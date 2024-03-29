/**
 * generated by Xtext 2.26.0
 */
package quantum.circuit.lang.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import quantum.circuit.qiskit.circuit.Circuit;
import quantum.circuit.qiskit.circuit.QuantumCircuitMetadata;
import quantum.circuit.qiskit.library.CompositeGatesUtils;
import quantum.circuit.qiskit.library.ElementaryGateUtils;
import quantum.circuit.qiskit.library.LoopOperationsUtils;
import quantum.circuit.qiskit.library.Measurements;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.QuantumCircuit;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class QuCircuitGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final String resourceName = resource.getURI().trimFileExtension().lastSegment();
    final EObject rootEObject = resource.getContents().get(0);
    final QuantumCircuit quCircuit = ((QuantumCircuit) rootEObject);
    final QuantumCircuitMetadata quCircuitMetadata = new QuantumCircuitMetadata(quCircuit);
    quCircuitMetadata.generateMetadata();
    fsa.generateFile(((((("/" + QiskitCodeGenerationUtils.QISKIT_FOLDER_NAME) + "-") + resourceName) + "/Composite_Gates.") + QiskitCodeGenerationUtils.PYTHON_FILE_EXTENSION), 
      new CompositeGatesUtils().generateLibraryFile(quCircuit));
    fsa.generateFile(((((("/" + QiskitCodeGenerationUtils.QISKIT_FOLDER_NAME) + "-") + resourceName) + "/Elementary_Gates.") + QiskitCodeGenerationUtils.PYTHON_FILE_EXTENSION), 
      new ElementaryGateUtils().generateLibraryFile(quCircuit));
    fsa.generateFile(((((("/" + QiskitCodeGenerationUtils.QISKIT_FOLDER_NAME) + "-") + resourceName) + "/Measurements.") + QiskitCodeGenerationUtils.PYTHON_FILE_EXTENSION), 
      new Measurements().generateLibraryFile(quCircuit));
    fsa.generateFile(((((("/" + QiskitCodeGenerationUtils.QISKIT_FOLDER_NAME) + "-") + resourceName) + "/Loop_Operations.") + QiskitCodeGenerationUtils.PYTHON_FILE_EXTENSION), 
      new LoopOperationsUtils().generateLibraryFile(quCircuit));
    fsa.generateFile(((((((("/" + QiskitCodeGenerationUtils.QISKIT_FOLDER_NAME) + "-") + resourceName) + "/main-") + resourceName) + ".") + QiskitCodeGenerationUtils.PYTHON_FILE_EXTENSION), 
      new Circuit().generateCode(quCircuit, quCircuitMetadata));
  }
}
