package org.arcanite.idm;

import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class ArcaniteXCoreGeneratorModule extends XcoreStandaloneSetup.XcoreStandaloneRuntimeModule {
  protected String getFileExtensions() {
    return "genmodel";
  }
  
  protected String getLanguageName() {
    return "xcore";
  }
  
  @Override
  public Class<? extends IGenerator> bindIGenerator() {
    return ArcaniteXCoreGenerator.class;
  }
}
