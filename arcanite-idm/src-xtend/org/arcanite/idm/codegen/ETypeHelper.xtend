package org.arcanite.idm.codegen

import org.eclipse.emf.ecore.EAttribute
import java.util.Map
import java.util.HashMap
import java.time.OffsetDateTime
import java.math.BigDecimal
import java.io.Serializable

class ETypeHelper extends AbstractGenerator {

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
