package dev.daniloberr;

// ENTRADA Y SALIDA DE DATOS

import java.util.Scanner;

public class _30IOestandar {

    /*
        Para enviar y recibir datos se utiliza la clase System.
     */

    public static void main(String[] args) {

        /* Llevamos to-do el curso usándolo pero
        así es como se envían datos a la salida estándar: con la
        clase System y la palabra out. Print es el método que
        nos imprime los datos y println lo hace
         en una nueva línea (hay varios métodos print).*/
        System.out.println("Imprimiendo datos en la salida estándar");

        /* Para introducir datos en la entrada estándar se utiliza
        la clase System y la palabra in.

        Con System.in se pueden crear objetos de la clase Scanner
        que lean y codifiquen los datos introducidos y podamos
        utilizar diferentes métodos de la clase con ellos.*/

        Scanner objetoScanner = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        String textoScaneado = objetoScanner.nextLine();
        System.out.print("Introduce un número: ");
        int numeroScaneado = objetoScanner.nextInt();

        System.out.println("El nombre introducido es: " + textoScaneado);
        System.out.println("El número introducido es: " + numeroScaneado);


        /*
            Con la clase Scanner, igual que se pueden leer y escribir
            datos instroducidos, se pueden leer y escribir archivos,
            bases de datos, etc.
         */
    }
}
