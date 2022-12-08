/**
 */
package org.arcanite.idm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.ApplicationGroup#getApplication <em>Application</em>}</li>
 *   <li>{@link org.arcanite.idm.ApplicationGroup#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getApplicationGroup()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface ApplicationGroup extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Application#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see org.arcanite.idm.IdmPackage#getApplicationGroup_Application()
	 * @see org.arcanite.idm.Application#getApplicationGroups
	 * @model opposite="applicationGroups"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.ApplicationGroup#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Group#getApplicationGroups <em>Application Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see org.arcanite.idm.IdmPackage#getApplicationGroup_Group()
	 * @see org.arcanite.idm.Group#getApplicationGroups
	 * @model opposite="applicationGroups"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.ApplicationGroup#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // ApplicationGroup
