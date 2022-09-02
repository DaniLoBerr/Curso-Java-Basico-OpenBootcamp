package com.ejercicios.ejerciciosDiscoDuroDeRoer;

import java.util.Scanner;

public class Ejercicio6 {

    /*
    Crea una aplicación que nos cuente el número de cifras de un número entero positivo (hay que controlarlo)
    pedido por teclado. Crea un método que realice esta acción, pasando el número por parámetro,
    devolverá el número de cifras.
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        long numeroElegido = dameNumero.nextLong();

        System.out.println(devolverCantidadCifras(numeroElegido));
    }

    private static String devolverCantidadCifras(long numeroElegido) {

        int cifras = 0;

        long i = numeroElegido;
        while (i > 0) {
            i /= 10;
            cifras++;
        }

        return "El número " + numeroElegido + " tiene " + cifras + " cifras";
    }
}
