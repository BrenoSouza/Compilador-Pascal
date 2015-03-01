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
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.number;
import org.xtext.example.pascal.pascal.set;
import org.xtext.example.pascal.pascal.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#isNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.factorImpl#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class factorImpl extends MinimalEObjectImpl.Container implements factor
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected variable variable;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected number number;

  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected set set;

  /**
   * The default value of the '{@link #isNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNil()
   * @generated
   * @ordered
   */
  protected static final boolean NIL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNil()
   * @generated
   * @ordered
   */
  protected boolean nil = NIL_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean()
   * @generated
   * @ordered
   */
  protected String boolean_ = BOOLEAN_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected function_designator function;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected factor not;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected factorImpl()
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
    return PascalPackage.Literals.FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(variable newVariable, NotificationChain msgs)
  {
    variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(number newNumber, NotificationChain msgs)
  {
    number oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(number newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(set newSet, NotificationChain msgs)
  {
    set oldSet = set;
    set = newSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(set newSet)
  {
    if (newSet != set)
    {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNil()
  {
    return nil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNil(boolean newNil)
  {
    boolean oldNil = nil;
    nil = newNil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NIL, oldNil, nil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolean()
  {
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolean(String newBoolean)
  {
    String oldBoolean = boolean_;
    boolean_ = newBoolean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__BOOLEAN, oldBoolean, boolean_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_designator getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(function_designator newFunction, NotificationChain msgs)
  {
    function_designator oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(function_designator newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factor getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNot(factor newNot, NotificationChain msgs)
  {
    factor oldNot = not;
    not = newNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NOT, oldNot, newNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(factor newNot)
  {
    if (newNot != not)
    {
      NotificationChain msgs = null;
      if (not != null)
        msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NOT, null, msgs);
      if (newNot != null)
        msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NOT, null, msgs);
      msgs = basicSetNot(newNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NOT, newNot, newNot));
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
      case PascalPackage.FACTOR__VARIABLE:
        return basicSetVariable(null, msgs);
      case PascalPackage.FACTOR__NUMBER:
        return basicSetNumber(null, msgs);
      case PascalPackage.FACTOR__SET:
        return basicSetSet(null, msgs);
      case PascalPackage.FACTOR__FUNCTION:
        return basicSetFunction(null, msgs);
      case PascalPackage.FACTOR__EXPRESSION:
        return basicSetExpression(null, msgs);
      case PascalPackage.FACTOR__NOT:
        return basicSetNot(null, msgs);
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
      case PascalPackage.FACTOR__VARIABLE:
        return getVariable();
      case PascalPackage.FACTOR__NUMBER:
        return getNumber();
      case PascalPackage.FACTOR__STRING:
        return getString();
      case PascalPackage.FACTOR__SET:
        return getSet();
      case PascalPackage.FACTOR__NIL:
        return isNil();
      case PascalPackage.FACTOR__BOOLEAN:
        return getBoolean();
      case PascalPackage.FACTOR__FUNCTION:
        return getFunction();
      case PascalPackage.FACTOR__EXPRESSION:
        return getExpression();
      case PascalPackage.FACTOR__NOT:
        return getNot();
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
      case PascalPackage.FACTOR__VARIABLE:
        setVariable((variable)newValue);
        return;
      case PascalPackage.FACTOR__NUMBER:
        setNumber((number)newValue);
        return;
      case PascalPackage.FACTOR__STRING:
        setString((String)newValue);
        return;
      case PascalPackage.FACTOR__SET:
        setSet((set)newValue);
        return;
      case PascalPackage.FACTOR__NIL:
        setNil((Boolean)newValue);
        return;
      case PascalPackage.FACTOR__BOOLEAN:
        setBoolean((String)newValue);
        return;
      case PascalPackage.FACTOR__FUNCTION:
        setFunction((function_designator)newValue);
        return;
      case PascalPackage.FACTOR__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case PascalPackage.FACTOR__NOT:
        setNot((factor)newValue);
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
      case PascalPackage.FACTOR__VARIABLE:
        setVariable((variable)null);
        return;
      case PascalPackage.FACTOR__NUMBER:
        setNumber((number)null);
        return;
      case PascalPackage.FACTOR__STRING:
        setString(STRING_EDEFAULT);
        return;
      case PascalPackage.FACTOR__SET:
        setSet((set)null);
        return;
      case PascalPackage.FACTOR__NIL:
        setNil(NIL_EDEFAULT);
        return;
      case PascalPackage.FACTOR__BOOLEAN:
        setBoolean(BOOLEAN_EDEFAULT);
        return;
      case PascalPackage.FACTOR__FUNCTION:
        setFunction((function_designator)null);
        return;
      case PascalPackage.FACTOR__EXPRESSION:
        setExpression((expression)null);
        return;
      case PascalPackage.FACTOR__NOT:
        setNot((factor)null);
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
      case PascalPackage.FACTOR__VARIABLE:
        return variable != null;
      case PascalPackage.FACTOR__NUMBER:
        return number != null;
      case PascalPackage.FACTOR__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case PascalPackage.FACTOR__SET:
        return set != null;
      case PascalPackage.FACTOR__NIL:
        return nil != NIL_EDEFAULT;
      case PascalPackage.FACTOR__BOOLEAN:
        return BOOLEAN_EDEFAULT == null ? boolean_ != null : !BOOLEAN_EDEFAULT.equals(boolean_);
      case PascalPackage.FACTOR__FUNCTION:
        return function != null;
      case PascalPackage.FACTOR__EXPRESSION:
        return expression != null;
      case PascalPackage.FACTOR__NOT:
        return not != null;
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
    result.append(" (string: ");
    result.append(string);
    result.append(", nil: ");
    result.append(nil);
    result.append(", boolean: ");
    result.append(boolean_);
    result.append(')');
    return result.toString();
  }

} //factorImpl
