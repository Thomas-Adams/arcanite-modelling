package org.arcanite.idm


import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.xcore.generator.XcoreGenerator
import org.eclipse.emf.ecore.xcore.XcorePackage

class ArcaniteXCoreGenerator extends XcoreGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		for (EObject o : resource.allContents.toIterable.filter(EObject)) {
			o.compile(fsa)
		}
	}

	
	def compile(EObject e, IFileSystemAccess fsa) {
		fsa.generateFile(e.eClass.name + ".txt", '''
			this is element «e.eClass.name»
		''')
	}


}
