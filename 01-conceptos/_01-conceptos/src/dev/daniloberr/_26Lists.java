package dev.daniloberr;

// Lists

/*
    Las listas son otro tipo de datos parecidos a los arrays pero en este caso
    nos permiten agregar elementos
    dinámicamente y también borrarlos. A diferencia de los arrays,
    a las listas se le pueden añadir el número de
    elementos que se quiera ya no que se define el tamaño al principio.

    Los elementos List son interfaces que nos ofrecen una serie de métodos como size(),
    empty(), contains(), toArray(), add(), remove()... propias de la interface;
     y, al ser una interface, para utilizar el elemento List debemos
      implementar alguno de estos métodos.

    En este caso, vamos a ver la implementación más utilizada de la interface List,
     que son los ArrayLists.
 */

import PaqueteDePrueba.Coche;
import PaqueteDePrueba.CocheElectrico;
import PaqueteDePrueba.CocheHibrido;

import java.util.ArrayList;
import java.util.List; /* La interface List proviene de este paquete,
fijarse que estamos utilizando este paquete en concreto */


public class _26Lists {

    public static void main(String[] args) {

        /* A continuación vemos como se crea una lista:
        Se especifica el tipo de dato de los elementos
        que van a formar parte de la lista (deben ser todos
        del mismo tipo de dato), se le da el nombre
        a la lista y se implementa el tipo de lista*/
        List<String> nombreLista = new ArrayList<>(); // Lista dinámica de Strings
        /*
        Ahora le añadimos elementos a esta lista vacía
        que acabamos de crear.
        Se le pueden aplicar diferentes métodos, de esta manera, a las listas
        */
        nombreLista.add("Nombre 1");
        nombreLista.add("Nombre 2");
        nombreLista.add("Nombre 3");
        nombreLista.add("Nombre 4");

        /* A diferencia de los arrays, se puede imprimir
        la lista directamente poniendo el nombre de la lista */
        System.out.println(nombreLista);

        /* También se puede imprimir iterando y en los arrayList
        es interesante utilizar el bucle foreach. Así
        e define un bucle foreach:
        - A la izquierda de los dos puntos se crea una variable temporal
        la cual solo existe dentro del bucle y en la que se va guardadndo cada elemento
        en cada iteración de la estructura de datos que se esté iterando. Se especifica
        el tipo de dato.
        - A la derecha se escribe en nombre de la estructura de datos que queremos iterar.
         */
        for (String nombreForEach : nombreLista) {
            System.out.println(nombreForEach);
        }



        /*
            Se puede trabajar con lista de diferentes tipos de datos,
            como por ejemplo con listas de objetos:
         */
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new CocheElectrico("motor1"));
        listaCoches.add(new CocheElectrico("motor2"));

        /*
            Ahora, si queremos imprimir la lista y la clase de los objetos de
            la lista no tiene un método toString, lo que nos imprimirá es
            la referencia en memoria a esos objetos. Si lo que queremos
            es que imprima el contenido de los objetos, habría que generar
            el método toString en la clase de estos.
         */
        System.out.println(listaCoches);

        /*
            También se puede utilizar el bucle foreach:
         */
        for (Coche cocheForEach: listaCoches) {
            System.out.println(listaCoches);
        }
    }
}
