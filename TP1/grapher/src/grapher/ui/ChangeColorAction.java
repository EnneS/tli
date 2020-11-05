package grapher.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ChangeColorAction extends AbstractAction {

	
	private Grapher grapher;
	private JTable table;

	public ChangeColorAction(Grapher grapher, JTable table) {
		super();
		this.grapher = grapher;
		this.table = table;
		putValue(NAME, "Change color...");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(table.getSelectedRow() == -1)
			return;
		// Ask for color
		Color c = JColorChooser.showDialog(null, "Choisir une couleur", 
				(Color) table.getModel().getValueAt(table.getSelectedRow(), 1));
		if(c == null)
			return;
		// Update color on both models
		((MyTableModel) table.getModel()).changeColor(c, table.getSelectedRow());
		grapher.changeColor(c, table.getSelectedRow());
	}
}
