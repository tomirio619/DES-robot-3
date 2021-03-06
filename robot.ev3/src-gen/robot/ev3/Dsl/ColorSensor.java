/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.ev3.dsl.ColorSensor#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see robot.ev3.dsl.DslPackage#getColorSensor()
 * @model
 * @generated
 */
public interface ColorSensor extends SensorType
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * The literals are from the enumeration {@link robot.ev3.dsl.Colors}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see robot.ev3.dsl.Colors
   * @see #setKey(Colors)
   * @see robot.ev3.dsl.DslPackage#getColorSensor_Key()
   * @model
   * @generated
   */
  Colors getKey();

  /**
   * Sets the value of the '{@link robot.ev3.dsl.ColorSensor#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see robot.ev3.dsl.Colors
   * @see #getKey()
   * @generated
   */
  void setKey(Colors value);

} // ColorSensor
