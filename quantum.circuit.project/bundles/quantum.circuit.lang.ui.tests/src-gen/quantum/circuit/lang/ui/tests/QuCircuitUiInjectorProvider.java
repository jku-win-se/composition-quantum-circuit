/*
 * generated by Xtext 2.26.0
 */
package quantum.circuit.lang.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import quantum.circuit.lang.ui.internal.LangActivator;

public class QuCircuitUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LangActivator.getInstance().getInjector("quantum.circuit.lang.QuCircuit");
	}

}
