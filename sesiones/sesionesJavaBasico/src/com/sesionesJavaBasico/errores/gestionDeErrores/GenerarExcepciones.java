package com.sesionesJavaBasico.errores.gestionDeErrores;

import java.io.IOException;

public class GenerarExcepciones {

    /**
     *
     * GESTIÓN DE ERRORES: Generar excepciones con Throw y Throws
     *
     * Esta forma de manejar los errores se utiliza cuando en
     * una parte de nuestro código se genera una excepción pero queremos
     * manejarla en otra parte del código.
     *
     * Por ejemplo, tenemos una función que realiza una serie de operaciones
     * las cuales podrían lanzar una excepción pero queremos manejarla en la
     * parte del programa donde se utilice esa función.
     *
     *  -throws: Con throws declaramos en la función que esta
     *  puede lanzar excepciones. Se pueden declarar varios
     *  tipos de excepciones a la vez. Cuando se invoque a
     *  esta función, es obligatorio meter esta invocación
     *  en un try/catch para gestionar las posibles excepciones
     *  recibidas
     *
     *  -throw: Se utiliza en la parte del código donde se produce la excepción y
     *  lo que hace es crear un objeto con la excepción
     *  que se produzca para lanzarlo donde se vaya a gestionar
     *  el fallo.
     *
     *
     */

    public static void main(String[] args) {

        try {
            division(4, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int division(int a, int b) throws ArithmeticException, IOException {

        int resultadoDivision;

        try {
            resultadoDivision = a / b;
        } catch (ArithmeticException e) {
            throw new IOException("Los datos introducidos no son válidos");
        }

        return resultadoDivision;
    }
}
