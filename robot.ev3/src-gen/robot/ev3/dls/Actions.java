/**
 * generated by Xtext 2.10.0
 */
package robot.ev3.dls;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robot.ev3.dls.DlsPackage#getActions()
 * @model
 * @generated
 */
public enum Actions implements Enumerator
{
  /**
   * The '<em><b>ROTATE L</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROTATE_L_VALUE
   * @generated
   * @ordered
   */
  ROTATE_L(0, "ROTATE_L", "rotateLeft"),

  /**
   * The '<em><b>ROTATE R</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROTATE_R_VALUE
   * @generated
   * @ordered
   */
  ROTATE_R(1, "ROTATE_R", "rotateRight"),

  /**
   * The '<em><b>DRIVE FORWARD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRIVE_FORWARD_VALUE
   * @generated
   * @ordered
   */
  DRIVE_FORWARD(2, "DRIVE_FORWARD", "driveForward"),

  /**
   * The '<em><b>DRIVE BACKWARD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRIVE_BACKWARD_VALUE
   * @generated
   * @ordered
   */
  DRIVE_BACKWARD(3, "DRIVE_BACKWARD", "driveBackward"),

  /**
   * The '<em><b>STOP DRIVING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOP_DRIVING_VALUE
   * @generated
   * @ordered
   */
  STOP_DRIVING(4, "STOP_DRIVING", "stopDriving");

  /**
   * The '<em><b>ROTATE L</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ROTATE L</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROTATE_L
   * @model literal="rotateLeft"
   * @generated
   * @ordered
   */
  public static final int ROTATE_L_VALUE = 0;

  /**
   * The '<em><b>ROTATE R</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ROTATE R</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROTATE_R
   * @model literal="rotateRight"
   * @generated
   * @ordered
   */
  public static final int ROTATE_R_VALUE = 1;

  /**
   * The '<em><b>DRIVE FORWARD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DRIVE FORWARD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRIVE_FORWARD
   * @model literal="driveForward"
   * @generated
   * @ordered
   */
  public static final int DRIVE_FORWARD_VALUE = 2;

  /**
   * The '<em><b>DRIVE BACKWARD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DRIVE BACKWARD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRIVE_BACKWARD
   * @model literal="driveBackward"
   * @generated
   * @ordered
   */
  public static final int DRIVE_BACKWARD_VALUE = 3;

  /**
   * The '<em><b>STOP DRIVING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STOP DRIVING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STOP_DRIVING
   * @model literal="stopDriving"
   * @generated
   * @ordered
   */
  public static final int STOP_DRIVING_VALUE = 4;

  /**
   * An array of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Actions[] VALUES_ARRAY =
    new Actions[]
    {
      ROTATE_L,
      ROTATE_R,
      DRIVE_FORWARD,
      DRIVE_BACKWARD,
      STOP_DRIVING,
    };

  /**
   * A public read-only list of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Actions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions get(int value)
  {
    switch (value)
    {
      case ROTATE_L_VALUE: return ROTATE_L;
      case ROTATE_R_VALUE: return ROTATE_R;
      case DRIVE_FORWARD_VALUE: return DRIVE_FORWARD;
      case DRIVE_BACKWARD_VALUE: return DRIVE_BACKWARD;
      case STOP_DRIVING_VALUE: return STOP_DRIVING;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Actions(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Actions