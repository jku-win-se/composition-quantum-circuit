package quantum.circuit.ui.wizard.qubo;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import quantum.circuit.ui.wizard.qubo.pages.QuboMatrixCreationPage;
import qubo.Qubo;
import qubo.lang.utils.QuboUtils;

public class QuboWizard extends Wizard implements INewWizard {

	private QuboMatrixCreationPage mainPage;
	
	public QuboWizard() {
		setWindowTitle("Qubo Matrix");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// Do nothing
	}
	
	@Override
	public void addPages() {
		super.addPages();
		mainPage = new QuboMatrixCreationPage("Create Random Qubo Matrix");
		addPage(mainPage);
	}

	@Override
	public boolean performFinish() {
		final Qubo qubo =  QuboUtils.createRandomQubo(mainPage.getNameOfQuboMatrix(), mainPage.getNumberOfColumns());
		QuboUtils.createSaveQuboResource(URI.createPlatformResourceURI(mainPage.getProjectNameLabel() + "/" + mainPage.getNameOfQuboMatrix() + ".qubo", true), qubo);
		return true;
	}
}
