package grapher.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class LeftPanel extends JPanel {
	public LeftPanel(String[] data, Grapher grapher, FunctionList functionList) {
		
		this.setLayout(new BorderLayout());
		
		Toolbar toolbar = new Toolbar();
				
		this.add(functionList, BorderLayout.CENTER);
		
		this.add(toolbar, BorderLayout.SOUTH);	
	}
}
