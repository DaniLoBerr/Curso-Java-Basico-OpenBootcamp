package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;


import java.util.Vector;

/** Crea un "Vector" del tipo de dato que prefieras,
 * y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final. */

public class Ejercicio3 {

    public static void main(String[] args) {

        Vector<Double> vector = new Vector<>();
        vector.add(1.1);
        vector.add(2.1);
        vector.add(3.1);
        vector.add(4.1);
        vector.add(5.1);

        System.out.println("El vector original es: " + vector);

        vector.remove(1);
        vector.remove(1);

        System.out.println("El vector final es: " + vector);
    }

}
