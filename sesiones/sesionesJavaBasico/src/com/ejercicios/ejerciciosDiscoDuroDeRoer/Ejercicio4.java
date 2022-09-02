package com.ejercicios.ejerciciosDiscoDuroDeRoer;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    4) Crea una aplicación que nos calcule el factorial de un número pedido por teclado,
    lo realizara mediante un método al que le pasamos el número como parámetro.
    Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno.
    Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numeroElegido = dameNumero.nextInt();

        System.out.println(devolverFactorialNumeroElegido(numeroElegido));
    }

    private static String devolverFactorialNumeroElegido(int numeroElegido) {

        int factorial = numeroElegido;

        for (int i = 1; numeroElegido > i; i++) {
            factorial *= i;
        }

        return "El factorial de " + numeroElegido + " es " + factorial;
    }

}
