package org.arcanite.idm.codegen;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class ClassGenerator {
  private final String PREFIX = "http://";
  
  private final String JAVA_LANG = "java.lang.";
  
  private final String JAVA_LIST = "java.util.List";
  
  private final String JAVA_ARRAY_LIST = "java.util.ArrayList";
  
  private final String JAVA_PERSISTENCE = "http://javax.persistence.";
  
  private final String MANY_TO_ONE = "javax.persistence.ManyToOne";
  
  private final String ONE_TO_MANY = "javax.persistence.OneToMany";
  
  private final String JAVA_FILE_EXTENSION = ".java";
  
  private final String DTO_SUFFIX = "Dto";
  
  private final Settings SETTINGS = new Settings(Boolean.FALSE);
  
  private EClass eClass;
  
  private String root;
  
  private String classFileName;
  
  private String dtoFileName;
  
  private List<String> imports = CollectionLiterals.<String>newArrayList();
  
  private List<String> dtoImports = CollectionLiterals.<String>newArrayList();
  
  private List<EAttribute> attributes = CollectionLiterals.<EAttribute>newArrayList();
  
  private List<EReference> references = CollectionLiterals.<EReference>newArrayList();
  
  private List<EAttribute> dtoAttributes = CollectionLiterals.<EAttribute>newArrayList();
  
  private List<EReference> dtoReferences = CollectionLiterals.<EReference>newArrayList();
  
  private List<EAnnotation> classAnnotations = CollectionLiterals.<EAnnotation>newArrayList();
  
  private List<EAnnotation> dtoAnnotations = CollectionLiterals.<EAnnotation>newArrayList();
  
  private Map<String, List<EAnnotation>> attributeAnnotations = CollectionLiterals.<String, List<EAnnotation>>newHashMap();
  
  private Map<String, List<EAnnotation>> referenceAnnotations = CollectionLiterals.<String, List<EAnnotation>>newHashMap();
  
  private Map<String, List<EAnnotation>> attributeDtoAnnotations = CollectionLiterals.<String, List<EAnnotation>>newHashMap();
  
  private Map<String, List<EAnnotation>> referenceDtoAnnotations = CollectionLiterals.<String, List<EAnnotation>>newHashMap();
  
  public ClassGenerator(final EClass eClass, final String root) {
    this.eClass = eClass;
    this.root = root;
    this.initialize();
    this.initializeDto();
  }
  
  public String className() {
    return this.eClass.getName();
  }
  
  public String dtoClassName() {
    String _name = this.eClass.getName();
    return (_name + this.DTO_SUFFIX);
  }
  
  public String packagePathSegment() {
    return this.eClass.getEPackage().getNsURI().replace(".", File.separator);
  }
  
  public String dtoPackagePathSegment() {
    String _replace = this.eClass.getEPackage().getNsURI().replace(".", File.separator);
    String _plus = (_replace + ".");
    String _lowerCase = this.DTO_SUFFIX.toLowerCase();
    return (_plus + _lowerCase);
  }
  
  public String initFileName(final String ending) {
    String _normalizePathSegment = this.normalizePathSegment(this.root);
    String _plus = (_normalizePathSegment + File.separator);
    String _normalizePathSegment_1 = this.normalizePathSegment(this.packagePathSegment());
    String _plus_1 = (_plus + _normalizePathSegment_1);
    String _plus_2 = (_plus_1 + File.separator);
    String _name = this.eClass.getName();
    String _plus_3 = (_plus_2 + _name);
    return (_plus_3 + ending);
  }
  
  public String initDtoFileName(final String ending) {
    String _normalizePathSegment = this.normalizePathSegment(this.root);
    String _plus = (_normalizePathSegment + File.separator);
    String _normalizePathSegment_1 = this.normalizePathSegment(this.dtoPackagePathSegment());
    String _plus_1 = (_plus + _normalizePathSegment_1);
    String _plus_2 = (_plus_1 + File.separator);
    String _dtoClassName = this.dtoClassName();
    String _plus_3 = (_plus_2 + _dtoClassName);
    return (_plus_3 + ending);
  }
  
  public String normalizePathSegment(final String path) {
    if (((path != null) && path.endsWith(File.separator))) {
      int _length = path.length();
      int _minus = (_length - 1);
      return path.substring(0, _minus);
    }
    return path;
  }
  
  public void initialize() {
    this.classFileName = this.initFileName(this.JAVA_FILE_EXTENSION);
    this.initializeAnnotationsAndImport();
  }
  
  public void initializeDto() {
    this.dtoFileName = this.initDtoFileName(this.JAVA_FILE_EXTENSION);
    this.initializeDtoAnnotationsAndImport();
  }
  
  public void initializeDtoAnnotationsAndImport() {
    final Procedure2<EAnnotation, Integer> _function = (EAnnotation q1, Integer q2) -> {
      boolean _startsWith = q1.getSource().startsWith(this.JAVA_PERSISTENCE);
      boolean _not = (!_startsWith);
      if (_not) {
        this.dtoAnnotations.add(q1);
        this.initialzeDtoAnnotationsImport(q1);
      }
    };
    IterableExtensions.<EAnnotation>forEach(this.eClass.getEAnnotations(), _function);
    final Procedure2<EAttribute, Integer> _function_1 = (EAttribute s1, Integer s2) -> {
      this.dtoAttributes.add(s1);
      this.initialzeDtoAttributeImport(s1);
      final Procedure2<EAnnotation, Integer> _function_2 = (EAnnotation q1, Integer q2) -> {
        List<EAnnotation> _xifexpression = null;
        List<EAnnotation> _get = this.attributeDtoAnnotations.get(s1.getName());
        boolean _tripleEquals = (_get == null);
        if (_tripleEquals) {
          _xifexpression = CollectionLiterals.<EAnnotation>newArrayList();
        } else {
          _xifexpression = this.attributeDtoAnnotations.get(s1.getName());
        }
        List<EAnnotation> list = _xifexpression;
        boolean _contains = list.contains(q1);
        boolean _not = (!_contains);
        if (_not) {
          list.add(q1);
          this.attributeDtoAnnotations.put(s1.getName(), list);
        }
        this.initialzeDtoAnnotationsImport(q1);
      };
      IterableExtensions.<EAnnotation>forEach(s1.getEAnnotations(), _function_2);
    };
    IterableExtensions.<EAttribute>forEach(this.eClass.getEAllAttributes(), _function_1);
    final Consumer<EReference> _function_2 = (EReference p1) -> {
      this.dtoReferences.add(p1);
      this.initializeDtoReferenceImports(p1);
      final Procedure2<EAnnotation, Integer> _function_3 = (EAnnotation q1, Integer q2) -> {
        List<EAnnotation> _xifexpression = null;
        List<EAnnotation> _get = this.referenceDtoAnnotations.get(p1.getName());
        boolean _tripleEquals = (_get == null);
        if (_tripleEquals) {
          _xifexpression = CollectionLiterals.<EAnnotation>newArrayList();
        } else {
          _xifexpression = this.referenceDtoAnnotations.get(p1.getName());
        }
        List<EAnnotation> list = _xifexpression;
        boolean _contains = list.contains(q1);
        boolean _not = (!_contains);
        if (_not) {
          list.add(q1);
          this.referenceDtoAnnotations.put(p1.getName(), list);
        }
        this.initialzeDtoAnnotationsImport(q1);
      };
      IterableExtensions.<EAnnotation>forEach(p1.getEAnnotations(), _function_3);
    };
    this.eClass.getEAllReferences().forEach(_function_2);
  }
  
  public void initializeAnnotationsAndImport() {
    final Procedure2<EAnnotation, Integer> _function = (EAnnotation q1, Integer q2) -> {
      this.classAnnotations.add(q1);
      this.initialzeAnnotationsImport(q1);
    };
    IterableExtensions.<EAnnotation>forEach(this.eClass.getEAnnotations(), _function);
    final Procedure2<EAttribute, Integer> _function_1 = (EAttribute s1, Integer s2) -> {
      this.attributes.add(s1);
      this.initialzeAttributeImport(s1);
      final Procedure2<EAnnotation, Integer> _function_2 = (EAnnotation q1, Integer q2) -> {
        List<EAnnotation> _xifexpression = null;
        List<EAnnotation> _get = this.attributeAnnotations.get(s1.getName());
        boolean _tripleEquals = (_get == null);
        if (_tripleEquals) {
          _xifexpression = CollectionLiterals.<EAnnotation>newArrayList();
        } else {
          _xifexpression = this.attributeAnnotations.get(s1.getName());
        }
        List<EAnnotation> list = _xifexpression;
        boolean _contains = list.contains(q1);
        boolean _not = (!_contains);
        if (_not) {
          list.add(q1);
          this.attributeAnnotations.put(s1.getName(), list);
        }
        this.initialzeAnnotationsImport(q1);
      };
      IterableExtensions.<EAnnotation>forEach(s1.getEAnnotations(), _function_2);
    };
    IterableExtensions.<EAttribute>forEach(this.eClass.getEAllAttributes(), _function_1);
    final Consumer<EReference> _function_2 = (EReference p1) -> {
      this.references.add(p1);
      this.initializeReferenceImports(p1);
      final Procedure2<EAnnotation, Integer> _function_3 = (EAnnotation q1, Integer q2) -> {
        List<EAnnotation> _xifexpression = null;
        List<EAnnotation> _get = this.referenceAnnotations.get(p1.getName());
        boolean _tripleEquals = (_get == null);
        if (_tripleEquals) {
          _xifexpression = CollectionLiterals.<EAnnotation>newArrayList();
        } else {
          _xifexpression = this.referenceAnnotations.get(p1.getName());
        }
        List<EAnnotation> list = _xifexpression;
        boolean _contains = list.contains(q1);
        boolean _not = (!_contains);
        if (_not) {
          list.add(q1);
          this.referenceAnnotations.put(p1.getName(), list);
        }
        this.initialzeAnnotationsImport(q1);
      };
      IterableExtensions.<EAnnotation>forEach(p1.getEAnnotations(), _function_3);
    };
    this.eClass.getEAllReferences().forEach(_function_2);
  }
  
  public boolean initialzeAnnotationsImport(final EAnnotation eAnnotation) {
    boolean _xblockexpression = false;
    {
      final String annotationImport = eAnnotation.getSource().substring(this.PREFIX.length());
      boolean _xifexpression = false;
      boolean _contains = this.imports.contains(annotationImport);
      boolean _not = (!_contains);
      if (_not) {
        _xifexpression = this.imports.add(annotationImport);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean initialzeDtoAnnotationsImport(final EAnnotation eAnnotation) {
    boolean _xblockexpression = false;
    {
      final String annotationImport = eAnnotation.getSource().substring(this.PREFIX.length());
      boolean _xifexpression = false;
      boolean _contains = this.dtoImports.contains(annotationImport);
      boolean _not = (!_contains);
      if (_not) {
        _xifexpression = this.dtoImports.add(annotationImport);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean initialzeAttributeImport(final EAttribute eAttribute) {
    boolean _xblockexpression = false;
    {
      final String attributeImport = eAttribute.getEAttributeType().getInstanceClassName();
      boolean _xifexpression = false;
      if ((((attributeImport != null) && (!this.imports.contains(attributeImport))) && (!attributeImport.startsWith(this.JAVA_LANG)))) {
        _xifexpression = this.imports.add(attributeImport);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean initialzeDtoAttributeImport(final EAttribute eAttribute) {
    boolean _xblockexpression = false;
    {
      final String attributeImport = eAttribute.getEAttributeType().getInstanceClassName();
      boolean _xifexpression = false;
      if ((((attributeImport != null) && (!this.dtoImports.contains(attributeImport))) && (!attributeImport.startsWith(this.JAVA_LANG)))) {
        _xifexpression = this.dtoImports.add(attributeImport);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean initializeReferenceImports(final EReference eReference) {
    boolean _xblockexpression = false;
    {
      final String referenceImport = eReference.getEReferenceType().getInstanceTypeName();
      boolean _contains = this.imports.contains(referenceImport);
      boolean _not = (!_contains);
      if (_not) {
        this.imports.add(referenceImport);
      }
      int _upperBound = eReference.getUpperBound();
      boolean _tripleEquals = (_upperBound == (-1));
      if (_tripleEquals) {
        boolean _contains_1 = this.imports.contains(this.JAVA_ARRAY_LIST);
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          this.imports.add(this.JAVA_ARRAY_LIST);
        }
        boolean _contains_2 = this.imports.contains(this.JAVA_LIST);
        boolean _not_2 = (!_contains_2);
        if (_not_2) {
          this.imports.add(this.JAVA_LIST);
        }
        boolean _contains_3 = this.imports.contains(this.ONE_TO_MANY);
        boolean _not_3 = (!_contains_3);
        if (_not_3) {
          this.imports.add(this.ONE_TO_MANY);
        }
      }
      boolean _xifexpression = false;
      int _upperBound_1 = eReference.getUpperBound();
      boolean _tripleNotEquals = (_upperBound_1 != (-1));
      if (_tripleNotEquals) {
        boolean _xifexpression_1 = false;
        boolean _contains_4 = this.imports.contains(this.MANY_TO_ONE);
        boolean _not_4 = (!_contains_4);
        if (_not_4) {
          _xifexpression_1 = this.imports.add(this.MANY_TO_ONE);
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean initializeDtoReferenceImports(final EReference eReference) {
    boolean _xblockexpression = false;
    {
      String _instanceTypeName = eReference.getEReferenceType().getInstanceTypeName();
      final String referenceImport = (_instanceTypeName + this.DTO_SUFFIX);
      boolean _contains = this.dtoImports.contains(referenceImport);
      boolean _not = (!_contains);
      if (_not) {
        this.dtoImports.add(referenceImport);
      }
      boolean _xifexpression = false;
      int _upperBound = eReference.getUpperBound();
      boolean _tripleEquals = (_upperBound == (-1));
      if (_tripleEquals) {
        boolean _xblockexpression_1 = false;
        {
          boolean _contains_1 = this.dtoImports.contains(this.JAVA_ARRAY_LIST);
          boolean _not_1 = (!_contains_1);
          if (_not_1) {
            this.dtoImports.add(this.JAVA_ARRAY_LIST);
          }
          boolean _xifexpression_1 = false;
          boolean _contains_2 = this.dtoImports.contains(this.JAVA_LIST);
          boolean _not_2 = (!_contains_2);
          if (_not_2) {
            _xifexpression_1 = this.dtoImports.add(this.JAVA_LIST);
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String getAnnotationName(final EAnnotation eAnnotation) {
    String _source = eAnnotation.getSource();
    boolean _tripleNotEquals = (_source != null);
    if (_tripleNotEquals) {
      int _xifexpression = (int) 0;
      int _lastIndexOf = eAnnotation.getSource().lastIndexOf(".");
      boolean _greaterThan = (_lastIndexOf > (-1));
      if (_greaterThan) {
        int _lastIndexOf_1 = eAnnotation.getSource().lastIndexOf(".");
        _xifexpression = (_lastIndexOf_1 + 1);
      } else {
        _xifexpression = 0;
      }
      int i = _xifexpression;
      return eAnnotation.getSource().substring(i);
    }
    return "";
  }
  
  public void render() {
    try {
      File file = new File(this.classFileName);
      file.getParentFile().mkdirs();
      file.createNewFile();
      final FileWriter fileWriter = new FileWriter(file);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      String _nsURI = this.eClass.getEPackage().getNsURI();
      String _plus = (_nsURI + ";");
      _builder.append(_plus);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        for(final String i : this.imports) {
          {
            boolean _isNotBlank = StringUtils.isNotBlank(i);
            if (_isNotBlank) {
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
        for(final EAnnotation a : this.classAnnotations) {
          String _renderAnnotation = this.renderAnnotation(a);
          _builder.append(_renderAnnotation);
          _builder.newLineIfNotEmpty();
        }
      }
      String _renderClass = this.renderClass();
      _builder.append(_renderClass);
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        for(final EAttribute f : this.attributes) {
          {
            List<EAnnotation> _get = this.attributeAnnotations.get(f.getName());
            boolean _tripleNotEquals = (_get != null);
            if (_tripleNotEquals) {
              {
                List<EAnnotation> _get_1 = this.attributeAnnotations.get(f.getName());
                for(final EAnnotation a_1 : _get_1) {
                  _builder.append("\t");
                  String _renderAnnotation_1 = this.renderAnnotation(a_1);
                  _builder.append(_renderAnnotation_1);
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.append("\t");
          _builder.append("private ");
          String _mapType = ETypeHelper.mapType(f);
          _builder.append(_mapType);
          _builder.append(" ");
          String _name = f.getName();
          _builder.append(_name);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          {
            Boolean _doGetterAndSetters = this.SETTINGS.doGetterAndSetters();
            if ((_doGetterAndSetters).booleanValue()) {
              _builder.append("\t");
              _builder.append("public void set");
              String _capitalize = StringUtils.capitalize(f.getName());
              _builder.append(_capitalize);
              _builder.append("(");
              String _mapType_1 = ETypeHelper.mapType(f);
              _builder.append(_mapType_1);
              _builder.append(" ");
              String _name_1 = f.getName();
              _builder.append(_name_1);
              _builder.append(" ) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("this.");
              String _name_2 = f.getName();
              _builder.append(_name_2);
              _builder.append(" = ");
              String _name_3 = f.getName();
              _builder.append(_name_3);
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              _builder.append("\t");
              _builder.append("public ");
              String _mapType_2 = ETypeHelper.mapType(f);
              _builder.append(_mapType_2);
              _builder.append(" get");
              String _capitalize_1 = StringUtils.capitalize(f.getName());
              _builder.append(_capitalize_1);
              _builder.append("() {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t", "\t");
              _builder.append("\t", "\t");
              _builder.append("return this.");
              String _name_4 = f.getName();
              _builder.append(_name_4, "\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}\t\t\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        for(final EReference ref : this.references) {
          {
            int _upperBound = ref.getUpperBound();
            boolean _tripleEquals = (_upperBound == (-1));
            if (_tripleEquals) {
              {
                List<EAnnotation> _get_2 = this.referenceAnnotations.get(ref.getName());
                boolean _tripleNotEquals_1 = (_get_2 != null);
                if (_tripleNotEquals_1) {
                  {
                    List<EAnnotation> _get_3 = this.referenceAnnotations.get(ref.getName());
                    for(final EAnnotation a_2 : _get_3) {
                      _builder.append("\t");
                      String _renderAnnotation_2 = this.renderAnnotation(a_2);
                      _builder.append(_renderAnnotation_2);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("\t");
              _builder.append("@OneToMany(mappedBy=\"");
              String _name_5 = ref.getEOpposite().getName();
              _builder.append(_name_5);
              _builder.append("\")");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("private List<");
              String _name_6 = ref.getEReferenceType().getName();
              _builder.append(_name_6);
              _builder.append("> ");
              String _name_7 = ref.getName();
              _builder.append(_name_7);
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              {
                Boolean _doGetterAndSetters_1 = this.SETTINGS.doGetterAndSetters();
                if ((_doGetterAndSetters_1).booleanValue()) {
                  _builder.append("\t");
                  _builder.append("public void set");
                  String _capitalize_2 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_2);
                  _builder.append("(List<");
                  String _name_8 = ref.getEReferenceType().getName();
                  _builder.append(_name_8);
                  _builder.append("> ");
                  String _name_9 = ref.getName();
                  _builder.append(_name_9);
                  _builder.append(") {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_10 = ref.getName();
                  _builder.append(_name_10, "\t");
                  _builder.append(" = ");
                  String _name_11 = ref.getName();
                  _builder.append(_name_11, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLineIfNotEmpty();
                  _builder.append(" ");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("public List<");
                  String _name_12 = ref.getEReferenceType().getName();
                  _builder.append(_name_12);
                  _builder.append("> get");
                  String _capitalize_3 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_3);
                  _builder.append("() {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return this.");
                  String _name_13 = ref.getName();
                  _builder.append(_name_13, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}\t\t\t\t\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.newLine();
            }
          }
          {
            int _upperBound_1 = ref.getUpperBound();
            boolean _tripleNotEquals_2 = (_upperBound_1 != (-1));
            if (_tripleNotEquals_2) {
              {
                List<EAnnotation> _get_4 = this.referenceAnnotations.get(ref.getName());
                boolean _tripleNotEquals_3 = (_get_4 != null);
                if (_tripleNotEquals_3) {
                  {
                    List<EAnnotation> _get_5 = this.referenceAnnotations.get(ref.getName());
                    for(final EAnnotation a_3 : _get_5) {
                      _builder.append("\t");
                      String _renderAnnotation_3 = this.renderAnnotation(a_3);
                      _builder.append(_renderAnnotation_3);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("\t");
              _builder.append("@ManyToOne");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("private ");
              String _name_14 = ref.getEReferenceType().getName();
              _builder.append(_name_14);
              _builder.append(" ");
              String _name_15 = ref.getName();
              _builder.append(_name_15);
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              {
                Boolean _doGetterAndSetters_2 = this.SETTINGS.doGetterAndSetters();
                if ((_doGetterAndSetters_2).booleanValue()) {
                  _builder.append("\t");
                  _builder.append("public void set");
                  String _capitalize_4 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_4);
                  _builder.append("(");
                  String _name_16 = ref.getEReferenceType().getName();
                  _builder.append(_name_16);
                  _builder.append(" ");
                  String _name_17 = ref.getName();
                  _builder.append(_name_17);
                  _builder.append(") {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_18 = ref.getName();
                  _builder.append(_name_18, "\t");
                  _builder.append(" = ");
                  String _name_19 = ref.getName();
                  _builder.append(_name_19, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLineIfNotEmpty();
                  _builder.append(" ");
                  _builder.newLine();
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("public ");
                  String _name_20 = ref.getEReferenceType().getName();
                  _builder.append(_name_20);
                  _builder.append(" get");
                  String _capitalize_5 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_5);
                  _builder.append("() {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return this.");
                  String _name_21 = ref.getName();
                  _builder.append(_name_21, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLineIfNotEmpty();
                  _builder.append(" ");
                  _builder.newLine();
                }
              }
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      final String content = _builder.toString();
      fileWriter.write(content);
      fileWriter.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void renderDto() {
    try {
      File file = new File(this.dtoFileName);
      file.getParentFile().mkdirs();
      file.createNewFile();
      final FileWriter fileWriter = new FileWriter(file);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      String _nsURI = this.eClass.getEPackage().getNsURI();
      String _plus = (_nsURI + ".dto;");
      _builder.append(_plus);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        for(final String i : this.dtoImports) {
          {
            boolean _isNotBlank = StringUtils.isNotBlank(i);
            if (_isNotBlank) {
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
        for(final EAnnotation a : this.dtoAnnotations) {
          String _renderAnnotation = this.renderAnnotation(a);
          _builder.append(_renderAnnotation);
          _builder.newLineIfNotEmpty();
        }
      }
      String _renderClass = this.renderClass();
      _builder.append(_renderClass);
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        for(final EAttribute f : this.dtoAttributes) {
          {
            List<EAnnotation> _get = this.attributeDtoAnnotations.get(f.getName());
            boolean _tripleNotEquals = (_get != null);
            if (_tripleNotEquals) {
              {
                List<EAnnotation> _get_1 = this.attributeDtoAnnotations.get(f.getName());
                for(final EAnnotation a_1 : _get_1) {
                  _builder.append("\t");
                  String _renderAnnotation_1 = this.renderAnnotation(a_1);
                  _builder.append(_renderAnnotation_1);
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.append("\t");
          _builder.append("private ");
          String _mapType = ETypeHelper.mapType(f);
          _builder.append(_mapType);
          _builder.append(" ");
          String _name = f.getName();
          _builder.append(_name);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          {
            Boolean _doGetterAndSetters = this.SETTINGS.doGetterAndSetters();
            if ((_doGetterAndSetters).booleanValue()) {
              _builder.append("\t");
              _builder.append("public void set");
              String _capitalize = StringUtils.capitalize(f.getName());
              _builder.append(_capitalize);
              _builder.append("(");
              String _mapType_1 = ETypeHelper.mapType(f);
              _builder.append(_mapType_1);
              _builder.append(" ");
              String _name_1 = f.getName();
              _builder.append(_name_1);
              _builder.append(" ) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("this.");
              String _name_2 = f.getName();
              _builder.append(_name_2);
              _builder.append(" = ");
              String _name_3 = f.getName();
              _builder.append(_name_3);
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              _builder.append("\t");
              _builder.append("public ");
              String _mapType_2 = ETypeHelper.mapType(f);
              _builder.append(_mapType_2);
              _builder.append(" get");
              String _capitalize_1 = StringUtils.capitalize(f.getName());
              _builder.append(_capitalize_1);
              _builder.append("() {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t", "\t");
              _builder.append("\t", "\t");
              _builder.append("return this.");
              String _name_4 = f.getName();
              _builder.append(_name_4, "\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}\t\t\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        for(final EReference ref : this.dtoReferences) {
          {
            int _upperBound = ref.getUpperBound();
            boolean _tripleEquals = (_upperBound == (-1));
            if (_tripleEquals) {
              {
                List<EAnnotation> _get_2 = this.referenceDtoAnnotations.get(ref.getName());
                boolean _tripleNotEquals_1 = (_get_2 != null);
                if (_tripleNotEquals_1) {
                  {
                    List<EAnnotation> _get_3 = this.referenceDtoAnnotations.get(ref.getName());
                    for(final EAnnotation a_2 : _get_3) {
                      _builder.append("\t");
                      String _renderAnnotation_2 = this.renderAnnotation(a_2);
                      _builder.append(_renderAnnotation_2);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("\t");
              _builder.append("private List<");
              String _name_5 = ref.getEReferenceType().getName();
              _builder.append(_name_5);
              _builder.append("> ");
              String _name_6 = ref.getName();
              _builder.append(_name_6);
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              {
                Boolean _doGetterAndSetters_1 = this.SETTINGS.doGetterAndSetters();
                if ((_doGetterAndSetters_1).booleanValue()) {
                  _builder.append("\t");
                  _builder.append("public void set");
                  String _capitalize_2 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_2);
                  _builder.append("(List<");
                  String _name_7 = ref.getEReferenceType().getName();
                  _builder.append(_name_7);
                  _builder.append("> ");
                  String _name_8 = ref.getName();
                  _builder.append(_name_8);
                  _builder.append(") {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_9 = ref.getName();
                  _builder.append(_name_9, "\t");
                  _builder.append(" = ");
                  String _name_10 = ref.getName();
                  _builder.append(_name_10, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLineIfNotEmpty();
                  _builder.append(" ");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("public List<");
                  String _name_11 = ref.getEReferenceType().getName();
                  _builder.append(_name_11);
                  _builder.append("> get");
                  String _capitalize_3 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_3);
                  _builder.append("() {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return this.");
                  String _name_12 = ref.getName();
                  _builder.append(_name_12, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}\t\t\t\t\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.newLine();
            }
          }
          {
            int _upperBound_1 = ref.getUpperBound();
            boolean _tripleNotEquals_2 = (_upperBound_1 != (-1));
            if (_tripleNotEquals_2) {
              {
                List<EAnnotation> _get_4 = this.referenceDtoAnnotations.get(ref.getName());
                boolean _tripleNotEquals_3 = (_get_4 != null);
                if (_tripleNotEquals_3) {
                  {
                    List<EAnnotation> _get_5 = this.referenceDtoAnnotations.get(ref.getName());
                    for(final EAnnotation a_3 : _get_5) {
                      _builder.append("\t");
                      String _renderAnnotation_3 = this.renderAnnotation(a_3);
                      _builder.append(_renderAnnotation_3);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("\t");
              _builder.append("private ");
              String _name_13 = ref.getEReferenceType().getName();
              _builder.append(_name_13);
              _builder.append(" ");
              String _name_14 = ref.getName();
              _builder.append(_name_14);
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              {
                Boolean _doGetterAndSetters_2 = this.SETTINGS.doGetterAndSetters();
                if ((_doGetterAndSetters_2).booleanValue()) {
                  _builder.append("\t");
                  _builder.append("public void set");
                  String _capitalize_4 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_4);
                  _builder.append("(");
                  String _name_15 = ref.getEReferenceType().getName();
                  _builder.append(_name_15);
                  _builder.append(" ");
                  String _name_16 = ref.getName();
                  _builder.append(_name_16);
                  _builder.append(") {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_17 = ref.getName();
                  _builder.append(_name_17, "\t");
                  _builder.append(" = ");
                  String _name_18 = ref.getName();
                  _builder.append(_name_18, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLineIfNotEmpty();
                  _builder.append(" ");
                  _builder.newLine();
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("public ");
                  String _name_19 = ref.getEReferenceType().getName();
                  _builder.append(_name_19);
                  _builder.append(" get");
                  String _capitalize_5 = StringUtils.capitalize(ref.getName());
                  _builder.append(_capitalize_5);
                  _builder.append("() {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return this.");
                  String _name_20 = ref.getName();
                  _builder.append(_name_20, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLineIfNotEmpty();
                  _builder.append(" ");
                  _builder.newLine();
                }
              }
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      final String content = _builder.toString();
      fileWriter.write(content);
      fileWriter.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String quoteAnnotationDetail(final String key, final String value) {
    if ((key.equalsIgnoreCase("name") || key.equalsIgnoreCase("columnDefition"))) {
      return (("\"" + value) + "\"");
    }
    return ((key + "=") + value);
  }
  
  public String renderDetails(final EAnnotation eAnnotation) {
    if ((((eAnnotation != null) && (eAnnotation.getDetails() != null)) && (eAnnotation.getDetails().size() > 0))) {
      final Function1<Map.Entry<String, String>, String> _function = (Map.Entry<String, String> e) -> {
        return this.quoteAnnotationDetail(e.getKey(), e.getValue());
      };
      List<String> detailsList = ListExtensions.<Map.Entry<String, String>, String>map(eAnnotation.getDetails(), _function);
      String _join = IterableExtensions.join(detailsList, ",");
      String _plus = ("(" + _join);
      return (_plus + ")");
    }
    return "";
  }
  
  public String renderAnnotation(final EAnnotation eAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@");
    String _annotationName = this.getAnnotationName(eAnnotation);
    _builder.append(_annotationName);
    String _renderDetails = this.renderDetails(eAnnotation);
    _builder.append(_renderDetails);
    return _builder.toString();
  }
  
  public String renderClass() {
    ArrayList<String> listImpl = CollectionLiterals.<String>newArrayList();
    ArrayList<String> listExtension = CollectionLiterals.<String>newArrayList();
    EList<EClass> _eSuperTypes = this.eClass.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      boolean _isInterface = superType.isInterface();
      if (_isInterface) {
        listImpl.add(superType.getName());
      } else {
        listExtension.add(superType.getName());
      }
    }
    String _xifexpression = null;
    boolean _isInterface_1 = this.eClass.isInterface();
    if (_isInterface_1) {
      _xifexpression = "interface";
    } else {
      _xifexpression = "class";
    }
    String _plus = ("public " + _xifexpression);
    String _plus_1 = (_plus + " ");
    String _name = this.eClass.getName();
    String definition = (_plus_1 + _name);
    boolean _isEmpty = listExtension.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _definition = definition;
      String _join = String.join(", ", listExtension);
      String _plus_2 = (" extends " + _join);
      definition = (_definition + _plus_2);
    }
    if (((!listImpl.isEmpty()) && this.eClass.isInterface())) {
      String _definition_1 = definition;
      String _join_1 = String.join(", ", listImpl);
      String _plus_3 = (" extends " + _join_1);
      definition = (_definition_1 + _plus_3);
    } else {
      if (((!listImpl.isEmpty()) && (!this.eClass.isInterface()))) {
        String _definition_2 = definition;
        String _join_2 = String.join(", ", listImpl);
        String _plus_4 = (" implements " + _join_2);
        definition = (_definition_2 + _plus_4);
      }
    }
    return definition;
  }
  
  public String renderDtoClass() {
    ArrayList<String> listImpl = CollectionLiterals.<String>newArrayList();
    ArrayList<String> listExtension = CollectionLiterals.<String>newArrayList();
    EList<EClass> _eSuperTypes = this.eClass.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      boolean _isInterface = superType.isInterface();
      if (_isInterface) {
        listImpl.add(superType.getName());
      } else {
        listExtension.add(superType.getName());
      }
    }
    String _xifexpression = null;
    boolean _isInterface_1 = this.eClass.isInterface();
    if (_isInterface_1) {
      _xifexpression = "interface";
    } else {
      _xifexpression = "class";
    }
    String _plus = ("public " + _xifexpression);
    String _plus_1 = (_plus + " ");
    String _dtoClassName = this.dtoClassName();
    String definition = (_plus_1 + _dtoClassName);
    boolean _isEmpty = listExtension.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _definition = definition;
      String _join = String.join(", ", listExtension);
      String _plus_2 = (" extends " + _join);
      definition = (_definition + _plus_2);
    }
    if (((!listImpl.isEmpty()) && this.eClass.isInterface())) {
      String _definition_1 = definition;
      String _join_1 = String.join(", ", listImpl);
      String _plus_3 = (" extends " + _join_1);
      definition = (_definition_1 + _plus_3);
    } else {
      if (((!listImpl.isEmpty()) && (!this.eClass.isInterface()))) {
        String _definition_2 = definition;
        String _join_2 = String.join(", ", listImpl);
        String _plus_4 = (" implements " + _join_2);
        definition = (_definition_2 + _plus_4);
      }
    }
    return definition;
  }
}
