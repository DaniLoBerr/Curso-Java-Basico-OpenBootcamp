package com.ejerciciosJavaBasico;

public class EjercicioSesion3 {

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

        String[] nombres = {"Juan Carlos", "Lucas", "Alejandro"};
        String sumaDeNombres = "";
        for (String nombre : nombres) {
            sumaDeNombres += " ni " + nombre;
        }
        System.out.println("Hoy no vendrán a la fiesta" + sumaDeNombres);
    }
}
