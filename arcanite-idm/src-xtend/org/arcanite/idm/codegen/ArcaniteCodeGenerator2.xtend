package org.arcanite.idm.codegen;

import java.io.File
import java.io.FileWriter
import java.io.Writer
import java.util.List
import java.util.Map
import org.apache.commons.lang3.StringUtils
import org.arcanite.idm.IdmPackage
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class ArcaniteCodeGenerator2 extends AbstractGenerator {

	static var outputDir = "/home/tadams/enargit-eclipse-workspaces/arcanite-dsl/arcanite-idm/target2"

	static val ARCANITE_PACKAGE = IdmPackage.eINSTANCE
	
	static val ARCANITE_DTO_PACKAGE = IdmPackage.eINSTANCE.name + ".dto"

	static val SETTINGS = new Settings(Boolean.FALSE)

	static val ANNOTATION_PREFIX = "http://";


	/**
	 * Main entry point for code generation
	 */
	def static void main(String[] args) {
		var model = ModelLoader.loadModel(ModelLoader.ARCANITE_ECORE)
		var allClasses = PackageHelper.getAllClasses(model.EPackage)
		allClasses.stream().forEach[EClass e|{
			var generator = new ClassGenerator(e, outputDir )
			generator.render()
			generator.renderDto()
		}]
	}

}
