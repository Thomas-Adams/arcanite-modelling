package org.arcanite.idm.codegen

import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute
import java.util.Map
import org.eclipse.emf.ecore.EAnnotation

/**
 * annotation "http://lombok.experimantal.SuperBuilder" as SuperBuilder
annotation "http://lombok.Data" as Data
annotation "http://lombok.Getter" as Getter
annotation "http://lombok.Setter" as Setter
annotation "http://lombok.EqualsAndHashCode" as EqualsAndHashCode
annotation "http://lombok.AllArgsConstructor" as AllArgsConstructor
annotation "http://lombok.NoArgsConstructor" as NoArgsConstructor
annotation "http://lombok.RequiredArgsConstructor" as RequiredArgsConstructor
annotation "http://lombok.ToString" as ToString
annotation "http://lombok.Value" as Value
 */
abstract class  AbstractGenerator {
	
	
	public static val ANNOTATION_JPA_ID = "http://javax.persistence.Id"
	public static val ANNOTATION_JPA_VERSION = "http://javax.persistence.Version"
	public static val ANNOTATION_JPA_COLUMN = "http://javax.persistence.Column"
	public static val ANNOTATION_JPA_ONETOMANY = "http://javax.persistence.OneToMany"
	public static val ANNOTATION_JPA_MANYTOMANY = "http://javax.persistence.ManyToMany"
	public static val ANNOTATION_JPA_MANYTOONE = "http://javax.persistence.ManyToOne"
	public static val ANNOTATION_JPA_ENTITY = "http://javax.persistence.Entity"
	public static val ANNOTATION_JPA_MAPPEDSUPERCLASS = "http://javax.persistence.MappedSuperClass"
	
	public static val ANNOTATION_LOMBOK_SUPERBUILDER = "http://lombok.experimantal.SuperBuilder"
	public static val ANNOTATION_LOMBOK_DATA = "http://lombok.Data"
	public static val ANNOTATION_LOMBOK_Getter = "http://lombok.Getter"
	public static val ANNOTATION_LOMBOK_Setter = "http://lombok.Setter"
	public static val ANNOTATION_LOMBOK_EqualsAndHashCode = "http://lombok.EqualsAndHashCode"
	public static val ANNOTATION_LOMBOK_AllArgsConstructor = "http://lombok.AllArgsConstructor"
	public static val ANNOTATION_LOMBOK_NoArgsConstructor = "http://lombok.NoArgsConstructor"
	public static val ANNOTATION_LOMBOK_RequiredArgsConstructor = "http://lombok.RequiredArgsConstructor"
	public static val ANNOTATION_LOMBOK_ToString = "http://lombok.ToString"
	public static val ANNOTATION_LOMBOK_Value = "http://lombok.Value"
	
	
	def static List<EAnnotation> collectFieldAnnotations(EClass eClass,EAttribute attr, Map<String, List<EAnnotation>> annotationMap) {
		val key =  eClass.name + "." + attr.name
		return annotationMap.getOrDefault(key, <EAnnotation>newArrayList())		
	}
	
	def static List<EAnnotation> collectClassAnnotations(EClass eClass, Map<String, List<EAnnotation>> annotationMap) {
		val key =  eClass.name
		return annotationMap.getOrDefault(key, <EAnnotation>newArrayList())		
	}
	
}