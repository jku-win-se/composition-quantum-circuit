package at.jku.se.quantum.circuit.qiskit.qugates;

import at.jku.se.quantum.circuit.qiskit.api.QiskitOperationGeneration;
import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.Measurement;
import qucircuit.QuantumOperation;

public class MeasurementCompBasisCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {		
		if (quOpe instanceof Measurement measurement) {
			String measurementStr = "qubits = " + QiskitCodeGenerationUtils.targetQubits(quOpe) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
			measurementStr += "cbits = " + QiskitCodeGenerationUtils.classicBits(measurement) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
			measurementStr += """
					for i in range(len(qubits)):
						qc.measure(qubits[i],cbits[i])
					""";
			return measurementStr;
		} else
			throw new IllegalArgumentException("Expected Measurement type object");		
	}

}
