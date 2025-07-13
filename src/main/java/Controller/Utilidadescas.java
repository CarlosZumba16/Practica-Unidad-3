/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Modelos_de_Tablas.Casa;
/**
 *
 * @author Carlos Zumba
 */
public class Utilidadescas {
 private static Casa[] casas = new Casa[10]; // Arreglo fijo para 10 casas
    private static int contador = 0; //Lleva un seguimiento de cuántas casas se han guardado en el arreglo.
    private static int[] grupoHomonimas = new int[10]; // Un arreglo para almacenar los grupos asignados 
    //a las casas, en función de sus dimensiones y número de pisos. 

    public static void guardarCasa(Casa casa) {
        if (contador < 10) { //•	Si contador es menor que 10 (es decir, hay espacio en el arreglo),
            //se almacena la casa en la posición indicada por contador.
            casas[contador] = casa;
            // Asignar grupo de homónimas
            int grupo = asignarGrupoHomonimas(casa.getDimension(), casa.getPisos());
            //•	Luego, se llama al método asignarGrupoHomonimas para determinar a 
            //qué grupo pertenece la casa.
            grupoHomonimas[contador] = grupo;
            contador++;//Se incrementa el contador para el siguiente almacenamiento.
        }
        //Este método recibe una instancia de Casa y la guarda en el arreglo casas. Además, asigna un grupo
        //de homónimas para la casa, basado en sus dimensiones y número de pisos.
    }

    public static Casa getCasa(int index) {
        if (index >= 0 && index < contador) {
            return casas[index];
        }
        return null;
        
        //Este método devuelve la casa que está almacenada en el índice especificado. 
        //Si el índice es válido (mayor o igual a 
        //0 y menor que el contador), retorna la casa; de lo contrario, retorna null.
    }

    public static int getContador() {
        return contador;
    }
    //Este método simplemente devuelve el valor actual del contador, es decir,
    //cuántas casas han sido almacenadas.
    

    private static int asignarGrupoHomonimas(int dimension, int pisos) { //Metodo 
        int grupo = 1; //•Comienza con un grupo 1 por defecto.
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) { //recorre todas las casas almacenadas hasta el momento. 
            //Si encuentra una casa con las mismas dimensiones 
            //y pisos, asigna el mismo grupo que la casa encontrada.
            if (casas[i] != null && casas[i].getDimension() == dimension && casas[i].getPisos() == pisos) {
                encontrado = true; 
                grupo = grupoHomonimas[i]; // Usar el mismo grupo de una casa previa con mismas dimensiones
                break;
            }
        }
        if (!encontrado && contador > 0) {
            grupo = grupoHomonimas[contador - 1] + 1; // Nuevo grupo para nuevas dimensiones
        }
        //•	Si no encuentra ninguna casa con las mismas características, asigna un nuevo grupo, 
        //incrementando el grupo del último elemento almacenado.
        return grupo;
    }

    public static int getGrupoHomonimas(int index) {
        if (index >= 0 && index < contador) {
            return grupoHomonimas[index];
        }
        return 1; // Valor por defecto para la primera casa o si no existe
    } //Este método devuelve el grupo de homónimas asignado a la casa que se encuentra en el índice index del 
    //arreglo casas. Si el índice es inválido, devuelve 1    
}
