/**
 */
package org.arcanite.idm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.UserGroup#getUser <em>User</em>}</li>
 *   <li>{@link org.arcanite.idm.UserGroup#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getUserGroup()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface UserGroup extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.User#getUserGroups <em>User Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.arcanite.idm.IdmPackage#getUserGroup_User()
	 * @see org.arcanite.idm.User#getUserGroups
	 * @model opposite="userGroups"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.UserGroup#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Group#getUserGroups <em>User Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see org.arcanite.idm.IdmPackage#getUserGroup_Group()
	 * @see org.arcanite.idm.Group#getUserGroups
	 * @model opposite="userGroups"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.UserGroup#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // UserGroup
