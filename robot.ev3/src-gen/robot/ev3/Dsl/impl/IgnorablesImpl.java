/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robot.ev3.dsl.DslPackage;
import robot.ev3.dsl.Ignorables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignorables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.ev3.dsl.impl.IgnorablesImpl#getAVOID_OBJECTS <em>AVOID OBJECTS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IgnorablesImpl extends MinimalEObjectImpl.Container implements Ignorables
{
  /**
   * The default value of the '{@link #getAVOID_OBJECTS() <em>AVOID OBJECTS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAVOID_OBJECTS()
   * @generated
   * @ordered
   */
  protected static final String AVOID_OBJECTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAVOID_OBJECTS() <em>AVOID OBJECTS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAVOID_OBJECTS()
   * @generated
   * @ordered
   */
  protected String avoiD_OBJECTS = AVOID_OBJECTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IgnorablesImpl()
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
    return DslPackage.Literals.IGNORABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAVOID_OBJECTS()
  {
    return avoiD_OBJECTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAVOID_OBJECTS(String newAVOID_OBJECTS)
  {
    String oldAVOID_OBJECTS = avoiD_OBJECTS;
    avoiD_OBJECTS = newAVOID_OBJECTS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.IGNORABLES__AVOID_OBJECTS, oldAVOID_OBJECTS, avoiD_OBJECTS));
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
      case DslPackage.IGNORABLES__AVOID_OBJECTS:
        return getAVOID_OBJECTS();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.IGNORABLES__AVOID_OBJECTS:
        setAVOID_OBJECTS((String)newValue);
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
      case DslPackage.IGNORABLES__AVOID_OBJECTS:
        setAVOID_OBJECTS(AVOID_OBJECTS_EDEFAULT);
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
      case DslPackage.IGNORABLES__AVOID_OBJECTS:
        return AVOID_OBJECTS_EDEFAULT == null ? avoiD_OBJECTS != null : !AVOID_OBJECTS_EDEFAULT.equals(avoiD_OBJECTS);
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
    result.append(" (AVOID_OBJECTS: ");
    result.append(avoiD_OBJECTS);
    result.append(')');
    return result.toString();
  }

} //IgnorablesImpl
