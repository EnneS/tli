package grapher.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;

public class Menu extends JMenuBar {
	
	public Menu(Grapher grapher, JTable table) {
		JMenu menu = new JMenu("Expression");
		add(menu);

		JMenuItem addFunctionItem = new JMenuItem("Add...");
		addFunctionItem.setAction(new AddExpressionAction(grapher, table));
		
		JMenuItem removeFunctionItem = new JMenuItem();
		removeFunctionItem.setAction(new RemoveExpressionAction(grapher, table));

		JMenuItem changeFunctionColorItem = new JMenuItem();
		changeFunctionColorItem.setAction(new ChangeColorAction(grapher, table));

		menu.add(addFunctionItem);
		menu.add(removeFunctionItem);
		menu.add(changeFunctionColorItem);
	}
}
