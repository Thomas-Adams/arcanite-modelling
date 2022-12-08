package org.arcanite.idm.codegen

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import java.util.stream.Collectors
import java.util.List

class PackageHelper {

	def static List<EClass> getAllClasses(EPackage ePackage) {

		var allPkgClasses = ePackage.EClassifiers.stream().filter[Object p|EClass.isInstance(p)].map [ Object e |
			EClass.cast(e)
		].collect(Collectors.toList)
		return allPkgClasses
	}

}
