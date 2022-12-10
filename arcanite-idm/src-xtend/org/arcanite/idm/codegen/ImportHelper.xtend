package org.arcanite.idm.codegen

import org.eclipse.emf.ecore.EClass
import java.util.List
import org.eclipse.emf.ecore.ETypeParameter
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EGenericType

class ImportHelper {

	static val PREFIX = "http://"

	static val JAVA_LANG = "java.lang."

	static val JAVA_LIST = "java.util.List"

	static val JAVA_ARRAY_LIST = "java.util.ArrayList"

	static val MANY_TO_ONE = "javax.persistence.ManyToOne"

	static val ONE_TO_MANY = "javax.persistence.OneToMany"

	static val JAVA_PERSISTENCE_PREFIX = "javax.persistence."

	def static List<String> importInitialize(EClass eClass) {

		val classImports = newArrayList()

		val attributeAnnotations = newHashMap()
		val referenceAnnotations = newHashMap()

		eClass.EAnnotations.forEach [ q1, q2 |
			val annotationImport = q1.source.substring(PREFIX.length)
			if (!classImports.contains(annotationImport)) {
				classImports.add(annotationImport)
			}
		]

		eClass.EAllAttributes.forEach [ s1, s2 |
			{

				val attributeImport = s1.EAttributeType.instanceClassName
				if (attributeImport !== null && !classImports.contains(attributeImport) &&
					!attributeImport.startsWith(JAVA_LANG)) {
					classImports.add(attributeImport)
				}

				s1.EAnnotations.forEach [ q1, q2 |
					{
						var list = attributeAnnotations.get(s1.name) === null
								? newArrayList()
								: attributeAnnotations.get(s1.name)
						if (!list.contains(q1)) {
							list.add(q1)
							attributeAnnotations.put(s1.name, list)
						}
						val annotationImport = q1.source.substring(PREFIX.length)
						if (!classImports.contains(annotationImport)) {
							classImports.add(annotationImport)
						}
					}
				]
			}
		]

		// references
		eClass.EAllReferences.forEach [ p1 |
			{

				val referenceImport = p1.EReferenceType.instanceTypeName
				if (!classImports.contains(referenceImport)) {
					classImports.add(referenceImport)
				}
				if (p1.upperBound === -1) {
					if (!classImports.contains(JAVA_ARRAY_LIST)) {
						classImports.add(JAVA_ARRAY_LIST)
					}

					if (!classImports.contains(JAVA_LIST)) {
						classImports.add(JAVA_LIST)
					}

					if (!classImports.contains(ONE_TO_MANY)) {
						classImports.add(ONE_TO_MANY)
					}
				}
				if (p1.upperBound !== -1) {
					if (!classImports.contains(MANY_TO_ONE)) {
						classImports.add(MANY_TO_ONE)
					}
				}
				p1.EAnnotations.forEach [ q1, q2 |
					{
						var list = referenceAnnotations.get(p1.name) === null
								? newArrayList()
								: referenceAnnotations.get(p1.name)
						if (!list.contains(q1)) {
							list.add(q1)
							referenceAnnotations.put(p1.name, list)
						}
						val annotationImport = q1.source.substring(PREFIX.length)
						if (!classImports.contains(annotationImport)) {
							classImports.add(annotationImport)
						}
					}
				]

			}
		]

		eClass.ETypeParameters.forEach [ p |
			{
				p.EBounds.forEach [ b |
					{
						if (!classImports.contains(b.EClassifier.instanceClassName)) {
							classImports.add(b.EClassifier.instanceClassName)
						}
					}
				]
			}
		]

		return classImports.filterNull.toList
	}

	def static List<String> importInitializeDto(EClass eClass) {
		var dtoImports = importInitialize(eClass)
		return dtoImports.filter[s|!s.startsWith(JAVA_PERSISTENCE_PREFIX)].toList
	}

	def static dtoFileFromClass(EClass eClass) {

		return (eClass.name.endsWith("Entity") ? eClass.name.replace("Entity", "Dto") : eClass.name + "Dto")

	}

	def static parameterizedTypes(EClass eClass) {
		val types = newHashMap()
		eClass.ETypeParameters.forEach [ p |
			{
				p.EBounds.forEach [ b |
					{
						val map = newHashMap()
						map.put("name", b.EClassifier.name)
						map.put("import", b.EClassifier.instanceClassName)
						types.put(p.name, map)
					}
				]
			}
		]
		return types
	}

	def static hasTypeParameters(EClass eClass) {
		val typesMap = parameterizedTypes(eClass)
		return !typesMap.empty
	}

	def static getClassTypeParameterNames(EClass eClass) {
		val list = newArrayList()
		eClass.ETypeParameters.forEach [ p |
			list.addAll(p.EBounds.map [ b |
				new GenericTypeParam(p.name, b.EClassifier.name, b.EClassifier.instanceClassName)
			].toList)
		]
		return list
	}

	def static getBoundsOfTypeParameter(ETypeParameter parameter) {
		val map = <String, String>newHashMap()
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

	static class GenericTypeParam {

		public String name = ""
		public String simpleClassName = ""
		public String instanceClassname = ""

		new(String name) {
			this.name = name
		}

		new(String name, String simpleClassName, String instanceClassname) {
			this.name = name
			this.simpleClassName = simpleClassName
			this.instanceClassname = instanceClassname
		}
	}

	def static generateClassDef(EClass eClass) {

		var expression = "public class " + eClass.name
		if (eClass.ETypeParameters.size > 0) {
			expression += "<"
			val list = eClass.ETypeParameters.map [ t |
				t.name + " extends " + t.EBounds.map[b|b.EClassifier.name].toList.get(0)
			].toList
			expression += list.join(", ")
			expression += ">"
		}

		if (eClass.EGenericSuperTypes.size > 0) {
			expression += " extends " + eClass.EGenericSuperTypes.map[c|generateTypeArgument(c)].toList.get(0)
		}
		return expression
	}

	def static generateDtoDef(EClass eClass) {

		var expression = "public class " + buildDtoName(eClass.name)
		if (eClass.ETypeParameters.size > 0) {
			expression += "<"
			val list = eClass.ETypeParameters.map [ t |
				t.name + " extends " + t.EBounds.map[b|b.EClassifier.name].toList.get(0)
			].toList
			expression += list.join(", ")
			expression += ">"
		}

		if (eClass.EGenericSuperTypes.size > 0) {
			expression += " extends " + eClass.EGenericSuperTypes.map[c|generateTypeArgument(c)].toList.get(0)
		}
		return expression
	}

	def static buildDtoName(String name) {
		if (name.endsWith("Entity")) {
			return name.replace("Entity", "Dto")
		}
		return name + "Dto"

	}

	def static generateTypeArgument(EGenericType eGenericType) {
		return buildDtoName(eGenericType.EClassifier.name) + IterableExtensions.join(eGenericType.ETypeArguments, "<", ", ", ">", [ t |
			t.EClassifier.name
		])
	}

	def static isFieldParameterized(EAttribute attr) {
		if (attr.EGenericType !== null && attr.EGenericType.ETypeParameter !== null &&
			attr.EGenericType.ETypeParameter.name !== null) {
			return true;
		}
		return false
	}

	def static getTypeParamerterOrType(EAttribute attr) {
		if (isFieldParameterized(attr)) {
			return attr.EGenericType.ETypeParameter.name
		}
		return attr.EAttributeType.name
	}
	
	def static packageBaseName() {
		return "org.arcanite.idm";
	}
}
