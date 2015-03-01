/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getSet <em>Set</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#isNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.factor#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor()
 * @model
 * @generated
 */
public interface factor extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(variable)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Variable()
   * @model containment="true"
   * @generated
   */
  variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(variable value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(number)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Number()
   * @model containment="true"
   * @generated
   */
  number getNumber();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(number value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(set)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Set()
   * @model containment="true"
   * @generated
   */
  set getSet();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(set value);

  /**
   * Returns the value of the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' attribute.
   * @see #setNil(boolean)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Nil()
   * @model
   * @generated
   */
  boolean isNil();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#isNil <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' attribute.
   * @see #isNil()
   * @generated
   */
  void setNil(boolean value);

  /**
   * Returns the value of the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean</em>' attribute.
   * @see #setBoolean(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Boolean()
   * @model
   * @generated
   */
  String getBoolean();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getBoolean <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean</em>' attribute.
   * @see #getBoolean()
   * @generated
   */
  void setBoolean(String value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(function_designator)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Function()
   * @model containment="true"
   * @generated
   */
  function_designator getFunction();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(function_designator value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

  /**
   * Returns the value of the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' containment reference.
   * @see #setNot(factor)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getfactor_Not()
   * @model containment="true"
   * @generated
   */
  factor getNot();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.factor#getNot <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' containment reference.
   * @see #getNot()
   * @generated
   */
  void setNot(factor value);

} // factor
