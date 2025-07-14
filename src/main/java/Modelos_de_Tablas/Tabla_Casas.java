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
public class Tabla_Casas extends AbstractTableModel {
    //•	La clase Tabla_Laberinto extiende AbstractTableModel, que es la clase base 
    //utilizada para crear modelos de tablas en Java Swing. Al extender esta clase, Tabla_Laberinto 
    //puede ser utilizada por un componente JTable para mostrar datos en una tabla.

    private String[][] data;

    public String[][] getdata() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return data.length;

    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return data[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch (columnIndex) {
            case 0:
                return data[rowIndex][0];
            case 1:
                return data[rowIndex][1];
            case 2:
                return data[rowIndex][2];
            case 3:
                return data[rowIndex][3];
            case 4:
                return data[rowIndex][4];
            case 5:
                return data[rowIndex][5];
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Numero de Casa";
            case 1:
                return "Nombre del Propietario";
            case 2:
                return "Ancho de la Casa";
            case 3:
                return "Largo de la Casa";
            case 4:
                return "Dimensiones";
            case 5:
                return "Numero de Pisos";
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    //•	Este método indica si las celdas de la tabla son editables o no.
    //En este caso, siempre devuelve false, lo que significa que las celdas no son editables por el usuario
    //(esto es útil si la tabla se utiliza solo para mostrar datos estáticos, como un laberinto).
}
/**
 * Resumen de la clase Tabla_Laberinto Esta clase implementa un modelo de tabla
 * personalizado que maneja los datos de un laberinto representado como una
 * matriz de caracteres (char[][]). Proporciona los métodos necesarios para que
 * la tabla se pueda mostrar correctamente en un componente JTable: •	setData:
 * Para establecer los datos del laberinto. •	getRowCount: Para obtener el
 * número de filas. •	getColumnCount: Para obtener el número de columnas. •
 * getValueAt: Para obtener el valor de una celda específica. •	isCellEditable:
 * Para indicar que las celdas no son editables.
 */
