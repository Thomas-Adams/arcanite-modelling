/**
 */
package org.enargit.cms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.enargit.cms.CmsPackage
 * @generated
 */
public interface CmsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmsFactory eINSTANCE = org.enargit.cms.impl.CmsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Basic Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Entity</em>'.
	 * @generated
	 */
	BasicEntity createBasicEntity();

	/**
	 * Returns a new object of class '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Type</em>'.
	 * @generated
	 */
	ContentType createContentType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CmsPackage getCmsPackage();

} //CmsFactory
