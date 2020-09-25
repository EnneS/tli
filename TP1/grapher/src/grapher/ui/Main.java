package grapher.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;


public class Main extends JFrame {
	Main(String title, String[] expressions) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Grapher grapher = new Grapher();		
		FunctionList functionList = new FunctionList(expressions, grapher);
		
		LeftPanel leftPanel =  new LeftPanel(expressions, grapher, functionList);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel, grapher);
		for(String expression : expressions) {
			grapher.add(expression);
		}
		
		setJMenuBar(new Menu(grapher, functionList));
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
