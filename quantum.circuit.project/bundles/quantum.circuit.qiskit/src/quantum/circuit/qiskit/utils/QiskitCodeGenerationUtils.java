package quantum.circuit.qiskit.utils;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import qucircuit.CompositeQuantumGate;
import qucircuit.ElementSelector;
import qucircuit.Selector;
import qucircuit.RangeSelector;
import qucircuit.Register;
import qucircuit.Operation;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumRegister;

public class QiskitCodeGenerationUtils {
	
	public static String QISKIT_FOLDER_NAME = "qiskit";
	public static String PYTHON_FILE_EXTENSION = "py";
	public static String LINE_SEPARATOR = "line.separator";
	
	//TODO define file names
	public static String COMPOSITE_GATE = "Composite_Gates";
	
	@Deprecated
	public static String indexes(EList<Selector> indexes) {
		var rangeOfValues = new StringBuilder().append("[");
		for (Selector index : indexes) {
			if (index instanceof ElementSelector indexObject) {
				rangeOfValues.append(indexObject.getIndex()).append(",");
			}
			else if (index instanceof RangeSelector indexRangeObject) {
				for (int i = indexRangeObject.getBegin(); i <= indexRangeObject.getEnd(); i++) {
					rangeOfValues.append(i).append(",");				
				}
			}
		}
		//Delete the last comma
		rangeOfValues.deleteCharAt(rangeOfValues.length() - 1);
		return rangeOfValues.append("]").toString();
	}
	
	/*
	 * Method to create target Qubits indexes
	 */
	public static String indexesQuantumRegister(EList<Selector> indexes, 
			Map<QuantumRegister,Integer> registerIndexes) {
		var rangeOfValues = new StringBuilder().append("[");
		for (Selector index : indexes) {
			if (index instanceof ElementSelector indexObject) {
				final Register register = (index.getRegister() == null)?registerIndexes.keySet().iterator().next():index.getRegister();
				rangeOfValues.append(indexObject.getIndex() + 
						registerIndexes.get(register)).append(",");				
			}
			else if (index instanceof RangeSelector indexRangeObject) {
				for (int i = indexRangeObject.getBegin(); i <= indexRangeObject.getEnd(); i++) {
					rangeOfValues.append(i + registerIndexes.getOrDefault(index.getRegister(), 0)).append(",");				
				}
			}
		}
		//Delete the last comma
		rangeOfValues.deleteCharAt(rangeOfValues.length() - 1);
		return rangeOfValues.append("]").toString();
	}	
	
	/*
	 * Method to create target Classical Bits indexes
	 */
	
	public static Collection<Operation> listOfCompositeConcreteOperations(QuantumCircuit quCircuit) {
		 return quCircuit.getLayers().stream()
						.map(l -> l.getQuantumOperations())
						.flatMap(Collection::stream)
						.map(quOpe -> quOpe.getOperations())
						.flatMap(Collection::stream)
						.filter(ope -> ope.getOperation().getType().getName().equals(CompositeQuantumGate.class.getSimpleName()))
						.collect(Collectors.toCollection(ECollections::newBasicEList))						
						;	 
	}

}
