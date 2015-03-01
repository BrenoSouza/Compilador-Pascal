/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>packed conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getBound <em>Bound</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getpacked_conformant_array_schema()
 * @model
 * @generated
 */
public interface packed_conformant_array_schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound</em>' containment reference.
   * @see #setBound(bound_specification)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getpacked_conformant_array_schema_Bound()
   * @model containment="true"
   * @generated
   */
  bound_specification getBound();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getBound <em>Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound</em>' containment reference.
   * @see #getBound()
   * @generated
   */
  void setBound(bound_specification value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getpacked_conformant_array_schema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.packed_conformant_array_schema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // packed_conformant_array_schema
