/**
 */
package org.arcanite.idm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.User#getUsername <em>Username</em>}</li>
 *   <li>{@link org.arcanite.idm.User#getEmail <em>Email</em>}</li>
 *   <li>{@link org.arcanite.idm.User#getPassword <em>Password</em>}</li>
 *   <li>{@link org.arcanite.idm.User#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.arcanite.idm.User#getExpired <em>Expired</em>}</li>
 *   <li>{@link org.arcanite.idm.User#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.arcanite.idm.User#getUserRoles <em>User Roles</em>}</li>
 *   <li>{@link org.arcanite.idm.User#getUserGroups <em>User Groups</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getUser()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface User extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.arcanite.idm.IdmPackage#getUser_Username()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.arcanite.idm.IdmPackage#getUser_Email()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.arcanite.idm.IdmPackage#getUser_Password()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Boolean)
	 * @see org.arcanite.idm.IdmPackage#getUser_Enabled()
	 * @model unique="false" dataType="org.arcanite.idm.Boolean"
	 * @generated
	 */
	Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.User#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expired</em>' attribute.
	 * @see #setExpired(Boolean)
	 * @see org.arcanite.idm.IdmPackage#getUser_Expired()
	 * @model unique="false" dataType="org.arcanite.idm.Boolean"
	 * @generated
	 */
	Boolean getExpired();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.User#getExpired <em>Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expired</em>' attribute.
	 * @see #getExpired()
	 * @generated
	 */
	void setExpired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(Boolean)
	 * @see org.arcanite.idm.IdmPackage#getUser_Locked()
	 * @model unique="false" dataType="org.arcanite.idm.Boolean"
	 * @generated
	 */
	Boolean getLocked();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.User#getLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #getLocked()
	 * @generated
	 */
	void setLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>User Roles</b></em>' reference list.
	 * The list contents are of type {@link org.arcanite.idm.UserRole}.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.UserRole#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Roles</em>' reference list.
	 * @see org.arcanite.idm.IdmPackage#getUser_UserRoles()
	 * @see org.arcanite.idm.UserRole#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<UserRole> getUserRoles();

	/**
	 * Returns the value of the '<em><b>User Groups</b></em>' reference list.
	 * The list contents are of type {@link org.arcanite.idm.UserGroup}.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.UserGroup#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Groups</em>' reference list.
	 * @see org.arcanite.idm.IdmPackage#getUser_UserGroups()
	 * @see org.arcanite.idm.UserGroup#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<UserGroup> getUserGroups();

} // User
