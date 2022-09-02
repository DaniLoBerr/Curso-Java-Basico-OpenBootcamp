package com.ejercicios.ejerciciosVarios;

import java.util.Scanner;

public class Ejercicio6 {
    /*
    Indicar si un número pasado por consola es par o impar
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numeroIntroducido = dameNumero.nextInt();

        if (numeroIntroducido % 2 == 0) {
            System.out.println(numeroIntroducido + " es un número par");
        } else {
            System.out.println(numeroIntroducido + " es un número impar");
        }
    }
}
