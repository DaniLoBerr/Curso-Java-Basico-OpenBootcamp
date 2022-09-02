package com.ejercicios.ejerciciosDiscoDuroDeRoer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    /*
    Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por parámetro
    para que nos indique si es o no un número primo, debe devolver true si es primo sino false.

    Un número primo es aquel solo puede dividirse entre 1 y si mismo.
    Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
    Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible
    desde ese numero hasta 1.
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numeroElegido = dameNumero.nextInt();

        System.out.println(devolverRespuestaNumeroPrimo(numeroElegido));
    }

    private static String devolverRespuestaNumeroPrimo (int numeroElegido) {

        List <Integer> listaPosiblesPrimos = new ArrayList<>();

        if (numeroElegido == 1) {
            return "El número 1 no es un número primo";
        }

        for (int i = 1; numeroElegido > 1; i++) {
            if (numeroElegido == i) {
                break;
            } else if (numeroElegido % i == 0) {
                listaPosiblesPrimos.add(i);
            }
        }

        if (listaPosiblesPrimos.size() == 1) {
            return "El " + numeroElegido + " es un número primo";
        } else {
            return "El " + numeroElegido + " no es un número primo";
        }
    }
}