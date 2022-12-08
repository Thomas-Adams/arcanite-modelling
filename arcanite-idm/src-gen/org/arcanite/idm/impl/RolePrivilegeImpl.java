/**
 */
package org.arcanite.idm.impl;

import org.arcanite.idm.IdmPackage;
import org.arcanite.idm.Privilege;
import org.arcanite.idm.Role;
import org.arcanite.idm.RolePrivilege;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Privilege</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.impl.RolePrivilegeImpl#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.RolePrivilegeImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolePrivilegeImpl extends BasicEntityImpl<Long> implements RolePrivilege {
	/**
	 * The cached value of the '{@link #getPrivilege() <em>Privilege</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilege()
	 * @generated
	 * @ordered
	 */
	protected Privilege privilege;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolePrivilegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmPackage.Literals.ROLE_PRIVILEGE;
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
	public Privilege getPrivilege() {
		if (privilege != null && privilege.eIsProxy()) {
			InternalEObject oldPrivilege = (InternalEObject)privilege;
			privilege = (Privilege)eResolveProxy(oldPrivilege);
			if (privilege != oldPrivilege) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdmPackage.ROLE_PRIVILEGE__PRIVILEGE, oldPrivilege, privilege));
			}
		}
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privilege basicGetPrivilege() {
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrivilege(Privilege newPrivilege, NotificationChain msgs) {
		Privilege oldPrivilege = privilege;
		privilege = newPrivilege;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmPackage.ROLE_PRIVILEGE__PRIVILEGE, oldPrivilege, newPrivilege);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivilege(Privilege newPrivilege) {
		if (newPrivilege != privilege) {
			NotificationChain msgs = null;
			if (privilege != null)
				msgs = ((InternalEObject)privilege).eInverseRemove(this, IdmPackage.PRIVILEGE__ROLE_PRIVILEGES, Privilege.class, msgs);
			if (newPrivilege != null)
				msgs = ((InternalEObject)newPrivilege).eInverseAdd(this, IdmPackage.PRIVILEGE__ROLE_PRIVILEGES, Privilege.class, msgs);
			msgs = basicSetPrivilege(newPrivilege, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.ROLE_PRIVILEGE__PRIVILEGE, newPrivilege, newPrivilege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdmPackage.ROLE_PRIVILEGE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdmPackage.ROLE_PRIVILEGE__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, IdmPackage.ROLE__ROLE_PRIVILEGES, Role.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, IdmPackage.ROLE__ROLE_PRIVILEGES, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.ROLE_PRIVILEGE__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdmPackage.ROLE_PRIVILEGE__PRIVILEGE:
				if (privilege != null)
					msgs = ((InternalEObject)privilege).eInverseRemove(this, IdmPackage.PRIVILEGE__ROLE_PRIVILEGES, Privilege.class, msgs);
				return basicSetPrivilege((Privilege)otherEnd, msgs);
			case IdmPackage.ROLE_PRIVILEGE__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, IdmPackage.ROLE__ROLE_PRIVILEGES, Role.class, msgs);
				return basicSetRole((Role)otherEnd, msgs);
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
			case IdmPackage.ROLE_PRIVILEGE__PRIVILEGE:
				return basicSetPrivilege(null, msgs);
			case IdmPackage.ROLE_PRIVILEGE__ROLE:
				return basicSetRole(null, msgs);
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
			case IdmPackage.ROLE_PRIVILEGE__PRIVILEGE:
				if (resolve) return getPrivilege();
				return basicGetPrivilege();
			case IdmPackage.ROLE_PRIVILEGE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
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
			case IdmPackage.ROLE_PRIVILEGE__PRIVILEGE:
				setPrivilege((Privilege)newValue);
				return;
			case IdmPackage.ROLE_PRIVILEGE__ROLE:
				setRole((Role)newValue);
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
			case IdmPackage.ROLE_PRIVILEGE__PRIVILEGE:
				setPrivilege((Privilege)null);
				return;
			case IdmPackage.ROLE_PRIVILEGE__ROLE:
				setRole((Role)null);
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
			case IdmPackage.ROLE_PRIVILEGE__PRIVILEGE:
				return privilege != null;
			case IdmPackage.ROLE_PRIVILEGE__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //RolePrivilegeImpl
