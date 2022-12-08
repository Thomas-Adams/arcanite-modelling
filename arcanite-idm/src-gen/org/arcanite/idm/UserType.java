/**
 */
package org.arcanite.idm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.UserType#getName <em>Name</em>}</li>
 *   <li>{@link org.arcanite.idm.UserType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getUserType()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface UserType extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.arcanite.idm.IdmPackage#getUserType_Name()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 *        annotation="http://javax.persistence.Column unique='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.UserType#getName <em>Name</em>}' attribute.
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
	 * @see org.arcanite.idm.IdmPackage#getUserType_Description()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.UserType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // UserType
