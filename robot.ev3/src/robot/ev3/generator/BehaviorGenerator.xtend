package robot.ev3.generator

import robot.ev3.dls.Actions
import robot.ev3.dls.ColorSensor
import robot.ev3.dls.SensorType
import robot.ev3.dls.Task
import robot.ev3.dls.TouchSensor
import robot.ev3.dls.TouchSensorSides
import robot.ev3.dls.UltrasonicSensor

class BehaviorGenerator {
	def static toBehavior(Task task)'''
		import lejos.robotics.subsumption.Behavior;
		import main.Robot;
		import lejos.hardware.*;
		import lejos.robotics.*;
		
		public class «task.name»Behavior implements Behavior {
			
			private final Robot robot;
			private boolean suppressed = false;
			
			«IF task.sensor instanceof TouchSensor»
				private boolean collisionLeft = false;
				private boolean collisionRight = false;
			«ENDIF»
			
			
			public «task.name»(Robot robot){
				this.robot = robot;
			}
		
			@Override
			public boolean takeControl() {
				«sensorTypeToTakeControl(task.sensor)»
					
			}
		
			@Override
			public void action() {
				«sensorTypeToAction(task)»
				
				while(robot.getLeftMotor().isMoving() && !suppressed()) {
					Thread.yield();	
				}
			}
		
			@Override
			public void suppress() {
				suppressed = true; 
			}
		
		}
	'''
	
	def static dispatch sensorTypeToTakeControl(SensorType sensor){
		switch(sensor){
			case (sensor instanceof ColorSensor): 
				return '''return robot.getColorId() == Color.«(sensor as ColorSensor).key»; '''
			case (sensor instanceof TouchSensor):
				if ( (sensor as TouchSensor ).key == TouchSensorSides.BOTH){
					return ''' 
					if(robot.getTouchLeftValue() == 1.0){
						collisionLeft = true;
						return true;
					}else if(robot.getTouchRightValue() == 1.0){
						collisionRight = true;
						return true;
					}else{
						return false;
					} '''
				}else if( ((sensor as TouchSensor ).key == TouchSensorSides.LEFT)  ){
					return ''' 
					if(robot.getTouchLeftValue() == 1.0){
						collisionLeft = true;
						return true;
					} '''
				}else if(((sensor as TouchSensor ).key == TouchSensorSides.RIGHT)  ){
					return ''' 
					if(robot.getTouchRightValue() == 1.0){
						collisionRight = true;
						return true;
					}'''
				}
			case (sensor instanceof UltrasonicSensor):
				return '''return robot.getDistanceValue() «(sensor as UltrasonicSensor).comparator» «(sensor as UltrasonicSensor).distance» '''
		}
	}
	
	def static dispatch sensorTypeToAction(Task task){
		switch(task.action){
			case Actions.BEEP:
				return '''Sound.buzz()'''
			case Actions.DRIVE_BACKWARD:
				return ''' 
					robot.getRightMotor().rotate(-180,true);
					robot.getLeftMotor().rotate(-180, true);
				  '''
		  	case Actions.DRIVE_FORWARD:
		  		return ''' 
		  			robot.getRightMotor().rotate(180,true);
		  			robot.getLeftMotor().rotate(180, true);  '''
  			case Actions.ROTATE_R:
  				return '''
					robot.getRightMotor().rotate(-180,true);
					robot.getLeftMotor().rotate(180, true);
  				'''
			case Actions.ROTATE_L:
				return '''
					robot.getRightMotor().rotate(180,true);
					robot.getLeftMotor().rotate(-180, true);
				'''
		  	case Actions.STOP_DRIVING:
		  		return '''
		  			robot.getLeftMotor().stop();
		  			robot.getRightMotor().stop();
		  		'''
	  		case Actions.TURN_AROUND:
	  			return '''
					robot.getRightMotor().rotate(360,true);
					robot.getLeftMotor().rotate(-360, true);
	  			'''
		}
	}
}






