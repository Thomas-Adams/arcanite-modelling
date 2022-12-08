package org.arcanite.idm.codegen;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

@SuppressWarnings("all")
public class Utils {
  public static String pluralize(final String name) {
    boolean _endsWith = name.endsWith("y");
    if (_endsWith) {
      int _length = name.length();
      int _minus = (_length - 1);
      String _substring = name.substring(0, _minus);
      return (_substring + "ies");
    }
    return (name + "s");
  }
  
  public static boolean hasIsManyToMany(final EClass eClass, final EReference ref) {
    if (((ref.getEOpposite() != null) && StringUtils.isNotBlank(ref.getEOpposite().getName()))) {
      return true;
    }
    return false;
  }
}
