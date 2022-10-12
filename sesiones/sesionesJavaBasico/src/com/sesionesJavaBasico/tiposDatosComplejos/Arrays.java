package com.sesionesJavaBasico.tiposDatosComplejos;

public class Arrays {

    /**
     *
     * ARRAYS
     *
     * Un array es una colección de elementos de un mismo tipo.
     * En Java, podría considerarse como una variable que tiene
     * múltiples valores consecutivos de un mismo tipo.
     *
     * Los Arrays en Java son figuras invariables a las cuales
     * se les define un tamaño cuando se declaran y no se pueden
     * ampliar ni reducir.
     */

    public static void main(String[] args) {

        /** Formas de declarar un Array en Java */
        // 1. Cuando no sabemos el valor que contendrán sus elementos
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;
        System.out.println("Array Uno: ");
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println(" El elemento de la posición " + i + " del array es " + arrayUno[i]);
        }

        // 2. Cuando si sabemos el valor que contendrán sus elementos
        int arrayDos[] = { 6, 7, 8, 9, 10 };
        System.out.println("Array Dos: ");
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.println(" El elemento de la posición " + i + " del array es " + arrayDos[i]);
        }

        /** Propiedades de los Arrays */
        String arrayTres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };
        // Longitud
        /* En este caso la longitud de un array es una propiedad, en
        las cadenas de texto vimos que era un método*/
        System.out.println("Propiedad Length: ");
        System.out.println(" La longitud del arrayTres es de: " + arrayTres.length);

        /** Formas de recorrer Arrays */
        // for
        /* Obtenemos la posición dentro del array utilizando un
        * contador (índice). Se accede a los valores del array a través
        * de su posición. */
        System.out.println("Recorrer un array con for: ");
        for (int i = 0; i < arrayTres.length; i++) {
            System.out.println(" El valor del elemento " + i + " es " + arrayTres[i]);
        }

        // foreach
        /* Se muestra directamente el contenido de los elementos
        * sin atender a su posición en el array. Se accede a los valores
        * del array directamente.  */
        System.out.println("Recorrer un array con foreach: ");
        for (String elemento : arrayTres) {
            System.out.println(" El valor de la posición actual es: " + elemento);
        }

        /** ARRAYS MULTIDIMENSIONALES
         * Es la unión de varios arrays unidimensionales.
         *
         * Los arrays bidimensionales forman una especie
         * de tabla en la que el primer array forma
         * las filas y el segundo array las columnas.
         * Se suelen utilizar para hacer asociaciones.
         *
         * Los arrays tridemensionales se suelen
         * utilizar para matrices.
         */

        /** Formas de declarar Arrays Bidireccionales */
        // Forma 1
        int arrayBi[][] = new int[2][4];
        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[0][3] = 4;
        arrayBi[1][0] = 10;
        arrayBi[1][1] = 20;
        arrayBi[1][2] = 30;
        arrayBi[1][3] = 40;

        // Forma 2
        int arrayBidi[][] = {
                { 1, 2, 3, 4 },
                { 10, 20, 30, 40 }
        };

        /** Forma de recorrer Arrays Bidireccionales
         *
         * Se anida un for dentro de otro: con el for inicial
         * se recorren los elementos del primer array (las filas)
         * y con el for anidado se recorren los elementos del segundo
         * array (las columnas) pero respecto a la posición del primer array,
         * es decir, primero se recorren los elementos de las columnas
         * con respecto a la primera fila y después con respecto a la segunda fila.
         */
        System.out.println("Arrays Bidimensionales: ");
        for (int i = 0; i < arrayBidi.length; i++){
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println(" En la posición " + i + " del primer array y " + j + " del segundo array, " +
                        "el valor es " + arrayBidi[i][j]);
            }
        }
    }
}
