package org.arcanite.idm

import org.eclipse.xtext.ecore.EcoreSupport

class ArcaniteXCoreGeneratorSupport extends EcoreSupport {
	
	
	override protected createGuiceModule() {
		return new ArcaniteXCoreGeneratorModule();
	}
	
}