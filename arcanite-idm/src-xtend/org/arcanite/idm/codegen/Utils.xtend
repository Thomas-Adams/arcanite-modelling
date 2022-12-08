package org.arcanite.idm.codegen

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.apache.commons.lang3.StringUtils

class Utils {

	def static pluralize(String name) {
		if (name.endsWith("y")) {
			return name.substring(0, name.length - 1) + "ies"
		}
		return name + "s"
	}

	def static hasIsManyToMany(EClass eClass, EReference ref) {
		if (ref.EOpposite !== null && StringUtils.isNotBlank(ref.EOpposite.name)) {
			return true
		}
		return false
	}
}
