/**
 */
package org.arcanite.idm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.arcanite.idm.IdmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Id='http://javax.persistence.Id' Version='http://javax.persistence.Version' Column='http://javax.persistence.Column' OneToMany='http://javax.persistence.OneToMany' ManyToMany='http://javax.persistence.ManyToMany' ManyToOne='http://javax.persistence.ManyToOne' Entity='http://javax.persistence.Entity' MappedSuperClass='http://javax.persistence.MappedSuperClass' SuperBuilder='http://lombok.experimental.SuperBuilder' Data='http://lombok.Data' Getter='http://lombok.Getter' Setter='http://lombok.Setter' EqualsAndHashCode='http://lombok.EqualsAndHashCode' AllArgsConstructor='http://lombok.AllArgsConstructor' NoArgsConstructor='http://lombok.NoArgsConstructor' RequiredArgsConstructor='http://lombok.RequiredArgsConstructor' ToString='http://lombok.ToString' Value='http://lombok.Value'"
 * @generated
 */
public interface IdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.arcanite.idm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdmPackage eINSTANCE = org.arcanite.idm.impl.IdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.BasicEntityImpl <em>Basic Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.BasicEntityImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getBasicEntity()
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
	 * The meta object id for the '{@link org.arcanite.idm.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.UserImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENABLED = BASIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EXPIRED = BASIC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOCKED = BASIC_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ROLES = BASIC_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_GROUPS = BASIC_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.PrivilegeImpl <em>Privilege</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.PrivilegeImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getPrivilege()
	 * @generated
	 */
	int PRIVILEGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__NAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__DESCRIPTION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE__ROLE_PRIVILEGES = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.RoleImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_PRIVILEGES = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__USER_ROLES = BASIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.RolePrivilegeImpl <em>Role Privilege</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.RolePrivilegeImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getRolePrivilege()
	 * @generated
	 */
	int ROLE_PRIVILEGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Privilege</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__PRIVILEGE = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE__ROLE = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PRIVILEGE_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.UserRoleImpl <em>User Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.UserRoleImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getUserRole()
	 * @generated
	 */
	int USER_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__USER = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__ROLE = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.UserGroupImpl <em>User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.UserGroupImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getUserGroup()
	 * @generated
	 */
	int USER_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__USER = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__GROUP = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.UserTypeImpl <em>User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.UserTypeImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__NAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__DESCRIPTION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.GroupImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__USER_GROUPS = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__APPLICATION_GROUPS = BASIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.ApplicationGroupImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getApplicationGroup()
	 * @generated
	 */
	int APPLICATION_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__APPLICATION = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP__GROUP = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_GROUP_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.TenantImpl <em>Tenant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.TenantImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getTenant()
	 * @generated
	 */
	int TENANT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__NAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__DESCRIPTION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__TENANT_APPLICATIONS = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.TenantApplicationImpl <em>Tenant Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.TenantApplicationImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getTenantApplication()
	 * @generated
	 */
	int TENANT_APPLICATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__TENANT = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION__APPLICATION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tenant Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tenant Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_APPLICATION_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.arcanite.idm.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.arcanite.idm.impl.ApplicationImpl
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ID = BASIC_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION = BASIC_ENTITY__VERSION;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CREATED = BASIC_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MODIFIED = BASIC_ENTITY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CREATED_BY = BASIC_ENTITY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MODIFIED_BY = BASIC_ENTITY__MODIFIED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = BASIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = BASIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TENANT_APPLICATIONS = BASIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_GROUPS = BASIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = BASIC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = BASIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Offset Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.OffsetDateTime
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getOffsetDateTime()
	 * @generated
	 */
	int OFFSET_DATE_TIME = 13;

	/**
	 * The meta object id for the '<em>Serializable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 14;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getString()
	 * @generated
	 */
	int STRING = 15;

	/**
	 * The meta object id for the '<em>Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 16;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 17;

	/**
	 * The meta object id for the '<em>Big Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getBigDecimal()
	 * @generated
	 */
	int BIG_DECIMAL = 18;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 19;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.arcanite.idm.impl.IdmPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 20;


	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.BasicEntity <em>Basic Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Entity</em>'.
	 * @see org.arcanite.idm.BasicEntity
	 * @generated
	 */
	EClass getBasicEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.BasicEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.arcanite.idm.BasicEntity#getId()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.BasicEntity#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.arcanite.idm.BasicEntity#getVersion()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.BasicEntity#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.arcanite.idm.BasicEntity#getCreated()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.BasicEntity#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.arcanite.idm.BasicEntity#getModified()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.BasicEntity#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see org.arcanite.idm.BasicEntity#getCreatedBy()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.BasicEntity#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see org.arcanite.idm.BasicEntity#getModifiedBy()
	 * @see #getBasicEntity()
	 * @generated
	 */
	EAttribute getBasicEntity_ModifiedBy();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.arcanite.idm.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.arcanite.idm.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.arcanite.idm.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.arcanite.idm.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.User#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.arcanite.idm.User#getEnabled()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.User#getExpired <em>Expired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expired</em>'.
	 * @see org.arcanite.idm.User#getExpired()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Expired();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.User#getLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see org.arcanite.idm.User#getLocked()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Locked();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.User#getUserRoles <em>User Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Roles</em>'.
	 * @see org.arcanite.idm.User#getUserRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserRoles();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.User#getUserGroups <em>User Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Groups</em>'.
	 * @see org.arcanite.idm.User#getUserGroups()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserGroups();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.Privilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privilege</em>'.
	 * @see org.arcanite.idm.Privilege
	 * @generated
	 */
	EClass getPrivilege();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Privilege#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.arcanite.idm.Privilege#getName()
	 * @see #getPrivilege()
	 * @generated
	 */
	EAttribute getPrivilege_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Privilege#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.arcanite.idm.Privilege#getDescription()
	 * @see #getPrivilege()
	 * @generated
	 */
	EAttribute getPrivilege_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Privilege#getRolePrivileges <em>Role Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Privileges</em>'.
	 * @see org.arcanite.idm.Privilege#getRolePrivileges()
	 * @see #getPrivilege()
	 * @generated
	 */
	EReference getPrivilege_RolePrivileges();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.arcanite.idm.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.arcanite.idm.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.arcanite.idm.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Role#getRolePrivileges <em>Role Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Privileges</em>'.
	 * @see org.arcanite.idm.Role#getRolePrivileges()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RolePrivileges();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Role#getUserRoles <em>User Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Roles</em>'.
	 * @see org.arcanite.idm.Role#getUserRoles()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_UserRoles();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.RolePrivilege <em>Role Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Privilege</em>'.
	 * @see org.arcanite.idm.RolePrivilege
	 * @generated
	 */
	EClass getRolePrivilege();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.RolePrivilege#getPrivilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Privilege</em>'.
	 * @see org.arcanite.idm.RolePrivilege#getPrivilege()
	 * @see #getRolePrivilege()
	 * @generated
	 */
	EReference getRolePrivilege_Privilege();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.RolePrivilege#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.arcanite.idm.RolePrivilege#getRole()
	 * @see #getRolePrivilege()
	 * @generated
	 */
	EReference getRolePrivilege_Role();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Role</em>'.
	 * @see org.arcanite.idm.UserRole
	 * @generated
	 */
	EClass getUserRole();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.UserRole#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.arcanite.idm.UserRole#getUser()
	 * @see #getUserRole()
	 * @generated
	 */
	EReference getUserRole_User();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.UserRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.arcanite.idm.UserRole#getRole()
	 * @see #getUserRole()
	 * @generated
	 */
	EReference getUserRole_Role();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.UserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Group</em>'.
	 * @see org.arcanite.idm.UserGroup
	 * @generated
	 */
	EClass getUserGroup();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.UserGroup#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.arcanite.idm.UserGroup#getUser()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_User();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.UserGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see org.arcanite.idm.UserGroup#getGroup()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_Group();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Type</em>'.
	 * @see org.arcanite.idm.UserType
	 * @generated
	 */
	EClass getUserType();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.UserType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.arcanite.idm.UserType#getName()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.UserType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.arcanite.idm.UserType#getDescription()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Description();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.arcanite.idm.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.arcanite.idm.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Group#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.arcanite.idm.Group#getDescription()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Group#getUserGroups <em>User Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Groups</em>'.
	 * @see org.arcanite.idm.Group#getUserGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_UserGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Group#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Application Groups</em>'.
	 * @see org.arcanite.idm.Group#getApplicationGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ApplicationGroups();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.ApplicationGroup <em>Application Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Group</em>'.
	 * @see org.arcanite.idm.ApplicationGroup
	 * @generated
	 */
	EClass getApplicationGroup();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.ApplicationGroup#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see org.arcanite.idm.ApplicationGroup#getApplication()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_Application();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.ApplicationGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see org.arcanite.idm.ApplicationGroup#getGroup()
	 * @see #getApplicationGroup()
	 * @generated
	 */
	EReference getApplicationGroup_Group();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.Tenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tenant</em>'.
	 * @see org.arcanite.idm.Tenant
	 * @generated
	 */
	EClass getTenant();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Tenant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.arcanite.idm.Tenant#getName()
	 * @see #getTenant()
	 * @generated
	 */
	EAttribute getTenant_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Tenant#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.arcanite.idm.Tenant#getDescription()
	 * @see #getTenant()
	 * @generated
	 */
	EAttribute getTenant_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Tenant#getTenantApplications <em>Tenant Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tenant Applications</em>'.
	 * @see org.arcanite.idm.Tenant#getTenantApplications()
	 * @see #getTenant()
	 * @generated
	 */
	EReference getTenant_TenantApplications();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.TenantApplication <em>Tenant Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tenant Application</em>'.
	 * @see org.arcanite.idm.TenantApplication
	 * @generated
	 */
	EClass getTenantApplication();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.TenantApplication#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tenant</em>'.
	 * @see org.arcanite.idm.TenantApplication#getTenant()
	 * @see #getTenantApplication()
	 * @generated
	 */
	EReference getTenantApplication_Tenant();

	/**
	 * Returns the meta object for the reference '{@link org.arcanite.idm.TenantApplication#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see org.arcanite.idm.TenantApplication#getApplication()
	 * @see #getTenantApplication()
	 * @generated
	 */
	EReference getTenantApplication_Application();

	/**
	 * Returns the meta object for class '{@link org.arcanite.idm.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.arcanite.idm.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.arcanite.idm.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.arcanite.idm.Application#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.arcanite.idm.Application#getDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Application#getTenantApplications <em>Tenant Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tenant Applications</em>'.
	 * @see org.arcanite.idm.Application#getTenantApplications()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_TenantApplications();

	/**
	 * Returns the meta object for the reference list '{@link org.arcanite.idm.Application#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Application Groups</em>'.
	 * @see org.arcanite.idm.Application#getApplicationGroups()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ApplicationGroups();

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
	 * Returns the meta object for data type '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 * @generated
	 */
	EDataType getSerializable();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getLong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Big Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Big Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 * @generated
	 */
	EDataType getBigDecimal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdmFactory getIdmFactory();

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
		 * The meta object literal for the '{@link org.arcanite.idm.impl.BasicEntityImpl <em>Basic Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.BasicEntityImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getBasicEntity()
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
		 * The meta object literal for the '{@link org.arcanite.idm.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.UserImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ENABLED = eINSTANCE.getUser_Enabled();

		/**
		 * The meta object literal for the '<em><b>Expired</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EXPIRED = eINSTANCE.getUser_Expired();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LOCKED = eINSTANCE.getUser_Locked();

		/**
		 * The meta object literal for the '<em><b>User Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_ROLES = eINSTANCE.getUser_UserRoles();

		/**
		 * The meta object literal for the '<em><b>User Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_GROUPS = eINSTANCE.getUser_UserGroups();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.PrivilegeImpl <em>Privilege</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.PrivilegeImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getPrivilege()
		 * @generated
		 */
		EClass PRIVILEGE = eINSTANCE.getPrivilege();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVILEGE__NAME = eINSTANCE.getPrivilege_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVILEGE__DESCRIPTION = eINSTANCE.getPrivilege_Description();

		/**
		 * The meta object literal for the '<em><b>Role Privileges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVILEGE__ROLE_PRIVILEGES = eINSTANCE.getPrivilege_RolePrivileges();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.RoleImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '<em><b>Role Privileges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_PRIVILEGES = eINSTANCE.getRole_RolePrivileges();

		/**
		 * The meta object literal for the '<em><b>User Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__USER_ROLES = eINSTANCE.getRole_UserRoles();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.RolePrivilegeImpl <em>Role Privilege</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.RolePrivilegeImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getRolePrivilege()
		 * @generated
		 */
		EClass ROLE_PRIVILEGE = eINSTANCE.getRolePrivilege();

		/**
		 * The meta object literal for the '<em><b>Privilege</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PRIVILEGE__PRIVILEGE = eINSTANCE.getRolePrivilege_Privilege();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PRIVILEGE__ROLE = eINSTANCE.getRolePrivilege_Role();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.UserRoleImpl <em>User Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.UserRoleImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getUserRole()
		 * @generated
		 */
		EClass USER_ROLE = eINSTANCE.getUserRole();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ROLE__USER = eINSTANCE.getUserRole_User();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ROLE__ROLE = eINSTANCE.getUserRole_Role();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.UserGroupImpl <em>User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.UserGroupImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getUserGroup()
		 * @generated
		 */
		EClass USER_GROUP = eINSTANCE.getUserGroup();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__USER = eINSTANCE.getUserGroup_User();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__GROUP = eINSTANCE.getUserGroup_Group();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.UserTypeImpl <em>User Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.UserTypeImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getUserType()
		 * @generated
		 */
		EClass USER_TYPE = eINSTANCE.getUserType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TYPE__NAME = eINSTANCE.getUserType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TYPE__DESCRIPTION = eINSTANCE.getUserType_Description();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.GroupImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__DESCRIPTION = eINSTANCE.getGroup_Description();

		/**
		 * The meta object literal for the '<em><b>User Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__USER_GROUPS = eINSTANCE.getGroup_UserGroups();

		/**
		 * The meta object literal for the '<em><b>Application Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__APPLICATION_GROUPS = eINSTANCE.getGroup_ApplicationGroups();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.ApplicationGroupImpl <em>Application Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.ApplicationGroupImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getApplicationGroup()
		 * @generated
		 */
		EClass APPLICATION_GROUP = eINSTANCE.getApplicationGroup();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__APPLICATION = eINSTANCE.getApplicationGroup_Application();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_GROUP__GROUP = eINSTANCE.getApplicationGroup_Group();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.TenantImpl <em>Tenant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.TenantImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getTenant()
		 * @generated
		 */
		EClass TENANT = eINSTANCE.getTenant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT__NAME = eINSTANCE.getTenant_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT__DESCRIPTION = eINSTANCE.getTenant_Description();

		/**
		 * The meta object literal for the '<em><b>Tenant Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT__TENANT_APPLICATIONS = eINSTANCE.getTenant_TenantApplications();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.TenantApplicationImpl <em>Tenant Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.TenantApplicationImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getTenantApplication()
		 * @generated
		 */
		EClass TENANT_APPLICATION = eINSTANCE.getTenantApplication();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT_APPLICATION__TENANT = eINSTANCE.getTenantApplication_Tenant();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT_APPLICATION__APPLICATION = eINSTANCE.getTenantApplication_Application();

		/**
		 * The meta object literal for the '{@link org.arcanite.idm.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.arcanite.idm.impl.ApplicationImpl
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESCRIPTION = eINSTANCE.getApplication_Description();

		/**
		 * The meta object literal for the '<em><b>Tenant Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__TENANT_APPLICATIONS = eINSTANCE.getApplication_TenantApplications();

		/**
		 * The meta object literal for the '<em><b>Application Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APPLICATION_GROUPS = eINSTANCE.getApplication_ApplicationGroups();

		/**
		 * The meta object literal for the '<em>Offset Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.OffsetDateTime
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getOffsetDateTime()
		 * @generated
		 */
		EDataType OFFSET_DATE_TIME = eINSTANCE.getOffsetDateTime();

		/**
		 * The meta object literal for the '<em>Serializable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getSerializable()
		 * @generated
		 */
		EDataType SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getLong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Big Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getBigDecimal()
		 * @generated
		 */
		EDataType BIG_DECIMAL = eINSTANCE.getBigDecimal();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.arcanite.idm.impl.IdmPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

	}

} //IdmPackage
