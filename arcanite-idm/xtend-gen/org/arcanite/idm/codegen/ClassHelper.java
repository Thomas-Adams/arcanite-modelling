package org.arcanite.idm.codegen;

import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ClassHelper extends AbstractGenerator {
  private static final Settings SETTINGS = new Settings(Boolean.FALSE);
  
  public static String compileField(final EClass eClass, final EAttribute attr, final Map<String, List<EAnnotation>> annotationMap) {
    ETypeHelper.mapType(attr);
    StringConcatenation _builder = new StringConcatenation();
    {
      List<EAnnotation> _collectFieldAnnotations = AbstractGenerator.collectFieldAnnotations(eClass, attr, annotationMap);
      for(final EAnnotation s : _collectFieldAnnotations) {
        String _renderAnnotation = AnnotationHelper.renderAnnotation(s);
        _builder.append(_renderAnnotation);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("private ");
    String _mapType = ETypeHelper.mapType(attr);
    _builder.append(_mapType);
    _builder.append(" ");
    String _name = attr.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Boolean _doGetterAndSetters = ClassHelper.SETTINGS.doGetterAndSetters();
      if ((_doGetterAndSetters).booleanValue()) {
        _builder.append("public void set");
        String _capitalize = StringUtils.capitalize(attr.getName());
        _builder.append(_capitalize);
        _builder.append("(");
        String _mapType_1 = ETypeHelper.mapType(attr);
        _builder.append(_mapType_1);
        _builder.append(" ");
        String _name_1 = attr.getName();
        _builder.append(_name_1);
        _builder.append(" ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _name_2 = attr.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" = ");
        String _name_3 = attr.getName();
        _builder.append(_name_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public ");
        String _mapType_2 = ETypeHelper.mapType(attr);
        _builder.append(_mapType_2);
        _builder.append(" get");
        String _capitalize_1 = StringUtils.capitalize(attr.getName());
        _builder.append(_capitalize_1);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.");
        String _name_4 = attr.getName();
        _builder.append(_name_4, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}\t\t\t\t");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
