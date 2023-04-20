package entity;

import javax.swing.table.DefaultTableCellRenderer;

public class PasswordRenderer extends DefaultTableCellRenderer{
	 @Override
	    protected void setValue(Object value) {
	        setText("********");
	    }
}
