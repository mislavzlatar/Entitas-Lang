/**
 * generated by Xtext 2.11.0
 */
package io.entitas.lang.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.entitas.lang.dsl.TargetParameter#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see io.entitas.lang.dsl.DslPackage#getTargetParameter()
 * @model
 * @generated
 */
public interface TargetParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see io.entitas.lang.dsl.DslPackage#getTargetParameter_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link io.entitas.lang.dsl.TargetParameter#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // TargetParameter
