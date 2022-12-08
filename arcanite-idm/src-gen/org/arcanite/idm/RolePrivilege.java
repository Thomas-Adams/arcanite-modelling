/**
 */
package org.arcanite.idm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Privilege</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.RolePrivilege#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link org.arcanite.idm.RolePrivilege#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getRolePrivilege()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface RolePrivilege extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Privilege</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Privilege#getRolePrivileges <em>Role Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege</em>' reference.
	 * @see #setPrivilege(Privilege)
	 * @see org.arcanite.idm.IdmPackage#getRolePrivilege_Privilege()
	 * @see org.arcanite.idm.Privilege#getRolePrivileges
	 * @model opposite="rolePrivileges"
	 * @generated
	 */
	Privilege getPrivilege();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.RolePrivilege#getPrivilege <em>Privilege</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege</em>' reference.
	 * @see #getPrivilege()
	 * @generated
	 */
	void setPrivilege(Privilege value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Role#getRolePrivileges <em>Role Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.arcanite.idm.IdmPackage#getRolePrivilege_Role()
	 * @see org.arcanite.idm.Role#getRolePrivileges
	 * @model opposite="rolePrivileges"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.RolePrivilege#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // RolePrivilege
