package com.sesionesJavaBasico.tiposDatosComplejos;

import java.util.Vector;

public class Vectores {

    /**
     *  VECTORES
     *
     * Los vectores son un tipo de dato similar a los Arrays
     * que también se utilizan para almacenar elementos de
     * un mismo tipo pero con la diferencia de que los vectores
     * aumentan automáticamente su tamaño cuando lo sobre-
     * cargarmos, además de que la clase Vector nos proporciona
     * métodos adicionales como añadir o elimiar elementos.
     * También se le pueden denominar Arrays Dinámicos pero
     * se le llaman vectores porque se accede a ellos a través
     * del "tipo de dato" de la clase Vector, y realmente,
     * cuando se crea un vector, lo que ocurre por
     * debajo es que se crea un array de una capacidad determinada.
     *
     * Si no se le indica nada, tiene una capacidad inicial de
     * 10 elementos, la cual aumenta el doble del array original según se va
     * excediendo. Pero se le puede indicar en el constructor
     * la capacidad inicial que queremos que tenga y la capacidad
     * de incremento cada vez que esta se supere.
     * Es importante medir bien la capacidad que preveemos que vamos
     * a necesitar porque cuando incurrimos en overflow y el vector
     * incrementa su capacidad, lo que está ocurriendo por debajo es
     * que el array subyacente sobre el que se están almacenando los datos
     * se duplica, es decir, si tenemos un vector de 1M de elementos con
     * una capacidad de incremento de 500mil y lo sobrepasamos,
     * por debajo lo que ocurre es que se crea otro array de 1,5M en el que
     * se copian los elementos del array del vector original,
     * por lo que en ese momento tendremos 2 arrays de una
     * capacidad total de 2,5M y estaremos consumiendo muchos
     * recursos de la computadora. Para reducir el tamaño del
     * vector utilizando el método trimToSize que veremos aquí,
     * sucede lo mismo.
     *
     * Por último, los vectores implementan la interface List (al igual
     * que los ArrayList o los LinkedList) pero de un modo sincronizado,
     * es decir, se pueden usar en entornos concurrentes, que a su vez
     * quiere decir que se pueden usar en varios procesos que se ejecutan
     * al mismo tiempo y hacen uso posiblemente de los mismos recursos
     * Es recomendable utilizar este tipo de elementos para la
     * programación concurrente y utilizar los ArrayList para
     * la programación secuencial.
     */

    public static void main(String[] args) {

        Vector<Integer> vector1 = new Vector<>(8, 3);

        /** Añadir elementos en un vector */
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);

        /** Eliminar elementos de un vector */
        vector1.remove(1);

        /** Añadir elementos en una posición concreta de un vector */
        vector1.insertElementAt(5, 1);

        /** Comprobar los elementos, el tamaño y la capacidad de un vector */
        System.out.println("El vector 1 está formado por: " + vector1 +
                ". Tiene un tamaño de " + vector1.size() +
                " y una capcidad de " + vector1.capacity());

        /** Recorrer un vector */
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println("Posición: " + i + ". Valor " + vector1.get(i));
        }

        /** Comparar vectores */
        Vector<String> vector2 = new Vector<>();
        vector2.add("Holi");
        boolean resultadoComparacion = vector1.equals(vector2);
        System.out.println("Son el vector 1 y el vector 2 iguales? " + resultadoComparacion);

        /** Reducir el tamaño del vector y adecuarlo a su contenido */
        vector1.trimToSize();
        System.out.println("El vector 1 está formado por: " + vector1 +
                ". Tiene un tamaño de " + vector1.size() +
                " y una capcidad de " + vector1.capacity());


    }

}
