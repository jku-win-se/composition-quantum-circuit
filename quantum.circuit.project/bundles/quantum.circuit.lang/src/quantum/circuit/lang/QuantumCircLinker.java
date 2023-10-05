package quantum.circuit.lang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.INode;

import com.google.common.collect.Multimap;

import qucircuit.QuantumRegister;

public class QuantumCircLinker extends LazyLinker{
	
	@Override
	protected void installProxies(EObject obj, IDiagnosticProducer producer, Multimap<Setting, INode> settingsToLink) {
		// Call to the super implementation
		super.installProxies(obj, producer, settingsToLink);
		if (obj instanceof QuantumRegister) {
			QuantumRegister quantumRegister = (QuantumRegister) obj;
			if (quantumRegister.getName() == null) {
				quantumRegister.setName("qr1");
			}
		}		
	}

}
