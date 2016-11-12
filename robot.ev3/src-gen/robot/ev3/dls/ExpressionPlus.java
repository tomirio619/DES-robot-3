/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.ev3.dls.ExpressionPlus#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see robot.ev3.dls.DlsPackage#getExpressionPlus()
 * @model
 * @generated
 */
public interface ExpressionPlus extends IntExpression
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(IntExpression)
   * @see robot.ev3.dls.DlsPackage#getExpressionPlus_Sub()
   * @model containment="true"
   * @generated
   */
  IntExpression getSub();

  /**
   * Sets the value of the '{@link robot.ev3.dls.ExpressionPlus#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(IntExpression value);

} // ExpressionPlus
