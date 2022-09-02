package com.ejercicios.ejerciciosDiscoDuroDeRoer;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    /*
    2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por
     teclado. Crea un método donde pasamos como parámetros entre que números queremos que los genere,
     podemos pedirlas por teclado antes de generar los números. Este método devolverá un número entero aleatorio.
    Muestra estos números por pantalla.
     */

    public static void main(String[] args) {

        Scanner dameCantidadNumeros = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números enteros que quieres que se generen: ");
        int numerosAGenerar = dameCantidadNumeros.nextInt();

        Scanner dameRangoNumeros = new Scanner(System.in);
        System.out.println("Generar " + numerosAGenerar + " números entre: ");
        int primerNumeroDelRango = dameRangoNumeros.nextInt();
        System.out.println("y: ");
        int segundoNumeroDelRango = dameRangoNumeros.nextInt();

        System.out.println("Los números aleatorios del rango escogido son: ");

        for (int i = 0; i < numerosAGenerar; i++) {
            int numeroAleatorio = devolverNumerosAGenerar(primerNumeroDelRango, segundoNumeroDelRango);
            System.out.println(numeroAleatorio);
        }

    }

    private static int devolverNumerosAGenerar (int primerNumeroDelRango, int segundoNumeroDelRango) {
        Random generarNumeroAleatorio = new Random();
        int numeroADevolver = generarNumeroAleatorio.nextInt((segundoNumeroDelRango-primerNumeroDelRango) + 1) + primerNumeroDelRango;
        return numeroADevolver;

    }
}
