/**
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.any_number;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>any number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.any_numberImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.any_numberImpl#getReal <em>Real</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class any_numberImpl extends MinimalEObjectImpl.Container implements any_number
{
  /**
   * The default value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected static final String INTEGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected String integer = INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #getReal() <em>Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReal()
   * @generated
   * @ordered
   */
  protected static final String REAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReal() <em>Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReal()
   * @generated
   * @ordered
   */
  protected String real = REAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected any_numberImpl()
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
    return PascalPackage.Literals.ANY_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInteger()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteger(String newInteger)
  {
    String oldInteger = integer;
    integer = newInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ANY_NUMBER__INTEGER, oldInteger, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReal()
  {
    return real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReal(String newReal)
  {
    String oldReal = real;
    real = newReal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ANY_NUMBER__REAL, oldReal, real));
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
      case PascalPackage.ANY_NUMBER__INTEGER:
        return getInteger();
      case PascalPackage.ANY_NUMBER__REAL:
        return getReal();
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
      case PascalPackage.ANY_NUMBER__INTEGER:
        setInteger((String)newValue);
        return;
      case PascalPackage.ANY_NUMBER__REAL:
        setReal((String)newValue);
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
      case PascalPackage.ANY_NUMBER__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case PascalPackage.ANY_NUMBER__REAL:
        setReal(REAL_EDEFAULT);
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
      case PascalPackage.ANY_NUMBER__INTEGER:
        return INTEGER_EDEFAULT == null ? integer != null : !INTEGER_EDEFAULT.equals(integer);
      case PascalPackage.ANY_NUMBER__REAL:
        return REAL_EDEFAULT == null ? real != null : !REAL_EDEFAULT.equals(real);
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
    result.append(" (integer: ");
    result.append(integer);
    result.append(", real: ");
    result.append(real);
    result.append(')');
    return result.toString();
  }

} //any_numberImpl
