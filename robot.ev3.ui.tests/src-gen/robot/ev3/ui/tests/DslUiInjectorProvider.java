/*
 * generated by Xtext 2.10.0
 */
package robot.ev3.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import robot.ev3.ui.internal.Ev3Activator;

public class DslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Ev3Activator.getInstance().getInjector("robot.ev3.Dsl");
	}

}
