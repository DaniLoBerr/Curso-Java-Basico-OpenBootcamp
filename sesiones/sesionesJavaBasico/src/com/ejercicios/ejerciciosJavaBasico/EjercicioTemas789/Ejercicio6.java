package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

import java.util.ArrayList;

/** Crea un ArrayList de tipo int, y, utilizando un bucle,
 * rellénalo con elementos 1..10. A continuación, con otro bucle,
 * recórrelo y elimina los numeros pares. Por último,
 * vuelve a recorrerlo y muestra el ArrayList final.
 * Si te atreves, puedes hacerlo en menos pasos,
 * siempre y cuando cumplas el primer "for" de relleno. */

public class Ejercicio6 {

    public static void main(String[] args) {

        ArrayList<Integer> listaArray = new ArrayList<>();

        // Añado los números del 1 al 10 en el array
        for (int i = 1; i <=10; i++) {
            listaArray.add(i);
        }

        // Elimino los elementos pares e imprimo el array final sin ellos
        for (int i = 0; i < listaArray.size(); i++) {
            if (listaArray.get(i) % 2 != 0) {
                System.out.println(listaArray.get(i));
            }
        }
    }
}
