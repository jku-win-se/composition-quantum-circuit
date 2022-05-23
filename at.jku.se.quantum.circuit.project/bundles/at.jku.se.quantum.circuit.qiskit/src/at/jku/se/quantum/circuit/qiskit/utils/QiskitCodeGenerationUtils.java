package at.jku.se.quantum.circuit.qiskit.utils;

import java.util.Iterator;
import java.util.function.Supplier;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import at.jku.se.quantum.circuit.metrics.utils.QuantumCircuitMetricsUtils;
import at.jku.se.quantum.circuit.qiskit.qugates.QiskitFactoryQuantumOperation;
import qucircuit.AbstractQuantumGate;
import qucircuit.ClassicRegister;
import qucircuit.Layer;
import qucircuit.Measurement;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QuantumRegister;

public class QiskitCodeGenerationUtils {
	
	public static String QISKIT_FOLDER_NAME = "qiskit";
	public static String PYTHON_FILE_EXTENSION = "python";
	public static String LINE_SEPARATOR = "line.separator";
	
	public static String qiskitGeneration(QuantumCircuit quCircuit) {		
		StringBuilder qiskitCode = new StringBuilder();
		qiskitCode.append(""" 
				from qiskit import QuantumRegister, ClassicalRegister, QuantumCircuit,transpile, assemble, Aer, converters
				from qiskit.transpiler.passes import Decompose
				import numpy as np
				n = """ + QuantumCircuitMetricsUtils.width(quCircuit) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR) +
				"""
				qr = QuantumRegister(n, 'q')
				cr = ClassicalRegister(n, 'c')
				qc = QuantumCircuit(qr, cr)
				""") 
				 ;
		Supplier<QiskitFactoryQuantumOperation> qiskitFactory = QiskitFactoryQuantumOperation::new;
		for (Layer layer : quCircuit.getLayers()) {
			for (QuantumOperation quOpe : layer.getQuantumOperations()) {
				qiskitCode.append(qiskitFactory.get().getQiskitCode(quOpe.getOperation().getName()).generateQiskitCode(quOpe));
			}
		}		
		return qiskitCode.toString();
	}
	
	//TODO refactor tqubits and cQubits
	public static String controlQubits(AbstractQuantumGate quGate) {
		String cQubits = "[";
		var quRegister = ((QuantumRegister) quGate.getControlQubits().get(0).eContainer());
		for(int i = 0; i < quGate.getControlQubits().size(); i++) {
			int index = quRegister.getQubits().indexOf(quGate.getControlQubits().get(i));
			cQubits += index;
			if (i + 1 < quGate.getControlQubits().size()) {
				cQubits += ",";
			}
		}
		cQubits += "]";	
		return cQubits;
	}
	
	public static String targetQubits(QuantumOperation quOpe) {
		String tqubits = "[";
		var quRegister = ((QuantumRegister) quOpe.getTargetQubits().get(0).eContainer());
		for(int i = 0; i < quOpe.getTargetQubits().size(); i++) {
			int index = quRegister.getQubits().indexOf(quOpe.getTargetQubits().get(i));
			tqubits += index;
			if (i + 1 < quOpe.getTargetQubits().size()) {
				tqubits += ",";
			}
		}
		tqubits += "]";	
		return tqubits;
	}
	
	public static String classicBits(Measurement measurement) {
		String classicBits = "[";
		var classicRegister = ((ClassicRegister) measurement.getClassicBits().get(0).eContainer());
		for(int i = 0; i < measurement.getClassicBits().size(); i++) {
			int index = classicRegister.getClassicBits().indexOf(measurement.getClassicBits().get(i));
			classicBits += index;
			if (i + 1 < measurement.getClassicBits().size()) {
				classicBits += ",";
			}
		}
		classicBits += "]";	
		return classicBits;
	}
	
	//Load Quantum Circuit Resource from IFile
	public static QuantumCircuit loadQuCircuitResource(IFile file) {
		ResourceSet reset = new ResourceSetImpl();			
		return (QuantumCircuit) reset
					.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true)
					.getContents()
					.get(0);
	}	
	
	//Create Qiskit Project
	public static IFolder createQiskitFolder(IContainer container) {
		IFolder folder = container.getFolder(new Path(QISKIT_FOLDER_NAME));
		if (!folder.exists()) {
			try {
				folder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return folder;		
	}

}
