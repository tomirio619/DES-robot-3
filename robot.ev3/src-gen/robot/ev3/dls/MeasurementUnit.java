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
 * A representation of the literals of the enumeration '<em><b>Measurement Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robot.ev3.dls.DlsPackage#getMeasurementUnit()
 * @model
 * @generated
 */
public enum MeasurementUnit implements Enumerator
{
  /**
   * The '<em><b>DISTANCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISTANCE_VALUE
   * @generated
   * @ordered
   */
  DISTANCE(0, "DISTANCE", "distance"),

  /**
   * The '<em><b>COLOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLOR_VALUE
   * @generated
   * @ordered
   */
  COLOR(1, "COLOR", "color"),

  /**
   * The '<em><b>INT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_VALUE
   * @generated
   * @ordered
   */
  INT(2, "INT", "int");

  /**
   * The '<em><b>DISTANCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DISTANCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISTANCE
   * @model literal="distance"
   * @generated
   * @ordered
   */
  public static final int DISTANCE_VALUE = 0;

  /**
   * The '<em><b>COLOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COLOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLOR
   * @model literal="color"
   * @generated
   * @ordered
   */
  public static final int COLOR_VALUE = 1;

  /**
   * The '<em><b>INT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT
   * @model literal="int"
   * @generated
   * @ordered
   */
  public static final int INT_VALUE = 2;

  /**
   * An array of all the '<em><b>Measurement Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MeasurementUnit[] VALUES_ARRAY =
    new MeasurementUnit[]
    {
      DISTANCE,
      COLOR,
      INT,
    };

  /**
   * A public read-only list of all the '<em><b>Measurement Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MeasurementUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Measurement Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MeasurementUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MeasurementUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Measurement Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MeasurementUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MeasurementUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Measurement Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MeasurementUnit get(int value)
  {
    switch (value)
    {
      case DISTANCE_VALUE: return DISTANCE;
      case COLOR_VALUE: return COLOR;
      case INT_VALUE: return INT;
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
  private MeasurementUnit(int value, String name, String literal)
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
  
} //MeasurementUnit