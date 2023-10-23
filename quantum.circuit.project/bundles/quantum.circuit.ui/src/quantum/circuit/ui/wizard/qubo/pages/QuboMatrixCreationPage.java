package quantum.circuit.ui.wizard.qubo.pages;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class QuboMatrixCreationPage extends WizardPage {
	
	private Label projectNameLabel;
	private Text nameOfQuboMatrix;
	private Text numberOfColumns;
	private IProject quboProject;

	public QuboMatrixCreationPage(String pageName) {
		super(pageName);
		this.quboProject = null;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		
		WidgetFactory.label(SWT.NONE).text("Select Project Name: ").create(container);
		
		projectNameLabel = WidgetFactory.label(SWT.NONE)
									.text("")
									.create(container);
		
		WidgetFactory.button(SWT.PUSH).text("...").
			onSelect(e -> {
				showContainerDialog(container);
			}).create(container);		

		WidgetFactory.label(SWT.NONE).text("Name of the Qubo Matrix: ").create(container);
		
		nameOfQuboMatrix = WidgetFactory.text(SWT.BORDER | SWT.SINGLE)
				.text("sample_qubo_matrix")
				.layoutData(new GridData(GridData.FILL_HORIZONTAL)).create(container);
		
		WidgetFactory.label(SWT.NONE).create(container);		
		
		WidgetFactory.label(SWT.NONE).text("Number of Columns: ").create(container);
		
		numberOfColumns = WidgetFactory.text(SWT.BORDER | SWT.SINGLE)
				.text("50")
				.layoutData(new GridData(GridData.FILL_HORIZONTAL)).create(container);
		
		WidgetFactory.label(SWT.NONE).create(container);	
		// Required to avoid an error in the system
		setControl(container);
		//TODO check if this project exist on the workspace
		setPageComplete(true);
	}
	
	private void showContainerDialog(Composite container) {
		final ElementListSelectionDialog selectFolder = 
				new ElementListSelectionDialog(container.getShell(), 
						WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());	
		selectFolder.setElements(ResourcesPlugin.getWorkspace().getRoot().getProjects());
		if (selectFolder.open() == Window.OK) {
			if (selectFolder.getFirstResult() instanceof IContainer) {
				quboProject = (IProject) selectFolder.getFirstResult();
				this.projectNameLabel.setText(quboProject.getName());	
				this.projectNameLabel.getParent().layout();
			}
		}		
	}	
	
	public String getProjectNameLabel() {
		return projectNameLabel.getText();
	}
	
	public String getNameOfQuboMatrix() {
		return nameOfQuboMatrix.getText();
	}
	
	public int getNumberOfColumns() {
		return Integer.parseInt(numberOfColumns.getText());
	}
	
	public IProject getQuboProject() {
		return quboProject;
	}
}
