package grapher.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTable;

public class LeftPanel extends JPanel {
	public LeftPanel(String[] data, Grapher grapher, JTable table) {
		
		this.setLayout(new BorderLayout());
		
		Toolbar toolbar = new Toolbar(grapher,table);
				
		this.add(table, BorderLayout.CENTER);
		
		this.add(toolbar, BorderLayout.SOUTH);	
	}
}
