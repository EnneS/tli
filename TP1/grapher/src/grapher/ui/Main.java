package grapher.ui;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;


public class Main extends JFrame {
	Main(String title, String[] expressions) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Grapher grapher = new Grapher();		
		FunctionList functionList = new FunctionList(expressions, grapher);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, functionList, grapher);
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
