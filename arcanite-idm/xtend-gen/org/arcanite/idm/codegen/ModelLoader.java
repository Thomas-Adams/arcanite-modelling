package org.arcanite.idm.codegen;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

@SuppressWarnings("all")
public class ModelLoader {
  public static final String ARCANITE_ECORE = "/home/tadams/enargit-eclipse-workspaces/arcanite-dsl/arcanite-idm/model/idm.ecore";
  
  /**
   * Loads a model from the corresponding ecore file.
   * @param fileName file name of the ecore file
   * @return instance of a @see{PackageModel}
   */
  public static PackageModel loadModel(final String fileName) {
    ResourceSetImpl resourceSet = new ResourceSetImpl();
    Map<String, Object> _extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    EcoreResourceFactoryImpl _ecoreResourceFactoryImpl = new EcoreResourceFactoryImpl();
    _extensionToFactoryMap.put("ecore", _ecoreResourceFactoryImpl);
    Resource resource = resourceSet.getResource(URI.createFileURI(fileName), true);
    EcoreUtil.resolveAll(resourceSet);
    EcoreUtil.resolveAll(resource);
    EObject model = resource.getContents().get(0);
    EPackage ePackage = ((EPackage) model);
    final Predicate<EObject> _function = (EObject p) -> {
      return EClass.class.isInstance(p);
    };
    final Function<EObject, EClass> _function_1 = (EObject e) -> {
      return EClass.class.cast(e);
    };
    List<EClass> allClasses = ePackage.getEClassifiers().stream().filter(_function).<EClass>map(_function_1).collect(Collectors.<EClass>toList());
    return new PackageModel(ePackage, allClasses);
  }
}
