package grapher.ui;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	public Toolbar( Grapher grapher, JTable table) {
		RemoveExpressionAction removeAction = new RemoveExpressionAction(grapher, table);
		AddExpressionAction addAction = new AddExpressionAction(grapher, table);
		
		
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
