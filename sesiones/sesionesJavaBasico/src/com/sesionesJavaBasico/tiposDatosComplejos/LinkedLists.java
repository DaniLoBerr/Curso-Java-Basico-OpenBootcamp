package com.sesionesJavaBasico.tiposDatosComplejos;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {

    /**
     *  LINKED LIST
     *
     *
     *  Muy parecido también a los ArrayList y a los
     *  Vectores, todos ellos implementan la interface
     *  List y comparten los métodos de esta.
     *
     *  La diferencia con Los Vectores y los ArrayLists
     *  es que las LinkedLists implementan listas
     *  doblemente enlazadas en vez de arrays.
     *  Las listas doblemente enlazadas son estructuras
     *  un poco más complejas que hacen que los procesos
     *  de inserción y eliminación sean más rápidos.
     *  Para buscar información en una lista lo más
     *  rápido es el ArrayList.
     *
     *  La clase LinkedList, además de la interface List,
     *  implementa la interface Deque, de forma que se
     *  puede utilizar una LinkedList para implementar colas.
     *  Las colas son listas en las que se introducen datos
     *  por un sitio y salen por otro. Existen dos tipos de colas:
     *  en las Fifo lo primero que entra es lo primero que sale
     *  y las Lifo lo último que entra es lo primero que sale.
     *
     */

    public static void main(String[] args) {

        LinkedList<Integer> listaEnlazada = new LinkedList<>();

        /** Añadir elementos en una LinkedList */
        listaEnlazada.add(1);
        listaEnlazada.add(2);
        listaEnlazada.add(3);

        /** Eliminar elementos de una LinkedList */
        listaEnlazada.remove(1);

        /** Recorrer una LinkedList */
        for (int elementoLista : listaEnlazada) {
            System.out.println(" Elemento de la lista: " + elementoLista);
        }

        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.println("Posición: " + i + ". Valor " + listaEnlazada.get(i));
        }

        /** Crear una LinkedLIst a partir un ArrayList */
        ArrayList<Integer> arrayLista = new ArrayList<>();
        arrayLista.add(24);
        arrayLista.add(35);

        LinkedList<Integer> arrayListaLInked = new LinkedList<>(arrayLista);
        System.out.println(arrayListaLInked);

        /** Comparar ArrayLists */


        /** Reducir el tamaño del ArrayList y adecuarlo a su contenido */

    }
}