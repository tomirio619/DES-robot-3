/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dls.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robot.ev3.dls.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robot.ev3.dls.DlsPackage
 * @generated
 */
public class DlsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DlsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DlsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DlsPackage.eINSTANCE;
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
  protected DlsSwitch<Adapter> modelSwitch =
    new DlsSwitch<Adapter>()
    {
      @Override
      public Adapter caseMission(Mission object)
      {
        return createMissionAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseSensorType(SensorType object)
      {
        return createSensorTypeAdapter();
      }
      @Override
      public Adapter caseColorSensor(ColorSensor object)
      {
        return createColorSensorAdapter();
      }
      @Override
      public Adapter caseTouchSensor(TouchSensor object)
      {
        return createTouchSensorAdapter();
      }
      @Override
      public Adapter caseUltrasonicSensor(UltrasonicSensor object)
      {
        return createUltrasonicSensorAdapter();
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
   * Creates a new adapter for an object of class '{@link robot.ev3.dls.Mission <em>Mission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.ev3.dls.Mission
   * @generated
   */
  public Adapter createMissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.ev3.dls.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.ev3.dls.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.ev3.dls.SensorType <em>Sensor Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.ev3.dls.SensorType
   * @generated
   */
  public Adapter createSensorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.ev3.dls.ColorSensor <em>Color Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.ev3.dls.ColorSensor
   * @generated
   */
  public Adapter createColorSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.ev3.dls.TouchSensor <em>Touch Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.ev3.dls.TouchSensor
   * @generated
   */
  public Adapter createTouchSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.ev3.dls.UltrasonicSensor <em>Ultrasonic Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.ev3.dls.UltrasonicSensor
   * @generated
   */
  public Adapter createUltrasonicSensorAdapter()
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

} //DlsAdapterFactory
