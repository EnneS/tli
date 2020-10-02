package grapher.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class ColorRenderer extends DefaultTableCellRenderer {
	
    public ColorRenderer() {
        setOpaque(true); //MUST do this for background to show up.
    }

    public Component getTableCellRendererComponent(JTable table, Object color,boolean isSelected, boolean hasFocus,int row, int column) {
        setBackground(null);
        Component tableCellRendererComponent = super.getTableCellRendererComponent(table, color, isSelected, hasFocus, row, column);
        if (color instanceof Color) {
            setBackground((Color) color);
            this.setText("");
        }
        return tableCellRendererComponent;
    }

}
