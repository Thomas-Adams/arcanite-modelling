package org.arcanite.idm.codegen;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Class representing a package with all its classes as
 * a list.
 */
@Accessors
@SuppressWarnings("all")
public class PackageModel {
  private EPackage ePackage;
  
  private List<EClass> eClasses;
  
  public PackageModel(final EPackage ePackage, final List<EClass> eClasses) {
    this.ePackage = ePackage;
    this.eClasses = eClasses;
  }
  
  @Pure
  public EPackage getEPackage() {
    return this.ePackage;
  }
  
  public void setEPackage(final EPackage ePackage) {
    this.ePackage = ePackage;
  }
  
  @Pure
  public List<EClass> getEClasses() {
    return this.eClasses;
  }
  
  public void setEClasses(final List<EClass> eClasses) {
    this.eClasses = eClasses;
  }
}
