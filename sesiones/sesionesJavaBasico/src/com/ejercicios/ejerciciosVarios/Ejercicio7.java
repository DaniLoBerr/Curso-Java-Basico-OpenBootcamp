package com.ejercicios.ejerciciosVarios;

import java.util.Scanner;

public class Ejercicio7 {

    /*
    Pedir dos números por teclado e indicar si uno es mayor que otro o sin son iguales.
     */

    public static void main(String[] args) {

        Scanner damePrimerNumero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int primerNumero = damePrimerNumero.nextInt();
        Scanner dameSegundoNumero = new Scanner(System.in);
        System.out.print("Introduce otro número: ");
        int segundoNumero = dameSegundoNumero.nextInt();

        if (primerNumero<segundoNumero) {
            System.out.println(primerNumero + " es menor que " + segundoNumero);
        } else if (primerNumero>segundoNumero) {
            System.out.println(primerNumero + " es mayor que " + segundoNumero);
        } else {
            System.out.println(primerNumero + " y " + segundoNumero + " son iguales");
        }
    }
}
