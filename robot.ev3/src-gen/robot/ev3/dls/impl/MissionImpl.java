/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robot.ev3.dls.Behavior;
import robot.ev3.dls.DlsPackage;
import robot.ev3.dls.Mission;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.ev3.dls.impl.MissionImpl#getBehaviorList <em>Behavior List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends MinimalEObjectImpl.Container implements Mission
{
  /**
   * The cached value of the '{@link #getBehaviorList() <em>Behavior List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviorList()
   * @generated
   * @ordered
   */
  protected EList<Behavior> behaviorList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MissionImpl()
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
    return DlsPackage.Literals.MISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Behavior> getBehaviorList()
  {
    if (behaviorList == null)
    {
      behaviorList = new EObjectContainmentEList<Behavior>(Behavior.class, this, DlsPackage.MISSION__BEHAVIOR_LIST);
    }
    return behaviorList;
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
      case DlsPackage.MISSION__BEHAVIOR_LIST:
        return ((InternalEList<?>)getBehaviorList()).basicRemove(otherEnd, msgs);
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
      case DlsPackage.MISSION__BEHAVIOR_LIST:
        return getBehaviorList();
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
      case DlsPackage.MISSION__BEHAVIOR_LIST:
        getBehaviorList().clear();
        getBehaviorList().addAll((Collection<? extends Behavior>)newValue);
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
      case DlsPackage.MISSION__BEHAVIOR_LIST:
        getBehaviorList().clear();
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
      case DlsPackage.MISSION__BEHAVIOR_LIST:
        return behaviorList != null && !behaviorList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MissionImpl