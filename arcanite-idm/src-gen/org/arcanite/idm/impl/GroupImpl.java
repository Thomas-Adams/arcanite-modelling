/**
 */
package org.arcanite.idm.impl;

import java.util.Collection;

import org.arcanite.idm.ApplicationGroup;
import org.arcanite.idm.Group;
import org.arcanite.idm.IdmPackage;
import org.arcanite.idm.UserGroup;

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
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.GroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.GroupImpl#getUserGroups <em>User Groups</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.GroupImpl#getApplicationGroups <em>Application Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends BasicEntityImpl<Long> implements Group {
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
	 * The cached value of the '{@link #getUserGroups() <em>User Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<UserGroup> userGroups;

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
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmPackage.Literals.GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserGroup> getUserGroups() {
		if (userGroups == null) {
			userGroups = new EObjectWithInverseResolvingEList<UserGroup>(UserGroup.class, this, IdmPackage.GROUP__USER_GROUPS, IdmPackage.USER_GROUP__GROUP);
		}
		return userGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationGroup> getApplicationGroups() {
		if (applicationGroups == null) {
			applicationGroups = new EObjectWithInverseResolvingEList<ApplicationGroup>(ApplicationGroup.class, this, IdmPackage.GROUP__APPLICATION_GROUPS, IdmPackage.APPLICATION_GROUP__GROUP);
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
			case IdmPackage.GROUP__USER_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserGroups()).basicAdd(otherEnd, msgs);
			case IdmPackage.GROUP__APPLICATION_GROUPS:
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
			case IdmPackage.GROUP__USER_GROUPS:
				return ((InternalEList<?>)getUserGroups()).basicRemove(otherEnd, msgs);
			case IdmPackage.GROUP__APPLICATION_GROUPS:
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
			case IdmPackage.GROUP__NAME:
				return getName();
			case IdmPackage.GROUP__DESCRIPTION:
				return getDescription();
			case IdmPackage.GROUP__USER_GROUPS:
				return getUserGroups();
			case IdmPackage.GROUP__APPLICATION_GROUPS:
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
			case IdmPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case IdmPackage.GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IdmPackage.GROUP__USER_GROUPS:
				getUserGroups().clear();
				getUserGroups().addAll((Collection<? extends UserGroup>)newValue);
				return;
			case IdmPackage.GROUP__APPLICATION_GROUPS:
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
			case IdmPackage.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IdmPackage.GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IdmPackage.GROUP__USER_GROUPS:
				getUserGroups().clear();
				return;
			case IdmPackage.GROUP__APPLICATION_GROUPS:
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
			case IdmPackage.GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IdmPackage.GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IdmPackage.GROUP__USER_GROUPS:
				return userGroups != null && !userGroups.isEmpty();
			case IdmPackage.GROUP__APPLICATION_GROUPS:
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

} //GroupImpl
