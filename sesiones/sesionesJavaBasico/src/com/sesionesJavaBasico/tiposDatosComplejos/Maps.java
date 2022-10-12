package com.sesionesJavaBasico.tiposDatosComplejos;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    /**
     *
     * MAPAS
     *
     *  También conocidos como Arrays asociativos, son
     *  elemtos formados por claves y valores.
     *  El mapa más típico es el HashMap, que lo que implementa
     *  es una tabla Hash, rápida a la hora de insertar y eliminar
     *  elementos. Otro mapa tamibién típico es el TreeMap, que
     *  implementa otra estructura de datos denominada Árbol Binario
     *  Rojo-Negro, rápido a la hora de realizar búsquedas.
     *
     *  En un mismo mapa no puede haber claves repetidas. En
     *  caso de añadir un valor diferente a una misma clave,
     *  este se sobreescribe.
     */

    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();

        /** Añadir elementos en un HashMap */
        mapa.put("Clave 1", 10);
        mapa.put("Clave 2", 20);
        mapa.put("Clave 3", 30);
        mapa.put("Clave 3", 40); // Ejemplo sobreescritura
        System.out.println(mapa);

        /** Eliminar elementos de un HasgMap */
        mapa.remove("Clave 3");
        System.out.println(mapa);

        /** Imprimir claves específicas de un HashMap */
        System.out.println(mapa.get("Clave 1"));
        // Esta segunda forma es cosa mía
        int clave1 = mapa.get("Clave 1");
        System.out.println(clave1);

        /** Reemplazar elementos de un HashMap */
        // Forma 1
        /* De esta manera, si no existe la clave, se crea */
        mapa.put("Clave 1", 100);
        System.out.println(mapa);

        // Forma 2
        /* De esta forma, si no existe la clave, no hace nada */
        mapa.replace("Clave 2", 200);
        System.out.println(mapa);

        /** Recorrer un HashMap entero: claves y valores */
        for (Map.Entry<String, Integer> elementoMapa : mapa.entrySet()) {
            System.out.println("Clave: " + elementoMapa.getKey());
            System.out.println("Valor: " + elementoMapa.getValue());
            System.out.println("Set de elementos: " + elementoMapa);
        }
    }
}
