package org.arcanite.idm

import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup.XcoreStandaloneRuntimeModule

class ArcaniteXCoreGeneratorModule extends XcoreStandaloneRuntimeModule {

	def protected getFileExtensions() {
		return "genmodel";
	}

	def protected getLanguageName() {
		return "xcore";
	}
	
	override bindIGenerator() {
        return ArcaniteXCoreGenerator;
    }
    
   
}
