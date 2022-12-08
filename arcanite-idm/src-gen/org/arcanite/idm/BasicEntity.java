/**
 */
package org.arcanite.idm;

import java.io.Serializable;

import java.time.OffsetDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.BasicEntity#getId <em>Id</em>}</li>
 *   <li>{@link org.arcanite.idm.BasicEntity#getVersion <em>Version</em>}</li>
 *   <li>{@link org.arcanite.idm.BasicEntity#getCreated <em>Created</em>}</li>
 *   <li>{@link org.arcanite.idm.BasicEntity#getModified <em>Modified</em>}</li>
 *   <li>{@link org.arcanite.idm.BasicEntity#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.arcanite.idm.BasicEntity#getModifiedBy <em>Modified By</em>}</li>
 * </ul>
 *
 * @see org.arcanite.idm.IdmPackage#getBasicEntity()
 * @model IDBounds="org.arcanite.idm.Serializable"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://javax.persistence.MappedSuperClass"
 *        annotation="http://lombok.experimental.SuperBuilder"
 *        annotation="http://lombok.NoArgsConstructor"
 * @generated
 */
public interface BasicEntity<ID extends Serializable> extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Serializable)
	 * @see org.arcanite.idm.IdmPackage#getBasicEntity_Id()
	 * @model unique="false"
	 *        annotation="http://javax.persistence.Id"
	 * @generated
	 */
	ID getId();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.BasicEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(ID value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Long)
	 * @see org.arcanite.idm.IdmPackage#getBasicEntity_Version()
	 * @model unique="false" dataType="org.arcanite.idm.Long"
	 *        annotation="http://javax.persistence.Version"
	 * @generated
	 */
	Long getVersion();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.BasicEntity#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Long value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(OffsetDateTime)
	 * @see org.arcanite.idm.IdmPackage#getBasicEntity_Created()
	 * @model unique="false" dataType="org.arcanite.idm.OffsetDateTime"
	 * @generated
	 */
	OffsetDateTime getCreated();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.BasicEntity#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(OffsetDateTime)
	 * @see org.arcanite.idm.IdmPackage#getBasicEntity_Modified()
	 * @model unique="false" dataType="org.arcanite.idm.OffsetDateTime"
	 * @generated
	 */
	OffsetDateTime getModified();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.BasicEntity#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see org.arcanite.idm.IdmPackage#getBasicEntity_CreatedBy()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.BasicEntity#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By</em>' attribute.
	 * @see #setModifiedBy(String)
	 * @see org.arcanite.idm.IdmPackage#getBasicEntity_ModifiedBy()
	 * @model unique="false" dataType="org.arcanite.idm.String"
	 * @generated
	 */
	String getModifiedBy();

	/**
	 * Sets the value of the '{@link org.arcanite.idm.BasicEntity#getModifiedBy <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By</em>' attribute.
	 * @see #getModifiedBy()
	 * @generated
	 */
	void setModifiedBy(String value);

} // BasicEntity
