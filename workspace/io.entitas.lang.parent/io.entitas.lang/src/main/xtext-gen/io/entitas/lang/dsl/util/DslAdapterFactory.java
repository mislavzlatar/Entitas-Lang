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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.entitas.lang.dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslSwitch<Adapter> modelSwitch =
    new DslSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseTargetId(TargetId object)
      {
        return createTargetIdAdapter();
      }
      @Override
      public Adapter caseTargetParameter(TargetParameter object)
      {
        return createTargetParameterAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
      }
      @Override
      public Adapter caseNamespace(Namespace object)
      {
        return createNamespaceAdapter();
      }
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseContextId(ContextId object)
      {
        return createContextIdAdapter();
      }
      @Override
      public Adapter caseAlias(Alias object)
      {
        return createAliasAdapter();
      }
      @Override
      public Adapter caseAliasList(AliasList object)
      {
        return createAliasListAdapter();
      }
      @Override
      public Adapter caseAliasRule(AliasRule object)
      {
        return createAliasRuleAdapter();
      }
      @Override
      public Adapter caseSingleAlias(SingleAlias object)
      {
        return createSingleAliasAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter casePropertyList(PropertyList object)
      {
        return createPropertyListAdapter();
      }
      @Override
      public Adapter casePropertyRules(PropertyRules object)
      {
        return createPropertyRulesAdapter();
      }
      @Override
      public Adapter casePropertyPrefix(PropertyPrefix object)
      {
        return createPropertyPrefixAdapter();
      }
      @Override
      public Adapter caseContextScopes(ContextScopes object)
      {
        return createContextScopesAdapter();
      }
      @Override
      public Adapter caseSystem(io.entitas.lang.dsl.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseAccessRule(AccessRule object)
      {
        return createAccessRuleAdapter();
      }
      @Override
      public Adapter caseTriggerRule(TriggerRule object)
      {
        return createTriggerRuleAdapter();
      }
      @Override
      public Adapter caseMatcherRule(MatcherRule object)
      {
        return createMatcherRuleAdapter();
      }
      @Override
      public Adapter caseContextScope(ContextScope object)
      {
        return createContextScopeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.TargetId <em>Target Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.TargetId
   * @generated
   */
  public Adapter createTargetIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.TargetParameter <em>Target Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.TargetParameter
   * @generated
   */
  public Adapter createTargetParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.Namespace
   * @generated
   */
  public Adapter createNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.ContextId <em>Context Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.ContextId
   * @generated
   */
  public Adapter createContextIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.Alias
   * @generated
   */
  public Adapter createAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.AliasList <em>Alias List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.AliasList
   * @generated
   */
  public Adapter createAliasListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.AliasRule <em>Alias Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.AliasRule
   * @generated
   */
  public Adapter createAliasRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.SingleAlias <em>Single Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.SingleAlias
   * @generated
   */
  public Adapter createSingleAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.PropertyList <em>Property List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.PropertyList
   * @generated
   */
  public Adapter createPropertyListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.PropertyRules <em>Property Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.PropertyRules
   * @generated
   */
  public Adapter createPropertyRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.PropertyPrefix <em>Property Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.PropertyPrefix
   * @generated
   */
  public Adapter createPropertyPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.ContextScopes <em>Context Scopes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.ContextScopes
   * @generated
   */
  public Adapter createContextScopesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.AccessRule <em>Access Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.AccessRule
   * @generated
   */
  public Adapter createAccessRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.TriggerRule <em>Trigger Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.TriggerRule
   * @generated
   */
  public Adapter createTriggerRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.MatcherRule <em>Matcher Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.MatcherRule
   * @generated
   */
  public Adapter createMatcherRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.entitas.lang.dsl.ContextScope <em>Context Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.entitas.lang.dsl.ContextScope
   * @generated
   */
  public Adapter createContextScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DslAdapterFactory
