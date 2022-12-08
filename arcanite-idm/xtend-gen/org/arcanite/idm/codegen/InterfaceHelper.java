package org.arcanite.idm.codegen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InterfaceHelper extends AbstractGenerator {
  private static final Settings SETTINGS = new Settings(Boolean.FALSE);
  
  /**
   * Generates code snippet for the class resp. interface definition part
   * @param eClass EClass instance for which a definition is built.
   * @return textual representation of the definition part
   */
  public static String compileClass(final EClass eClass) {
    ArrayList<String> listImpl = new ArrayList<String>();
    ArrayList<String> listExtension = new ArrayList<String>();
    EList<EClass> _eSuperTypes = eClass.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      boolean _isInterface = superType.isInterface();
      if (_isInterface) {
        listImpl.add(superType.getName());
      } else {
        listExtension.add(superType.getName());
      }
    }
    String _xifexpression = null;
    boolean _isInterface_1 = eClass.isInterface();
    if (_isInterface_1) {
      _xifexpression = "interface";
    } else {
      _xifexpression = "class";
    }
    String _plus = ("public " + _xifexpression);
    String _plus_1 = (_plus + " ");
    String _name = eClass.getName();
    String definition = (_plus_1 + _name);
    boolean _isEmpty = listExtension.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _definition = definition;
      String _join = String.join(", ", listExtension);
      String _plus_2 = (" extends " + _join);
      definition = (_definition + _plus_2);
    }
    if (((!listImpl.isEmpty()) && eClass.isInterface())) {
      String _definition_1 = definition;
      String _join_1 = String.join(", ", listImpl);
      String _plus_3 = (" extends " + _join_1);
      definition = (_definition_1 + _plus_3);
    } else {
      if (((!listImpl.isEmpty()) && (!eClass.isInterface()))) {
        String _definition_2 = definition;
        String _join_2 = String.join(", ", listImpl);
        String _plus_4 = (" implements " + _join_2);
        definition = (_definition_2 + _plus_4);
      }
    }
    return definition;
  }
  
  public static String compileField(final EClass eClass, final EAttribute attr, final Map<String, List<EAnnotation>> annotationMap) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<EAnnotation> _collectFieldAnnotations = AbstractGenerator.collectFieldAnnotations(eClass, attr, annotationMap);
      for(final EAnnotation s : _collectFieldAnnotations) {
        _builder.append("@");
        String _renderAnnotation = AnnotationHelper.renderAnnotation(s);
        _builder.append(_renderAnnotation);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Boolean _doGetterAndSetters = InterfaceHelper.SETTINGS.doGetterAndSetters();
      if ((_doGetterAndSetters).booleanValue()) {
        String _compileFieldAccessors = InterfaceHelper.compileFieldAccessors(eClass, attr, annotationMap);
        _builder.append(_compileFieldAccessors);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public static String compileFieldAccessors(final EClass eClass, final EAttribute attr, final Map<String, List<EAnnotation>> annotationMap) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _capitalize = StringUtils.capitalize(attr.getName());
    _builder.append(_capitalize);
    _builder.append("(");
    String _name = attr.getEAttributeType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _name_1 = attr.getName();
    _builder.append(_name_1);
    _builder.append(" );");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    String _name_2 = attr.getEAttributeType().getName();
    _builder.append(_name_2);
    _builder.append(" get");
    String _capitalize_1 = StringUtils.capitalize(attr.getName());
    _builder.append(_capitalize_1);
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
