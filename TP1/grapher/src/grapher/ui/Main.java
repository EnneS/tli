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
<<<<<<< HEAD
		FunctionList functionList = new FunctionList(expressions, grapher);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, functionList, grapher);
=======
		
		LeftPanel leftPanel =  new LeftPanel(expressions, grapher);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel, grapher);
>>>>>>> 3083fabbe171ebbfe4ad8b5d1280cd26252549dd
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
