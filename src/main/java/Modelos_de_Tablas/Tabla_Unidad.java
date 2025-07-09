/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos_de_Tablas;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Carlos Zumba
 */
public class Tabla_Unidad extends AbstractTableModel {
  public    String[][] data = new String[0][0];

    public void setData(String[][] aux) {
        this.data = aux;
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return data.length;
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return data.length == 0 ? 0 : data[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return data[rowIndex][columnIndex];
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
    @Override
 public boolean isCellEditable(int rowIndex, int columnIndex){
     return false;
 }      
}
