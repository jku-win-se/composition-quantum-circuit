/*
 * generated by Xtext 2.26.0
 */
package at.jku.se.qubo.lang.ui.tests;

import at.jku.se.qubo.lang.ui.internal.LangActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class QUBOUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LangActivator.getInstance().getInjector("at.jku.se.qubo.lang.QUBO");
	}

}