/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos_de_Tablas;

/**
 *
 * @author Carlos Zumba
 */
public class Casa {
      private int dimension;
    private int pisos;

    // Constructor con parámetros
    public Casa(int dimension, int pisos) {
        this.dimension = dimension;
        this.pisos = pisos;
    }

    public int getDimension() {
        return dimension;
    }

    public int getPisos() {
        return pisos;
    }

    @Override
    public String toString() {
        return dimension + "x" + dimension + " (" + pisos + " pisos)";
    }
}
