/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Carlos Zumba
 */
public class PintarTable extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable Tabla, Object val, boolean celsaselec, boolean focis, int filas, int columnas) {
        super.getTableCellRendererComponent(Tabla, val, celsaselec, focis, filas, columnas);
        char valor = (Character) val;
        switch (valor) {
            case '#':
                setBackground(Color.GRAY);
                break;
            case 'E':
                setBackground(Color.GREEN);
                break;
            case 'S':
                setBackground(Color.RED);
                break;
            default:
                setBackground(Color.WHITE);
                break;
        }
        setText("");
        return this;
    }
}
