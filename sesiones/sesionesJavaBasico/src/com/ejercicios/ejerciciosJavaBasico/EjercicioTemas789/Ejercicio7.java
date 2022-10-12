package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

import java.util.Scanner;

/** Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
 * a su llamante del tipo ArithmeticException que será capturada por su
 * llamante (desde "main", por ejemplo). Si se dispara la excepción,
 * mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos
 * en cualquier caso: "Demo de código". */

public class Ejercicio7 {

    public static void main(String[] args) {

        // Solicitamos 2 números
        Scanner introduceNumero = new Scanner(System.in);
        System.out.print("Introduce dos números enteros: ");
        int numero1 = introduceNumero.nextInt();
        int numero2 = introduceNumero.nextInt();

        // Llámamos a la función y capturamos la posible excepción
        try {
            int division = dividePorCero(numero1, numero2);
            System.out.println("El resultado de dividir " + numero1 + " entre " + numero2 + " es: " + division);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Demos de código");
        }
    }

    // Creamos la función que realice la operación
    private static int dividePorCero(int numero1, int numero2) throws ArithmeticException {

        int resultadoDivision;

        // Lanzamos la posible excepción para que se ocupe de ella el llamante
        try {
            resultadoDivision = numero1 / numero2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Esto no puede hacerse");
        }

        return resultadoDivision;
    }
}
