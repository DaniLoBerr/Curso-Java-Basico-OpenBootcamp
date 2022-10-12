package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

/** Crea un array bidimensional de enteros y recórrelo,
 * mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        int arrayBidi[][] = {
                {2, 7, 9},
                {1, 6, 4}
        };
        for (int i = 0; arrayBidi.length > i; i++){
            for (int j = 0; arrayBidi[i].length > j; j++) {
                System.out.println(" En la posición " + i + " de la primera dimensión y "
                        + j + " de la segunda, el valor es " + arrayBidi[i][j]);
            }
        }
    }
}
