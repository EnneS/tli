package grapher.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class Menu extends JMenuBar {
	
	public Menu(Grapher grapher, FunctionList functionList) {
		JMenu menu = new JMenu("Expression");
		add(menu);

		JMenuItem addFunctionItem = new JMenuItem("Add...");
		addFunctionItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			     String expression = JOptionPane.showInputDialog("Nouvelle expression :"); 
			     grapher.add(expression);
			     functionList.addElement(expression);
			}
			
		});
		
		JMenuItem removeFunctionItem = new JMenuItem();
		removeFunctionItem.setAction(new RemoveExpressionAction(grapher, functionList));
		menu.add(addFunctionItem);
		menu.add(removeFunctionItem);



	}
}
