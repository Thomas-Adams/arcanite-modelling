/**
 */
package org.arcanite.idm.impl;

import java.util.Collection;

import org.arcanite.idm.IdmPackage;
import org.arcanite.idm.User;
import org.arcanite.idm.UserGroup;
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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getExpired <em>Expired</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getUserRoles <em>User Roles</em>}</li>
 *   <li>{@link org.arcanite.idm.impl.UserImpl#getUserGroups <em>User Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends BasicEntityImpl<Long> implements User {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpired() <em>Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpired() <em>Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpired()
	 * @generated
	 * @ordered
	 */
	protected Boolean expired = EXPIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean locked = LOCKED_EDEFAULT;

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
	 * The cached value of the '{@link #getUserGroups() <em>User Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<UserGroup> userGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdmPackage.Literals.USER;
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
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.USER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(Boolean newEnabled) {
		Boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.USER__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExpired() {
		return expired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpired(Boolean newExpired) {
		Boolean oldExpired = expired;
		expired = newExpired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.USER__EXPIRED, oldExpired, expired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(Boolean newLocked) {
		Boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdmPackage.USER__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserRole> getUserRoles() {
		if (userRoles == null) {
			userRoles = new EObjectWithInverseResolvingEList<UserRole>(UserRole.class, this, IdmPackage.USER__USER_ROLES, IdmPackage.USER_ROLE__USER);
		}
		return userRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserGroup> getUserGroups() {
		if (userGroups == null) {
			userGroups = new EObjectWithInverseResolvingEList<UserGroup>(UserGroup.class, this, IdmPackage.USER__USER_GROUPS, IdmPackage.USER_GROUP__USER);
		}
		return userGroups;
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
			case IdmPackage.USER__USER_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserRoles()).basicAdd(otherEnd, msgs);
			case IdmPackage.USER__USER_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserGroups()).basicAdd(otherEnd, msgs);
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
			case IdmPackage.USER__USER_ROLES:
				return ((InternalEList<?>)getUserRoles()).basicRemove(otherEnd, msgs);
			case IdmPackage.USER__USER_GROUPS:
				return ((InternalEList<?>)getUserGroups()).basicRemove(otherEnd, msgs);
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
			case IdmPackage.USER__USERNAME:
				return getUsername();
			case IdmPackage.USER__EMAIL:
				return getEmail();
			case IdmPackage.USER__PASSWORD:
				return getPassword();
			case IdmPackage.USER__ENABLED:
				return getEnabled();
			case IdmPackage.USER__EXPIRED:
				return getExpired();
			case IdmPackage.USER__LOCKED:
				return getLocked();
			case IdmPackage.USER__USER_ROLES:
				return getUserRoles();
			case IdmPackage.USER__USER_GROUPS:
				return getUserGroups();
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
			case IdmPackage.USER__USERNAME:
				setUsername((String)newValue);
				return;
			case IdmPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case IdmPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case IdmPackage.USER__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case IdmPackage.USER__EXPIRED:
				setExpired((Boolean)newValue);
				return;
			case IdmPackage.USER__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case IdmPackage.USER__USER_ROLES:
				getUserRoles().clear();
				getUserRoles().addAll((Collection<? extends UserRole>)newValue);
				return;
			case IdmPackage.USER__USER_GROUPS:
				getUserGroups().clear();
				getUserGroups().addAll((Collection<? extends UserGroup>)newValue);
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
			case IdmPackage.USER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case IdmPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case IdmPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case IdmPackage.USER__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case IdmPackage.USER__EXPIRED:
				setExpired(EXPIRED_EDEFAULT);
				return;
			case IdmPackage.USER__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case IdmPackage.USER__USER_ROLES:
				getUserRoles().clear();
				return;
			case IdmPackage.USER__USER_GROUPS:
				getUserGroups().clear();
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
			case IdmPackage.USER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case IdmPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case IdmPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case IdmPackage.USER__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case IdmPackage.USER__EXPIRED:
				return EXPIRED_EDEFAULT == null ? expired != null : !EXPIRED_EDEFAULT.equals(expired);
			case IdmPackage.USER__LOCKED:
				return LOCKED_EDEFAULT == null ? locked != null : !LOCKED_EDEFAULT.equals(locked);
			case IdmPackage.USER__USER_ROLES:
				return userRoles != null && !userRoles.isEmpty();
			case IdmPackage.USER__USER_GROUPS:
				return userGroups != null && !userGroups.isEmpty();
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
		result.append(" (username: ");
		result.append(username);
		result.append(", email: ");
		result.append(email);
		result.append(", password: ");
		result.append(password);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", expired: ");
		result.append(expired);
		result.append(", locked: ");
		result.append(locked);
		result.append(')');
		return result.toString();
	}

} //UserImpl
