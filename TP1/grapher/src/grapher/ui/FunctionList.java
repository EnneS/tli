package grapher.ui;

import javax.swing.DefaultListModel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FunctionList extends JList<String> {
	
	private Grapher grapher;
	private static DefaultListModel<String> list = new DefaultListModel<String>();
	
	public FunctionList(String[] data, Grapher grapher) {
		super(list);
		System.out.println(data.length);
		for(String s : data) {
			list.addElement(s);
		}
		
		this.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				grapher.setSelectedFunction(getSelectedIndex());
			}
			
		});
	}
	
	public void addElement(String s){
		list.addElement(s);
	}
	
	public void removeElement(int i) {
		list.removeElementAt(i);
	}
}
