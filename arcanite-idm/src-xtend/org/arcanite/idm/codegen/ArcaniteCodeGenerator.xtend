package org.arcanite.idm.codegen;

import java.io.File
import java.io.FileWriter
import java.io.Writer
import java.util.List
import java.util.Map
import org.apache.commons.lang3.StringUtils
import org.arcanite.idm.IdmPackage
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import java.lang.reflect.ParameterizedType
import java.util.stream.Collectors
import org.eclipse.emf.ecore.ETypeParameter
import org.eclipse.emf.ecore.impl.EDataTypeImpl
import org.eclipse.emf.ecore.impl.EAttributeImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.InternalEObject
import java.util.HashMap
import java.time.OffsetDateTime
import java.math.BigDecimal
import java.io.Serializable
import org.eclipse.xtend.typesystem.emf.EcoreUtil2
import org.eclipse.emf.ecore.EGenericType
import com.google.common.base.Joiner.MapJoiner
import java.util.StringJoiner

class ArcaniteCodeGenerator extends AbstractGenerator {

	static var outputDir = "/home/tadams/enargit-eclipse-workspaces/arcanite-dsl/arcanite-idm/target"

	static val ARCANITE_PACKAGE = IdmPackage.eINSTANCE

	static val SETTINGS = new Settings(Boolean.FALSE)

	static val ANNOTATION_PREFIX = "http://";

	/**
	 * Loops through all classes of a package and builds them
	 */
	def static void buildClasses(EPackage ePackage, Map<String, List<EAnnotation>> annotationMap) {
		var allClasses = PackageHelper.getAllClasses(ePackage)
		val importMap = <String, List<String>>newHashMap()
		allClasses.stream().forEach[EClass e|buildClass(e, annotationMap, importMap)]
	}

	/**
	 * Initialize a file writer along with its destination directories
	 */
	def static Writer getFileWriter(EClass eClass) {
		var f = new File(outputDir + "/" + eClass.EPackage.nsURI.replace(".", "/") + "/" + eClass.name + ".java")
		f.parentFile.mkdirs()
		f.createNewFile()
		return new FileWriter(f)
	}

	def private static debugReference(EClass eClass, EReference ref, Map<String, List<EAnnotation>> annotationMap) {
		println("eClass.name: " + eClass.name)
		println("ref.upperBound: " + (ref.upperBound === -1 ? "List" : "Single"))
		println("ref.name: " + ref.name)
		println("ref.EReferenceType.name: " + ref.EReferenceType.name)
		println("ref.EOpposite.name: " + ref.EOpposite.name)
		println("ref.EReferenceType.instanceTypeName: " + ref.EReferenceType.instanceTypeName)
	}

	def static collectImports(EClass eClass, Map<String, List<EAnnotation>> annotationMap,
		Map<String, List<String>> importMap) {
		collectClassAnnotations(eClass, annotationMap).forEach [ p1, p2 |
			if (importMap.get(eClass.name) === null) {
				var list = <String>newArrayList()
				list.add(p1.source.substring(ANNOTATION_PREFIX.length))
				importMap.put(eClass.name, list)
			} else {
				var list = importMap.get(eClass.name)
				if (!list.contains(p1.source.substring(ANNOTATION_PREFIX.length))) {
					list.add(p1.source.substring(ANNOTATION_PREFIX.length))
					importMap.put(eClass.name, list)
				}
			}
		]
	}

	def static collectImports(EClass eClass, EAttribute eAttribute, Map<String, List<EAnnotation>> annotationMap,
		Map<String, List<String>> importMap) {

		collectFieldAnnotations(eClass, eAttribute, annotationMap).forEach [ p1, p2 |
			if (importMap.get(eClass.name) === null) {
				var list = <String>newArrayList()
				list.add(p1.source.substring(ANNOTATION_PREFIX.length))
				importMap.put(eClass.name, list)
			} else {
				var list = importMap.get(eClass.name)
				if (!list.contains(p1.source.substring(ANNOTATION_PREFIX.length))) {
					list.add(p1.source.substring(ANNOTATION_PREFIX.length))
					importMap.put(eClass.name, list)
				}
			}
		]

		var s = ETypeHelper.mapTypeClassName(eAttribute)
		if (!s.startsWith("java.lang")) {
			if (importMap.get(eClass.name) === null) {
				var list = <String>newArrayList()
				list.add(s)
				importMap.put(eClass.name, list)
			} else {
				var list = importMap.get(eClass.name)
				if (!list.contains(s)) {
					list.add(s)
					importMap.put(eClass.name, list)
				}
			}
		}
	}

	def static collectImports(EClass eClass, EReference ref, Map<String, List<EAnnotation>> annotationMap,
		Map<String, List<String>> importMap) {
		debugReference(eClass, ref, annotationMap)

		if (ref.upperBound === -1) {

			if (importMap.get(eClass.name) === null) {
				var list = <String>newArrayList()
				list.add("java.util.List")
				importMap.put(eClass.name, list)
			} else {
				var list = importMap.get(eClass.name)
				if (!list.contains("java.util.List")) {
					list.add("java.util.List")
					importMap.put(eClass.name, list)
				}
			}

			if (importMap.get(eClass.name) === null) {
				var list = <String>newArrayList()
				list.add("ava.util.ArrayList")
				importMap.put(eClass.name, list)
			} else {
				var list = importMap.get(eClass.name)
				if (!list.contains("java.util.ArrayList")) {
					list.add("ava.util.ArrayList")
					importMap.put(eClass.name, list)
				}
			}

		}

		if (importMap.get(eClass.name) === null) {
			var list = <String>newArrayList()
			list.add(ref.EReferenceType.instanceTypeName)
			importMap.put(eClass.name, list)
		} else {
			var list = importMap.get(eClass.name)
			if (!list.contains(ref.EReferenceType.instanceTypeName)) {
				list.add(ref.EReferenceType.instanceTypeName)
				importMap.put(eClass.name, list)
			}
		}
	}

	/**
	 * Builds up the entire class and write the output back into the file system
	 */
	def static void buildClass(EClass eClass, Map<String, List<EAnnotation>> annotationMap,
		Map<String, List<String>> importMap) {
		var fileWriter = getFileWriter(eClass)
		collectImports(eClass, annotationMap, importMap)
		eClass.EAllAttributes.forEach[p1|collectImports(eClass, p1, annotationMap, importMap)]
		eClass.EAllReferences.forEach [ p1 |
			collectImports(eClass, p1, annotationMap, importMap)

		]

		var content = '''					
			package «eClass.EPackage.nsURI + ";"»
			
			«FOR s : importMap.entrySet.filter[p1 | p1.key.equals(eClass.name)]»
				«FOR i : s.value»
					import «i»;
				«ENDFOR»
			«ENDFOR»
			
			
			
			
			«FOR s : collectClassAnnotations(eClass, annotationMap)»
				«AnnotationHelper.renderAnnotation(s)»
			«ENDFOR»
			«InterfaceHelper.compileClass(eClass)»  {
				«FOR attr : eClass.EAllAttributes»
					«compileField(eClass, attr, annotationMap)»
				«ENDFOR»
				
				«FOR ref : eClass.EAllReferences»
					«compileReference(eClass, ref, annotationMap)»
				«ENDFOR»
			}
		'''
		fileWriter.write(content)
		fileWriter.close()
	}

	def static String compileField(EClass eClass, EAttribute attr, Map<String, List<EAnnotation>> annotationMap) {
		if (eClass.interface) {
			return InterfaceHelper.compileField(eClass, attr, annotationMap);
		} else {
			return ClassHelper.compileField(eClass, attr, annotationMap);
		}
	}

	def static compileReference(EClass eClass, EReference ref, Map<String, List<EAnnotation>> annotationMap) {
		debugReference(eClass, ref, annotationMap)

		return '''
			«IF ref.upperBound === - 1»
				@OneToMany(mappedBy="«ref.EOpposite.name»")
				private List<«ref.EReferenceType.name»> «ref.name»;
				«IF SETTINGS.doGetterAndSetters»
					public void set«StringUtils.capitalize(ref.name)»(List<«ref.EReferenceType.name»> «ref.name») {
						this.«ref.name» = «ref.name»;
					}
					 
					public List<«ref.EReferenceType.name»> get«StringUtils.capitalize(ref.name)»() {
						return this.«ref.name»;
					}
					 
				«ENDIF»
			«ENDIF»
			«IF ref.upperBound !== - 1»
				@ManyToOne
				private «ref.EReferenceType.name» «ref.name»;
				«IF SETTINGS.doGetterAndSetters»
					public void set«StringUtils.capitalize(ref.name)»(«ref.EReferenceType.name» «ref.name») {
						this.«ref.name» = «ref.name»;
					}
					 
					
					public «ref.EReferenceType.name» get«StringUtils.capitalize(ref.name)»() {
						return this.«ref.name»;
					}
					 
				«ENDIF»
			«ENDIF»
		'''
	}

	/**
	 * Main entry point for code generation
	 */
	def static void main2(String[] args) {
		val annotationMap = AnnotationHelper.buildAnnotations(ModelLoader.ARCANITE_ECORE)

		buildClasses(ARCANITE_PACKAGE, annotationMap)

	}

	def static main3(String[] args) {

		var model = ModelLoader.loadModel(ModelLoader.ARCANITE_ECORE)

		model.EClasses.forEach [ clz |
			{

				println(clz.name) // className
				println(clz.instanceTypeName) // null
				clz.ETypeParameters.forEach [ p |
					{
						println(p.name) // type parameter name = ID
						p.EBounds.forEach [ b |
							{
								println(b.EClassifier.name) // Serializable
								println(b.EClassifier.instanceClassName) // java.io.Serializable
							}
						]
					}
				]

				clz.EAllStructuralFeatures.forEach [ f |
					{
						println(f) // structural feature
						if (f.EGenericType !== null) {
							println(f.EGenericType) // generic type impl with ID expression
							if (f.EGenericType.ETypeParameter !== null) {
								println(f.EGenericType.ETypeParameter.name) // generic parameter name = ID
							}

						}

					}
				]
				println("--attr--")
				clz.EAllAttributes.forEach [ s |
					{
						println(s) // attribute impl 
						if (s.EGenericType !== null) {
							println(s.EGenericType) // generic type impl with ID expression
							if (s.EGenericType.ETypeParameter !== null) {
								println(s.EGenericType.ETypeParameter.name) // generic parameter name = ID
							}
						}
					}
				]
				println("==========================")
				clz.EAllGenericSuperTypes.forEach [ st |
					{
						println(st)
						println(st.EClassifier)
						println(st.EClassifier.ETypeParameters)

						st.EClassifier.ETypeParameters.forEach [ t |
							{
								println(t.name)
								t.EBounds.forEach [ b |
									{
										println(b.EClassifier.instanceClassName)
									}
								]
							}
						]
					}
				]
				println(clz)

				println("--------------------------")
				clz.EAttributes.forEach [ attr |
					{

						print(attr.name)
						print(" :: ")
						print(attr.EAttributeType.name)
						print(" :: ")
						print(attr.EAttributeType.instanceTypeName)
						print(" :: ")
						print(attr.EGenericType.ERawType)
						print(" :: ")
						println(attr.EAttributeType.instanceClassName)

					}
				]
				println("==========================")
				println("")

			}
		]

	}

	/**
	 * Stubs not used for now, need to solve workflow issue first
	 */
	def void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject o : resource.allContents.toIterable.filter(EObject)) {
			o.compile(fsa)
		}
	}

	/**
	 * Stubs not used for now, need to solve workflow issue first
	 */
	def compile(EObject e, IFileSystemAccess fsa) {
		fsa.generateFile(e.eClass.name + ".txt", '''
			this is element «e.eClass.name»
		''')
	}

	def static getClassTypeParameterNames(EClass eClass) {
		val map = newHashMap()
		eClass.ETypeParameters.map[p|map.put(p.name, getBoundsOfTypeParameter(p))]
	}

	def static getBoundsOfTypeParameter(ETypeParameter parameter) {
		val map = newHashMap()
		parameter.EBounds.map [ b |
			map.put(b.EClassifier.name, b.EClassifier.instanceClassName)
		]
		return map
	}

	def static isParameterized(EAttribute eAttribute) {
		return (eAttribute.EGenericType !== null && eAttribute.EGenericType.ETypeParameter !== null &&
			eAttribute.EGenericType.ETypeParameter.name !== null)
	}

	def static hasParameter(EAttribute eAttribute, String paramName) {
		return ((eAttribute.EGenericType !== null && eAttribute.EGenericType.ETypeParameter !== null &&
			eAttribute.EGenericType.ETypeParameter.name !== null) &&
			eAttribute.EGenericType.ETypeParameter.name.equals(paramName) )
	}

	def static getParameter(EAttribute eAttribute) {
		if (isParameterized(eAttribute)) {
			return eAttribute.EGenericType.ETypeParameter.name
		}
		return null
	}

	def static main(String[] args) {
		var model = ModelLoader.loadModel(ModelLoader.ARCANITE_ECORE)
		var allClasses = PackageHelper.getAllClasses(model.EPackage)
		
	
		
		allClasses.forEach [ eClass |
			//generateSuper(eClass)	
			attributesOfClass(eClass)
		]
	}

	def static generateSuper(EClass eClass) {
		
//		println(eClass.name)
//		eClass.ESuperTypes.forEach[c|{			
//			println(c.name)
//			println(c.instanceClassName)
//			println(c.ETypeParameters)			
//			
//			c.ETypeParameters.forEach[t | {
//				println(t)
//				t.EBounds.forEach[b|{
//					println(b.EClassifier.name)
//				}]
//				println(t.name)
//			}]
//			
//		}]
		var expression = "public class " + eClass.name		
		if(eClass.ETypeParameters.size>0) {			
			expression +="<"
			val list = eClass.ETypeParameters.map[t| t.name + " extends " + t.EBounds.map[b| b.EClassifier.name].toList.get(0)].toList
			expression +=list.join(", ")
			expression +=">"
		}
		
		if(eClass.EGenericSuperTypes.size > 0) {
			expression += " extends " + eClass.EGenericSuperTypes.map[c|generateTypeArgument(c)].toList.get(0)
		}
		println(expression) 
	}
	
	def static generateTypeArgument(EGenericType eGenericType) {
	 	return eGenericType.EClassifier.name +  IterableExtensions.join(eGenericType.ETypeArguments,"<",", ",">", [t | t.EClassifier.name])
	}

	def static attributesOfClass(EClass eClass) {
		
		EcoreUtil.resolveAll(eClass)
		
		
		eClass.EAllStructuralFeatures.forEach[attr1| {
			
			if (attr1 instanceof EAttribute) {
				print("attr.EAttributeType.name)                    :  ")println((attr1 as EAttribute).EAttributeType.name)
				print("attr.EAttributeType.instanceClassName)       :  ")println((attr1 as EAttribute).EAttributeType.instanceClassName)
				print("attr.EAttributeType.ETypeParameters)         :  ")println((attr1 as EAttribute).EAttributeType.ETypeParameters)
				print("attr.EAttributeType.EType)                   :  ")println((attr1 as EAttribute).EType)
				print("attr.EAttributeType.EType.name)              :  ")println((attr1 as EAttribute).EType.name)
				print("attr.EAttributeType.EType.instanceClassName) :  ")println((attr1 as EAttribute).EType.instanceClassName)
				print("attr.EGenericType)                           :  ")println(attr1.EGenericType)
				print("attr.EGenericType.EClassifier)               :  ")println(attr1.EGenericType.EClassifier)
				print("attr.EGenericType.ETypeArguments)            :  ")println(attr1.EGenericType.ETypeArguments)
				print("attr.EGenericType.ERawType)                  :  ")println(attr1.EGenericType.ERawType)
				print("attr.EGenericType.ETypeParameter)            :  ")println(attr1.EGenericType.ETypeParameter)
				print("attr.EGenericType.ETypeParameter.name)       :  ")println(attr1.EGenericType.ETypeParameter!==null?attr1.EGenericType.ETypeParameter.name: "")
				println("==========================================================================================")
			}
				
			
			
		} ]
	}
	
	
	def static isFieldParamerterized(EAttribute attr) {		
		if (attr.EGenericType.ETypeParameter.name!==null) {
			return true;
		}
		return false
	}
	
	def static getTypeParamerterOrType(EAttribute attr) {		
		if (isFieldParamerterized(attr)) {
			return attr.EGenericType.ETypeParameter.name
		}
		return attr.EAttributeType.name
	}
	
	
	
	
	def static Map<String, Class<?>> getMappedTypes() {

		var typesMap = new HashMap<String, Class<?>>()

		typesMap.put("java.util.Date", OffsetDateTime)
		typesMap.put("java.lang.Long", Long)
		typesMap.put("java.lang.Boolean", Boolean)
		typesMap.put("java.lang.String", String)
		typesMap.put("java.math.BigDecimal", BigDecimal)
		typesMap.put("java.time.OffsetDateTime", OffsetDateTime)
		typesMap.put("java.io.Serializable", Serializable)

		return typesMap;

	}

	def static String mapType(EAttribute eAttribute) {
		return getMappedTypes().get(eAttribute.EAttributeType.instanceClassName) !== null ? getMappedTypes().get(
			eAttribute.EAttributeType.instanceClassName).simpleName : eAttribute.EAttributeType.name

	}

	def static String mapTypeClassName(EAttribute eAttribute) {
		return getMappedTypes().get(eAttribute.EAttributeType.instanceClassName) !== null ? getMappedTypes().get(
			eAttribute.EAttributeType.instanceClassName).canonicalName : eAttribute.EAttributeType.instanceClassName
	}

}
