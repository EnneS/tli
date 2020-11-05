package grapher.ui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {

    private String[] columnNames = {
			"Fonction",
			"Couleur"
		};
    
//    private ArrayList<ArrayList<Object>> data;
    private Object[][] data = new Object[0][2];
    
    public MyTableModel() {
    	super();
    
    };

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
	public void addElement(String s,Color c) {
		Object[][] newArray = new Object[this.data.length+1][2];
		for(int i = 0; i < this.data.length; i++) {
			newArray[i][0] = this.data[i][0];
			newArray[i][1] = this.data[i][1];
		}
		newArray[this.data.length][0] = s;
		newArray[this.data.length][1] = c;
		this.data = newArray;
        fireTableCellUpdated(this.data.length-1, 0);
        fireTableCellUpdated(this.data.length-1, 1);
 	}
	
	public void removeElement(int indexRemove) {
		Object[][] newArray = new Object[this.data.length-1][2];
		for(int i = 0; i < this.data.length; i++) {
			if(i < indexRemove) {
				newArray[i][0] = this.data[i][0];
				newArray[i][1] = this.data[i][1];
			} else if(i > indexRemove) {
				newArray[i - 1][0] = this.data[i][0];
				newArray[i - 1][1] = this.data[i][1];
			}
			fireTableCellUpdated(i, 0);
			fireTableCellUpdated(i, 1);
		}
		
		this.data = newArray;
	}
	
	public void changeColor(Color c, int row) {
		this.data[row][1] = c;
        fireTableCellUpdated(row, 1);
	}
	

}
