package robot.ev3.generator;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import robot.ev3.dls.Actions;
import robot.ev3.dls.ColorSensor;
import robot.ev3.dls.Colors;
import robot.ev3.dls.CompareOperator;
import robot.ev3.dls.SensorType;
import robot.ev3.dls.Task;
import robot.ev3.dls.TouchSensor;
import robot.ev3.dls.TouchSensorSides;
import robot.ev3.dls.UltrasonicSensor;

@SuppressWarnings("all")
public class BehaviorGenerator {
  public static CharSequence toBehavior(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import lejos.robotics.subsumption.Behavior;");
    _builder.newLine();
    _builder.append("import main.Robot;");
    _builder.newLine();
    _builder.append("import lejos.hardware.*;");
    _builder.newLine();
    _builder.append("import lejos.robotics.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = task.getName();
    _builder.append(_name, "");
    _builder.append("Behavior implements Behavior {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final Robot robot;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean suppressed = false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      SensorType _sensor = task.getSensor();
      if ((_sensor instanceof TouchSensor)) {
        _builder.append("\t");
        _builder.append("private boolean collisionLeft = false;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private boolean collisionRight = false;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = task.getName();
    _builder.append(_name_1, "\t");
    _builder.append("(Robot robot){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.robot = robot;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean takeControl() {");
    _builder.newLine();
    _builder.append("\t\t");
    SensorType _sensor_1 = task.getSensor();
    String _sensorTypeToTakeControl = BehaviorGenerator.sensorTypeToTakeControl(_sensor_1);
    _builder.append(_sensorTypeToTakeControl, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void action() {");
    _builder.newLine();
    _builder.append("\t\t");
    String _sensorTypeToAction = BehaviorGenerator.sensorTypeToAction(task);
    _builder.append(_sensorTypeToAction, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while(robot.getLeftMotor().isMoving() && !suppressed()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Thread.yield();\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void suppress() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("suppressed = true; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected static String _sensorTypeToTakeControl(final SensorType sensor) {
    boolean _matched = false;
    if ((sensor instanceof ColorSensor)) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return robot.getColorId() == Color.");
      Colors _key = ((ColorSensor) sensor).getKey();
      _builder.append(_key, "");
      _builder.append("; ");
      return _builder.toString();
    }
    if (!_matched) {
      if ((sensor instanceof TouchSensor)) {
        _matched=true;
        TouchSensorSides _key_1 = ((TouchSensor) sensor).getKey();
        boolean _equals = Objects.equal(_key_1, TouchSensorSides.BOTH);
        if (_equals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("if(robot.getTouchLeftValue() == 1.0){");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("collisionLeft = true;");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("return true;");
          _builder_1.newLine();
          _builder_1.append("}else if(robot.getTouchRightValue() == 1.0){");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("collisionRight = true;");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("return true;");
          _builder_1.newLine();
          _builder_1.append("}else{");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("return false;");
          _builder_1.newLine();
          _builder_1.append("} ");
          return _builder_1.toString();
        } else {
          TouchSensorSides _key_2 = ((TouchSensor) sensor).getKey();
          boolean _equals_1 = Objects.equal(_key_2, TouchSensorSides.LEFT);
          if (_equals_1) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("if(robot.getTouchLeftValue() == 1.0){");
            _builder_2.newLine();
            _builder_2.append("\t");
            _builder_2.append("collisionLeft = true;");
            _builder_2.newLine();
            _builder_2.append("\t");
            _builder_2.append("return true;");
            _builder_2.newLine();
            _builder_2.append("} ");
            return _builder_2.toString();
          } else {
            TouchSensorSides _key_3 = ((TouchSensor) sensor).getKey();
            boolean _equals_2 = Objects.equal(_key_3, TouchSensorSides.RIGHT);
            if (_equals_2) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("if(robot.getTouchRightValue() == 1.0){");
              _builder_3.newLine();
              _builder_3.append("\t");
              _builder_3.append("collisionRight = true;");
              _builder_3.newLine();
              _builder_3.append("\t");
              _builder_3.append("return true;");
              _builder_3.newLine();
              _builder_3.append("}");
              return _builder_3.toString();
            }
          }
        }
      }
    }
    if (!_matched) {
      if ((sensor instanceof UltrasonicSensor)) {
        _matched=true;
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("return robot.getDistanceValue() ");
        CompareOperator _comparator = ((UltrasonicSensor) sensor).getComparator();
        _builder_4.append(_comparator, "");
        _builder_4.append(" ");
        String _distance = ((UltrasonicSensor) sensor).getDistance();
        _builder_4.append(_distance, "");
        _builder_4.append(" ");
        return _builder_4.toString();
      }
    }
    return null;
  }
  
  protected static String _sensorTypeToAction(final Task task) {
    Actions _action = task.getAction();
    if (_action != null) {
      switch (_action) {
        case BEEP:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Sound.buzz()");
          return _builder.toString();
        case DRIVE_BACKWARD:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("robot.getRightMotor().rotate(-180,true);");
          _builder_1.newLine();
          _builder_1.append("robot.getLeftMotor().rotate(-180, true);");
          _builder_1.newLine();
          return _builder_1.toString();
        case DRIVE_FORWARD:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("robot.getRightMotor().rotate(180,true);");
          _builder_2.newLine();
          _builder_2.append("robot.getLeftMotor().rotate(180, true);  ");
          return _builder_2.toString();
        case ROTATE_R:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("robot.getRightMotor().rotate(-180,true);");
          _builder_3.newLine();
          _builder_3.append("robot.getLeftMotor().rotate(180, true);");
          _builder_3.newLine();
          return _builder_3.toString();
        case ROTATE_L:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("robot.getRightMotor().rotate(180,true);");
          _builder_4.newLine();
          _builder_4.append("robot.getLeftMotor().rotate(-180, true);");
          _builder_4.newLine();
          return _builder_4.toString();
        case STOP_DRIVING:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("robot.getLeftMotor().stop();");
          _builder_5.newLine();
          _builder_5.append("robot.getRightMotor().stop();");
          _builder_5.newLine();
          return _builder_5.toString();
        case TURN_AROUND:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("robot.getRightMotor().rotate(360,true);");
          _builder_6.newLine();
          _builder_6.append("robot.getLeftMotor().rotate(-360, true);");
          _builder_6.newLine();
          return _builder_6.toString();
        default:
          break;
      }
    }
    return null;
  }
  
  public static String sensorTypeToTakeControl(final SensorType sensor) {
    return _sensorTypeToTakeControl(sensor);
  }
  
  public static String sensorTypeToAction(final Task task) {
    return _sensorTypeToAction(task);
  }
}
