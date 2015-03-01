/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.conformant_array_schema#getPacked <em>Packed</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.conformant_array_schema#getUnpacked <em>Unpacked</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getconformant_array_schema()
 * @model
 * @generated
 */
public interface conformant_array_schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Packed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packed</em>' containment reference.
   * @see #setPacked(packed_conformant_array_schema)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getconformant_array_schema_Packed()
   * @model containment="true"
   * @generated
   */
  packed_conformant_array_schema getPacked();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.conformant_array_schema#getPacked <em>Packed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Packed</em>' containment reference.
   * @see #getPacked()
   * @generated
   */
  void setPacked(packed_conformant_array_schema value);

  /**
   * Returns the value of the '<em><b>Unpacked</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unpacked</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unpacked</em>' containment reference.
   * @see #setUnpacked(unpacked_conformant_array_schema)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getconformant_array_schema_Unpacked()
   * @model containment="true"
   * @generated
   */
  unpacked_conformant_array_schema getUnpacked();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.conformant_array_schema#getUnpacked <em>Unpacked</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unpacked</em>' containment reference.
   * @see #getUnpacked()
   * @generated
   */
  void setUnpacked(unpacked_conformant_array_schema value);

} // conformant_array_schema
