/**
 */
package org.enargit.cms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.enargit.cms.ContentType#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.enargit.cms.ContentType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.enargit.cms.CmsPackage#getContentType()
 * @model annotation="http://lombok.experimantal.SuperBuilder"
 * @generated
 */
public interface ContentType extends BasicEntity {
	/**
	 * Returns the value of the '<em><b>Typename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typename</em>' attribute.
	 * @see #setTypename(String)
	 * @see org.enargit.cms.CmsPackage#getContentType_Typename()
	 * @model unique="false"
	 * @generated
	 */
	String getTypename();

	/**
	 * Sets the value of the '{@link org.enargit.cms.ContentType#getTypename <em>Typename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typename</em>' attribute.
	 * @see #getTypename()
	 * @generated
	 */
	void setTypename(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.enargit.cms.CmsPackage#getContentType_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.enargit.cms.ContentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ContentType
