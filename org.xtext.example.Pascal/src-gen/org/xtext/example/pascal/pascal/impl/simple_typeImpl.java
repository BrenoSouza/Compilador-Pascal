/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.enumerated_type;
import org.xtext.example.pascal.pascal.simple_type;
import org.xtext.example.pascal.pascal.subrange_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_typeImpl#getSubrange <em>Subrange</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_typeImpl#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.simple_typeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_typeImpl extends MinimalEObjectImpl.Container implements simple_type
{
  /**
   * The cached value of the '{@link #getSubrange() <em>Subrange</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrange()
   * @generated
   * @ordered
   */
  protected subrange_type subrange;

  /**
   * The cached value of the '{@link #getEnumerated() <em>Enumerated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
  protected enumerated_type enumerated;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_typeImpl()
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
    return PascalPackage.Literals.SIMPLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrange_type getSubrange()
  {
    return subrange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubrange(subrange_type newSubrange, NotificationChain msgs)
  {
    subrange_type oldSubrange = subrange;
    subrange = newSubrange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE, oldSubrange, newSubrange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubrange(subrange_type newSubrange)
  {
    if (newSubrange != subrange)
    {
      NotificationChain msgs = null;
      if (subrange != null)
        msgs = ((InternalEObject)subrange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE, null, msgs);
      if (newSubrange != null)
        msgs = ((InternalEObject)newSubrange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE, null, msgs);
      msgs = basicSetSubrange(newSubrange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE, newSubrange, newSubrange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumerated_type getEnumerated()
  {
    return enumerated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumerated(enumerated_type newEnumerated, NotificationChain msgs)
  {
    enumerated_type oldEnumerated = enumerated;
    enumerated = newEnumerated;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__ENUMERATED, oldEnumerated, newEnumerated);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumerated(enumerated_type newEnumerated)
  {
    if (newEnumerated != enumerated)
    {
      NotificationChain msgs = null;
      if (enumerated != null)
        msgs = ((InternalEObject)enumerated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__ENUMERATED, null, msgs);
      if (newEnumerated != null)
        msgs = ((InternalEObject)newEnumerated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__ENUMERATED, null, msgs);
      msgs = basicSetEnumerated(newEnumerated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__ENUMERATED, newEnumerated, newEnumerated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__NAME, oldName, name));
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE:
        return basicSetSubrange(null, msgs);
      case PascalPackage.SIMPLE_TYPE__ENUMERATED:
        return basicSetEnumerated(null, msgs);
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE:
        return getSubrange();
      case PascalPackage.SIMPLE_TYPE__ENUMERATED:
        return getEnumerated();
      case PascalPackage.SIMPLE_TYPE__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.SIMPLE_TYPE__SUBRANGE:
        setSubrange((subrange_type)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED:
        setEnumerated((enumerated_type)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__NAME:
        setName((String)newValue);
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE:
        setSubrange((subrange_type)null);
        return;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED:
        setEnumerated((enumerated_type)null);
        return;
      case PascalPackage.SIMPLE_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE:
        return subrange != null;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED:
        return enumerated != null;
      case PascalPackage.SIMPLE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //simple_typeImpl
