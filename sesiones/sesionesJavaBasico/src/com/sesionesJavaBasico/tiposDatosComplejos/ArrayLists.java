package com.sesionesJavaBasico.tiposDatosComplejos;

import java.util.ArrayList;

public class ArrayLists {

    /**
     *  ARRAYS LIST
     *
     *  Son un tipo de dato que implementa la interface List
     *  en formato de Array dinámico. Son elementos muy parecidos
     *  a los vectores con las diferencias de que
     *  en los ArrayList cuando se sobrepasa su tamaño
     *  aumentan su capacidad la mitad del tamaño original
     *  y que la clase ArrayList no es sincronizada
     *  por lo que si hay varios procesos concurrentes sobre un objeto
     *  de este tipo y en dos de ellos se modifica la estructura del
     *  objeto se pueden producir errores.
     *
     *  Es recomendable utilizar este tipo de elementos para la
     *  programación secuencial y utilizar los vectores para
     *  la programación concurrente.
     *
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayLista1 = new ArrayList<>();

        /** Añadir elementos en un ArrayList */
        arrayLista1.add(1);
        arrayLista1.add(2);
        arrayLista1.add(3);

        /** Eliminar elementos de un ArrayList */
        arrayLista1.remove(1);

        /** Recorrer un ArrayList */
        for (int elementoLista : arrayLista1) {
            System.out.println(" Elemento de la lista: " + elementoLista);
        }

        for (int i = 0; i < arrayLista1.size(); i++) {
            System.out.println("Posición: " + i + ". Valor " + arrayLista1.get(i));
        }

        /** Convertir un ArrayList en un Array */
        // Forma 1
        int array[] = new int[arrayLista1.size()];
        for (int i = 0; i < arrayLista1.size(); i++) {
            array[i] = arrayLista1.get(i);
        }
        for (int elemento : array) {
            System.out.println("Elemento array: " + elemento);
        }

        // Forma 2
        for (Object arrayObjeto : arrayLista1.toArray()) {
            System.out.println(arrayObjeto.toString());
        }

        /** Comparar ArrayLists */
        ArrayList<String> arrayLista2 = new ArrayList<>();
        arrayLista2.add("Holi");
        boolean resultadoComparacion = arrayLista1.equals(arrayLista2);
        System.out.println("Son el Array List 1 y el Array List 2 iguales? " + resultadoComparacion);

        /** Reducir el tamaño del ArrayList y adecuarlo a su contenido */
        arrayLista1.trimToSize();
        System.out.println("El ArrayList 1 está formado por: " + arrayLista1 +
                ". Tiene un tamaño de " + arrayLista1.size());
    }
}
