/**
 * generated by Xtext 2.26.0
 */
package at.jku.se.qubo.lang.generator;

import at.jku.se.quantum.operation.definition.api.utils.QuantumOperationUtils;
import at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage;
import at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary;
import at.jku.se.qubo.lang.utils.QuboUtils;
import at.jku.se.qubo.mm.qubo.Qubo;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import qucircuit.QuCircuitPackage;
import qucircuit.QuantumCircuit;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class QUBOGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    QuantumOperationLibrary quantumOpLib = this.generateQuantumLibraryIfNotExist(fsa, resource);
    this.generateQUBOQuantumCircuit(fsa, resource, quantumOpLib);
  }
  
  public QuantumOperationLibrary generateQuantumLibraryIfNotExist(final IFileSystemAccess2 fsa, final Resource resource) {
    try {
      URI quOpeURI = this.createURI(fsa, resource, "quantum-operation", QuantumOpePackage.eNS_PREFIX);
      ResourceSet reset = resource.getResourceSet();
      Resource quOpeResource = reset.createResource(quOpeURI);
      boolean _exists = reset.getURIConverter().exists(quOpeURI, Collections.EMPTY_MAP);
      boolean _not = (!_exists);
      if (_not) {
        QuantumOperationLibrary quantumOpLib = QuantumOperationUtils.getAllQuantumOperations();
        quOpeResource.getContents().add(quantumOpLib);
        quOpeResource.save(Collections.EMPTY_MAP);
        return quantumOpLib;
      } else {
        quOpeResource.load(Collections.EMPTY_MAP);
        EObject _get = quOpeResource.getContents().get(0);
        return ((QuantumOperationLibrary) _get);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generateQUBOQuantumCircuit(final IFileSystemAccess2 fsa, final Resource resource, final QuantumOperationLibrary quantumOpLib) {
    try {
      URI quCircuitURI = this.createURI(fsa, resource, "qu-circuit", QuCircuitPackage.eNS_PREFIX);
      ResourceSet reset = resource.getResourceSet();
      Resource quCircuit = reset.createResource(quCircuitURI);
      EObject _get = resource.getContents().get(0);
      Qubo qubo = ((Qubo) _get);
      QuantumCircuit quantumCircuit = QuboUtils.createQuboCircuit(qubo, quantumOpLib);
      quCircuit.getContents().add(quantumCircuit);
      quCircuit.save(Collections.EMPTY_MAP);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public URI createURI(final IFileSystemAccess2 fsa, final Resource resource, final String folder, final String ext) {
    return fsa.getURI("/").trimSegments(1).appendSegment(folder).appendSegment(resource.getURI().trimFileExtension().lastSegment()).appendFileExtension(ext);
  }
}
