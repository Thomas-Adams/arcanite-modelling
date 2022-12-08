package org.arcanite.idm;

import org.eclipse.xtext.ecore.EcoreSupport;

@SuppressWarnings("all")
public class ArcaniteXCoreGeneratorSupport extends EcoreSupport {
  @Override
  protected com.google.inject.Module createGuiceModule() {
    return new ArcaniteXCoreGeneratorModule();
  }
}
