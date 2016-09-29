/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.core.semantic.data.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind;

import org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionalStructureImpl;

import org.polarsys.capella.core.semantic.data.information.Association;
import org.polarsys.capella.core.semantic.data.information.AssociationPkg;
import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.KeyPart;

import org.polarsys.capella.core.semantic.data.pa.PaPackage;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponent;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Component Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl#getOwnedAssociations <em>Owned Associations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl#getOwnedComponents <em>Owned Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalComponentPkgImpl#getOwnedKeyParts <em>Owned Key Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalComponentPkgImpl extends AbstractFunctionalStructureImpl implements PhysicalComponentPkg {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.UNSET;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedAssociations() <em>Owned Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> ownedAssociations;

	/**
	 * The cached value of the '{@link #getOwnedComponents() <em>Owned Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> ownedComponents;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponentPkgs() <em>Owned Physical Component Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponentPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponentPkg> ownedPhysicalComponentPkgs;

	/**
	 * The cached value of the '{@link #getOwnedKeyParts() <em>Owned Key Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedKeyParts()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyPart> ownedKeyParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComponentPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_COMPONENT_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_COMPONENT_PKG__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getOwnedAssociations() {
		if (ownedAssociations == null) {
			ownedAssociations = new EObjectContainmentEList<Association>(Association.class, this, PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS);
		}
		return ownedAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getOwnedComponents() {
		if (ownedComponents == null) {
			ownedComponents = new EObjectContainmentEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS);
		}
		return ownedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponentPkg> getOwnedPhysicalComponentPkgs() {
		if (ownedPhysicalComponentPkgs == null) {
			ownedPhysicalComponentPkgs = new EObjectContainmentEList<PhysicalComponentPkg>(PhysicalComponentPkg.class, this, PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS);
		}
		return ownedPhysicalComponentPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyPart> getOwnedKeyParts() {
		if (ownedKeyParts == null) {
			ownedKeyParts = new EObjectContainmentEList<KeyPart>(KeyPart.class, this, PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS);
		}
		return ownedKeyParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS:
				return ((InternalEList<?>)getOwnedAssociations()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS:
				return ((InternalEList<?>)getOwnedComponents()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalComponentPkgs()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS:
				return ((InternalEList<?>)getOwnedKeyParts()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_COMPONENT_PKG__VISIBILITY:
				return getVisibility();
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS:
				return getOwnedAssociations();
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS:
				return getOwnedComponents();
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS:
				return getOwnedPhysicalComponentPkgs();
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS:
				return getOwnedKeyParts();
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
			case PaPackage.PHYSICAL_COMPONENT_PKG__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS:
				getOwnedAssociations().clear();
				getOwnedAssociations().addAll((Collection<? extends Association>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS:
				getOwnedComponents().clear();
				getOwnedComponents().addAll((Collection<? extends PhysicalComponent>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
				getOwnedPhysicalComponentPkgs().addAll((Collection<? extends PhysicalComponentPkg>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS:
				getOwnedKeyParts().clear();
				getOwnedKeyParts().addAll((Collection<? extends KeyPart>)newValue);
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
			case PaPackage.PHYSICAL_COMPONENT_PKG__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS:
				getOwnedAssociations().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS:
				getOwnedComponents().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS:
				getOwnedKeyParts().clear();
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
			case PaPackage.PHYSICAL_COMPONENT_PKG__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS:
				return ownedAssociations != null && !ownedAssociations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS:
				return ownedComponents != null && !ownedComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ownedPhysicalComponentPkgs != null && !ownedPhysicalComponentPkgs.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS:
				return ownedKeyParts != null && !ownedKeyParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AssociationPkg.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT_PKG__VISIBILITY: return InformationPackage.ASSOCIATION_PKG__VISIBILITY;
				case PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS: return InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AssociationPkg.class) {
			switch (baseFeatureID) {
				case InformationPackage.ASSOCIATION_PKG__VISIBILITY: return PaPackage.PHYSICAL_COMPONENT_PKG__VISIBILITY;
				case InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS: return PaPackage.PHYSICAL_COMPONENT_PKG__OWNED_ASSOCIATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //PhysicalComponentPkgImpl