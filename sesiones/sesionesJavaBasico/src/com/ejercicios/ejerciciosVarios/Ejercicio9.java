package com.ejercicios.ejerciciosVarios;

import java.util.Scanner;

public class Ejercicio9 {

    /*
    Crear una aplicación que nos permite insertar números hasta que insertemos un -1
    para finalizar el programa.
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numeroIntroducido = dameNumero.nextInt();

        while (numeroIntroducido != -1) {
            System.out.print("Por favor, seleccione otro número: ");
            numeroIntroducido = dameNumero.nextInt();
        }
        System.out.println("Enhorabuena! Ha encontrado usted el -1");

    }
}
