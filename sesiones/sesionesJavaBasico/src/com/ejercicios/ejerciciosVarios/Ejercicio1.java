package com.ejercicios.ejerciciosVarios;

public class Ejercicio1 {

    /*
    Escribe un programa Java que dibuje los números del 1 al 100 que sean divisibles por 3.
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }

    }
}