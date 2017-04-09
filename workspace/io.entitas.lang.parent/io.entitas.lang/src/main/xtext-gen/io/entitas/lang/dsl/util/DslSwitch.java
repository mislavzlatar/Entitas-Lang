/**
 * generated by Xtext 2.11.0
 */
package io.entitas.lang.dsl.util;

import io.entitas.lang.dsl.AccessRule;
import io.entitas.lang.dsl.Alias;
import io.entitas.lang.dsl.AliasList;
import io.entitas.lang.dsl.AliasRule;
import io.entitas.lang.dsl.Component;
import io.entitas.lang.dsl.Context;
import io.entitas.lang.dsl.ContextId;
import io.entitas.lang.dsl.ContextScope;
import io.entitas.lang.dsl.ContextScopes;
import io.entitas.lang.dsl.DslPackage;
import io.entitas.lang.dsl.MatcherRule;
import io.entitas.lang.dsl.Namespace;
import io.entitas.lang.dsl.PropertyList;
import io.entitas.lang.dsl.PropertyPrefix;
import io.entitas.lang.dsl.PropertyRules;
import io.entitas.lang.dsl.Root;
import io.entitas.lang.dsl.SingleAlias;
import io.entitas.lang.dsl.Target;
import io.entitas.lang.dsl.TargetId;
import io.entitas.lang.dsl.TargetParameter;
import io.entitas.lang.dsl.TriggerRule;
import io.entitas.lang.dsl.Version;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see io.entitas.lang.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TARGET:
      {
        Target target = (Target)theEObject;
        T result = caseTarget(target);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TARGET_ID:
      {
        TargetId targetId = (TargetId)theEObject;
        T result = caseTargetId(targetId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TARGET_PARAMETER:
      {
        TargetParameter targetParameter = (TargetParameter)theEObject;
        T result = caseTargetParameter(targetParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.NAMESPACE:
      {
        Namespace namespace = (Namespace)theEObject;
        T result = caseNamespace(namespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONTEXT:
      {
        Context context = (Context)theEObject;
        T result = caseContext(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONTEXT_ID:
      {
        ContextId contextId = (ContextId)theEObject;
        T result = caseContextId(contextId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ALIAS:
      {
        Alias alias = (Alias)theEObject;
        T result = caseAlias(alias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ALIAS_LIST:
      {
        AliasList aliasList = (AliasList)theEObject;
        T result = caseAliasList(aliasList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ALIAS_RULE:
      {
        AliasRule aliasRule = (AliasRule)theEObject;
        T result = caseAliasRule(aliasRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SINGLE_ALIAS:
      {
        SingleAlias singleAlias = (SingleAlias)theEObject;
        T result = caseSingleAlias(singleAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PROPERTY_LIST:
      {
        PropertyList propertyList = (PropertyList)theEObject;
        T result = casePropertyList(propertyList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PROPERTY_RULES:
      {
        PropertyRules propertyRules = (PropertyRules)theEObject;
        T result = casePropertyRules(propertyRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PROPERTY_PREFIX:
      {
        PropertyPrefix propertyPrefix = (PropertyPrefix)theEObject;
        T result = casePropertyPrefix(propertyPrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONTEXT_SCOPES:
      {
        ContextScopes contextScopes = (ContextScopes)theEObject;
        T result = caseContextScopes(contextScopes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SYSTEM:
      {
        io.entitas.lang.dsl.System system = (io.entitas.lang.dsl.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ACCESS_RULE:
      {
        AccessRule accessRule = (AccessRule)theEObject;
        T result = caseAccessRule(accessRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRIGGER_RULE:
      {
        TriggerRule triggerRule = (TriggerRule)theEObject;
        T result = caseTriggerRule(triggerRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.MATCHER_RULE:
      {
        MatcherRule matcherRule = (MatcherRule)theEObject;
        T result = caseMatcherRule(matcherRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONTEXT_SCOPE:
      {
        ContextScope contextScope = (ContextScope)theEObject;
        T result = caseContextScope(contextScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTarget(Target object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetId(TargetId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetParameter(TargetParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersion(Version object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace(Namespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextId(ContextId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlias(Alias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasList(AliasList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasRule(AliasRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleAlias(SingleAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyList(PropertyList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyRules(PropertyRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyPrefix(PropertyPrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Scopes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Scopes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextScopes(ContextScopes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(io.entitas.lang.dsl.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessRule(AccessRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggerRule(TriggerRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matcher Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matcher Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatcherRule(MatcherRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextScope(ContextScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslSwitch
