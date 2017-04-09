/**
 * generated by Xtext 2.11.0
 */
package io.entitas.lang.dsl.impl;

import io.entitas.lang.dsl.Alias;
import io.entitas.lang.dsl.Component;
import io.entitas.lang.dsl.Context;
import io.entitas.lang.dsl.DslPackage;
import io.entitas.lang.dsl.Namespace;
import io.entitas.lang.dsl.Root;
import io.entitas.lang.dsl.Target;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.entitas.lang.dsl.impl.RootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.RootImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.RootImpl#getContext <em>Context</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.RootImpl#getTypeAliases <em>Type Aliases</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.RootImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.RootImpl#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Target target;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected Namespace namespace;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected Context context;

  /**
   * The cached value of the '{@link #getTypeAliases() <em>Type Aliases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeAliases()
   * @generated
   * @ordered
   */
  protected EList<Alias> typeAliases;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystems()
   * @generated
   * @ordered
   */
  protected EList<io.entitas.lang.dsl.System> systems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootImpl()
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
    return DslPackage.Literals.ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs)
  {
    Target oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.ROOT__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Target newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.ROOT__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.ROOT__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROOT__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs)
  {
    Namespace oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.ROOT__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(Namespace newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.ROOT__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.ROOT__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROOT__NAMESPACE, newNamespace, newNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContext(Context newContext, NotificationChain msgs)
  {
    Context oldContext = context;
    context = newContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.ROOT__CONTEXT, oldContext, newContext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(Context newContext)
  {
    if (newContext != context)
    {
      NotificationChain msgs = null;
      if (context != null)
        msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.ROOT__CONTEXT, null, msgs);
      if (newContext != null)
        msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.ROOT__CONTEXT, null, msgs);
      msgs = basicSetContext(newContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ROOT__CONTEXT, newContext, newContext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Alias> getTypeAliases()
  {
    if (typeAliases == null)
    {
      typeAliases = new EObjectContainmentEList<Alias>(Alias.class, this, DslPackage.ROOT__TYPE_ALIASES);
    }
    return typeAliases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, DslPackage.ROOT__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<io.entitas.lang.dsl.System> getSystems()
  {
    if (systems == null)
    {
      systems = new EObjectContainmentEList<io.entitas.lang.dsl.System>(io.entitas.lang.dsl.System.class, this, DslPackage.ROOT__SYSTEMS);
    }
    return systems;
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
      case DslPackage.ROOT__TARGET:
        return basicSetTarget(null, msgs);
      case DslPackage.ROOT__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case DslPackage.ROOT__CONTEXT:
        return basicSetContext(null, msgs);
      case DslPackage.ROOT__TYPE_ALIASES:
        return ((InternalEList<?>)getTypeAliases()).basicRemove(otherEnd, msgs);
      case DslPackage.ROOT__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case DslPackage.ROOT__SYSTEMS:
        return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
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
      case DslPackage.ROOT__TARGET:
        return getTarget();
      case DslPackage.ROOT__NAMESPACE:
        return getNamespace();
      case DslPackage.ROOT__CONTEXT:
        return getContext();
      case DslPackage.ROOT__TYPE_ALIASES:
        return getTypeAliases();
      case DslPackage.ROOT__COMPONENTS:
        return getComponents();
      case DslPackage.ROOT__SYSTEMS:
        return getSystems();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.ROOT__TARGET:
        setTarget((Target)newValue);
        return;
      case DslPackage.ROOT__NAMESPACE:
        setNamespace((Namespace)newValue);
        return;
      case DslPackage.ROOT__CONTEXT:
        setContext((Context)newValue);
        return;
      case DslPackage.ROOT__TYPE_ALIASES:
        getTypeAliases().clear();
        getTypeAliases().addAll((Collection<? extends Alias>)newValue);
        return;
      case DslPackage.ROOT__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case DslPackage.ROOT__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends io.entitas.lang.dsl.System>)newValue);
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
      case DslPackage.ROOT__TARGET:
        setTarget((Target)null);
        return;
      case DslPackage.ROOT__NAMESPACE:
        setNamespace((Namespace)null);
        return;
      case DslPackage.ROOT__CONTEXT:
        setContext((Context)null);
        return;
      case DslPackage.ROOT__TYPE_ALIASES:
        getTypeAliases().clear();
        return;
      case DslPackage.ROOT__COMPONENTS:
        getComponents().clear();
        return;
      case DslPackage.ROOT__SYSTEMS:
        getSystems().clear();
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
      case DslPackage.ROOT__TARGET:
        return target != null;
      case DslPackage.ROOT__NAMESPACE:
        return namespace != null;
      case DslPackage.ROOT__CONTEXT:
        return context != null;
      case DslPackage.ROOT__TYPE_ALIASES:
        return typeAliases != null && !typeAliases.isEmpty();
      case DslPackage.ROOT__COMPONENTS:
        return components != null && !components.isEmpty();
      case DslPackage.ROOT__SYSTEMS:
        return systems != null && !systems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RootImpl