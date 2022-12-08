package org.arcanite.idm.codegen;

@SuppressWarnings("all")
public class Settings {
  private Boolean doGetterAndSetters = Boolean.FALSE;
  
  public Settings(final Boolean doGetterAndSetters) {
    this.doGetterAndSetters = doGetterAndSetters;
  }
  
  public Boolean doGetterAndSetters() {
    return this.doGetterAndSetters;
  }
  
  public Boolean doGetterAndSetters(final Boolean value) {
    return this.doGetterAndSetters = value;
  }
}
