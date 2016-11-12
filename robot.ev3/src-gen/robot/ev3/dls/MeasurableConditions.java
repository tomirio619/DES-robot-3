/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurable Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.ev3.dls.MeasurableConditions#getMeasurableConditions <em>Measurable Conditions</em>}</li>
 * </ul>
 *
 * @see robot.ev3.dls.DlsPackage#getMeasurableConditions()
 * @model
 * @generated
 */
public interface MeasurableConditions extends TakeControl
{
  /**
   * Returns the value of the '<em><b>Measurable Conditions</b></em>' containment reference list.
   * The list contents are of type {@link robot.ev3.dls.MeasurableCondition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measurable Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurable Conditions</em>' containment reference list.
   * @see robot.ev3.dls.DlsPackage#getMeasurableConditions_MeasurableConditions()
   * @model containment="true"
   * @generated
   */
  EList<MeasurableCondition> getMeasurableConditions();

} // MeasurableConditions