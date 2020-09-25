package grapher.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class RemoveExpressionAction extends AbstractAction {

	Grapher grapher;
	FunctionList functionList;
	
	public RemoveExpressionAction(Grapher grapher, FunctionList functionList) {
		super();
		this.grapher = grapher;
		this.functionList = functionList;
		putValue(NAME, "Remove...");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int selectedFunction = functionList.getSelectedIndex();
		if(selectedFunction != -1) {
			grapher.remove(selectedFunction);
			functionList.removeElement(selectedFunction);
		}		
	}

}
