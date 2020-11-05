package grapher.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class AddExpressionAction extends AbstractAction {

	
	private Grapher grapher;
	private JTable table;

	public AddExpressionAction(Grapher grapher, JTable table) {
		super();
		this.grapher = grapher;
		this.table = table;
		putValue(NAME, "Add...");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	     String expression = JOptionPane.showInputDialog("Nouvelle expression :"); 
	     if(expression != null) {
	    	 grapher.add(expression, Color.BLACK);
	    	 ((MyTableModel) table.getModel()).addElement(expression, Color.BLACK);
	     }
	}
}
