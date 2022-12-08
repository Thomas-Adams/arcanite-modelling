/**
 */
package org.arcanite.idm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.UserRole#getUser <em>User</em>}</li>
 *   <li>{@link org.arcanite.idm.UserRole#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getUserRole()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface UserRole extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.User#getUserRoles <em>User Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.arcanite.idm.IdmPackage#getUserRole_User()
	 * @see org.arcanite.idm.User#getUserRoles
	 * @model opposite="userRoles"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.UserRole#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Role#getUserRoles <em>User Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.arcanite.idm.IdmPackage#getUserRole_Role()
	 * @see org.arcanite.idm.Role#getUserRoles
	 * @model opposite="userRoles"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.UserRole#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // UserRole
