/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import robot.ev3.dsl.*;

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
 * @see robot.ev3.dsl.DslPackage
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
      case DslPackage.MISSION:
      {
        Mission mission = (Mission)theEObject;
        T result = caseMission(mission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.IGNORABLES:
      {
        Ignorables ignorables = (Ignorables)theEObject;
        T result = caseIgnorables(ignorables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SENSOR_TYPE:
      {
        SensorType sensorType = (SensorType)theEObject;
        T result = caseSensorType(sensorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COLOR_SENSOR:
      {
        ColorSensor colorSensor = (ColorSensor)theEObject;
        T result = caseColorSensor(colorSensor);
        if (result == null) result = caseSensorType(colorSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TOUCH_SENSOR:
      {
        TouchSensor touchSensor = (TouchSensor)theEObject;
        T result = caseTouchSensor(touchSensor);
        if (result == null) result = caseSensorType(touchSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ULTRASONIC_SENSOR:
      {
        UltrasonicSensor ultrasonicSensor = (UltrasonicSensor)theEObject;
        T result = caseUltrasonicSensor(ultrasonicSensor);
        if (result == null) result = caseSensorType(ultrasonicSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMission(Mission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ignorables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ignorables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIgnorables(Ignorables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensorType(SensorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorSensor(ColorSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Touch Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Touch Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTouchSensor(TouchSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ultrasonic Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ultrasonic Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUltrasonicSensor(UltrasonicSensor object)
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