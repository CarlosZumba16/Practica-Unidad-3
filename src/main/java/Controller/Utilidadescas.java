/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Zumba
 */
public class Utilidadescas {

    private String path = "Data";

    public void save(String text, String name_file) throws IOException {
        FileWriter file = new FileWriter(path + File.separatorChar + name_file, true);
        file.write(text);
        file.close();
    }

    public String[][] listAll(String name_file) throws IOException {
        String[][] data = null;
        Integer filas = countRegister(name_file);
        if (filas > 0) {
            Integer col = countColumn(name_file);
            data = new String[filas][col];
            FileReader file = new FileReader(path + File.separatorChar + name_file);
            BufferedReader br = new BufferedReader(file);
            String linea = br.readLine();
            int fil = 0;
            while (linea != null) {
                String[] columas = linea.split("\t");

                for (int j = 0; j < columas.length; j++) {
                    data[fil][j] = columas[j];
                    System.out.println("qqqq");
                }
                fil++;
                linea = br.readLine();
            }
            file.close();
            br.close();
        }

        System.out.println();
        return data;
    }

    private Integer countRegister(String name_file) throws IOException {
        FileReader file = new FileReader(path + File.separatorChar + name_file);
        BufferedReader br = new BufferedReader(file);
        int lines = (int) br.lines().count();
        file.close();
        br.close();
        return lines;
    }

    private Integer countColumn(String name_file) throws FileNotFoundException, IOException {
        FileReader file = new FileReader(path + File.separatorChar + name_file);
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();
        file.close();
        br.close();
        return line.split("\t").length;

    }

    public int EncontrarCasa(String NombredelArchivo) {
        try {
            String[][] Archivo = listAll(NombredelArchivo);
            if (Archivo.length == 0) {
                return 1;
            }
            return Integer.parseInt(Archivo[Archivo.length - 1][0]) + 1;
        } catch (Exception e) {
            return 1;
        }
    }

    public String EncotrarHomonima(String NombredelArchivo) {
        try {
            String[][] Archivo = listAll(NombredelArchivo);
            String resul = "";
            for (int i = 0; i < Archivo.length; i++) {
                String dimensioni = Archivo[i][4];
                String numpisosi = Archivo[i][5];
                for (int j = i + 1; j < Archivo.length; j++) {
                    String dimensionj = Archivo[j][4];
                    String numpisosj = Archivo[j][5];
                    if (dimensioni.equals(dimensionj) && (numpisosi.equals(numpisosj))) {
                        resul += (Archivo[i][0]) + "Es igual a la " + Archivo[j][0] + "\n";
                    }
                }

            }
            return resul;
        } catch (Exception e) {
            return "";
        }

    }
}
