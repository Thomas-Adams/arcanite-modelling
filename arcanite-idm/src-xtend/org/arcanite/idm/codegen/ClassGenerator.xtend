package org.arcanite.idm.codegen

import java.io.File
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.apache.commons.lang3.StringUtils
import java.io.FileWriter

class ClassGenerator {

	val PREFIX = "http://"

	val JAVA_LANG = "java.lang."

	val JAVA_LIST = "java.util.List"

	val JAVA_ARRAY_LIST = "java.util.ArrayList"
	
	val JAVA_PERSISTENCE = "http://javax.persistence."
	
	val MANY_TO_ONE = "javax.persistence.ManyToOne"
	
	val ONE_TO_MANY = "javax.persistence.OneToMany"

	val JAVA_FILE_EXTENSION = ".java"
	
	val DTO_SUFFIX = "Dto"

	val SETTINGS = new Settings(Boolean.FALSE)

	EClass eClass
	String root

	String classFileName
	
	String dtoFileName

	List<String> imports = newArrayList()
	List<String> dtoImports = newArrayList()

	List<EAttribute> attributes = newArrayList()
	List<EReference> references = newArrayList()
	
	List<EAttribute> dtoAttributes = newArrayList()
	List<EReference> dtoReferences = newArrayList()

	List<EAnnotation> classAnnotations = newArrayList()
	List<EAnnotation> dtoAnnotations = newArrayList()
	Map<String, List<EAnnotation>> attributeAnnotations = newHashMap()
	Map<String, List<EAnnotation>> referenceAnnotations = newHashMap()
	
	Map<String, List<EAnnotation>> attributeDtoAnnotations = newHashMap()
	Map<String, List<EAnnotation>> referenceDtoAnnotations = newHashMap()
	
	
	
	
	new(EClass eClass, String root) {
		this.eClass = eClass
		this.root = root
		initialize()
		initializeDto()
	}
	
	def className() {
		return this.eClass.name
	}
	
	def dtoClassName() {
		return this.eClass.name + DTO_SUFFIX
	}
	
	
	
	def packagePathSegment() {
		return this.eClass.EPackage.nsURI.replace(".", File.separator)
	}
	
	def dtoPackagePathSegment() {
		return this.eClass.EPackage.nsURI.replace(".", File.separator) + "." + DTO_SUFFIX.toLowerCase()
	}
	

	def initFileName(String ending) {
		return normalizePathSegment(this.root) + (File.separator) +
			normalizePathSegment(packagePathSegment()) + File.separator +
			eClass.name + ending;
	}
	
	def initDtoFileName(String ending) {
		return normalizePathSegment(this.root) + (File.separator) +
			normalizePathSegment(dtoPackagePathSegment()) + File.separator +
			dtoClassName() + ending;
	}

	def normalizePathSegment(String path) {
		if (path !== null && path.endsWith(File.separator)) {
			return path.substring(0, path.length - 1)
		}
		return path;
	}

	def initialize() {
		classFileName = initFileName(JAVA_FILE_EXTENSION)
		initializeAnnotationsAndImport()
	}
	
	def initializeDto() {
		dtoFileName = initDtoFileName(JAVA_FILE_EXTENSION)
		initializeDtoAnnotationsAndImport()
	}
	
	def initializeDtoAnnotationsAndImport() {
		// class based annotations
		this.eClass.EAnnotations.forEach [ q1, q2 |
			if(!q1.source.startsWith(JAVA_PERSISTENCE)) {
				dtoAnnotations.add(q1)
				initialzeDtoAnnotationsImport(q1)
			}
		]

		// field annotations
		this.eClass.EAllAttributes.forEach [ s1, s2 |
			{
				dtoAttributes.add(s1)
				initialzeDtoAttributeImport(s1)
				s1.EAnnotations.forEach [ q1, q2 |
					{
						var list = this.attributeDtoAnnotations.get(s1.name) === null ? newArrayList() : this.
								attributeDtoAnnotations.get(s1.name)
						if (!list.contains(q1)) {
							list.add(q1)
							this.attributeDtoAnnotations.put(s1.name, list)
						}
						initialzeDtoAnnotationsImport(q1)
					}
				]
			}
		]

		// references
		this.eClass.EAllReferences.forEach [ p1 |
			{
				dtoReferences.add(p1)
				initializeDtoReferenceImports(p1)
				p1.EAnnotations.forEach [ q1, q2 |
					{
						var list = this.referenceDtoAnnotations.get(p1.name) === null ? newArrayList() : this.
								referenceDtoAnnotations.get(p1.name)
						if (!list.contains(q1)) {
							list.add(q1)
							this.referenceDtoAnnotations.put(p1.name, list)
						}
						initialzeDtoAnnotationsImport(q1)
					}
				]

			}
		]
	}

	def initializeAnnotationsAndImport() {
		// class based annotations
		this.eClass.EAnnotations.forEach [ q1, q2 |
			classAnnotations.add(q1)
			initialzeAnnotationsImport(q1)
		]

		// field annotations
		this.eClass.EAllAttributes.forEach [ s1, s2 |
			{
				attributes.add(s1)
				initialzeAttributeImport(s1)
				s1.EAnnotations.forEach [ q1, q2 |
					{
						var list = this.attributeAnnotations.get(s1.name) === null ? newArrayList() : this.
								attributeAnnotations.get(s1.name)
						if (!list.contains(q1)) {
							list.add(q1)
							this.attributeAnnotations.put(s1.name, list)
						}
						initialzeAnnotationsImport(q1)
					}
				]
			}
		]

		// references
		this.eClass.EAllReferences.forEach [ p1 |
			{
				references.add(p1)
				initializeReferenceImports(p1)
				p1.EAnnotations.forEach [ q1, q2 |
					{
						var list = this.referenceAnnotations.get(p1.name) === null ? newArrayList() : this.
								referenceAnnotations.get(p1.name)
						if (!list.contains(q1)) {
							list.add(q1)
							this.referenceAnnotations.put(p1.name, list)
						}
						initialzeAnnotationsImport(q1)
					}
				]

			}
		]
	}

	def initialzeAnnotationsImport(EAnnotation eAnnotation) {
		val annotationImport = eAnnotation.source.substring(PREFIX.length)
		if (!imports.contains(annotationImport)) {
			imports.add(annotationImport)
		}
	}
	
	def initialzeDtoAnnotationsImport(EAnnotation eAnnotation) {
		val annotationImport = eAnnotation.source.substring(PREFIX.length)
		if (!dtoImports.contains(annotationImport)) {
			dtoImports.add(annotationImport)
		}
	}

	def initialzeAttributeImport(EAttribute eAttribute) {
		val attributeImport = eAttribute.EAttributeType.instanceClassName
		if (attributeImport !== null && !imports.contains(attributeImport) && !attributeImport.startsWith(JAVA_LANG)) {
			imports.add(attributeImport)
		}
	}
	
	def initialzeDtoAttributeImport(EAttribute eAttribute) {
		val attributeImport = eAttribute.EAttributeType.instanceClassName
		if (attributeImport !== null && !dtoImports.contains(attributeImport) && !attributeImport.startsWith(JAVA_LANG)) {
			dtoImports.add(attributeImport)
		}
	}

	def initializeReferenceImports(EReference eReference) {
		val referenceImport = eReference.EReferenceType.instanceTypeName
		if (!imports.contains(referenceImport)) {
			imports.add(referenceImport)
		}
		if (eReference.upperBound === -1) {
			if (!imports.contains(JAVA_ARRAY_LIST)) {
				imports.add(JAVA_ARRAY_LIST)
			}

			if (!imports.contains(JAVA_LIST)) {
				imports.add(JAVA_LIST)
			}
			
			if (!imports.contains(ONE_TO_MANY)) {
				imports.add(ONE_TO_MANY)
			}
		}
		if (eReference.upperBound !== -1) {
			if (!imports.contains(MANY_TO_ONE)) {
				imports.add(MANY_TO_ONE)
			}
		}
	}
	
	
	def initializeDtoReferenceImports(EReference eReference) {
		val referenceImport = eReference.EReferenceType.instanceTypeName + DTO_SUFFIX
		if (!dtoImports.contains(referenceImport)) {
			dtoImports.add(referenceImport)
		}
		if (eReference.upperBound === -1) {
			if (!dtoImports.contains(JAVA_ARRAY_LIST)) {
				dtoImports.add(JAVA_ARRAY_LIST)
			}

			if (!dtoImports.contains(JAVA_LIST)) {
				dtoImports.add(JAVA_LIST)
			}
		}
	}

	def getAnnotationName(EAnnotation eAnnotation) {
		if (eAnnotation.source !== null) {
			var i = eAnnotation.source.lastIndexOf(".") > -1 ? eAnnotation.source.lastIndexOf(".") + 1 : 0
			return eAnnotation.source.substring(i)
		}
		return ""
	}

	def render() {
		var file = new File(this.classFileName)
		file.parentFile.mkdirs()
		file.createNewFile()
		val fileWriter = new FileWriter(file)
		val content = '''
			package «eClass.EPackage.nsURI + ";"»
			
			«FOR i : imports»
				«IF StringUtils.isNotBlank(i)»
					import «i»;
				«ENDIF»
			«ENDFOR»
			
			
			
			
			«FOR a : classAnnotations»
				«renderAnnotation(a)»
			«ENDFOR»
			«renderClass()» {
			
			«FOR f : attributes»
				«IF attributeAnnotations.get(f.name)!==null»
					«FOR a: attributeAnnotations.get(f.name)»
						«"\t"»«renderAnnotation(a)»
					«ENDFOR»
				«ENDIF»
				«"\t"»private «ETypeHelper.mapType(f)» «f.name»;
				
				«IF SETTINGS.doGetterAndSetters»
					«"\t"»public void set«StringUtils.capitalize(f.name)»(«ETypeHelper.mapType(f)» «f.name» ) {
					«"\t"»«"\t"»this.«f.name» = «f.name»;
					«"\t"»}
					
					«"\t"»public «ETypeHelper.mapType(f)» get«StringUtils.capitalize(f.name)»() {
						«"\t"»«"\t"»return this.«f.name»;
					«"\t"»
					«"\t"»}				
				«ENDIF»				
			«ENDFOR»
			«FOR ref : references»
				«IF ref.upperBound === - 1»
					«IF referenceAnnotations.get(ref.name)!==null»
						«FOR a: referenceAnnotations.get(ref.name)»
							«"\t"»«renderAnnotation(a)»
						«ENDFOR»
					«ENDIF»
					«"\t"»@OneToMany(mappedBy="«ref.EOpposite.name»")
					«"\t"»private List<«ref.EReferenceType.name»> «ref.name»;
					
					«IF SETTINGS.doGetterAndSetters»
						«"\t"»public void set«StringUtils.capitalize(ref.name)»(List<«ref.EReferenceType.name»> «ref.name») {
							this.«ref.name» = «ref.name»;
						«"\t"»}
						 
						«"\t"»public List<«ref.EReferenceType.name»> get«StringUtils.capitalize(ref.name)»() {
							return this.«ref.name»;
						«"\t"»}						
					«ENDIF»
					
				«ENDIF»
				«IF ref.upperBound !== - 1»
					«IF referenceAnnotations.get(ref.name)!==null»
						«FOR a: referenceAnnotations.get(ref.name)»
							«"\t"»«renderAnnotation(a)»
						«ENDFOR»
					«ENDIF»
					«"\t"»@ManyToOne
					«"\t"»private «ref.EReferenceType.name» «ref.name»;
					
					«IF SETTINGS.doGetterAndSetters»
						«"\t"»public void set«StringUtils.capitalize(ref.name)»(«ref.EReferenceType.name» «ref.name») {
							this.«ref.name» = «ref.name»;
						«"\t"»}
						 
						
						«"\t"»public «ref.EReferenceType.name» get«StringUtils.capitalize(ref.name)»() {
							return this.«ref.name»;
						«"\t"»}
						 
					«ENDIF»
					
				«ENDIF»
			«ENDFOR»
			}
		'''
		fileWriter.write(content)
		fileWriter.close()
	}

	def renderDto() {
		var file = new File(this.dtoFileName)
		file.parentFile.mkdirs()
		file.createNewFile()
		val fileWriter = new FileWriter(file)
		val content = '''
			package «eClass.EPackage.nsURI + ".dto;"»
			
			«FOR i : dtoImports»
				«IF StringUtils.isNotBlank(i)»
					import «i»;
				«ENDIF»
			«ENDFOR»
			
			
			
			
			«FOR a : dtoAnnotations»
				«renderAnnotation(a)»
			«ENDFOR»
			«renderClass()» {
			
			«FOR f : dtoAttributes»
				«IF attributeDtoAnnotations.get(f.name)!==null»
					«FOR a: attributeDtoAnnotations.get(f.name)»
						«"\t"»«renderAnnotation(a)»
					«ENDFOR»
				«ENDIF»
				«"\t"»private «ETypeHelper.mapType(f)» «f.name»;
				
				«IF SETTINGS.doGetterAndSetters»
					«"\t"»public void set«StringUtils.capitalize(f.name)»(«ETypeHelper.mapType(f)» «f.name» ) {
					«"\t"»«"\t"»this.«f.name» = «f.name»;
					«"\t"»}
					
					«"\t"»public «ETypeHelper.mapType(f)» get«StringUtils.capitalize(f.name)»() {
						«"\t"»«"\t"»return this.«f.name»;
					«"\t"»
					«"\t"»}				
				«ENDIF»				
			«ENDFOR»
			«FOR ref : dtoReferences»
				«IF ref.upperBound === - 1»
					«IF referenceDtoAnnotations.get(ref.name)!==null»
						«FOR a: referenceDtoAnnotations.get(ref.name)»
							«"\t"»«renderAnnotation(a)»
						«ENDFOR»
					«ENDIF»
					«"\t"»private List<«ref.EReferenceType.name»> «ref.name»;
					
					«IF SETTINGS.doGetterAndSetters»
						«"\t"»public void set«StringUtils.capitalize(ref.name)»(List<«ref.EReferenceType.name»> «ref.name») {
							this.«ref.name» = «ref.name»;
						«"\t"»}
						 
						«"\t"»public List<«ref.EReferenceType.name»> get«StringUtils.capitalize(ref.name)»() {
							return this.«ref.name»;
						«"\t"»}						
					«ENDIF»
					
				«ENDIF»
				«IF ref.upperBound !== - 1»
					«IF referenceDtoAnnotations.get(ref.name)!==null»
						«FOR a: referenceDtoAnnotations.get(ref.name)»
							«"\t"»«renderAnnotation(a)»
						«ENDFOR»
					«ENDIF»
					«"\t"»private «ref.EReferenceType.name» «ref.name»;
					
					«IF SETTINGS.doGetterAndSetters»
						«"\t"»public void set«StringUtils.capitalize(ref.name)»(«ref.EReferenceType.name» «ref.name») {
							this.«ref.name» = «ref.name»;
						«"\t"»}
						 
						
						«"\t"»public «ref.EReferenceType.name» get«StringUtils.capitalize(ref.name)»() {
							return this.«ref.name»;
						«"\t"»}
						 
					«ENDIF»
					
				«ENDIF»
			«ENDFOR»
			}
		'''
		fileWriter.write(content)
		fileWriter.close()
	}
	


	def quoteAnnotationDetail(String key, String value) {
		if ((key.equalsIgnoreCase("name")) || (key.equalsIgnoreCase("columnDefition"))) {
			return "\"" + value + "\""
		}
		return key + "=" + value;
	}

	def renderDetails(EAnnotation eAnnotation) {
		if (eAnnotation !== null && eAnnotation.details !== null && eAnnotation.details.size > 0) {
			var detailsList = eAnnotation.details.map[e|quoteAnnotationDetail(e.key, e.value)]
			return "(" + detailsList.join(",") + ")"
		}
		return ""
	}

	def renderAnnotation(EAnnotation eAnnotation) {
		return '''@«getAnnotationName(eAnnotation)»«renderDetails(eAnnotation)»'''
	}

	def renderClass() {
		var listImpl = newArrayList()
		var listExtension = newArrayList()
		for (EClass superType : eClass.ESuperTypes) {
			if (superType.isInterface) {
				listImpl.add(superType.name)
			} else {
				listExtension.add(superType.name)
			}
		}
		var definition = "public " + ( eClass.interface ? "interface" : "class") + " " + eClass.name
		if (!listExtension.empty) {
			definition += " extends " + String.join(', ', listExtension)
		}
		if (!listImpl.empty && eClass.interface) {
			definition += " extends " + String.join(', ', listImpl)
		} else if (!listImpl.empty && !eClass.interface) {
			definition += " implements " + String.join(', ', listImpl)
		}
		return definition

	}
	
	def renderDtoClass() {
		var listImpl = newArrayList()
		var listExtension = newArrayList()
		for (EClass superType : eClass.ESuperTypes) {
			if (superType.isInterface) {
				listImpl.add(superType.name)
			} else {
				listExtension.add(superType.name)
			}
		}
		var definition = "public " + ( eClass.interface ? "interface" : "class") + " " + dtoClassName()
		if (!listExtension.empty) {
			definition += " extends " + String.join(', ', listExtension)
		}
		if (!listImpl.empty && eClass.interface) {
			definition += " extends " + String.join(', ', listImpl)
		} else if (!listImpl.empty && !eClass.interface) {
			definition += " implements " + String.join(', ', listImpl)
		}
		return definition

	}
	

}
