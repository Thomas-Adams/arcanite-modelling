package org.arcanite.idm.codegen;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * annotation "http://lombok.experimantal.SuperBuilder" as SuperBuilder
 * annotation "http://lombok.Data" as Data
 * annotation "http://lombok.Getter" as Getter
 * annotation "http://lombok.Setter" as Setter
 * annotation "http://lombok.EqualsAndHashCode" as EqualsAndHashCode
 * annotation "http://lombok.AllArgsConstructor" as AllArgsConstructor
 * annotation "http://lombok.NoArgsConstructor" as NoArgsConstructor
 * annotation "http://lombok.RequiredArgsConstructor" as RequiredArgsConstructor
 * annotation "http://lombok.ToString" as ToString
 * annotation "http://lombok.Value" as Value
 */
@SuppressWarnings("all")
public abstract class AbstractGenerator {
  public static final String ANNOTATION_JPA_ID = "http://javax.persistence.Id";
  
  public static final String ANNOTATION_JPA_VERSION = "http://javax.persistence.Version";
  
  public static final String ANNOTATION_JPA_COLUMN = "http://javax.persistence.Column";
  
  public static final String ANNOTATION_JPA_ONETOMANY = "http://javax.persistence.OneToMany";
  
  public static final String ANNOTATION_JPA_MANYTOMANY = "http://javax.persistence.ManyToMany";
  
  public static final String ANNOTATION_JPA_MANYTOONE = "http://javax.persistence.ManyToOne";
  
  public static final String ANNOTATION_JPA_ENTITY = "http://javax.persistence.Entity";
  
  public static final String ANNOTATION_JPA_MAPPEDSUPERCLASS = "http://javax.persistence.MappedSuperClass";
  
  public static final String ANNOTATION_LOMBOK_SUPERBUILDER = "http://lombok.experimantal.SuperBuilder";
  
  public static final String ANNOTATION_LOMBOK_DATA = "http://lombok.Data";
  
  public static final String ANNOTATION_LOMBOK_Getter = "http://lombok.Getter";
  
  public static final String ANNOTATION_LOMBOK_Setter = "http://lombok.Setter";
  
  public static final String ANNOTATION_LOMBOK_EqualsAndHashCode = "http://lombok.EqualsAndHashCode";
  
  public static final String ANNOTATION_LOMBOK_AllArgsConstructor = "http://lombok.AllArgsConstructor";
  
  public static final String ANNOTATION_LOMBOK_NoArgsConstructor = "http://lombok.NoArgsConstructor";
  
  public static final String ANNOTATION_LOMBOK_RequiredArgsConstructor = "http://lombok.RequiredArgsConstructor";
  
  public static final String ANNOTATION_LOMBOK_ToString = "http://lombok.ToString";
  
  public static final String ANNOTATION_LOMBOK_Value = "http://lombok.Value";
  
  public static List<EAnnotation> collectFieldAnnotations(final EClass eClass, final EAttribute attr, final Map<String, List<EAnnotation>> annotationMap) {
    String _name = eClass.getName();
    String _plus = (_name + ".");
    String _name_1 = attr.getName();
    final String key = (_plus + _name_1);
    return annotationMap.getOrDefault(key, CollectionLiterals.<EAnnotation>newArrayList());
  }
  
  public static List<EAnnotation> collectClassAnnotations(final EClass eClass, final Map<String, List<EAnnotation>> annotationMap) {
    final String key = eClass.getName();
    return annotationMap.getOrDefault(key, CollectionLiterals.<EAnnotation>newArrayList());
  }
}
