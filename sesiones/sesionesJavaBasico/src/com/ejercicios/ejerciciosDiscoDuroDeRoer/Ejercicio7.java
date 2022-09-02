package com.ejercicios.ejerciciosDiscoDuroDeRoer;

import java.util.Scanner;

import static java.lang.Math.round;

public class Ejercicio7 {

    /*
    Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda,
    estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros,
    la cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
    mostrara un mensaje indicando el cambio (void).

El cambio de divisas son:

    0.86 libras es un 1 €
    1 $ es un 1 €
    137.05 yenes es un 1 €
     */

    public static void main(String[] args) {

        Scanner damePrecio = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de dinero en euros: ");
        double precioElegido = damePrecio.nextDouble();

        Scanner dameDivisa = new Scanner(System.in);
        System.out.println("¿A qué divisa quiere convertirla? Elija entre libras, dólares o yenes");
        String divisaElegida = dameDivisa.nextLine();

        double conversion = precioElegido;

        switch (divisaElegida) {
            case "libras", "Libras":
                double eurosLibras = conversion*0.85;
                System.out.println(precioElegido + " euros son " + eurosLibras + " libras");
                break;

            case "dolares", "dólares", "Dólares", "Dolares":
                double eurosDolares = conversion*1.28611;
                System.out.println(precioElegido + " euros son " + eurosDolares + " dólares");
                break;

            case "yenes", "Yenes":
                double eurosYenes = conversion*137.05;
                System.out.println(precioElegido + " euros son " + eurosYenes + " yenes");
                break;
            default:
                System.out.println("La divisa elegida no es una divisa válida");
        }
    }
}
