/**
 */
package org.arcanite.idm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tenant Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.TenantApplication#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.arcanite.idm.TenantApplication#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getTenantApplication()
 * @model superTypes="org.arcanite.idm.BasicEntity&lt;org.arcanite.idm.Long&gt;"
 *        annotation="http://lombok.Data"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 *        annotation="http://javax.persistence.Entity"
 * @generated
 */
public interface TenantApplication extends BasicEntity<Long> {
	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Tenant#getTenantApplications <em>Tenant Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' reference.
	 * @see #setTenant(Tenant)
	 * @see org.arcanite.idm.IdmPackage#getTenantApplication_Tenant()
	 * @see org.arcanite.idm.Tenant#getTenantApplications
	 * @model opposite="tenantApplications"
	 * @generated
	 */
	Tenant getTenant();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.TenantApplication#getTenant <em>Tenant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' reference.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(Tenant value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.arcanite.idm.Application#getTenantApplications <em>Tenant Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see org.arcanite.idm.IdmPackage#getTenantApplication_Application()
	 * @see org.arcanite.idm.Application#getTenantApplications
	 * @model opposite="tenantApplications"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.TenantApplication#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // TenantApplication
