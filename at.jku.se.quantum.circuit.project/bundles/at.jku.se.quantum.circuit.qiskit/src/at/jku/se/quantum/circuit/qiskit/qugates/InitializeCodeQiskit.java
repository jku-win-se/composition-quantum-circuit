package at.jku.se.quantum.circuit.qiskit.qugates;

import at.jku.se.quantum.circuit.qiskit.api.QiskitOperationGeneration;
import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.QuantumOperation;

public class InitializeCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		StringBuilder initializeBlock = new StringBuilder();
		initializeBlock.append("""
				def initialize(tqubits): #this is done alternatively as to the AA-Block
				    qc = QuantumCircuit(len(tqubits))
				    for t in tqubits: #tqubits from Eclipse
				        qc.reset(t)
				        qc.h(t)
				    init = qc.to_instruction()
				    init.label = "Initialize"
				    return init
				""");
		initializeBlock.append("tqubits = " +  QiskitCodeGenerationUtils.targetQubits(quOpe) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR));
		initializeBlock.append("qc.append(initialize(tqubits),tqubits)");
		initializeBlock.append(System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR));
		return initializeBlock.toString();
	}

}
