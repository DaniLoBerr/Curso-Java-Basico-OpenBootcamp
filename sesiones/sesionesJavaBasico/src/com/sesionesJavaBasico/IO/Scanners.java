package com.sesionesJavaBasico.IO;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Scanners {

    /**
     *
     * SCANNER
     *
     * La clase Scanner, perteneciente al paquete java.util, nos permite
     * ingresar datos por teclado en nuestro programa. Deben ser datos de
     * tipo primitivo o Strings.
     * También se puede utilizar para ingresar datos de un fichero.
     * El "System.in" es el parámetro que nos indica de donde provienen
     * los datos. El "in" es un InputStream.
     *
     * Se puede utilizar la estructura try/catch para evitar que se
     * detenga el programa si se introduce un tipo de dato no válido y
     * una estructura de control como do-while para resetear el proceso.
     */

    public static void main(String[] args) {

            boolean flagEstado = false;
            do {
                Scanner solicitarEdad = new Scanner(System.in);
                System.out.println("Introduce tu edad: ");
                try {
                    int edadSolicitada = solicitarEdad.nextInt();
                    System.out.println("Tu edad es: " + edadSolicitada);
                    flagEstado = true;
                } catch (InputMismatchException e) {
                    System.out.println("Los datos introducidos no son válidos");
                }
            } while (!flagEstado);



    }
}
