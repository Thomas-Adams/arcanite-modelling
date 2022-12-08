package org.arcanite.idm.codegen

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute
import java.util.Map
import java.util.List
import org.apache.commons.lang3.StringUtils
import org.eclipse.emf.ecore.EAnnotation

class ClassHelper extends AbstractGenerator {
	static val SETTINGS = new Settings(Boolean.FALSE)
	
	def static compileField(EClass eClass, EAttribute attr, Map<String, List<EAnnotation>> annotationMap) {
		ETypeHelper.mapType(attr)	
		return '''
			«FOR s : collectFieldAnnotations(eClass, attr, annotationMap)»
				«AnnotationHelper.renderAnnotation(s)»
			«ENDFOR»
			private «ETypeHelper.mapType(attr)» «attr.name»;
			
			«IF SETTINGS.doGetterAndSetters»
			public void set«StringUtils.capitalize(attr.name)»(«ETypeHelper.mapType(attr)» «attr.name» ) {
				this.«attr.name» = «attr.name»;
			}
			
			public «ETypeHelper.mapType(attr)» get«StringUtils.capitalize(attr.name)»() {
				return this.«attr.name»;
			}				
			«ENDIF»
		'''
	}

}
