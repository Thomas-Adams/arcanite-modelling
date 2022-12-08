/**
 */
package org.arcanite.idm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.arcanite.idm.Application#getDescription <em>Description</em>}</li>
 *   <li>{@link org.arcanite.idm.Application#getTenantApplications <em>Tenant Applications</em>}</li>
 *   <li>{@link org.arcanite.idm.Application#getApplicationGroups <em>Application Groups</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getApplication()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface Application extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.arcanite.idm.IdmPackage#getApplication_Name()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 *        annotation="http://javax.persistence.Column unique='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.Application#getName <em>Name</em>}' attribute.
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
	 * @see org.arcanite.idm.IdmPackage#getApplication_Description()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.Application#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Applications</b></em>' reference list.
	 * The list contents are of type {@link org.arcanite.idm.TenantApplication}.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.TenantApplication#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Applications</em>' reference list.
	 * @see org.arcanite.idm.IdmPackage#getApplication_TenantApplications()
	 * @see org.arcanite.idm.TenantApplication#getApplication
	 * @model opposite="application"
	 * @generated
	 */
	EList<TenantApplication> getTenantApplications();

	/**
	 * Returns the value of the '<em><b>Application Groups</b></em>' reference list.
	 * The list contents are of type {@link org.arcanite.idm.ApplicationGroup}.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.ApplicationGroup#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Groups</em>' reference list.
	 * @see org.arcanite.idm.IdmPackage#getApplication_ApplicationGroups()
	 * @see org.arcanite.idm.ApplicationGroup#getApplication
	 * @model opposite="application"
	 * @generated
	 */
	EList<ApplicationGroup> getApplicationGroups();

} // Application
