package org.arcanite.idm.codegen

import org.eclipse.emf.ecore.EPackage
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Class representing a package with all its classes as
 * a list.
 */
@Accessors
class PackageModel {

	var EPackage ePackage;

	var List<EClass> eClasses;

	new(EPackage ePackage, List<EClass> eClasses) {
		this.ePackage = ePackage
		this.eClasses = eClasses
	}

}
