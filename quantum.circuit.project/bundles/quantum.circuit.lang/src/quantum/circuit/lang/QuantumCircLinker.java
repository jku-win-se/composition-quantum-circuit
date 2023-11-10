package quantum.circuit.lang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.INode;

import com.google.common.collect.Multimap;

import quantum.circuit.lang.utils.EcoreUtils3;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Layer;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.QuantumRegister;

public class QuantumCircLinker extends LazyLinker{
	
	@Override
	protected void installProxies(EObject obj, IDiagnosticProducer producer, Multimap<Setting, INode> settingsToLink) {
		//TODO factory pattern?
		// Call to the super implementation
		super.installProxies(obj, producer, settingsToLink);
		if (obj instanceof QuantumRegister) {
			final QuantumRegister quantumRegister = (QuantumRegister) obj;
			if (quantumRegister.getName() == null) {
				quantumRegister.setName("qr1");
			}
		}	
		if (obj instanceof LoopOperation) {
			final LoopOperation loop = (LoopOperation) obj;
			if (loop.getName() == null) {
				int pos = EcoreUtils3.getEObjectPosition(loop) + 1;
				loop.setName("Loop" + pos);
			}
		}
		if (obj instanceof ElementaryQuantumGate) {
			final ElementaryQuantumGate elementaryGate = (ElementaryQuantumGate) obj;
			if (elementaryGate.getName() == null) {
				int pos = EcoreUtils3.getEObjectPosition(elementaryGate) + 1;
				elementaryGate.setName("EG" + pos);
			}
		}
		if (obj instanceof Measurement) {
			final Measurement m = (Measurement) obj;
			if (m.getName() == null) {
				int pos = EcoreUtils3.getEObjectPosition(m) + 1;
				m.setName("M" + pos);
			}
		}
		if (obj instanceof Layer) {
			final Layer layer = (Layer) obj;
			if (layer.getName() == null) {
				int pos = EcoreUtils3.getEObjectPosition(layer) + 1;
				layer.setName("L" + pos);
			}
		}		
	}

}
