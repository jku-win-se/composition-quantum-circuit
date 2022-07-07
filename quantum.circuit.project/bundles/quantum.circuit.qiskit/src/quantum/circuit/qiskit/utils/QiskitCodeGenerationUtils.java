package quantum.circuit.qiskit.utils;

import org.eclipse.emf.common.util.EList;

import qucircuit.Index;
import qucircuit.IndexInt;
import qucircuit.IndexRange;

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

}
