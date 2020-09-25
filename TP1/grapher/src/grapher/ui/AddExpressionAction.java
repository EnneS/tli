package grapher.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class AddExpressionAction extends AbstractAction {

	
	private Grapher grapher;
	private FunctionList functionList;

	public AddExpressionAction(Grapher grapher, FunctionList functionList) {
		super();
		this.grapher = grapher;
		this.functionList = functionList;
		putValue(NAME, "Add...");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	     String expression = JOptionPane.showInputDialog("Nouvelle expression :"); 
	     grapher.add(expression);
	     functionList.addElement(expression);
	}
}
