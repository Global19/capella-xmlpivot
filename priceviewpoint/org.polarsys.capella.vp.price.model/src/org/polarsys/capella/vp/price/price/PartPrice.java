/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.price.price;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.price.price.PartPrice#getCurrentPrice <em>Current Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.vp.price.price.PricePackage#getPartPrice()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/cs/0.8.0#//Part'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Part'"
 * @generated
 */

public interface PartPrice extends Price, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Current Price</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Price</em>' attribute.
	 * @see #setCurrentPrice(int)
	 * @see org.polarsys.capella.vp.price.price.PricePackage#getPartPrice_CurrentPrice()
	 * @model
	 * @generated
	 */

	int getCurrentPrice();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.price.price.PartPrice#getCurrentPrice <em>Current Price</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Price</em>' attribute.
	 * @see #getCurrentPrice()
	 * @generated
	 */

	void setCurrentPrice(int value);

} // PartPrice