package com.ejercicios.ejerciciosJavaBasico;

public class EjercicioTema4 {

    /**
     * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
     *
     * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
     *
     * String[] nombres = {"", "", "", ""}
     *
     * @param args
     */

    public static void main(String[] args) {

        // Mi manera
        String[] nombres = {"Juan Carlos", "Lucas", "Alejandro"};
        String sumaDeNombres = "";
        for (String nombre : nombres) {
            sumaDeNombres += " ni " + nombre;
        }
        System.out.println("Hoy no vendrán a la fiesta" + sumaDeNombres);

        // La manera del ejercicio corregido
        String[] texto = new String[]{"Texto 1", "Texto 2", "Texto 3"};
        for(int i = 0; i < texto.length; i++) {
            System.out.print(texto[i]);
        }
    }
}
