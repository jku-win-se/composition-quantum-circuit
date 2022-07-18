/*
 * generated by Xtext 2.26.0
 */
package quantum.circuit.lang.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import quantum.circuit.lang.QuCircuitRuntimeModule;
import quantum.circuit.lang.QuCircuitStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class QuCircuitIdeSetup extends QuCircuitStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new QuCircuitRuntimeModule(), new QuCircuitIdeModule()));
	}
	
}
