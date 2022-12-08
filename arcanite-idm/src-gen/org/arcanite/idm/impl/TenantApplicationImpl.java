/**
 */
package org.arcanite.idm.impl;

import org.arcanite.idm.Application;
import org.arcanite.idm.IdmPackage;
import org.arcanite.idm.Tenant;
import org.arcanite.idm.TenantApplication;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.impl.TenantApplicationImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.TenantApplicationImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenantApplicationImpl extends BasicEntityImpl<Long> implements TenantApplication {
	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected Tenant tenant;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TenantApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmPackage.Literals.TENANT_APPLICATION;
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
	public Tenant getTenant() {
		if (tenant != null && tenant.eIsProxy()) {
			InternalEObject oldTenant = (InternalEObject)tenant;
			tenant = (Tenant)eResolveProxy(oldTenant);
			if (tenant != oldTenant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdmPackage.TENANT_APPLICATION__TENANT, oldTenant, tenant));
			}
		}
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tenant basicGetTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTenant(Tenant newTenant, NotificationChain msgs) {
		Tenant oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmPackage.TENANT_APPLICATION__TENANT, oldTenant, newTenant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant(Tenant newTenant) {
		if (newTenant != tenant) {
			NotificationChain msgs = null;
			if (tenant != null)
				msgs = ((InternalEObject)tenant).eInverseRemove(this, IdmPackage.TENANT__TENANT_APPLICATIONS, Tenant.class, msgs);
			if (newTenant != null)
				msgs = ((InternalEObject)newTenant).eInverseAdd(this, IdmPackage.TENANT__TENANT_APPLICATIONS, Tenant.class, msgs);
			msgs = basicSetTenant(newTenant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.TENANT_APPLICATION__TENANT, newTenant, newTenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject)application;
			application = (Application)eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdmPackage.TENANT_APPLICATION__APPLICATION, oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmPackage.TENANT_APPLICATION__APPLICATION, oldApplication, newApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject)application).eInverseRemove(this, IdmPackage.APPLICATION__TENANT_APPLICATIONS, Application.class, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, IdmPackage.APPLICATION__TENANT_APPLICATIONS, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.TENANT_APPLICATION__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdmPackage.TENANT_APPLICATION__TENANT:
				if (tenant != null)
					msgs = ((InternalEObject)tenant).eInverseRemove(this, IdmPackage.TENANT__TENANT_APPLICATIONS, Tenant.class, msgs);
				return basicSetTenant((Tenant)otherEnd, msgs);
			case IdmPackage.TENANT_APPLICATION__APPLICATION:
				if (application != null)
					msgs = ((InternalEObject)application).eInverseRemove(this, IdmPackage.APPLICATION__TENANT_APPLICATIONS, Application.class, msgs);
				return basicSetApplication((Application)otherEnd, msgs);
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
			case IdmPackage.TENANT_APPLICATION__TENANT:
				return basicSetTenant(null, msgs);
			case IdmPackage.TENANT_APPLICATION__APPLICATION:
				return basicSetApplication(null, msgs);
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
			case IdmPackage.TENANT_APPLICATION__TENANT:
				if (resolve) return getTenant();
				return basicGetTenant();
			case IdmPackage.TENANT_APPLICATION__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IdmPackage.TENANT_APPLICATION__TENANT:
				setTenant((Tenant)newValue);
				return;
			case IdmPackage.TENANT_APPLICATION__APPLICATION:
				setApplication((Application)newValue);
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
			case IdmPackage.TENANT_APPLICATION__TENANT:
				setTenant((Tenant)null);
				return;
			case IdmPackage.TENANT_APPLICATION__APPLICATION:
				setApplication((Application)null);
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
			case IdmPackage.TENANT_APPLICATION__TENANT:
				return tenant != null;
			case IdmPackage.TENANT_APPLICATION__APPLICATION:
				return application != null;
		}
		return super.eIsSet(featureID);
	}

} //TenantApplicationImpl
