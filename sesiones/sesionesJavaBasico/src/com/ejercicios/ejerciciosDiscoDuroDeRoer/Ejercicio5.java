package com.ejercicios.ejerciciosDiscoDuroDeRoer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

    /*
    Crea una aplicación que nos convierta un número en base decimal a binario.
    Esto lo realizara un método al que le pasaremos el numero como parámetro,
    devolverá un String con el numero convertido a binario.
    Para convertir un numero decimal a binario,
    debemos dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo
    hasta que no se pueda dividir mas,
    el resto que obtengamos de cada división formara el numero binario, de abajo a arriba.

    Veamos un ejemplo: si introducimos un 8 nos deberá devolver 1000
     */

    public static void main(String[] args) {

        Scanner dameNumero = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int numeroElegido = dameNumero.nextInt();

        System.out.println(devolverNumeroConvertido(numeroElegido));
    }

    private static String devolverNumeroConvertido(int numeroElegido) {

        int numeroDividido = numeroElegido;

        List<Integer> listaBinarios = new ArrayList<>();

        do {
            listaBinarios.add(numeroDividido%2);
            numeroDividido /= 2;
        } while (numeroDividido > 0);

        Collections.reverse(listaBinarios);

        String numeroBinario = "";

        for (int i : listaBinarios) {
            numeroBinario += i;
        }

        return "El número " + numeroElegido + " en binario es " + numeroBinario;

    }
}
