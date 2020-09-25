package grapher.ui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FunctionList extends JList {
	
	Grapher grapher;
	
	public FunctionList(String[] data, Grapher grapher) {
		
		super(data);				
		
		this.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				grapher.setSelectedFunction(getSelectedIndex());
			}
			
		});
	}
}
