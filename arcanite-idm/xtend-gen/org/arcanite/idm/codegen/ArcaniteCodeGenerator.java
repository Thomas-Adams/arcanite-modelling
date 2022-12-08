package org.arcanite.idm.codegen;

import com.google.common.collect.Iterables;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.arcanite.idm.IdmPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class ArcaniteCodeGenerator extends AbstractGenerator {
  private static String outputDir = "/home/tadams/enargit-eclipse-workspaces/arcanite-dsl/arcanite-idm/target";
  
  private static final IdmPackage ARCANITE_PACKAGE = IdmPackage.eINSTANCE;
  
  private static final Settings SETTINGS = new Settings(Boolean.FALSE);
  
  private static final String ANNOTATION_PREFIX = "http://";
  
  /**
   * Loops through all classes of a package and builds them
   */
  public static void buildClasses(final EPackage ePackage, final Map<String, List<EAnnotation>> annotationMap) {
    List<EClass> allClasses = PackageHelper.getAllClasses(ePackage);
    final HashMap<String, List<String>> importMap = CollectionLiterals.<String, List<String>>newHashMap();
    final Consumer<EClass> _function = (EClass e) -> {
      ArcaniteCodeGenerator.buildClass(e, annotationMap, importMap);
    };
    allClasses.stream().forEach(_function);
  }
  
  /**
   * Initialize a file writer along with its destination directories
   */
  public static Writer getFileWriter(final EClass eClass) {
    try {
      String _replace = eClass.getEPackage().getNsURI().replace(".", "/");
      String _plus = ((ArcaniteCodeGenerator.outputDir + "/") + _replace);
      String _plus_1 = (_plus + "/");
      String _name = eClass.getName();
      String _plus_2 = (_plus_1 + _name);
      String _plus_3 = (_plus_2 + ".java");
      File f = new File(_plus_3);
      f.getParentFile().mkdirs();
      f.createNewFile();
      return new FileWriter(f);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static String debugReference(final EClass eClass, final EReference ref, final Map<String, List<EAnnotation>> annotationMap) {
    String _xblockexpression = null;
    {
      String _name = eClass.getName();
      String _plus = ("eClass.name: " + _name);
      InputOutput.<String>println(_plus);
      String _xifexpression = null;
      int _upperBound = ref.getUpperBound();
      boolean _tripleEquals = (_upperBound == (-1));
      if (_tripleEquals) {
        _xifexpression = "List";
      } else {
        _xifexpression = "Single";
      }
      String _plus_1 = ("ref.upperBound: " + _xifexpression);
      InputOutput.<String>println(_plus_1);
      String _name_1 = ref.getName();
      String _plus_2 = ("ref.name: " + _name_1);
      InputOutput.<String>println(_plus_2);
      String _name_2 = ref.getEReferenceType().getName();
      String _plus_3 = ("ref.EReferenceType.name: " + _name_2);
      InputOutput.<String>println(_plus_3);
      String _name_3 = ref.getEOpposite().getName();
      String _plus_4 = ("ref.EOpposite.name: " + _name_3);
      InputOutput.<String>println(_plus_4);
      String _instanceTypeName = ref.getEReferenceType().getInstanceTypeName();
      String _plus_5 = ("ref.EReferenceType.instanceTypeName: " + _instanceTypeName);
      _xblockexpression = InputOutput.<String>println(_plus_5);
    }
    return _xblockexpression;
  }
  
  public static void collectImports(final EClass eClass, final Map<String, List<EAnnotation>> annotationMap, final Map<String, List<String>> importMap) {
    final Procedure2<EAnnotation, Integer> _function = (EAnnotation p1, Integer p2) -> {
      List<String> _get = importMap.get(eClass.getName());
      boolean _tripleEquals = (_get == null);
      if (_tripleEquals) {
        ArrayList<String> list = CollectionLiterals.<String>newArrayList();
        list.add(p1.getSource().substring(ArcaniteCodeGenerator.ANNOTATION_PREFIX.length()));
        importMap.put(eClass.getName(), list);
      } else {
        List<String> list_1 = importMap.get(eClass.getName());
        boolean _contains = list_1.contains(p1.getSource().substring(ArcaniteCodeGenerator.ANNOTATION_PREFIX.length()));
        boolean _not = (!_contains);
        if (_not) {
          list_1.add(p1.getSource().substring(ArcaniteCodeGenerator.ANNOTATION_PREFIX.length()));
          importMap.put(eClass.getName(), list_1);
        }
      }
    };
    IterableExtensions.<EAnnotation>forEach(AbstractGenerator.collectClassAnnotations(eClass, annotationMap), _function);
  }
  
  public static List<String> collectImports(final EClass eClass, final EAttribute eAttribute, final Map<String, List<EAnnotation>> annotationMap, final Map<String, List<String>> importMap) {
    List<String> _xblockexpression = null;
    {
      final Procedure2<EAnnotation, Integer> _function = (EAnnotation p1, Integer p2) -> {
        List<String> _get = importMap.get(eClass.getName());
        boolean _tripleEquals = (_get == null);
        if (_tripleEquals) {
          ArrayList<String> list = CollectionLiterals.<String>newArrayList();
          list.add(p1.getSource().substring(ArcaniteCodeGenerator.ANNOTATION_PREFIX.length()));
          importMap.put(eClass.getName(), list);
        } else {
          List<String> list_1 = importMap.get(eClass.getName());
          boolean _contains = list_1.contains(p1.getSource().substring(ArcaniteCodeGenerator.ANNOTATION_PREFIX.length()));
          boolean _not = (!_contains);
          if (_not) {
            list_1.add(p1.getSource().substring(ArcaniteCodeGenerator.ANNOTATION_PREFIX.length()));
            importMap.put(eClass.getName(), list_1);
          }
        }
      };
      IterableExtensions.<EAnnotation>forEach(AbstractGenerator.collectFieldAnnotations(eClass, eAttribute, annotationMap), _function);
      String s = ETypeHelper.mapTypeClassName(eAttribute);
      List<String> _xifexpression = null;
      boolean _startsWith = s.startsWith("java.lang");
      boolean _not = (!_startsWith);
      if (_not) {
        List<String> _xifexpression_1 = null;
        List<String> _get = importMap.get(eClass.getName());
        boolean _tripleEquals = (_get == null);
        if (_tripleEquals) {
          List<String> _xblockexpression_1 = null;
          {
            ArrayList<String> list = CollectionLiterals.<String>newArrayList();
            list.add(s);
            _xblockexpression_1 = importMap.put(eClass.getName(), list);
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          List<String> _xblockexpression_2 = null;
          {
            List<String> list = importMap.get(eClass.getName());
            List<String> _xifexpression_2 = null;
            boolean _contains = list.contains(s);
            boolean _not_1 = (!_contains);
            if (_not_1) {
              List<String> _xblockexpression_3 = null;
              {
                list.add(s);
                _xblockexpression_3 = importMap.put(eClass.getName(), list);
              }
              _xifexpression_2 = _xblockexpression_3;
            }
            _xblockexpression_2 = _xifexpression_2;
          }
          _xifexpression_1 = _xblockexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static List<String> collectImports(final EClass eClass, final EReference ref, final Map<String, List<EAnnotation>> annotationMap, final Map<String, List<String>> importMap) {
    List<String> _xblockexpression = null;
    {
      ArcaniteCodeGenerator.debugReference(eClass, ref, annotationMap);
      int _upperBound = ref.getUpperBound();
      boolean _tripleEquals = (_upperBound == (-1));
      if (_tripleEquals) {
        List<String> _get = importMap.get(eClass.getName());
        boolean _tripleEquals_1 = (_get == null);
        if (_tripleEquals_1) {
          ArrayList<String> list = CollectionLiterals.<String>newArrayList();
          list.add("java.util.List");
          importMap.put(eClass.getName(), list);
        } else {
          List<String> list_1 = importMap.get(eClass.getName());
          boolean _contains = list_1.contains("java.util.List");
          boolean _not = (!_contains);
          if (_not) {
            list_1.add("java.util.List");
            importMap.put(eClass.getName(), list_1);
          }
        }
        List<String> _get_1 = importMap.get(eClass.getName());
        boolean _tripleEquals_2 = (_get_1 == null);
        if (_tripleEquals_2) {
          ArrayList<String> list_2 = CollectionLiterals.<String>newArrayList();
          list_2.add("ava.util.ArrayList");
          importMap.put(eClass.getName(), list_2);
        } else {
          List<String> list_3 = importMap.get(eClass.getName());
          boolean _contains_1 = list_3.contains("java.util.ArrayList");
          boolean _not_1 = (!_contains_1);
          if (_not_1) {
            list_3.add("ava.util.ArrayList");
            importMap.put(eClass.getName(), list_3);
          }
        }
      }
      List<String> _xifexpression = null;
      List<String> _get_2 = importMap.get(eClass.getName());
      boolean _tripleEquals_3 = (_get_2 == null);
      if (_tripleEquals_3) {
        List<String> _xblockexpression_1 = null;
        {
          ArrayList<String> list_4 = CollectionLiterals.<String>newArrayList();
          list_4.add(ref.getEReferenceType().getInstanceTypeName());
          _xblockexpression_1 = importMap.put(eClass.getName(), list_4);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        List<String> _xblockexpression_2 = null;
        {
          List<String> list_4 = importMap.get(eClass.getName());
          List<String> _xifexpression_1 = null;
          boolean _contains_2 = list_4.contains(ref.getEReferenceType().getInstanceTypeName());
          boolean _not_2 = (!_contains_2);
          if (_not_2) {
            List<String> _xblockexpression_3 = null;
            {
              list_4.add(ref.getEReferenceType().getInstanceTypeName());
              _xblockexpression_3 = importMap.put(eClass.getName(), list_4);
            }
            _xifexpression_1 = _xblockexpression_3;
          }
          _xblockexpression_2 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_2;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Builds up the entire class and write the output back into the file system
   */
  public static void buildClass(final EClass eClass, final Map<String, List<EAnnotation>> annotationMap, final Map<String, List<String>> importMap) {
    try {
      Writer fileWriter = ArcaniteCodeGenerator.getFileWriter(eClass);
      ArcaniteCodeGenerator.collectImports(eClass, annotationMap, importMap);
      final Consumer<EAttribute> _function = (EAttribute p1) -> {
        ArcaniteCodeGenerator.collectImports(eClass, p1, annotationMap, importMap);
      };
      eClass.getEAllAttributes().forEach(_function);
      final Consumer<EReference> _function_1 = (EReference p1) -> {
        ArcaniteCodeGenerator.collectImports(eClass, p1, annotationMap, importMap);
      };
      eClass.getEAllReferences().forEach(_function_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      String _nsURI = eClass.getEPackage().getNsURI();
      String _plus = (_nsURI + ";");
      _builder.append(_plus);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        final Function1<Map.Entry<String, List<String>>, Boolean> _function_2 = (Map.Entry<String, List<String>> p1) -> {
          return Boolean.valueOf(p1.getKey().equals(eClass.getName()));
        };
        Iterable<Map.Entry<String, List<String>>> _filter = IterableExtensions.<Map.Entry<String, List<String>>>filter(importMap.entrySet(), _function_2);
        for(final Map.Entry<String, List<String>> s : _filter) {
          {
            List<String> _value = s.getValue();
            for(final String i : _value) {
              _builder.append("import ");
              _builder.append(i);
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      {
        List<EAnnotation> _collectClassAnnotations = AbstractGenerator.collectClassAnnotations(eClass, annotationMap);
        for(final EAnnotation s_1 : _collectClassAnnotations) {
          String _renderAnnotation = AnnotationHelper.renderAnnotation(s_1);
          _builder.append(_renderAnnotation);
          _builder.newLineIfNotEmpty();
        }
      }
      String _compileClass = InterfaceHelper.compileClass(eClass);
      _builder.append(_compileClass);
      _builder.append("  {");
      _builder.newLineIfNotEmpty();
      {
        EList<EAttribute> _eAllAttributes = eClass.getEAllAttributes();
        for(final EAttribute attr : _eAllAttributes) {
          _builder.append("\t");
          String _compileField = ArcaniteCodeGenerator.compileField(eClass, attr, annotationMap);
          _builder.append(_compileField, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        EList<EReference> _eAllReferences = eClass.getEAllReferences();
        for(final EReference ref : _eAllReferences) {
          _builder.append("\t");
          String _compileReference = ArcaniteCodeGenerator.compileReference(eClass, ref, annotationMap);
          _builder.append(_compileReference, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      String content = _builder.toString();
      fileWriter.write(content);
      fileWriter.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String compileField(final EClass eClass, final EAttribute attr, final Map<String, List<EAnnotation>> annotationMap) {
    boolean _isInterface = eClass.isInterface();
    if (_isInterface) {
      return InterfaceHelper.compileField(eClass, attr, annotationMap);
    } else {
      return ClassHelper.compileField(eClass, attr, annotationMap);
    }
  }
  
  public static String compileReference(final EClass eClass, final EReference ref, final Map<String, List<EAnnotation>> annotationMap) {
    ArcaniteCodeGenerator.debugReference(eClass, ref, annotationMap);
    StringConcatenation _builder = new StringConcatenation();
    {
      int _upperBound = ref.getUpperBound();
      boolean _tripleEquals = (_upperBound == (-1));
      if (_tripleEquals) {
        _builder.append("@OneToMany(mappedBy=\"");
        String _name = ref.getEOpposite().getName();
        _builder.append(_name);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("private List<");
        String _name_1 = ref.getEReferenceType().getName();
        _builder.append(_name_1);
        _builder.append("> ");
        String _name_2 = ref.getName();
        _builder.append(_name_2);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          Boolean _doGetterAndSetters = ArcaniteCodeGenerator.SETTINGS.doGetterAndSetters();
          if ((_doGetterAndSetters).booleanValue()) {
            _builder.append("public void set");
            String _capitalize = StringUtils.capitalize(ref.getName());
            _builder.append(_capitalize);
            _builder.append("(List<");
            String _name_3 = ref.getEReferenceType().getName();
            _builder.append(_name_3);
            _builder.append("> ");
            String _name_4 = ref.getName();
            _builder.append(_name_4);
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _name_5 = ref.getName();
            _builder.append(_name_5, "\t");
            _builder.append(" = ");
            String _name_6 = ref.getName();
            _builder.append(_name_6, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(" ");
            _builder.newLine();
            _builder.append("public List<");
            String _name_7 = ref.getEReferenceType().getName();
            _builder.append(_name_7);
            _builder.append("> get");
            String _capitalize_1 = StringUtils.capitalize(ref.getName());
            _builder.append(_capitalize_1);
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this.");
            String _name_8 = ref.getName();
            _builder.append(_name_8, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(" ");
            _builder.newLine();
          }
        }
      }
    }
    {
      int _upperBound_1 = ref.getUpperBound();
      boolean _tripleNotEquals = (_upperBound_1 != (-1));
      if (_tripleNotEquals) {
        _builder.append("@ManyToOne");
        _builder.newLine();
        _builder.append("private ");
        String _name_9 = ref.getEReferenceType().getName();
        _builder.append(_name_9);
        _builder.append(" ");
        String _name_10 = ref.getName();
        _builder.append(_name_10);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          Boolean _doGetterAndSetters_1 = ArcaniteCodeGenerator.SETTINGS.doGetterAndSetters();
          if ((_doGetterAndSetters_1).booleanValue()) {
            _builder.append("public void set");
            String _capitalize_2 = StringUtils.capitalize(ref.getName());
            _builder.append(_capitalize_2);
            _builder.append("(");
            String _name_11 = ref.getEReferenceType().getName();
            _builder.append(_name_11);
            _builder.append(" ");
            String _name_12 = ref.getName();
            _builder.append(_name_12);
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _name_13 = ref.getName();
            _builder.append(_name_13, "\t");
            _builder.append(" = ");
            String _name_14 = ref.getName();
            _builder.append(_name_14, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(" ");
            _builder.newLine();
            _builder.newLine();
            _builder.append("public ");
            String _name_15 = ref.getEReferenceType().getName();
            _builder.append(_name_15);
            _builder.append(" get");
            String _capitalize_3 = StringUtils.capitalize(ref.getName());
            _builder.append(_capitalize_3);
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this.");
            String _name_16 = ref.getName();
            _builder.append(_name_16, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append(" ");
            _builder.newLine();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  /**
   * Main entry point for code generation
   */
  public static void main2(final String[] args) {
    final HashMap<String, List<EAnnotation>> annotationMap = AnnotationHelper.buildAnnotations(ModelLoader.ARCANITE_ECORE);
    ArcaniteCodeGenerator.buildClasses(ArcaniteCodeGenerator.ARCANITE_PACKAGE, annotationMap);
  }
  
  public static void main3(final String[] args) {
    PackageModel model = ModelLoader.loadModel(ModelLoader.ARCANITE_ECORE);
    final Consumer<EClass> _function = (EClass clz) -> {
      InputOutput.<String>println(clz.getName());
      InputOutput.<String>println(clz.getInstanceTypeName());
      final Consumer<ETypeParameter> _function_1 = (ETypeParameter p) -> {
        InputOutput.<String>println(p.getName());
        final Consumer<EGenericType> _function_2 = (EGenericType b) -> {
          InputOutput.<String>println(b.getEClassifier().getName());
          InputOutput.<String>println(b.getEClassifier().getInstanceClassName());
        };
        p.getEBounds().forEach(_function_2);
      };
      clz.getETypeParameters().forEach(_function_1);
      final Consumer<EStructuralFeature> _function_2 = (EStructuralFeature f) -> {
        InputOutput.<EStructuralFeature>println(f);
        EGenericType _eGenericType = f.getEGenericType();
        boolean _tripleNotEquals = (_eGenericType != null);
        if (_tripleNotEquals) {
          InputOutput.<EGenericType>println(f.getEGenericType());
          ETypeParameter _eTypeParameter = f.getEGenericType().getETypeParameter();
          boolean _tripleNotEquals_1 = (_eTypeParameter != null);
          if (_tripleNotEquals_1) {
            InputOutput.<String>println(f.getEGenericType().getETypeParameter().getName());
          }
        }
      };
      clz.getEAllStructuralFeatures().forEach(_function_2);
      InputOutput.<String>println("--attr--");
      final Consumer<EAttribute> _function_3 = (EAttribute s) -> {
        InputOutput.<EAttribute>println(s);
        EGenericType _eGenericType = s.getEGenericType();
        boolean _tripleNotEquals = (_eGenericType != null);
        if (_tripleNotEquals) {
          InputOutput.<EGenericType>println(s.getEGenericType());
          ETypeParameter _eTypeParameter = s.getEGenericType().getETypeParameter();
          boolean _tripleNotEquals_1 = (_eTypeParameter != null);
          if (_tripleNotEquals_1) {
            InputOutput.<String>println(s.getEGenericType().getETypeParameter().getName());
          }
        }
      };
      clz.getEAllAttributes().forEach(_function_3);
      InputOutput.<String>println("==========================");
      final Consumer<EGenericType> _function_4 = (EGenericType st) -> {
        InputOutput.<EGenericType>println(st);
        InputOutput.<EClassifier>println(st.getEClassifier());
        InputOutput.<EList<ETypeParameter>>println(st.getEClassifier().getETypeParameters());
        final Consumer<ETypeParameter> _function_5 = (ETypeParameter t) -> {
          InputOutput.<String>println(t.getName());
          final Consumer<EGenericType> _function_6 = (EGenericType b) -> {
            InputOutput.<String>println(b.getEClassifier().getInstanceClassName());
          };
          t.getEBounds().forEach(_function_6);
        };
        st.getEClassifier().getETypeParameters().forEach(_function_5);
      };
      clz.getEAllGenericSuperTypes().forEach(_function_4);
      InputOutput.<EClass>println(clz);
      InputOutput.<String>println("--------------------------");
      final Consumer<EAttribute> _function_5 = (EAttribute attr) -> {
        InputOutput.<String>print(attr.getName());
        InputOutput.<String>print(" :: ");
        InputOutput.<String>print(attr.getEAttributeType().getName());
        InputOutput.<String>print(" :: ");
        InputOutput.<String>print(attr.getEAttributeType().getInstanceTypeName());
        InputOutput.<String>print(" :: ");
        InputOutput.<EClassifier>print(attr.getEGenericType().getERawType());
        InputOutput.<String>print(" :: ");
        InputOutput.<String>println(attr.getEAttributeType().getInstanceClassName());
      };
      clz.getEAttributes().forEach(_function_5);
      InputOutput.<String>println("==========================");
      InputOutput.<String>println("");
    };
    model.getEClasses().forEach(_function);
  }
  
  /**
   * Stubs not used for now, need to solve workflow issue first
   */
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _filter = Iterables.<EObject>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), EObject.class);
    for (final EObject o : _filter) {
      this.compile(o, fsa);
    }
  }
  
  /**
   * Stubs not used for now, need to solve workflow issue first
   */
  public void compile(final EObject e, final IFileSystemAccess fsa) {
    String _name = e.eClass().getName();
    String _plus = (_name + ".txt");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this is element ");
    String _name_1 = e.eClass().getName();
    _builder.append(_name_1);
    _builder.newLineIfNotEmpty();
    fsa.generateFile(_plus, _builder);
  }
  
  public static List<HashMap<String, String>> getClassTypeParameterNames(final EClass eClass) {
    List<HashMap<String, String>> _xblockexpression = null;
    {
      final HashMap<String, HashMap<String, String>> map = CollectionLiterals.<String, HashMap<String, String>>newHashMap();
      final Function1<ETypeParameter, HashMap<String, String>> _function = (ETypeParameter p) -> {
        return map.put(p.getName(), ArcaniteCodeGenerator.getBoundsOfTypeParameter(p));
      };
      _xblockexpression = ListExtensions.<ETypeParameter, HashMap<String, String>>map(eClass.getETypeParameters(), _function);
    }
    return _xblockexpression;
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
    boolean _isParameterized = ArcaniteCodeGenerator.isParameterized(eAttribute);
    if (_isParameterized) {
      return eAttribute.getEGenericType().getETypeParameter().getName();
    }
    return null;
  }
  
  public static void main(final String[] args) {
    PackageModel model = ModelLoader.loadModel(ModelLoader.ARCANITE_ECORE);
    List<EClass> allClasses = PackageHelper.getAllClasses(model.getEPackage());
    final Consumer<EClass> _function = (EClass eClass) -> {
      ArcaniteCodeGenerator.attributesOfClass(eClass);
    };
    allClasses.forEach(_function);
  }
  
  public static String generateSuper(final EClass eClass) {
    String _xblockexpression = null;
    {
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
          return ArcaniteCodeGenerator.generateTypeArgument(c);
        };
        String _get = IterableExtensions.<String>toList(ListExtensions.<EGenericType, String>map(eClass.getEGenericSuperTypes(), _function_1)).get(0);
        String _plus = (" extends " + _get);
        expression = (_expression_3 + _plus);
      }
      _xblockexpression = InputOutput.<String>println(expression);
    }
    return _xblockexpression;
  }
  
  public static String generateTypeArgument(final EGenericType eGenericType) {
    String _name = eGenericType.getEClassifier().getName();
    final Function1<EGenericType, CharSequence> _function = (EGenericType t) -> {
      return t.getEClassifier().getName();
    };
    String _join = IterableExtensions.<EGenericType>join(eGenericType.getETypeArguments(), "<", ", ", ">", _function);
    return (_name + _join);
  }
  
  public static void attributesOfClass(final EClass eClass) {
    EcoreUtil.resolveAll(eClass);
    final Consumer<EStructuralFeature> _function = (EStructuralFeature attr1) -> {
      if ((attr1 instanceof EAttribute)) {
        InputOutput.<String>print("attr.EAttributeType.name)                    :  ");
        InputOutput.<String>println(((EAttribute) attr1).getEAttributeType().getName());
        InputOutput.<String>print("attr.EAttributeType.instanceClassName)       :  ");
        InputOutput.<String>println(((EAttribute) attr1).getEAttributeType().getInstanceClassName());
        InputOutput.<String>print("attr.EAttributeType.ETypeParameters)         :  ");
        InputOutput.<EList<ETypeParameter>>println(((EAttribute) attr1).getEAttributeType().getETypeParameters());
        InputOutput.<String>print("attr.EAttributeType.EType)                   :  ");
        InputOutput.<EClassifier>println(((EAttribute) attr1).getEType());
        InputOutput.<String>print("attr.EAttributeType.EType.name)              :  ");
        InputOutput.<String>println(((EAttribute) attr1).getEType().getName());
        InputOutput.<String>print("attr.EAttributeType.EType.instanceClassName) :  ");
        InputOutput.<String>println(((EAttribute) attr1).getEType().getInstanceClassName());
        InputOutput.<String>print("attr.EGenericType)                           :  ");
        InputOutput.<EGenericType>println(((EAttribute)attr1).getEGenericType());
        InputOutput.<String>print("attr.EGenericType.EClassifier)               :  ");
        InputOutput.<EClassifier>println(((EAttribute)attr1).getEGenericType().getEClassifier());
        InputOutput.<String>print("attr.EGenericType.ETypeArguments)            :  ");
        InputOutput.<EList<EGenericType>>println(((EAttribute)attr1).getEGenericType().getETypeArguments());
        InputOutput.<String>print("attr.EGenericType.ERawType)                  :  ");
        InputOutput.<EClassifier>println(((EAttribute)attr1).getEGenericType().getERawType());
        InputOutput.<String>print("attr.EGenericType.ETypeParameter)            :  ");
        InputOutput.<ETypeParameter>println(((EAttribute)attr1).getEGenericType().getETypeParameter());
        InputOutput.<String>print("attr.EGenericType.ETypeParameter.name)       :  ");
        String _xifexpression = null;
        ETypeParameter _eTypeParameter = ((EAttribute)attr1).getEGenericType().getETypeParameter();
        boolean _tripleNotEquals = (_eTypeParameter != null);
        if (_tripleNotEquals) {
          _xifexpression = ((EAttribute)attr1).getEGenericType().getETypeParameter().getName();
        } else {
          _xifexpression = "";
        }
        InputOutput.<String>println(_xifexpression);
        InputOutput.<String>println("==========================================================================================");
      }
    };
    eClass.getEAllStructuralFeatures().forEach(_function);
  }
  
  public static boolean isFieldParamerterized(final EAttribute attr) {
    String _name = attr.getEGenericType().getETypeParameter().getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      return true;
    }
    return false;
  }
  
  public static String getTypeParamerterOrType(final EAttribute attr) {
    boolean _isFieldParamerterized = ArcaniteCodeGenerator.isFieldParamerterized(attr);
    if (_isFieldParamerterized) {
      return attr.getEGenericType().getETypeParameter().getName();
    }
    return attr.getEAttributeType().getName();
  }
  
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
    Class<?> _get = ArcaniteCodeGenerator.getMappedTypes().get(eAttribute.getEAttributeType().getInstanceClassName());
    boolean _tripleNotEquals = (_get != null);
    if (_tripleNotEquals) {
      _xifexpression = ArcaniteCodeGenerator.getMappedTypes().get(
        eAttribute.getEAttributeType().getInstanceClassName()).getSimpleName();
    } else {
      _xifexpression = eAttribute.getEAttributeType().getName();
    }
    return _xifexpression;
  }
  
  public static String mapTypeClassName(final EAttribute eAttribute) {
    String _xifexpression = null;
    Class<?> _get = ArcaniteCodeGenerator.getMappedTypes().get(eAttribute.getEAttributeType().getInstanceClassName());
    boolean _tripleNotEquals = (_get != null);
    if (_tripleNotEquals) {
      _xifexpression = ArcaniteCodeGenerator.getMappedTypes().get(
        eAttribute.getEAttributeType().getInstanceClassName()).getCanonicalName();
    } else {
      _xifexpression = eAttribute.getEAttributeType().getInstanceClassName();
    }
    return _xifexpression;
  }
}
