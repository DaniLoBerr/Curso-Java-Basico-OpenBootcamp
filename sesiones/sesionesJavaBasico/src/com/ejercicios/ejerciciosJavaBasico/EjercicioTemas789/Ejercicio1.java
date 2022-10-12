package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

/** Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores. */

public class Ejercicio1 {

    public static void main(String[] args) {

        String arrayPalabras[] = {"palabra 1", "palabra 2", "palabra 3"};

        for (String elementoArray : arrayPalabras) {
            System.out.println(elementoArray);
        }
    }
}
