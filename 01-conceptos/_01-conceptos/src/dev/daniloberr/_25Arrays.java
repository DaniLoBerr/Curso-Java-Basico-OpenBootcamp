package dev.daniloberr;

import PaqueteDePrueba.Coche;

// ARRAYS
/*
    Los Arrays son tipos de datos que nos permiten trabajar con agrupaciones de variables u objetos.
    Es una estructura de datos estática (?). Creo que esto quiere decir que los arrays son
    elementos invariables, a los que no se le pueden añadir más elementos o borrar una vez que están
    definidos y no se le pueden agregar más elementos del tamaño que ya tienen definido.

 */
public class _25Arrays {

    public static void main(String[] args) {

        String variable1 = "Nombre 1";
        String variable2 = "Nombre 2";
        String variable3 = "Nombre 3";

        // Dos formas de declarar un Array:

        /*
            De esta primera manera, en la declaración del array se especifíca
            su longitud con un número y luego se va especificando qué variables
            ocuparían el array posición por posición.

            Cuando se declara un array de esta manera, el array se encuentra vacío y habría
            que rellenarlo.
         */

        String[] nombreArray = new String[3];
        nombreArray[0] = variable1;
        nombreArray[1] = variable2;
        nombreArray[2] = variable3;

        /*
            De esta segunda forma, en la propia declaración del array, se incluyen entre corchetes
            las variables que formarán parte del array.
         */

        String[] nombreArray2 = new String[] {variable1, variable2, variable3};



        /*
            Se pueden crear arrays de diferentes tipos de datos:
         */

        int[] nombreArray3 = new int[5]; // Array de números enteros.
        Coche[] nombreArray4 = new Coche[2]; // Array de objetos de la clase Coche.


        /*
            Para imprimir elementos concretos de un array, bastaría con indicar
            la posición del array que queremos imprimir:
         */

        System.out.println(nombreArray[1]);

        /*
            Si lo que queremos es imprimir todos los elementos de un array, lo que
            debemos hacer es un bucle for que itere to-do el array y vaya imprimiendo
            las posiciones del mismo una a una:
         */

        for (int i = 0; i < nombreArray.length; i++) {
            System.out.println(nombreArray[i]);
        }
    }
}
