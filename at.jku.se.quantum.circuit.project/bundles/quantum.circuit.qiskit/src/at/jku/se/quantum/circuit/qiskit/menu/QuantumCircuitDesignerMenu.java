package at.jku.se.quantum.circuit.qiskit.menu;

import java.io.ByteArrayInputStream;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;

public class QuantumCircuitDesignerMenu implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// Do nothing
	}

	@Override
	public void dispose() {
		// Do nothing
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// set selection service
		ISelectionService service = window.getSelectionService();
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		// check if it is an IFile
		if (structured.getFirstElement() instanceof IFile quCircuitFile) {
			IProject project = quCircuitFile.getProject();
			final var quCircuit = QiskitCodeGenerationUtils.loadQuCircuitResource(quCircuitFile);
			final var qiskitFolder = QiskitCodeGenerationUtils.createQiskitFolder(project);
			final var qiskitCode = QiskitCodeGenerationUtils.qiskitGeneration(quCircuit);
			final var qiskitFile = qiskitFolder.getFile(quCircuitFile.getName() + "." + QiskitCodeGenerationUtils.PYTHON_FILE_EXTENSION);
			
			try {
				qiskitFile.create(new ByteArrayInputStream(qiskitCode.getBytes()), true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
			
			System.out.println("Stuff!");
		}
		//Create Qiskit Folder
		//Create Qiskit Code	
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// Do nothing
	}

}
