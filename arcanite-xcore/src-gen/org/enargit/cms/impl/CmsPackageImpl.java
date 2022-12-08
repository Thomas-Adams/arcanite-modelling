/**
 */
package org.enargit.cms.impl;

import java.time.OffsetDateTime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.enargit.cms.BasicEntity;
import org.enargit.cms.CmsFactory;
import org.enargit.cms.CmsPackage;
import org.enargit.cms.ContentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmsPackageImpl extends EPackageImpl implements CmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType offsetDateTimeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.enargit.cms.CmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmsPackageImpl() {
		super(eNS_URI, CmsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmsPackage init() {
		if (isInited) return (CmsPackage)EPackage.Registry.INSTANCE.getEPackage(CmsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCmsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CmsPackageImpl theCmsPackage = registeredCmsPackage instanceof CmsPackageImpl ? (CmsPackageImpl)registeredCmsPackage : new CmsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCmsPackage.createPackageContents();

		// Initialize created meta-data
		theCmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCmsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmsPackage.eNS_URI, theCmsPackage);
		return theCmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicEntity() {
		return basicEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicEntity_Id() {
		return (EAttribute)basicEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicEntity_Version() {
		return (EAttribute)basicEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicEntity_Created() {
		return (EAttribute)basicEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicEntity_Modified() {
		return (EAttribute)basicEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicEntity_CreatedBy() {
		return (EAttribute)basicEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicEntity_ModifiedBy() {
		return (EAttribute)basicEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentType() {
		return contentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_Typename() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_Description() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOffsetDateTime() {
		return offsetDateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsFactory getCmsFactory() {
		return (CmsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		basicEntityEClass = createEClass(BASIC_ENTITY);
		createEAttribute(basicEntityEClass, BASIC_ENTITY__ID);
		createEAttribute(basicEntityEClass, BASIC_ENTITY__VERSION);
		createEAttribute(basicEntityEClass, BASIC_ENTITY__CREATED);
		createEAttribute(basicEntityEClass, BASIC_ENTITY__MODIFIED);
		createEAttribute(basicEntityEClass, BASIC_ENTITY__CREATED_BY);
		createEAttribute(basicEntityEClass, BASIC_ENTITY__MODIFIED_BY);

		contentTypeEClass = createEClass(CONTENT_TYPE);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__TYPENAME);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__DESCRIPTION);

		// Create data types
		offsetDateTimeEDataType = createEDataType(OFFSET_DATE_TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contentTypeEClass.getESuperTypes().add(this.getBasicEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(basicEntityEClass, BasicEntity.class, "BasicEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicEntity_Id(), theEcorePackage.getELongObject(), "id", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_Version(), theEcorePackage.getELongObject(), "version", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_Created(), this.getOffsetDateTime(), "created", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_Modified(), this.getOffsetDateTime(), "modified", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_CreatedBy(), theEcorePackage.getEString(), "createdBy", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_ModifiedBy(), theEcorePackage.getEString(), "modifiedBy", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentTypeEClass, ContentType.class, "ContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentType_Typename(), theEcorePackage.getEString(), "typename", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(offsetDateTimeEDataType, OffsetDateTime.class, "OffsetDateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://lombok.experimantal.SuperBuilder
		createLombokAnnotations();
		// http://javax.persistence.MappedSuperClass
		createJavaxAnnotations();
		// http://javax.persistence.Id
		createJavax_1Annotations();
		// http://javax.persistence.Version
		createJavax_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Id", "http://javax.persistence.Id",
			   "Version", "http://javax.persistence.Version",
			   "Column", "http://javax.persistence.Column",
			   "OneToMany", "http://javax.persistence.OneToMany",
			   "ManyToMany", "http://javax.persistence.ManyToMany",
			   "ManyToOne", "http://javax.persistence.ManyToOne",
			   "Entity", "http://javax.persistence.Entity",
			   "MappedSuperClass", "http://javax.persistence.MappedSuperClass",
			   "SuperBuilder", "http://lombok.experimantal.SuperBuilder",
			   "Data", "http://lombok.Data",
			   "Getter", "http://lombok.Getter",
			   "Setter", "http://lombok.Setter",
			   "EqualsAndHashCode", "http://lombok.EqualsAndHashCode",
			   "AllArgsConstructor", "http://lombok.AllArgsConstructor",
			   "NoArgsConstructor", "http://lombok.NoArgsConstructor",
			   "RequiredArgsConstructor", "http://lombok.RequiredArgsConstructor",
			   "ToString", "http://lombok.ToString",
			   "Value", "http://lombok.Value"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://lombok.experimantal.SuperBuilder</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLombokAnnotations() {
		String source = "http://lombok.experimantal.SuperBuilder";
		addAnnotation
		  (basicEntityEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (contentTypeEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://javax.persistence.MappedSuperClass</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJavaxAnnotations() {
		String source = "http://javax.persistence.MappedSuperClass";
		addAnnotation
		  (basicEntityEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://javax.persistence.Id</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJavax_1Annotations() {
		String source = "http://javax.persistence.Id";
		addAnnotation
		  (getBasicEntity_Id(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://javax.persistence.Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJavax_2Annotations() {
		String source = "http://javax.persistence.Version";
		addAnnotation
		  (getBasicEntity_Version(),
		   source,
		   new String[] {
		   });
	}

} //CmsPackageImpl
