/**
 */
package org.arcanite.idm.impl;

import java.util.Collection;

import org.arcanite.idm.IdmPackage;
import org.arcanite.idm.Role;
import org.arcanite.idm.RolePrivilege;
import org.arcanite.idm.UserRole;

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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.RoleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.RoleImpl#getRolePrivileges <em>Role Privileges</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.RoleImpl#getUserRoles <em>User Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends BasicEntityImpl<Long> implements Role {
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
	 * The cached value of the '{@link #getRolePrivileges() <em>Role Privileges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePrivileges()
	 * @generated
	 * @ordered
	 */
	protected EList<RolePrivilege> rolePrivileges;

	/**
	 * The cached value of the '{@link #getUserRoles() <em>User Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<UserRole> userRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmPackage.Literals.ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.ROLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.ROLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RolePrivilege> getRolePrivileges() {
		if (rolePrivileges == null) {
			rolePrivileges = new EObjectWithInverseResolvingEList<RolePrivilege>(RolePrivilege.class, this, IdmPackage.ROLE__ROLE_PRIVILEGES, IdmPackage.ROLE_PRIVILEGE__ROLE);
		}
		return rolePrivileges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserRole> getUserRoles() {
		if (userRoles == null) {
			userRoles = new EObjectWithInverseResolvingEList<UserRole>(UserRole.class, this, IdmPackage.ROLE__USER_ROLES, IdmPackage.USER_ROLE__ROLE);
		}
		return userRoles;
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
			case IdmPackage.ROLE__ROLE_PRIVILEGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRolePrivileges()).basicAdd(otherEnd, msgs);
			case IdmPackage.ROLE__USER_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserRoles()).basicAdd(otherEnd, msgs);
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
			case IdmPackage.ROLE__ROLE_PRIVILEGES:
				return ((InternalEList<?>)getRolePrivileges()).basicRemove(otherEnd, msgs);
			case IdmPackage.ROLE__USER_ROLES:
				return ((InternalEList<?>)getUserRoles()).basicRemove(otherEnd, msgs);
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
			case IdmPackage.ROLE__NAME:
				return getName();
			case IdmPackage.ROLE__DESCRIPTION:
				return getDescription();
			case IdmPackage.ROLE__ROLE_PRIVILEGES:
				return getRolePrivileges();
			case IdmPackage.ROLE__USER_ROLES:
				return getUserRoles();
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
			case IdmPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case IdmPackage.ROLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IdmPackage.ROLE__ROLE_PRIVILEGES:
				getRolePrivileges().clear();
				getRolePrivileges().addAll((Collection<? extends RolePrivilege>)newValue);
				return;
			case IdmPackage.ROLE__USER_ROLES:
				getUserRoles().clear();
				getUserRoles().addAll((Collection<? extends UserRole>)newValue);
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
			case IdmPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IdmPackage.ROLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IdmPackage.ROLE__ROLE_PRIVILEGES:
				getRolePrivileges().clear();
				return;
			case IdmPackage.ROLE__USER_ROLES:
				getUserRoles().clear();
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
			case IdmPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IdmPackage.ROLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IdmPackage.ROLE__ROLE_PRIVILEGES:
				return rolePrivileges != null && !rolePrivileges.isEmpty();
			case IdmPackage.ROLE__USER_ROLES:
				return userRoles != null && !userRoles.isEmpty();
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

} //RoleImpl
