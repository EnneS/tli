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
		// Check if there are functions in the table
		if(table.getSelectionModel().getSelectedIndices().length != 0) {			
			int selectedFunction = table.getSelectionModel().getSelectedIndices()[0];
			// Check if one of them is selected
			if(selectedFunction != -1) {
				// Remove it from the grapher and the table
				grapher.remove(selectedFunction);
				((MyTableModel) table.getModel()).removeElement(selectedFunction);
			}		
		}
	}

}
