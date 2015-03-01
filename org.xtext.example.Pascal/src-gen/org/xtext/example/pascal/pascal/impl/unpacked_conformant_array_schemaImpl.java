/**
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.bound_specification;
import org.xtext.example.pascal.pascal.parameter_type;
import org.xtext.example.pascal.pascal.unpacked_conformant_array_schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.unpacked_conformant_array_schemaImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unpacked_conformant_array_schemaImpl extends MinimalEObjectImpl.Container implements unpacked_conformant_array_schema
{
  /**
   * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBounds()
   * @generated
   * @ordered
   */
  protected EList<bound_specification> bounds;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected parameter_type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unpacked_conformant_array_schemaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.UNPACKED_CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<bound_specification> getBounds()
  {
    if (bounds == null)
    {
      bounds = new EObjectContainmentEList<bound_specification>(bound_specification.class, this, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS);
    }
    return bounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(parameter_type newType, NotificationChain msgs)
  {
    parameter_type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(parameter_type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        return ((InternalEList<?>)getBounds()).basicRemove(otherEnd, msgs);
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        return getBounds();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE:
        return getType();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        getBounds().clear();
        getBounds().addAll((Collection<? extends bound_specification>)newValue);
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE:
        setType((parameter_type)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        getBounds().clear();
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE:
        setType((parameter_type)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUNDS:
        return bounds != null && !bounds.isEmpty();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //unpacked_conformant_array_schemaImpl
