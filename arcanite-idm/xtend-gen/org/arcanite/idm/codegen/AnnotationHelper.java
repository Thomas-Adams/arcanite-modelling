package org.arcanite.idm.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class AnnotationHelper {
  /**
   * Gets all annotations from each class of a package represented by the
   * corresponding ecore model file, @see @code{ModelLoader},
   * It puts all found annotations on the classes itself as on fields
   * into an annotation map of the form : [ key as string, value as list of string ]
   * @fileName the filename to the ecore model file
   * @return annotationMap
   */
  public static HashMap<String, List<EAnnotation>> buildAnnotations(final String fileName) {
    PackageModel model = ModelLoader.loadModel(fileName);
    final HashMap<String, List<EAnnotation>> annotationMap = CollectionLiterals.<String, List<EAnnotation>>newHashMap();
    final Consumer<EClass> _function = (EClass p1) -> {
      final ArrayList<EAnnotation> annotationList = CollectionLiterals.<EAnnotation>newArrayList();
      final Procedure2<EAnnotation, Integer> _function_1 = (EAnnotation q1, Integer q2) -> {
        annotationList.add(q1);
      };
      IterableExtensions.<EAnnotation>forEach(p1.getEAnnotations(), _function_1);
      annotationMap.put(p1.getName(), annotationList);
    };
    model.getEClasses().forEach(_function);
    final Consumer<EClass> _function_1 = (EClass p1) -> {
      final Procedure2<EStructuralFeature, Integer> _function_2 = (EStructuralFeature s1, Integer s2) -> {
        final ArrayList<EAnnotation> annotationList = CollectionLiterals.<EAnnotation>newArrayList();
        final Procedure2<EAnnotation, Integer> _function_3 = (EAnnotation q1, Integer q2) -> {
          annotationList.add(q1);
        };
        IterableExtensions.<EAnnotation>forEach(s1.getEAnnotations(), _function_3);
        String _name = p1.getName();
        String _plus = (_name + ".");
        String _name_1 = s1.getName();
        String _plus_1 = (_plus + _name_1);
        annotationMap.put(_plus_1, annotationList);
      };
      IterableExtensions.<EStructuralFeature>forEach(p1.getEAllStructuralFeatures(), _function_2);
    };
    model.getEClasses().forEach(_function_1);
    return annotationMap;
  }
  
  /**
   * Puts textual annotation values into double quotes.
   * @param key annotation property name
   * @param value annotation value
   */
  private static String quoteAnnotationDetail(final String key, final String value) {
    if ((key.equalsIgnoreCase("name") || key.equalsIgnoreCase("columnDefition"))) {
      return (("\"" + value) + "\"");
    }
    return ((key + "=") + value);
  }
  
  private static String getAnnotationName(final EAnnotation eAnnotation) {
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
  
  private static String parseDetails(final EAnnotation eAnnotation) {
    if ((((eAnnotation != null) && (eAnnotation.getDetails() != null)) && (eAnnotation.getDetails().size() > 0))) {
      final Function1<Map.Entry<String, String>, String> _function = (Map.Entry<String, String> e) -> {
        return AnnotationHelper.quoteAnnotationDetail(e.getKey(), e.getValue());
      };
      List<String> detailsList = ListExtensions.<Map.Entry<String, String>, String>map(eAnnotation.getDetails(), _function);
      String _join = IterableExtensions.join(detailsList, ",");
      String _plus = ("(" + _join);
      return (_plus + ")");
    }
    return "";
  }
  
  public static String renderAnnotation(final EAnnotation eAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@");
    String _annotationName = AnnotationHelper.getAnnotationName(eAnnotation);
    String _parseDetails = AnnotationHelper.parseDetails(eAnnotation);
    String _plus = (_annotationName + _parseDetails);
    _builder.append(_plus);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
