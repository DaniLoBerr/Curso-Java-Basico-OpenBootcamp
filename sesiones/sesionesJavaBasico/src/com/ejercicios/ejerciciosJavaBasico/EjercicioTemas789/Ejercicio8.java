package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/** Utilizando InputStream y PrintStream, crea una función
 * que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero
 * dado en el parámetro "fileIn" al fichero dado en "fileOut". */

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner getFilePath = new Scanner(System.in);
        System.out.println("Introduzca la ruta y el nombre del archivo que desea copiar: ");
        String fileIn = getFilePath.nextLine();

        Scanner nameNewFile = new Scanner(System.in);
        System.out.println("Introduzca la ruta, el nombre y la extensión de su nuevo archivo: ");
        String fileOut = nameNewFile.nextLine();

        copyFile(fileIn, fileOut);

        System.out.println("El archivo se ha copiado con éxito");
    }

    public static void copyFile (String fileIn, String fileOut) {

        try {
            InputStream inputFile = new FileInputStream(fileIn);
            BufferedInputStream bufferInputFile = new BufferedInputStream(inputFile);
            byte[] datosInputFile = bufferInputFile.readAllBytes();
            inputFile.close();

            try {
                PrintStream outputFile = new PrintStream(fileOut);
                outputFile.write(datosInputFile);
                outputFile.close();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
