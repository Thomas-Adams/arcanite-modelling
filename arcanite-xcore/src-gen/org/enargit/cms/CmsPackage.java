/**
 */
package org.enargit.cms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.enargit.cms.CmsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Id='http://javax.persistence.Id' Version='http://javax.persistence.Version' Column='http://javax.persistence.Column' OneToMany='http://javax.persistence.OneToMany' ManyToMany='http://javax.persistence.ManyToMany' ManyToOne='http://javax.persistence.ManyToOne' Entity='http://javax.persistence.Entity' MappedSuperClass='http://javax.persistence.MappedSuperClass' SuperBuilder='http://lombok.experimantal.SuperBuilder' Data='http://lombok.Data' Getter='http://lombok.Getter' Setter='http://lombok.Setter' EqualsAndHashCode='http://lombok.EqualsAndHashCode' AllArgsConstructor='http://lombok.AllArgsConstructor' NoArgsConstructor='http://lombok.NoArgsConstructor' RequiredArgsConstructor='http://lombok.RequiredArgsConstructor' ToString='http://lombok.ToString' Value='http://lombok.Value'"
 * @generated
 */
public interface CmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.enargit.cms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmsPackage eINSTANCE = org.enargit.cms.impl.CmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.enargit.cms.impl.BasicEntityImpl <em>Basic Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.enargit.cms.impl.BasicEntityImpl
	 * @see org.enargit.cms.impl.CmsPackageImpl#getBasicEntity()
	 * @generated
	 */
	int BASIC_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY__CREATED = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY__CREATED_BY = 4;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY__MODIFIED_BY = 5;

	/**
	 * The number of structural features of the '<em>Basic Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Basic Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.enargit.cms.impl.ContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.enargit.cms.impl.ContentTypeImpl
	 * @see org.enargit.cms.impl.CmsPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Typename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__TYPENAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__DESCRIPTION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Offset Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.OffsetDateTime
	 * @see org.enargit.cms.impl.CmsPackageImpl#getOffsetDateTime()
	 * @generated
	 */
	int OFFSET_DATE_TIME = 2;


	/**
	 * Returns the meta object for class '{@link org.enargit.cms.BasicEntity <em>Basic Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Entity</em>'.
	 * @see org.enargit.cms.BasicEntity
	 * @generated
	 */
	EClass getBasicEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.BasicEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.enargit.cms.BasicEntity#getId()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.BasicEntity#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.enargit.cms.BasicEntity#getVersion()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.BasicEntity#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.enargit.cms.BasicEntity#getCreated()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.BasicEntity#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.enargit.cms.BasicEntity#getModified()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.BasicEntity#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see org.enargit.cms.BasicEntity#getCreatedBy()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.BasicEntity#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see org.enargit.cms.BasicEntity#getModifiedBy()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_ModifiedBy();

	/**
	 * Returns the meta object for class '{@link org.enargit.cms.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.enargit.cms.ContentType
	 * @generated
	 */
	EClass getContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.ContentType#getTypename <em>Typename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typename</em>'.
	 * @see org.enargit.cms.ContentType#getTypename()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Typename();

	/**
	 * Returns the meta object for the attribute '{@link org.enargit.cms.ContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.enargit.cms.ContentType#getDescription()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Description();

	/**
	 * Returns the meta object for data type '{@link java.time.OffsetDateTime <em>Offset Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Offset Date Time</em>'.
	 * @see java.time.OffsetDateTime
	 * @model instanceClass="java.time.OffsetDateTime"
	 * @generated
	 */
	EDataType getOffsetDateTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmsFactory getCmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.enargit.cms.impl.BasicEntityImpl <em>Basic Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.enargit.cms.impl.BasicEntityImpl
		 * @see org.enargit.cms.impl.CmsPackageImpl#getBasicEntity()
		 * @generated
		 */
		EClass BASIC_ENTITY = eINSTANCE.getBasicEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ENTITY__ID = eINSTANCE.getBasicEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ENTITY__VERSION = eINSTANCE.getBasicEntity_Version();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ENTITY__CREATED = eINSTANCE.getBasicEntity_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ENTITY__MODIFIED = eINSTANCE.getBasicEntity_Modified();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ENTITY__CREATED_BY = eINSTANCE.getBasicEntity_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ENTITY__MODIFIED_BY = eINSTANCE.getBasicEntity_ModifiedBy();

		/**
		 * The meta object literal for the '{@link org.enargit.cms.impl.ContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.enargit.cms.impl.ContentTypeImpl
		 * @see org.enargit.cms.impl.CmsPackageImpl#getContentType()
		 * @generated
		 */
		EClass CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em><b>Typename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__TYPENAME = eINSTANCE.getContentType_Typename();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__DESCRIPTION = eINSTANCE.getContentType_Description();

		/**
		 * The meta object literal for the '<em>Offset Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.OffsetDateTime
		 * @see org.enargit.cms.impl.CmsPackageImpl#getOffsetDateTime()
		 * @generated
		 */
		EDataType OFFSET_DATE_TIME = eINSTANCE.getOffsetDateTime();

	}

} //CmsPackage
