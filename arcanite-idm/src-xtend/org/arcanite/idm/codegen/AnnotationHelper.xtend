package org.arcanite.idm.codegen

import java.util.List
import org.eclipse.emf.ecore.EAnnotation

class AnnotationHelper {

	/**
	 * Gets all annotations from each class of a package represented by the
	 * corresponding ecore model file, @see @code{ModelLoader},
	 * It puts all found annotations on the classes itself as on fields
	 * into an annotation map of the form : [ key as string, value as list of string ]
	 * @fileName the filename to the ecore model file 
	 * @return annotationMap
	 */
	def static buildAnnotations(String fileName) {
		var model = ModelLoader.loadModel(fileName)
		val annotationMap = <String, List<EAnnotation>>newHashMap()

		// Class annotation		
		model.EClasses.forEach [ p1 |
			{
				val annotationList = <EAnnotation>newArrayList()
				p1.EAnnotations.forEach [ q1, q2 |
					annotationList.add(q1)
				]
				annotationMap.put(p1.name, annotationList)
			}
		]

		// StructuralFeature annotation fields 
		model.EClasses.forEach [ p1 |
			{
				p1.EAllStructuralFeatures.forEach [ s1, s2 |
					{
						val annotationList = <EAnnotation>newArrayList()
						s1.EAnnotations.forEach[q1, q2|annotationList.add(q1)]
						annotationMap.put(p1.name + "." + s1.name, annotationList)
					}
				]
			}
		]
		return annotationMap
	}

	/**
	 * Puts textual annotation values into double quotes.
	 * @param key annotation property name
	 * @param value annotation value
	 */
	def private static quoteAnnotationDetail(String key, String value) {
		if ((key.equalsIgnoreCase("name")) || (key.equalsIgnoreCase("columnDefition"))) {
			return "\"" + value + "\""
		}
		return key + "=" + value;
	}

	def private static getAnnotationName(EAnnotation eAnnotation) {
		if (eAnnotation.source !== null) {
			var i = eAnnotation.source.lastIndexOf(".") > -1 ? eAnnotation.source.lastIndexOf(".") + 1 : 0
			return eAnnotation.source.substring(i)
		}
		return ""
	}

	def private static parseDetails(EAnnotation eAnnotation) {
		if (eAnnotation !== null && eAnnotation.details !== null && eAnnotation.details.size > 0) {
			var detailsList = eAnnotation.details.map[e|quoteAnnotationDetail(e.key, e.value)]
			return "(" + detailsList.join(",") + ")"
		}
		return ""
	}

	def static renderAnnotation(EAnnotation eAnnotation) {
		return '''
			@«getAnnotationName(eAnnotation) + parseDetails(eAnnotation)»
		'''
	}

}
