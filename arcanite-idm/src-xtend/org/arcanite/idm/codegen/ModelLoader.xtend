package org.arcanite.idm.codegen

import java.util.stream.Collectors
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.codegen.ecore.xtext.GenModelRuntimeModule
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.typesystem.emf.EcoreUtil2

class ModelLoader {
	
	public static val ARCANITE_ECORE = "/home/tadams/enargit-eclipse-workspaces/arcanite-dsl/arcanite-idm/model/idm.ecore";
	
	
	
	
	/**
	 * Loads a model from the corresponding ecore file.
	 * @param fileName file name of the ecore file
	 * @return instance of a @see{PackageModel} 
	 */
	
	def static loadModel(String fileName) {
		
		var resourceSet = new ResourceSetImpl();
    	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",new EcoreResourceFactoryImpl())
    	var resource = resourceSet.getResource(URI.createFileURI(fileName),true);
    	
    	EcoreUtil.resolveAll(resourceSet)
    	EcoreUtil.resolveAll(resource)
    	var model = resource.getContents().get(0);
    	
    	var ePackage =  model as EPackage				
		var allClasses = ePackage.EClassifiers.stream().filter[EObject p|EClass.isInstance(p)].map [ EObject e |
			EClass.cast(e)
		].collect(Collectors.toList)
		
		return new PackageModel(ePackage, allClasses);
	}
	
}