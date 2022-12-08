package org.arcanite.idm.codegen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;

@SuppressWarnings("all")
public class ETypeHelper extends AbstractGenerator {
  public static Map<String, Class<?>> getMappedTypes() {
    HashMap<String, Class<?>> typesMap = new HashMap<String, Class<?>>();
    typesMap.put("java.util.Date", OffsetDateTime.class);
    typesMap.put("java.lang.Long", Long.class);
    typesMap.put("java.lang.Boolean", Boolean.class);
    typesMap.put("java.lang.String", String.class);
    typesMap.put("java.math.BigDecimal", BigDecimal.class);
    typesMap.put("java.time.OffsetDateTime", OffsetDateTime.class);
    typesMap.put("java.io.Serializable", Serializable.class);
    return typesMap;
  }
  
  public static String mapType(final EAttribute eAttribute) {
    String _xifexpression = null;
    Class<?> _get = ETypeHelper.getMappedTypes().get(eAttribute.getEAttributeType().getInstanceClassName());
    boolean _tripleNotEquals = (_get != null);
    if (_tripleNotEquals) {
      _xifexpression = ETypeHelper.getMappedTypes().get(
        eAttribute.getEAttributeType().getInstanceClassName()).getSimpleName();
    } else {
      _xifexpression = eAttribute.getEAttributeType().getName();
    }
    return _xifexpression;
  }
  
  public static String mapTypeClassName(final EAttribute eAttribute) {
    String _xifexpression = null;
    Class<?> _get = ETypeHelper.getMappedTypes().get(eAttribute.getEAttributeType().getInstanceClassName());
    boolean _tripleNotEquals = (_get != null);
    if (_tripleNotEquals) {
      _xifexpression = ETypeHelper.getMappedTypes().get(
        eAttribute.getEAttributeType().getInstanceClassName()).getCanonicalName();
    } else {
      _xifexpression = eAttribute.getEAttributeType().getInstanceClassName();
    }
    return _xifexpression;
  }
}
