package org.arcanite.idm.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class ImportHelper {
  public static class GenericTypeParam {
    public String name = "";
    
    public String simpleClassName = "";
    
    public String instanceClassname = "";
    
    public GenericTypeParam(final String name) {
      this.name = name;
    }
    
    public GenericTypeParam(final String name, final String simpleClassName, final String instanceClassname) {
      this.name = name;
      this.simpleClassName = simpleClassName;
      this.instanceClassname = instanceClassname;
    }
  }
  
  private static final String PREFIX = "http://";
  
  private static final String JAVA_LANG = "java.lang.";
  
  private static final String JAVA_LIST = "java.util.List";
  
  private static final String JAVA_ARRAY_LIST = "java.util.ArrayList";
  
  private static final String MANY_TO_ONE = "javax.persistence.ManyToOne";
  
  private static final String ONE_TO_MANY = "javax.persistence.OneToMany";
  
  private static final String JAVA_PERSISTENCE_PREFIX = "javax.persistence.";
  
  public static List<String> importInitialize(final EClass eClass) {
    final ArrayList<String> classImports = CollectionLiterals.<String>newArrayList();
    final HashMap<String, ArrayList<EAnnotation>> attributeAnnotations = CollectionLiterals.<String, ArrayList<EAnnotation>>newHashMap();
    final HashMap<String, ArrayList<EAnnotation>> referenceAnnotations = CollectionLiterals.<String, ArrayList<EAnnotation>>newHashMap();
    final Procedure2<EAnnotation, Integer> _function = (EAnnotation q1, Integer q2) -> {
      final String annotationImport = q1.getSource().substring(ImportHelper.PREFIX.length());
      boolean _contains = classImports.contains(annotationImport);
      boolean _not = (!_contains);
      if (_not) {
        classImports.add(annotationImport);
      }
    };
    IterableExtensions.<EAnnotation>forEach(eClass.getEAnnotations(), _function);
    final Procedure2<EAttribute, Integer> _function_1 = (EAttribute s1, Integer s2) -> {
      final String attributeImport = s1.getEAttributeType().getInstanceClassName();
      if ((((attributeImport != null) && (!classImports.contains(attributeImport))) && 
        (!attributeImport.startsWith(ImportHelper.JAVA_LANG)))) {
        classImports.add(attributeImport);
      }
      final Procedure2<EAnnotation, Integer> _function_2 = (EAnnotation q1, Integer q2) -> {
        ArrayList<EAnnotation> _xifexpression = null;
        ArrayList<EAnnotation> _get = attributeAnnotations.get(s1.getName());
        boolean _tripleEquals = (_get == null);
        if (_tripleEquals) {
          _xifexpression = CollectionLiterals.<EAnnotation>newArrayList();
        } else {
          _xifexpression = attributeAnnotations.get(s1.getName());
        }
        ArrayList<EAnnotation> list = _xifexpression;
        boolean _contains = list.contains(q1);
        boolean _not = (!_contains);
        if (_not) {
          list.add(q1);
          attributeAnnotations.put(s1.getName(), list);
        }
        final String annotationImport = q1.getSource().substring(ImportHelper.PREFIX.length());
        boolean _contains_1 = classImports.contains(annotationImport);
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          classImports.add(annotationImport);
        }
      };
      IterableExtensions.<EAnnotation>forEach(s1.getEAnnotations(), _function_2);
    };
    IterableExtensions.<EAttribute>forEach(eClass.getEAllAttributes(), _function_1);
    final Consumer<EReference> _function_2 = (EReference p1) -> {
      final String referenceImport = p1.getEReferenceType().getInstanceTypeName();
      boolean _contains = classImports.contains(referenceImport);
      boolean _not = (!_contains);
      if (_not) {
        classImports.add(referenceImport);
      }
      int _upperBound = p1.getUpperBound();
      boolean _tripleEquals = (_upperBound == (-1));
      if (_tripleEquals) {
        boolean _contains_1 = classImports.contains(ImportHelper.JAVA_ARRAY_LIST);
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          classImports.add(ImportHelper.JAVA_ARRAY_LIST);
        }
        boolean _contains_2 = classImports.contains(ImportHelper.JAVA_LIST);
        boolean _not_2 = (!_contains_2);
        if (_not_2) {
          classImports.add(ImportHelper.JAVA_LIST);
        }
        boolean _contains_3 = classImports.contains(ImportHelper.ONE_TO_MANY);
        boolean _not_3 = (!_contains_3);
        if (_not_3) {
          classImports.add(ImportHelper.ONE_TO_MANY);
        }
      }
      int _upperBound_1 = p1.getUpperBound();
      boolean _tripleNotEquals = (_upperBound_1 != (-1));
      if (_tripleNotEquals) {
        boolean _contains_4 = classImports.contains(ImportHelper.MANY_TO_ONE);
        boolean _not_4 = (!_contains_4);
        if (_not_4) {
          classImports.add(ImportHelper.MANY_TO_ONE);
        }
      }
      final Procedure2<EAnnotation, Integer> _function_3 = (EAnnotation q1, Integer q2) -> {
        ArrayList<EAnnotation> _xifexpression = null;
        ArrayList<EAnnotation> _get = referenceAnnotations.get(p1.getName());
        boolean _tripleEquals_1 = (_get == null);
        if (_tripleEquals_1) {
          _xifexpression = CollectionLiterals.<EAnnotation>newArrayList();
        } else {
          _xifexpression = referenceAnnotations.get(p1.getName());
        }
        ArrayList<EAnnotation> list = _xifexpression;
        boolean _contains_5 = list.contains(q1);
        boolean _not_5 = (!_contains_5);
        if (_not_5) {
          list.add(q1);
          referenceAnnotations.put(p1.getName(), list);
        }
        final String annotationImport = q1.getSource().substring(ImportHelper.PREFIX.length());
        boolean _contains_6 = classImports.contains(annotationImport);
        boolean _not_6 = (!_contains_6);
        if (_not_6) {
          classImports.add(annotationImport);
        }
      };
      IterableExtensions.<EAnnotation>forEach(p1.getEAnnotations(), _function_3);
    };
    eClass.getEAllReferences().forEach(_function_2);
    final Consumer<ETypeParameter> _function_3 = (ETypeParameter p) -> {
      final Consumer<EGenericType> _function_4 = (EGenericType b) -> {
        boolean _contains = classImports.contains(b.getEClassifier().getInstanceClassName());
        boolean _not = (!_contains);
        if (_not) {
          classImports.add(b.getEClassifier().getInstanceClassName());
        }
      };
      p.getEBounds().forEach(_function_4);
    };
    eClass.getETypeParameters().forEach(_function_3);
    return IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(classImports));
  }
  
  public static List<String> importInitializeDto(final EClass eClass) {
    List<String> dtoImports = ImportHelper.importInitialize(eClass);
    final Function1<String, Boolean> _function = (String s) -> {
      boolean _startsWith = s.startsWith(ImportHelper.JAVA_PERSISTENCE_PREFIX);
      return Boolean.valueOf((!_startsWith));
    };
    return IterableExtensions.<String>toList(IterableExtensions.<String>filter(dtoImports, _function));
  }
  
  public static String dtoFileFromClass(final EClass eClass) {
    String _xifexpression = null;
    boolean _endsWith = eClass.getName().endsWith("Entity");
    if (_endsWith) {
      _xifexpression = eClass.getName().replace("Entity", "Dto");
    } else {
      String _name = eClass.getName();
      _xifexpression = (_name + "Dto");
    }
    return _xifexpression;
  }
  
  public static HashMap<String, HashMap<String, String>> parameterizedTypes(final EClass eClass) {
    final HashMap<String, HashMap<String, String>> types = CollectionLiterals.<String, HashMap<String, String>>newHashMap();
    final Consumer<ETypeParameter> _function = (ETypeParameter p) -> {
      final Consumer<EGenericType> _function_1 = (EGenericType b) -> {
        final HashMap<String, String> map = CollectionLiterals.<String, String>newHashMap();
        map.put("name", b.getEClassifier().getName());
        map.put("import", b.getEClassifier().getInstanceClassName());
        types.put(p.getName(), map);
      };
      p.getEBounds().forEach(_function_1);
    };
    eClass.getETypeParameters().forEach(_function);
    return types;
  }
  
  public static boolean hasTypeParameters(final EClass eClass) {
    final HashMap<String, HashMap<String, String>> typesMap = ImportHelper.parameterizedTypes(eClass);
    boolean _isEmpty = typesMap.isEmpty();
    return (!_isEmpty);
  }
  
  public static ArrayList<ImportHelper.GenericTypeParam> getClassTypeParameterNames(final EClass eClass) {
    final ArrayList<ImportHelper.GenericTypeParam> list = CollectionLiterals.<ImportHelper.GenericTypeParam>newArrayList();
    final Consumer<ETypeParameter> _function = (ETypeParameter p) -> {
      final Function1<EGenericType, ImportHelper.GenericTypeParam> _function_1 = (EGenericType b) -> {
        String _name = p.getName();
        String _name_1 = b.getEClassifier().getName();
        String _instanceClassName = b.getEClassifier().getInstanceClassName();
        return new ImportHelper.GenericTypeParam(_name, _name_1, _instanceClassName);
      };
      list.addAll(IterableExtensions.<ImportHelper.GenericTypeParam>toList(ListExtensions.<EGenericType, ImportHelper.GenericTypeParam>map(p.getEBounds(), _function_1)));
    };
    eClass.getETypeParameters().forEach(_function);
    return list;
  }
  
  public static HashMap<String, String> getBoundsOfTypeParameter(final ETypeParameter parameter) {
    final HashMap<String, String> map = CollectionLiterals.<String, String>newHashMap();
    final Function1<EGenericType, String> _function = (EGenericType b) -> {
      return map.put(b.getEClassifier().getName(), b.getEClassifier().getInstanceClassName());
    };
    /* ListExtensions.<EGenericType, String>map(parameter.getEBounds(), _function); */
    return map;
  }
  
  public static boolean isParameterized(final EAttribute eAttribute) {
    return (((eAttribute.getEGenericType() != null) && (eAttribute.getEGenericType().getETypeParameter() != null)) && 
      (eAttribute.getEGenericType().getETypeParameter().getName() != null));
  }
  
  public static boolean hasParameter(final EAttribute eAttribute, final String paramName) {
    return ((((eAttribute.getEGenericType() != null) && (eAttribute.getEGenericType().getETypeParameter() != null)) && 
      (eAttribute.getEGenericType().getETypeParameter().getName() != null)) && 
      eAttribute.getEGenericType().getETypeParameter().getName().equals(paramName));
  }
  
  public static String getParameter(final EAttribute eAttribute) {
    boolean _isParameterized = ImportHelper.isParameterized(eAttribute);
    if (_isParameterized) {
      return eAttribute.getEGenericType().getETypeParameter().getName();
    }
    return null;
  }
  
  public static String generateClassDef(final EClass eClass) {
    String _name = eClass.getName();
    String expression = ("public class " + _name);
    int _size = eClass.getETypeParameters().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _expression = expression;
      expression = (_expression + "<");
      final Function1<ETypeParameter, String> _function = (ETypeParameter t) -> {
        String _name_1 = t.getName();
        String _plus = (_name_1 + " extends ");
        final Function1<EGenericType, String> _function_1 = (EGenericType b) -> {
          return b.getEClassifier().getName();
        };
        String _get = IterableExtensions.<String>toList(ListExtensions.<EGenericType, String>map(t.getEBounds(), _function_1)).get(0);
        return (_plus + _get);
      };
      final List<String> list = IterableExtensions.<String>toList(ListExtensions.<ETypeParameter, String>map(eClass.getETypeParameters(), _function));
      String _expression_1 = expression;
      String _join = IterableExtensions.join(list, ", ");
      expression = (_expression_1 + _join);
      String _expression_2 = expression;
      expression = (_expression_2 + ">");
    }
    int _size_1 = eClass.getEGenericSuperTypes().size();
    boolean _greaterThan_1 = (_size_1 > 0);
    if (_greaterThan_1) {
      String _expression_3 = expression;
      final Function1<EGenericType, String> _function_1 = (EGenericType c) -> {
        return ImportHelper.generateTypeArgument(c);
      };
      String _get = IterableExtensions.<String>toList(ListExtensions.<EGenericType, String>map(eClass.getEGenericSuperTypes(), _function_1)).get(0);
      String _plus = (" extends " + _get);
      expression = (_expression_3 + _plus);
    }
    return expression;
  }
  
  public static String generateDtoDef(final EClass eClass) {
    String _buildDtoName = ImportHelper.buildDtoName(eClass.getName());
    String expression = ("public class " + _buildDtoName);
    int _size = eClass.getETypeParameters().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _expression = expression;
      expression = (_expression + "<");
      final Function1<ETypeParameter, String> _function = (ETypeParameter t) -> {
        String _name = t.getName();
        String _plus = (_name + " extends ");
        final Function1<EGenericType, String> _function_1 = (EGenericType b) -> {
          return b.getEClassifier().getName();
        };
        String _get = IterableExtensions.<String>toList(ListExtensions.<EGenericType, String>map(t.getEBounds(), _function_1)).get(0);
        return (_plus + _get);
      };
      final List<String> list = IterableExtensions.<String>toList(ListExtensions.<ETypeParameter, String>map(eClass.getETypeParameters(), _function));
      String _expression_1 = expression;
      String _join = IterableExtensions.join(list, ", ");
      expression = (_expression_1 + _join);
      String _expression_2 = expression;
      expression = (_expression_2 + ">");
    }
    int _size_1 = eClass.getEGenericSuperTypes().size();
    boolean _greaterThan_1 = (_size_1 > 0);
    if (_greaterThan_1) {
      String _expression_3 = expression;
      final Function1<EGenericType, String> _function_1 = (EGenericType c) -> {
        return ImportHelper.generateTypeArgument(c);
      };
      String _get = IterableExtensions.<String>toList(ListExtensions.<EGenericType, String>map(eClass.getEGenericSuperTypes(), _function_1)).get(0);
      String _plus = (" extends " + _get);
      expression = (_expression_3 + _plus);
    }
    return expression;
  }
  
  public static String buildDtoName(final String name) {
    boolean _endsWith = name.endsWith("Entity");
    if (_endsWith) {
      return name.replace("Entity", "Dto");
    }
    return (name + "Dto");
  }
  
  public static String generateTypeArgument(final EGenericType eGenericType) {
    String _buildDtoName = ImportHelper.buildDtoName(eGenericType.getEClassifier().getName());
    final Function1<EGenericType, CharSequence> _function = (EGenericType t) -> {
      return t.getEClassifier().getName();
    };
    String _join = IterableExtensions.<EGenericType>join(eGenericType.getETypeArguments(), "<", ", ", ">", _function);
    return (_buildDtoName + _join);
  }
  
  public static boolean isFieldParameterized(final EAttribute attr) {
    if ((((attr.getEGenericType() != null) && (attr.getEGenericType().getETypeParameter() != null)) && 
      (attr.getEGenericType().getETypeParameter().getName() != null))) {
      return true;
    }
    return false;
  }
  
  public static String getTypeParamerterOrType(final EAttribute attr) {
    boolean _isFieldParameterized = ImportHelper.isFieldParameterized(attr);
    if (_isFieldParameterized) {
      return attr.getEGenericType().getETypeParameter().getName();
    }
    return attr.getEAttributeType().getName();
  }
}
