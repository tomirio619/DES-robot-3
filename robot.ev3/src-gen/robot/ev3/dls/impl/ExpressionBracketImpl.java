/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.ev3.dls.DlsPackage;
import robot.ev3.dls.ExpressionBracket;
import robot.ev3.dls.IntExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.ev3.dls.impl.ExpressionBracketImpl#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionBracketImpl extends IntExpressionImpl implements ExpressionBracket
{
  /**
   * The cached value of the '{@link #getSub() <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSub()
   * @generated
   * @ordered
   */
  protected IntExpression sub;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionBracketImpl()
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
    return DlsPackage.Literals.EXPRESSION_BRACKET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpression getSub()
  {
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSub(IntExpression newSub, NotificationChain msgs)
  {
    IntExpression oldSub = sub;
    sub = newSub;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DlsPackage.EXPRESSION_BRACKET__SUB, oldSub, newSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSub(IntExpression newSub)
  {
    if (newSub != sub)
    {
      NotificationChain msgs = null;
      if (sub != null)
        msgs = ((InternalEObject)sub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DlsPackage.EXPRESSION_BRACKET__SUB, null, msgs);
      if (newSub != null)
        msgs = ((InternalEObject)newSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DlsPackage.EXPRESSION_BRACKET__SUB, null, msgs);
      msgs = basicSetSub(newSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DlsPackage.EXPRESSION_BRACKET__SUB, newSub, newSub));
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
      case DlsPackage.EXPRESSION_BRACKET__SUB:
        return basicSetSub(null, msgs);
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
      case DlsPackage.EXPRESSION_BRACKET__SUB:
        return getSub();
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
      case DlsPackage.EXPRESSION_BRACKET__SUB:
        setSub((IntExpression)newValue);
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
      case DlsPackage.EXPRESSION_BRACKET__SUB:
        setSub((IntExpression)null);
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
      case DlsPackage.EXPRESSION_BRACKET__SUB:
        return sub != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionBracketImpl
