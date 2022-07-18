package quantum.circuit.qiskit.utils;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import qucircuit.CompositeQuantumGate;
import qucircuit.Index;
import qucircuit.IndexInt;
import qucircuit.IndexRange;
import qucircuit.Operation;
import qucircuit.QuantumCircuit;

public class QiskitCodeGenerationUtils {
	
	public static String QISKIT_FOLDER_NAME = "qiskit";
	public static String PYTHON_FILE_EXTENSION = "py";
	public static String LINE_SEPARATOR = "line.separator";
	
	//TODO define file names
	public static String COMPOSITE_GATE = "Composite_Gates";
	
	public static String indexes(EList<Index> indexes) {
		var rangeOfValues = new StringBuilder().append("[");
		for (Index index : indexes) {
			if (index instanceof IndexInt indexObject) {
				rangeOfValues.append(indexObject.getIndex()).append(",");
			}
			else if (index instanceof IndexRange indexRangeObject) {
				for (int i = indexRangeObject.getBegin(); i <= indexRangeObject.getEnd(); i++) {
					rangeOfValues.append(i).append(",");				
				}
			}
		}
		//Delete the last comma
		rangeOfValues.deleteCharAt(rangeOfValues.length() - 1);
		return rangeOfValues.append("]").toString();
	}
	
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
