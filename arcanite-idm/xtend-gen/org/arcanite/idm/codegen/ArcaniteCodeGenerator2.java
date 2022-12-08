package org.arcanite.idm.codegen;

import java.util.List;
import java.util.function.Consumer;
import org.arcanite.idm.IdmPackage;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ArcaniteCodeGenerator2 extends AbstractGenerator {
  private static String outputDir = "/home/tadams/enargit-eclipse-workspaces/arcanite-dsl/arcanite-idm/target2";
  
  private static final IdmPackage ARCANITE_PACKAGE = IdmPackage.eINSTANCE;
  
  private static final String ARCANITE_DTO_PACKAGE = (IdmPackage.eINSTANCE.getName() + ".dto");
  
  private static final Settings SETTINGS = new Settings(Boolean.FALSE);
  
  private static final String ANNOTATION_PREFIX = "http://";
  
  /**
   * Main entry point for code generation
   */
  public static void main(final String[] args) {
    PackageModel model = ModelLoader.loadModel(ModelLoader.ARCANITE_ECORE);
    List<EClass> allClasses = PackageHelper.getAllClasses(model.getEPackage());
    final Consumer<EClass> _function = (EClass e) -> {
      ClassGenerator generator = new ClassGenerator(e, ArcaniteCodeGenerator2.outputDir);
      generator.render();
      generator.renderDto();
    };
    allClasses.stream().forEach(_function);
  }
}
