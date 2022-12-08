package org.arcanite.idm.codegen

import org.eclipse.emf.ecore.EClass
import java.util.ArrayList
import org.apache.commons.lang3.StringUtils
import org.eclipse.emf.ecore.EAttribute
import java.util.Map
import java.util.List
import org.eclipse.emf.ecore.EAnnotation

class InterfaceHelper extends AbstractGenerator {
	
	static val SETTINGS = new Settings(Boolean.FALSE)
	
	/**
	 * Generates code snippet for the class resp. interface definition part
	 * @param eClass EClass instance for which a definition is built.
	 * @return textual representation of the definition part 
	 */
	def static compileClass(EClass eClass) {
		var listImpl = new ArrayList<String>()
		var listExtension = new ArrayList<String>()
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

	def static String compileField(EClass eClass, EAttribute attr, Map<String, List<EAnnotation>> annotationMap) {

		return '''
			«FOR s : collectFieldAnnotations(eClass, attr, annotationMap)»
				@«AnnotationHelper.renderAnnotation(s)»
			«ENDFOR»
			«IF SETTINGS.doGetterAndSetters»
			«compileFieldAccessors(eClass, attr, annotationMap)»
			«ENDIF»			
		'''
	}

	def static String compileFieldAccessors(EClass eClass, EAttribute attr,
		Map<String, List<EAnnotation>> annotationMap) {
		return '''			
			public void set«StringUtils.capitalize(attr.name)»(«attr.EAttributeType.name» «attr.name» );
			
			public «attr.EAttributeType.name» get«StringUtils.capitalize(attr.name)»();
		'''
	}

}
