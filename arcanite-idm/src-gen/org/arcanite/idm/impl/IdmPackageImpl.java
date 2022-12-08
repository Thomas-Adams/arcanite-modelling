/**
 */
package org.arcanite.idm.impl;

import java.io.Serializable;

import java.math.BigDecimal;

import java.time.OffsetDateTime;

import org.arcanite.idm.Application;
import org.arcanite.idm.ApplicationGroup;
import org.arcanite.idm.BasicEntity;
import org.arcanite.idm.Group;
import org.arcanite.idm.IdmFactory;
import org.arcanite.idm.IdmPackage;
import org.arcanite.idm.Privilege;
import org.arcanite.idm.Role;
import org.arcanite.idm.RolePrivilege;
import org.arcanite.idm.Tenant;
import org.arcanite.idm.TenantApplication;
import org.arcanite.idm.User;
import org.arcanite.idm.UserGroup;
import org.arcanite.idm.UserRole;
import org.arcanite.idm.UserType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdmPackageImpl extends EPackageImpl implements IdmPackage {
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
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privilegeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePrivilegeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tenantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tenantApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType offsetDateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serializableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bigDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

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
	 * @see org.arcanite.idm.IdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdmPackageImpl() {
		super(eNS_URI, IdmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdmPackage init() {
		if (isInited) return (IdmPackage)EPackage.Registry.INSTANCE.getEPackage(IdmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIdmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IdmPackageImpl theIdmPackage = registeredIdmPackage instanceof IdmPackageImpl ? (IdmPackageImpl)registeredIdmPackage : new IdmPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIdmPackage.createPackageContents();

		// Initialize created meta-data
		theIdmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdmPackage.eNS_URI, theIdmPackage);
		return theIdmPackage;
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
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Username() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Enabled() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Expired() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Locked() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_UserRoles() {
		return (EReference)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_UserGroups() {
		return (EReference)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivilege() {
		return privilegeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivilege_Name() {
		return (EAttribute)privilegeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivilege_Description() {
		return (EAttribute)privilegeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivilege_RolePrivileges() {
		return (EReference)privilegeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RolePrivileges() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_UserRoles() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePrivilege() {
		return rolePrivilegeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePrivilege_Privilege() {
		return (EReference)rolePrivilegeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePrivilege_Role() {
		return (EReference)rolePrivilegeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRole() {
		return userRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRole_User() {
		return (EReference)userRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRole_Role() {
		return (EReference)userRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserGroup() {
		return userGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGroup_User() {
		return (EReference)userGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGroup_Group() {
		return (EReference)userGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserType() {
		return userTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserType_Name() {
		return (EAttribute)userTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserType_Description() {
		return (EAttribute)userTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Description() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_UserGroups() {
		return (EReference)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_ApplicationGroups() {
		return (EReference)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationGroup() {
		return applicationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationGroup_Application() {
		return (EReference)applicationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationGroup_Group() {
		return (EReference)applicationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTenant() {
		return tenantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTenant_Name() {
		return (EAttribute)tenantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTenant_Description() {
		return (EAttribute)tenantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTenant_TenantApplications() {
		return (EReference)tenantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTenantApplication() {
		return tenantApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTenantApplication_Tenant() {
		return (EReference)tenantApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTenantApplication_Application() {
		return (EReference)tenantApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Description() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_TenantApplications() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ApplicationGroups() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
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
	public EDataType getSerializable() {
		return serializableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLong() {
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBigDecimal() {
		return bigDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdmFactory getIdmFactory() {
		return (IdmFactory)getEFactoryInstance();
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

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__PASSWORD);
		createEAttribute(userEClass, USER__ENABLED);
		createEAttribute(userEClass, USER__EXPIRED);
		createEAttribute(userEClass, USER__LOCKED);
		createEReference(userEClass, USER__USER_ROLES);
		createEReference(userEClass, USER__USER_GROUPS);

		privilegeEClass = createEClass(PRIVILEGE);
		createEAttribute(privilegeEClass, PRIVILEGE__NAME);
		createEAttribute(privilegeEClass, PRIVILEGE__DESCRIPTION);
		createEReference(privilegeEClass, PRIVILEGE__ROLE_PRIVILEGES);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);
		createEReference(roleEClass, ROLE__ROLE_PRIVILEGES);
		createEReference(roleEClass, ROLE__USER_ROLES);

		rolePrivilegeEClass = createEClass(ROLE_PRIVILEGE);
		createEReference(rolePrivilegeEClass, ROLE_PRIVILEGE__PRIVILEGE);
		createEReference(rolePrivilegeEClass, ROLE_PRIVILEGE__ROLE);

		userRoleEClass = createEClass(USER_ROLE);
		createEReference(userRoleEClass, USER_ROLE__USER);
		createEReference(userRoleEClass, USER_ROLE__ROLE);

		userGroupEClass = createEClass(USER_GROUP);
		createEReference(userGroupEClass, USER_GROUP__USER);
		createEReference(userGroupEClass, USER_GROUP__GROUP);

		userTypeEClass = createEClass(USER_TYPE);
		createEAttribute(userTypeEClass, USER_TYPE__NAME);
		createEAttribute(userTypeEClass, USER_TYPE__DESCRIPTION);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__NAME);
		createEAttribute(groupEClass, GROUP__DESCRIPTION);
		createEReference(groupEClass, GROUP__USER_GROUPS);
		createEReference(groupEClass, GROUP__APPLICATION_GROUPS);

		applicationGroupEClass = createEClass(APPLICATION_GROUP);
		createEReference(applicationGroupEClass, APPLICATION_GROUP__APPLICATION);
		createEReference(applicationGroupEClass, APPLICATION_GROUP__GROUP);

		tenantEClass = createEClass(TENANT);
		createEAttribute(tenantEClass, TENANT__NAME);
		createEAttribute(tenantEClass, TENANT__DESCRIPTION);
		createEReference(tenantEClass, TENANT__TENANT_APPLICATIONS);

		tenantApplicationEClass = createEClass(TENANT_APPLICATION);
		createEReference(tenantApplicationEClass, TENANT_APPLICATION__TENANT);
		createEReference(tenantApplicationEClass, TENANT_APPLICATION__APPLICATION);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__DESCRIPTION);
		createEReference(applicationEClass, APPLICATION__TENANT_APPLICATIONS);
		createEReference(applicationEClass, APPLICATION__APPLICATION_GROUPS);

		// Create data types
		offsetDateTimeEDataType = createEDataType(OFFSET_DATE_TIME);
		serializableEDataType = createEDataType(SERIALIZABLE);
		stringEDataType = createEDataType(STRING);
		longEDataType = createEDataType(LONG);
		booleanEDataType = createEDataType(BOOLEAN);
		bigDecimalEDataType = createEDataType(BIG_DECIMAL);
		doubleEDataType = createEDataType(DOUBLE);
		floatEDataType = createEDataType(FLOAT);
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

		// Create type parameters
		ETypeParameter basicEntityEClass_ID = addETypeParameter(basicEntityEClass, "ID");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSerializable());
		basicEntityEClass_ID.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getBasicEntity());
		EGenericType g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		userEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		privilegeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		roleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		rolePrivilegeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		userRoleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		userGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		userTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		groupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		applicationGroupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		tenantEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		tenantApplicationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBasicEntity());
		g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		applicationEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(basicEntityEClass, BasicEntity.class, "BasicEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(basicEntityEClass_ID);
		initEAttribute(getBasicEntity_Id(), g1, "id", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_Version(), this.getLong(), "version", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_Created(), this.getOffsetDateTime(), "created", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_Modified(), this.getOffsetDateTime(), "modified", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_CreatedBy(), this.getString(), "createdBy", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEntity_ModifiedBy(), this.getString(), "modifiedBy", null, 0, 1, BasicEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Username(), this.getString(), "username", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), this.getString(), "email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), this.getString(), "password", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Enabled(), this.getBoolean(), "enabled", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Expired(), this.getBoolean(), "expired", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Locked(), this.getBoolean(), "locked", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_UserRoles(), this.getUserRole(), this.getUserRole_User(), "userRoles", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_UserGroups(), this.getUserGroup(), this.getUserGroup_User(), "userGroups", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privilegeEClass, Privilege.class, "Privilege", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivilege_Name(), this.getString(), "name", null, 0, 1, Privilege.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivilege_Description(), this.getString(), "description", null, 0, 1, Privilege.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivilege_RolePrivileges(), this.getRolePrivilege(), this.getRolePrivilege_Privilege(), "rolePrivileges", null, 0, -1, Privilege.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), this.getString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Description(), this.getString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RolePrivileges(), this.getRolePrivilege(), this.getRolePrivilege_Role(), "rolePrivileges", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_UserRoles(), this.getUserRole(), this.getUserRole_Role(), "userRoles", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolePrivilegeEClass, RolePrivilege.class, "RolePrivilege", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRolePrivilege_Privilege(), this.getPrivilege(), this.getPrivilege_RolePrivileges(), "privilege", null, 0, 1, RolePrivilege.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRolePrivilege_Role(), this.getRole(), this.getRole_RolePrivileges(), "role", null, 0, 1, RolePrivilege.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userRoleEClass, UserRole.class, "UserRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserRole_User(), this.getUser(), this.getUser_UserRoles(), "user", null, 0, 1, UserRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserRole_Role(), this.getRole(), this.getRole_UserRoles(), "role", null, 0, 1, UserRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userGroupEClass, UserGroup.class, "UserGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserGroup_User(), this.getUser(), this.getUser_UserGroups(), "user", null, 0, 1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserGroup_Group(), this.getGroup(), this.getGroup_UserGroups(), "group", null, 0, 1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTypeEClass, UserType.class, "UserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserType_Name(), this.getString(), "name", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserType_Description(), this.getString(), "description", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Name(), this.getString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Description(), this.getString(), "description", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_UserGroups(), this.getUserGroup(), this.getUserGroup_Group(), "userGroups", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_ApplicationGroups(), this.getApplicationGroup(), this.getApplicationGroup_Group(), "applicationGroups", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationGroupEClass, ApplicationGroup.class, "ApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationGroup_Application(), this.getApplication(), this.getApplication_ApplicationGroups(), "application", null, 0, 1, ApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationGroup_Group(), this.getGroup(), this.getGroup_ApplicationGroups(), "group", null, 0, 1, ApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tenantEClass, Tenant.class, "Tenant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTenant_Name(), this.getString(), "name", null, 0, 1, Tenant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTenant_Description(), this.getString(), "description", null, 0, 1, Tenant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTenant_TenantApplications(), this.getTenantApplication(), this.getTenantApplication_Tenant(), "tenantApplications", null, 0, -1, Tenant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tenantApplicationEClass, TenantApplication.class, "TenantApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTenantApplication_Tenant(), this.getTenant(), this.getTenant_TenantApplications(), "tenant", null, 0, 1, TenantApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTenantApplication_Application(), this.getApplication(), this.getApplication_TenantApplications(), "application", null, 0, 1, TenantApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), this.getString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Description(), this.getString(), "description", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_TenantApplications(), this.getTenantApplication(), this.getTenantApplication_Application(), "tenantApplications", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ApplicationGroups(), this.getApplicationGroup(), this.getApplicationGroup_Application(), "applicationGroups", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(offsetDateTimeEDataType, OffsetDateTime.class, "OffsetDateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serializableEDataType, Serializable.class, "Serializable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "Long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bigDecimalEDataType, BigDecimal.class, "BigDecimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleEDataType, Double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, Float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://lombok.experimental.SuperBuilder
		createLombokAnnotations();
		// http://javax.persistence.MappedSuperClass
		createJavaxAnnotations();
		// http://lombok.NoArgsConstructor
		createLombok_1Annotations();
		// http://javax.persistence.Id
		createJavax_1Annotations();
		// http://javax.persistence.Version
		createJavax_2Annotations();
		// http://lombok.Data
		createLombok_2Annotations();
		// http://javax.persistence.Entity
		createJavax_3Annotations();
		// http://javax.persistence.Column
		createJavax_4Annotations();
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
			   "SuperBuilder", "http://lombok.experimental.SuperBuilder",
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
	 * Initializes the annotations for <b>http://lombok.experimental.SuperBuilder</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLombokAnnotations() {
		String source = "http://lombok.experimental.SuperBuilder";
		addAnnotation
		  (basicEntityEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (basicEntityEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (privilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rolePrivilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userRoleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userTypeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantApplicationEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationEClass,
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
	 * Initializes the annotations for <b>http://lombok.NoArgsConstructor</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLombok_1Annotations() {
		String source = "http://lombok.NoArgsConstructor";
		addAnnotation
		  (basicEntityEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (privilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rolePrivilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userRoleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userTypeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantApplicationEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationEClass,
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

	/**
	 * Initializes the annotations for <b>http://lombok.Data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLombok_2Annotations() {
		String source = "http://lombok.Data";
		addAnnotation
		  (userEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (privilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rolePrivilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userRoleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userTypeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantApplicationEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://javax.persistence.Entity</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJavax_3Annotations() {
		String source = "http://javax.persistence.Entity";
		addAnnotation
		  (userEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (privilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rolePrivilegeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userRoleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (userTypeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tenantApplicationEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://javax.persistence.Column</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJavax_4Annotations() {
		String source = "http://javax.persistence.Column";
		addAnnotation
		  (getPrivilege_Name(),
		   source,
		   new String[] {
			   "unique", "true"
		   });
		addAnnotation
		  (getRole_Name(),
		   source,
		   new String[] {
			   "unique", "true"
		   });
		addAnnotation
		  (getUserType_Name(),
		   source,
		   new String[] {
			   "unique", "true"
		   });
		addAnnotation
		  (getGroup_Name(),
		   source,
		   new String[] {
			   "unique", "true"
		   });
		addAnnotation
		  (getTenant_Name(),
		   source,
		   new String[] {
			   "unique", "true"
		   });
		addAnnotation
		  (getApplication_Name(),
		   source,
		   new String[] {
			   "unique", "true"
		   });
	}

} //IdmPackageImpl
