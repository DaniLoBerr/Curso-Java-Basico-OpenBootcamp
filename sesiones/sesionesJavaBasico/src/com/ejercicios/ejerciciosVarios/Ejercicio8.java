package com.ejercicios.ejerciciosVarios;

import java.util.Scanner;

public class Ejercicio8 {

    /*
    Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1.
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.println("Introduzca un número entero mayor que 1: ");
        int numeroIntroducido = dameNumero.nextInt();

        int suma = 0;

        while (numeroIntroducido <= 1) {
            System.out.println("Por favor, introduzca un número válido");
            numeroIntroducido = dameNumero.nextInt();
        }
        for (int i = 1; i <= numeroIntroducido; i++) {
            suma += i;
        }
        System.out.println("La suma solicitada es " + suma);
    }

}
