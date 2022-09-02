package dev.daniloberr;

// MAPAS
/*
    Son estructuras de datos
     similaares a las listas
    solo que los mapas operan con pares
    de clave-valor.

    Funcionan como interfaces, al igual
    que las listas, y se declaran de la misma manera
    solo que indicando por separado
    el tipo de dato que tendrán las claves
    y el tipo de dato que tendrán los valores
    (pueden ser String-int, int-Obj, etc).

    Existen diferentes implementaciones de la interface
    mapa, la más utilizada es el HashMap.
 */

import java.util.HashMap;
import java.util.Map;

public class _27Maps {

    public static void main(String[] args) {

        Map<String, String> nombreMapa = new HashMap<>();

        /* Con el método put añadiríamos datos
        al mapa*/
        nombreMapa.put("clave", "valor");
        /* En el elemento clave se suelen utilizar
        valores únicos, indetificativos, como un dni,
        un email, etc. En el ejemplo que vamos a ver
         a continuación, la clave será el dni
         y los valores serán las personas asociadas a él*/
        nombreMapa.put("12345678L", "Pepito Pérez");
        nombreMapa.put("12345678O", "Pepita López");
        System.out.println(nombreMapa);

        // Iterar sobre el mapa
        /* Iterar sobre las claves */
        for (String variableClaves: nombreMapa.keySet()) {
            System.out.println(variableClaves);
        }

        /* Iterar valores */
        for (String variableValores: nombreMapa.values()) {
            System.out.println(variableValores);
        }

        /* Iterar los pares */
        /* Para ello, debemos importar el método Entry del paquete java.util */
        for (Map.Entry<String, String> variablePares: nombreMapa.entrySet()) {
            System.out.println(variablePares.getKey() + " - " + variablePares.getValue());
        }

    }
}
