/*
 * generated by Xtext 2.26.0
 */
package quantum.circuit.lang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class QuCircuitAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("quantum/circuit/lang/parser/antlr/internal/InternalQuCircuit.tokens");
	}
}
