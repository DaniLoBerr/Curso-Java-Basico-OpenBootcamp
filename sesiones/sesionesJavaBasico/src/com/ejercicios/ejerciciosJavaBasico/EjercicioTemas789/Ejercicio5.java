package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

import java.util.ArrayList;
import java.util.LinkedList;

/** Crea un ArrayList de tipo String, con 4 elementos.
 * Cópialo en una LinkedList. Recorre ambos mostrando
 * únicamente el valor de cada elemento. */

public class Ejercicio5 {

    public static void main(String[] args) {

        ArrayList<String> listaArray = new ArrayList<>();

        listaArray.add("Uno");
        listaArray.add("Dos");
        listaArray.add("Tres");
        listaArray.add("Cuatro");

        for(String elementoListaArray : listaArray) {
            System.out.println("Elemento ArrayList: " + elementoListaArray);
        }

        LinkedList<String> listaLinked = new LinkedList<>(listaArray);

        for (String elementoListaLinked : listaLinked) {
            System.out.println("Elemento LinkedList: " + elementoListaLinked);
        }
    }
}
