package grapher.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTable;

public class RemoveExpressionAction extends AbstractAction {

	Grapher grapher;
	JTable table;
	
	public RemoveExpressionAction(Grapher grapher, JTable table) {
		super();
		this.grapher = grapher;
		this.table = table;
		putValue(NAME, "Remove...");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int selectedFunction = table.getSelectionModel().getSelectedIndices()[0];
		if(selectedFunction != -1) {
			grapher.remove(selectedFunction);
			((MyTableModel) table.getModel()).removeElement(selectedFunction);
		}		
	}

}
