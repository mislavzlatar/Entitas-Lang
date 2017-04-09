/**
 * generated by Xtext 2.11.0
 */
package io.entitas.lang.dsl.impl;

import io.entitas.lang.dsl.AccessRule;
import io.entitas.lang.dsl.ContextScope;
import io.entitas.lang.dsl.DslPackage;
import io.entitas.lang.dsl.MatcherRule;
import io.entitas.lang.dsl.TriggerRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#isReactive <em>Reactive</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#getTriggerRules <em>Trigger Rules</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#isNoFilter <em>No Filter</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#getMatcherRules <em>Matcher Rules</em>}</li>
 *   <li>{@link io.entitas.lang.dsl.impl.SystemImpl#getAccessRules <em>Access Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements io.entitas.lang.dsl.System
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * The default value of the '{@link #isReactive() <em>Reactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReactive()
   * @generated
   * @ordered
   */
  protected static final boolean REACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReactive() <em>Reactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReactive()
   * @generated
   * @ordered
   */
  protected boolean reactive = REACTIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected ContextScope scope;

  /**
   * The cached value of the '{@link #getTriggerRules() <em>Trigger Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggerRules()
   * @generated
   * @ordered
   */
  protected EList<TriggerRule> triggerRules;

  /**
   * The default value of the '{@link #isNoFilter() <em>No Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoFilter()
   * @generated
   * @ordered
   */
  protected static final boolean NO_FILTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoFilter() <em>No Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoFilter()
   * @generated
   * @ordered
   */
  protected boolean noFilter = NO_FILTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getMatcherRules() <em>Matcher Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatcherRules()
   * @generated
   * @ordered
   */
  protected MatcherRule matcherRules;

  /**
   * The cached value of the '{@link #getAccessRules() <em>Access Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessRules()
   * @generated
   * @ordered
   */
  protected EList<AccessRule> accessRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return DslPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EDataTypeEList<String>(String.class, this, DslPackage.SYSTEM__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReactive()
  {
    return reactive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReactive(boolean newReactive)
  {
    boolean oldReactive = reactive;
    reactive = newReactive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__REACTIVE, oldReactive, reactive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextScope getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScope(ContextScope newScope, NotificationChain msgs)
  {
    ContextScope oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__SCOPE, oldScope, newScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(ContextScope newScope)
  {
    if (newScope != scope)
    {
      NotificationChain msgs = null;
      if (scope != null)
        msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__SCOPE, null, msgs);
      if (newScope != null)
        msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__SCOPE, null, msgs);
      msgs = basicSetScope(newScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__SCOPE, newScope, newScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TriggerRule> getTriggerRules()
  {
    if (triggerRules == null)
    {
      triggerRules = new EObjectContainmentEList<TriggerRule>(TriggerRule.class, this, DslPackage.SYSTEM__TRIGGER_RULES);
    }
    return triggerRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoFilter()
  {
    return noFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoFilter(boolean newNoFilter)
  {
    boolean oldNoFilter = noFilter;
    noFilter = newNoFilter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__NO_FILTER, oldNoFilter, noFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatcherRule getMatcherRules()
  {
    return matcherRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMatcherRules(MatcherRule newMatcherRules, NotificationChain msgs)
  {
    MatcherRule oldMatcherRules = matcherRules;
    matcherRules = newMatcherRules;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__MATCHER_RULES, oldMatcherRules, newMatcherRules);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatcherRules(MatcherRule newMatcherRules)
  {
    if (newMatcherRules != matcherRules)
    {
      NotificationChain msgs = null;
      if (matcherRules != null)
        msgs = ((InternalEObject)matcherRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__MATCHER_RULES, null, msgs);
      if (newMatcherRules != null)
        msgs = ((InternalEObject)newMatcherRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.SYSTEM__MATCHER_RULES, null, msgs);
      msgs = basicSetMatcherRules(newMatcherRules, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SYSTEM__MATCHER_RULES, newMatcherRules, newMatcherRules));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AccessRule> getAccessRules()
  {
    if (accessRules == null)
    {
      accessRules = new EObjectContainmentEList<AccessRule>(AccessRule.class, this, DslPackage.SYSTEM__ACCESS_RULES);
    }
    return accessRules;
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
      case DslPackage.SYSTEM__SCOPE:
        return basicSetScope(null, msgs);
      case DslPackage.SYSTEM__TRIGGER_RULES:
        return ((InternalEList<?>)getTriggerRules()).basicRemove(otherEnd, msgs);
      case DslPackage.SYSTEM__MATCHER_RULES:
        return basicSetMatcherRules(null, msgs);
      case DslPackage.SYSTEM__ACCESS_RULES:
        return ((InternalEList<?>)getAccessRules()).basicRemove(otherEnd, msgs);
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
      case DslPackage.SYSTEM__NAME:
        return getName();
      case DslPackage.SYSTEM__PARAMETERS:
        return getParameters();
      case DslPackage.SYSTEM__REACTIVE:
        return isReactive();
      case DslPackage.SYSTEM__SCOPE:
        return getScope();
      case DslPackage.SYSTEM__TRIGGER_RULES:
        return getTriggerRules();
      case DslPackage.SYSTEM__NO_FILTER:
        return isNoFilter();
      case DslPackage.SYSTEM__MATCHER_RULES:
        return getMatcherRules();
      case DslPackage.SYSTEM__ACCESS_RULES:
        return getAccessRules();
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
      case DslPackage.SYSTEM__NAME:
        setName((String)newValue);
        return;
      case DslPackage.SYSTEM__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
        return;
      case DslPackage.SYSTEM__REACTIVE:
        setReactive((Boolean)newValue);
        return;
      case DslPackage.SYSTEM__SCOPE:
        setScope((ContextScope)newValue);
        return;
      case DslPackage.SYSTEM__TRIGGER_RULES:
        getTriggerRules().clear();
        getTriggerRules().addAll((Collection<? extends TriggerRule>)newValue);
        return;
      case DslPackage.SYSTEM__NO_FILTER:
        setNoFilter((Boolean)newValue);
        return;
      case DslPackage.SYSTEM__MATCHER_RULES:
        setMatcherRules((MatcherRule)newValue);
        return;
      case DslPackage.SYSTEM__ACCESS_RULES:
        getAccessRules().clear();
        getAccessRules().addAll((Collection<? extends AccessRule>)newValue);
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
      case DslPackage.SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.SYSTEM__PARAMETERS:
        getParameters().clear();
        return;
      case DslPackage.SYSTEM__REACTIVE:
        setReactive(REACTIVE_EDEFAULT);
        return;
      case DslPackage.SYSTEM__SCOPE:
        setScope((ContextScope)null);
        return;
      case DslPackage.SYSTEM__TRIGGER_RULES:
        getTriggerRules().clear();
        return;
      case DslPackage.SYSTEM__NO_FILTER:
        setNoFilter(NO_FILTER_EDEFAULT);
        return;
      case DslPackage.SYSTEM__MATCHER_RULES:
        setMatcherRules((MatcherRule)null);
        return;
      case DslPackage.SYSTEM__ACCESS_RULES:
        getAccessRules().clear();
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
      case DslPackage.SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.SYSTEM__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case DslPackage.SYSTEM__REACTIVE:
        return reactive != REACTIVE_EDEFAULT;
      case DslPackage.SYSTEM__SCOPE:
        return scope != null;
      case DslPackage.SYSTEM__TRIGGER_RULES:
        return triggerRules != null && !triggerRules.isEmpty();
      case DslPackage.SYSTEM__NO_FILTER:
        return noFilter != NO_FILTER_EDEFAULT;
      case DslPackage.SYSTEM__MATCHER_RULES:
        return matcherRules != null;
      case DslPackage.SYSTEM__ACCESS_RULES:
        return accessRules != null && !accessRules.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", parameters: ");
    result.append(parameters);
    result.append(", reactive: ");
    result.append(reactive);
    result.append(", noFilter: ");
    result.append(noFilter);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
