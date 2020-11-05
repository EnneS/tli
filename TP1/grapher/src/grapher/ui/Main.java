package grapher.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;


public class Main extends JFrame {
	
	Main(String title, String[] expressions) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Grapher grapher = new Grapher();		
	
		MyTableModel tableModel = new MyTableModel();

		JTable table = new JTable(tableModel);
		table.setDefaultRenderer(Object.class, new ColorRenderer());
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {				
				grapher.setSelectedFunction(table.getSelectionModel().getSelectedIndices()[0]);
			}
		});
		
		LeftPanel leftPanel =  new LeftPanel(expressions, grapher, table);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel, grapher);
		for(String expression : expressions) {
			grapher.add(expression, Color.black);
			tableModel.addElement(expression, Color.black);
		}
				
		setJMenuBar(new Menu(grapher, table));
		add(splitPane);
		pack();
		
	}

	public static void main(String[] argv) {
		final String[] expressions = argv;
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { 
				new Main("grapher", expressions).setVisible(true); 
			}
		});
	}
}
