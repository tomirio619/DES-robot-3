/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.ev3.dsl.Task#getName <em>Name</em>}</li>
 *   <li>{@link robot.ev3.dsl.Task#getSensor <em>Sensor</em>}</li>
 *   <li>{@link robot.ev3.dsl.Task#getAction <em>Action</em>}</li>
 *   <li>{@link robot.ev3.dsl.Task#isIgnoreBehavior <em>Ignore Behavior</em>}</li>
 * </ul>
 *
 * @see robot.ev3.dsl.DslPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see robot.ev3.dsl.DslPackage#getTask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link robot.ev3.dsl.Task#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' containment reference.
   * @see #setSensor(SensorType)
   * @see robot.ev3.dsl.DslPackage#getTask_Sensor()
   * @model containment="true"
   * @generated
   */
  SensorType getSensor();

  /**
   * Sets the value of the '{@link robot.ev3.dsl.Task#getSensor <em>Sensor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' containment reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(SensorType value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * The literals are from the enumeration {@link robot.ev3.dsl.Actions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see robot.ev3.dsl.Actions
   * @see #setAction(Actions)
   * @see robot.ev3.dsl.DslPackage#getTask_Action()
   * @model
   * @generated
   */
  Actions getAction();

  /**
   * Sets the value of the '{@link robot.ev3.dsl.Task#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see robot.ev3.dsl.Actions
   * @see #getAction()
   * @generated
   */
  void setAction(Actions value);

  /**
   * Returns the value of the '<em><b>Ignore Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Behavior</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Behavior</em>' attribute.
   * @see #setIgnoreBehavior(boolean)
   * @see robot.ev3.dsl.DslPackage#getTask_IgnoreBehavior()
   * @model
   * @generated
   */
  boolean isIgnoreBehavior();

  /**
   * Sets the value of the '{@link robot.ev3.dsl.Task#isIgnoreBehavior <em>Ignore Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Behavior</em>' attribute.
   * @see #isIgnoreBehavior()
   * @generated
   */
  void setIgnoreBehavior(boolean value);

} // Task
