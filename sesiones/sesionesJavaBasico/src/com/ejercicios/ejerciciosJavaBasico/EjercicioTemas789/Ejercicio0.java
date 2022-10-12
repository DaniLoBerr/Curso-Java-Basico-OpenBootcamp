package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

import java.util.Scanner;

/** 0. Escribe el código que devuelva una cadena al revés */

public class Ejercicio0 {

    public static void main(String[] args) {

        Scanner introduceCadena = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");

        String cadenaIntroducida = introduceCadena.nextLine();

        String cadenaReversed = reverse(cadenaIntroducida);
        System.out.println("La cadena '" + cadenaIntroducida + "' revertida sería: " + cadenaReversed);


    }

    public static String reverse(String cadenaIntroducida) {

        String cadenaReversed = "";
        for (int i = cadenaIntroducida.length() -1; i >= 0; i--) {
            cadenaReversed += cadenaIntroducida.charAt(i);
        }
        return cadenaReversed;
    }
}
