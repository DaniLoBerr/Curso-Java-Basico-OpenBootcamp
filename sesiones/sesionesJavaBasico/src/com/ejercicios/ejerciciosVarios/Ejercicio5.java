package com.ejercicios.ejerciciosVarios;

import java.util.Scanner;

public class Ejercicio5 {

    /*
    Lee un número por teclado y muestra por consola el carácter al que
    pertenece en la tabla ASCII. Por ejemplo, si introduzco un 97, me muestre una a.
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.print("Introduzca un número del 0 al 255: ");
        int numeroElegido = dameNumero.nextInt();
        if (numeroElegido <= 255) {
            char caracter = (char) numeroElegido;
            System.out.println("El número " + numeroElegido + " representa el caracter '" + caracter + "' en la tabla ASCII");
        } else {
            System.out.println("Introduzca un número válido");
        }

        /*
        Los números enteros y los caracteres son tipos de datos compatibles, es decir, se pueden convertir
        de uno a otro sin problemas, en base a su correspondecia en la tabla ASCII.
         */
    }
}
