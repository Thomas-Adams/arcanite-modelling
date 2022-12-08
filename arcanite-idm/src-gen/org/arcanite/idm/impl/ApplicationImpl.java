/**
 */
package org.arcanite.idm.impl;

import java.util.Collection;

import org.arcanite.idm.Application;
import org.arcanite.idm.ApplicationGroup;
import org.arcanite.idm.IdmPackage;
import org.arcanite.idm.TenantApplication;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.ApplicationImpl#getTenantApplications <em>Tenant Applications</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.ApplicationImpl#getApplicationGroups <em>Application Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends BasicEntityImpl<Long> implements Application {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTenantApplications() <em>Tenant Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<TenantApplication> tenantApplications;

	/**
	 * The cached value of the '{@link #getApplicationGroups() <em>Application Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationGroup> applicationGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		super.setId(newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.APPLICATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TenantApplication> getTenantApplications() {
		if (tenantApplications == null) {
			tenantApplications = new EObjectWithInverseResolvingEList<TenantApplication>(TenantApplication.class, this, IdmPackage.APPLICATION__TENANT_APPLICATIONS, IdmPackage.TENANT_APPLICATION__APPLICATION);
		}
		return tenantApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationGroup> getApplicationGroups() {
		if (applicationGroups == null) {
			applicationGroups = new EObjectWithInverseResolvingEList<ApplicationGroup>(ApplicationGroup.class, this, IdmPackage.APPLICATION__APPLICATION_GROUPS, IdmPackage.APPLICATION_GROUP__APPLICATION);
		}
		return applicationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdmPackage.APPLICATION__TENANT_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTenantApplications()).basicAdd(otherEnd, msgs);
			case IdmPackage.APPLICATION__APPLICATION_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplicationGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdmPackage.APPLICATION__TENANT_APPLICATIONS:
				return ((InternalEList<?>)getTenantApplications()).basicRemove(otherEnd, msgs);
			case IdmPackage.APPLICATION__APPLICATION_GROUPS:
				return ((InternalEList<?>)getApplicationGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdmPackage.APPLICATION__NAME:
				return getName();
			case IdmPackage.APPLICATION__DESCRIPTION:
				return getDescription();
			case IdmPackage.APPLICATION__TENANT_APPLICATIONS:
				return getTenantApplications();
			case IdmPackage.APPLICATION__APPLICATION_GROUPS:
				return getApplicationGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IdmPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case IdmPackage.APPLICATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IdmPackage.APPLICATION__TENANT_APPLICATIONS:
				getTenantApplications().clear();
				getTenantApplications().addAll((Collection<? extends TenantApplication>)newValue);
				return;
			case IdmPackage.APPLICATION__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				getApplicationGroups().addAll((Collection<? extends ApplicationGroup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IdmPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IdmPackage.APPLICATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IdmPackage.APPLICATION__TENANT_APPLICATIONS:
				getTenantApplications().clear();
				return;
			case IdmPackage.APPLICATION__APPLICATION_GROUPS:
				getApplicationGroups().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IdmPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IdmPackage.APPLICATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IdmPackage.APPLICATION__TENANT_APPLICATIONS:
				return tenantApplications != null && !tenantApplications.isEmpty();
			case IdmPackage.APPLICATION__APPLICATION_GROUPS:
				return applicationGroups != null && !applicationGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
