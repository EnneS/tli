package grapher.ui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	public Toolbar() {
		JButton buttonMoins = new JButton("-");
		JButton buttonPlus = new JButton("+");
		
		this.add(buttonMoins);
		this.add(buttonPlus);
	}
}
