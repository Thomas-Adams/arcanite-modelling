/**
 */
package org.arcanite.idm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.Role#getName <em>Name</em>}</li>
 *   <li>{@link org.arcanite.idm.Role#getDescription <em>Description</em>}</li>
 *   <li>{@link org.arcanite.idm.Role#getRolePrivileges <em>Role Privileges</em>}</li>
 *   <li>{@link org.arcanite.idm.Role#getUserRoles <em>User Roles</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getRole()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface Role extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.arcanite.idm.IdmPackage#getRole_Name()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 *        annotation="http://javax.persistence.Column unique='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.arcanite.idm.IdmPackage#getRole_Description()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.Role#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Role Privileges</b></em>' reference list.
	 * The list contents are of type {@link org.arcanite.idm.RolePrivilege}.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.RolePrivilege#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Privileges</em>' reference list.
	 * @see org.arcanite.idm.IdmPackage#getRole_RolePrivileges()
	 * @see org.arcanite.idm.RolePrivilege#getRole
	 * @model opposite="role"
	 * @generated
	 */
	EList<RolePrivilege> getRolePrivileges();

	/**
	 * Returns the value of the '<em><b>User Roles</b></em>' reference list.
	 * The list contents are of type {@link org.arcanite.idm.UserRole}.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.UserRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Roles</em>' reference list.
	 * @see org.arcanite.idm.IdmPackage#getRole_UserRoles()
	 * @see org.arcanite.idm.UserRole#getRole
	 * @model opposite="role"
	 * @generated
	 */
	EList<UserRole> getUserRoles();

} // Role
