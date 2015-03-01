/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>record type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.record_type#getRecordKeyword <em>Record Keyword</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.record_type#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.record_type#getEndKeyword <em>End Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getrecord_type()
 * @model
 * @generated
 */
public interface record_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Record Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Keyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Keyword</em>' attribute.
   * @see #setRecordKeyword(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getrecord_type_RecordKeyword()
   * @model
   * @generated
   */
  String getRecordKeyword();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.record_type#getRecordKeyword <em>Record Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Keyword</em>' attribute.
   * @see #getRecordKeyword()
   * @generated
   */
  void setRecordKeyword(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference.
   * @see #setFields(field_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getrecord_type_Fields()
   * @model containment="true"
   * @generated
   */
  field_list getFields();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.record_type#getFields <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' containment reference.
   * @see #getFields()
   * @generated
   */
  void setFields(field_list value);

  /**
   * Returns the value of the '<em><b>End Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Keyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Keyword</em>' attribute.
   * @see #setEndKeyword(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getrecord_type_EndKeyword()
   * @model
   * @generated
   */
  String getEndKeyword();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.record_type#getEndKeyword <em>End Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Keyword</em>' attribute.
   * @see #getEndKeyword()
   * @generated
   */
  void setEndKeyword(String value);

} // record_type
