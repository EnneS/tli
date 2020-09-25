package grapher.ui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	public Toolbar( Grapher grapher, FunctionList functionList) {
		RemoveExpressionAction removeAction = new RemoveExpressionAction(grapher, functionList);
		AddExpressionAction addAction = new AddExpressionAction(grapher, functionList);
		
		
		JButton buttonMoins = new JButton();
		JButton buttonPlus = new JButton();
		
		buttonMoins.setAction(removeAction);
		buttonMoins.setText("-");
		
		buttonPlus.setAction(addAction);
		buttonPlus.setText("+");
		
		this.add(buttonMoins);
		this.add(buttonPlus);
	}
}
