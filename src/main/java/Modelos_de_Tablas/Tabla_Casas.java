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
public class Tabla_Casas extends AbstractTableModel{
 //•	La clase Tabla_Laberinto extiende AbstractTableModel, que es la clase base 
    //utilizada para crear modelos de tablas en Java Swing. Al extender esta clase, Tabla_Laberinto 
    //puede ser utilizada por un componente JTable para mostrar datos en una tabla.

    public String[][] data = new String[0][0];
    //Es un arreglo bidimensional de tipo char, que almacena los datos del laberinto. 
    //El tamaño de la matriz es inicializado como 0x0, lo que significa que inicialmente
    //no tiene filas ni columnas. Posteriormente, se establecerán las dimensiones del laberinto.

    public void setData(String[][] aux) {
        this.data = aux;
        //•	Este método recibe un arreglo bidimensional 
        //aux que representa los nuevos datos del laberinto y los asigna al atributo data.
        
        fireTableStructureChanged();
        //Luego, se llama al método fireTableStructureChanged() para notificar a la tabla
        //que la estructura de los datos ha cambiado. 
        //Esto asegura que la tabla se actualice adecuadamente cuando los datos cambian.
    }

    @Override
    public int getRowCount() {
        return data.length;
    }
    //•	Este método devuelve el número de filas de la tabla. En este caso, es igual al
    //número de filas en la matriz data (es decir, el número de filas del laberinto).

    @Override
    public int getColumnCount() {
        return data.length == 0 ? 0 : data[0].length;
    }
    //Este método devuelve el número de columnas de la tabla. 
    //Si la matriz data tiene al menos una fila, devuelve el número de columnas
    //de la primera fila (data[0].length).
	//Si data está vacío (sin filas), retorna 0.


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    //•	Este método obtiene el valor de la celda ubicada en la fila rowIndex 
    //y la columna columnIndex. Devuelve el valor de tipo char almacenado en data[rowIndex][columnIndex].

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    //•	Este método indica si las celdas de la tabla son editables o no.
    //En este caso, siempre devuelve false, lo que significa que las celdas no son editables por el usuario
    //(esto es útil si la tabla se utiliza solo para mostrar datos estáticos, como un laberinto).
}
/**Resumen de la clase Tabla_Laberinto
Esta clase implementa un modelo de tabla personalizado que maneja los datos de un laberinto representado como una matriz de caracteres (char[][]). Proporciona los métodos necesarios para que la tabla se pueda mostrar correctamente en un componente JTable:
•	setData: Para establecer los datos del laberinto.
•	getRowCount: Para obtener el número de filas.
•	getColumnCount: Para obtener el número de columnas.
•	getValueAt: Para obtener el valor de una celda específica.
•	isCellEditable: Para indicar que las celdas no son editables.
*/