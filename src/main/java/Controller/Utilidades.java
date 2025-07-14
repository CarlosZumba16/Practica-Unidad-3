/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Carlos Zumba
 */
public class Utilidades {

    public char[][] build(int num, double porcentaje) {
        int muros = (int) Math.round(num * num * porcentaje / 100.0);
        char[][] matris = new char[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matris[i][j] = ' ';
            }
        }
        int filaentrada, columnaentrada, filassalida, columnasalida;
        do {
            filaentrada = (int) (Math.random() * num);
            columnaentrada = (int) (Math.random() * num);
            filassalida = (int) (Math.random() * num);
            columnasalida = (int) (Math.random() * num);
        } while ((filaentrada == filassalida) && (columnaentrada == columnasalida));
        matris[filaentrada][columnaentrada] = 'E';
        matris[filassalida][columnasalida] = 'S';
        int colocado = 0;
        while (colocado < muros) {
            int fila = (int) (Math.random() * num);
            int columna = (int) (Math.random() * num);
            if (matris[fila][columna] == ' ') {
                matris[fila][columna] = '#';
                colocado++;
            }
        }
        return matris;
    }

    public String[][] ConstrutorMatriz(int numFila, int Numcolumna) {
        String[][] Aux = new String[numFila][Numcolumna];
        for (int i = 0; i < numFila; i++) {
            for (int j = 0; j < Numcolumna; j++) {
                Aux[i][j] = String.format("%.0f", (Math.random() * (numFila * Numcolumna)));
            }
        }
        return Aux;
    }

    public String[][] EliminarNumero(String num, String[][] matis) {
        for (String[] mati : matis) {
            for (int j = 0; j < matis[0].length; j++) {
                if (num.equals(mati[j])) {
                    mati[j] = " - ";
                }
            }
        }
        return matis;
    }

    public String[][] EliminarPrimos(String[][] matis) {
        for (String[] mati : matis) {
            for (int j = 0; j < matis[0].length; j++) {
                if (!mati[j].equals(" - ")) {
                    int numero = Integer.parseInt(mati[j]);
                    if (EsPrimo(numero)) {
                        mati[j] = " - ";
                    }
                }
            }
        }
        return matis;
    }

    private boolean EsPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
       //Arreglos para las casas

}
