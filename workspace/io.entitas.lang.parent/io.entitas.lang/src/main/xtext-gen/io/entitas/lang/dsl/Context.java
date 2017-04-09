/**
 * generated by Xtext 2.11.0
 */
package io.entitas.lang.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.entitas.lang.dsl.Context#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see io.entitas.lang.dsl.DslPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' containment reference list.
   * The list contents are of type {@link io.entitas.lang.dsl.ContextId}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' containment reference list.
   * @see io.entitas.lang.dsl.DslPackage#getContext_Ids()
   * @model containment="true"
   * @generated
   */
  EList<ContextId> getIds();

} // Context
