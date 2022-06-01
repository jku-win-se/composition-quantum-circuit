package quantum.circuit.qiskit.qugates;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import quantum.circuit.qiskit.api.QiskitOperationGeneration;
import quantum.operation.contribution.compositequantumgate.Amplification;
import quantum.operation.contribution.compositequantumgate.Grover;
import quantum.operation.contribution.compositequantumgate.Initialize;
import quantum.operation.contribution.compositequantumgate.Oracle;
import quantum.operation.contribution.compositequantumgate.QFTInv;
import quantum.operation.contribution.elementaryquantumgate.Hadamard;
import quantum.operation.contribution.elementaryquantumgate.PauliX;
import quantum.operation.contribution.elementaryquantumgate.PauliZ;
import quantum.operation.contribution.measurement.MeasurementCompBasis;
import quantum.operation.contribution.statepreparation.Reset;

public class QiskitFactoryQuantumOperation {
	
	private static final Map<String, Supplier<QiskitOperationGeneration>> qiskitOpeByQuantumName = new HashMap<>();
	static {
			qiskitOpeByQuantumName.put(Hadamard.class.getSimpleName(), HadarmardCodeQiskit::new);
			qiskitOpeByQuantumName.put(MeasurementCompBasis.class.getSimpleName(), MeasurementCompBasisCodeQiskit::new);
			qiskitOpeByQuantumName.put(Amplification.class.getSimpleName(), AmplificationCodeQiskit::new);
			qiskitOpeByQuantumName.put(Oracle.class.getSimpleName(), OracleCodeQiskit::new);
			qiskitOpeByQuantumName.put(Reset.class.getSimpleName(), ResetCodeQiskit::new);
			qiskitOpeByQuantumName.put(PauliZ.class.getSimpleName(), PauliZCodeQiskit::new);
			qiskitOpeByQuantumName.put(PauliX.class.getSimpleName(), PauliXCodeQiskit::new);
			qiskitOpeByQuantumName.put(Initialize.class.getSimpleName(), InitializeCodeQiskit::new);
			qiskitOpeByQuantumName.put(Grover.class.getSimpleName(), GroverCodeQiskit::new);
			qiskitOpeByQuantumName.put(QFTInv.class.getSimpleName(), QFTInvCodeQiskit::new);
	}	
	
	public QiskitOperationGeneration getQiskitCode(String quOperation) {
		Supplier<QiskitOperationGeneration> generation = qiskitOpeByQuantumName.get(quOperation);
		if (generation != null) {
			return generation.get();
		}
		throw new IllegalArgumentException("No such operation defined: " + quOperation);		
	}
}
