package com.sesionesJavaBasico.errores.gestionDeErrores;

import java.util.Scanner;

public class CapturarExcepciones {

    /**
     *
     * GESTIÓN DE ERRORES: Capturar excepciones con Try / Catch
     *
     *  Para manejar los errores en tiempo de ejecución que se puedan llegar a producir
     *  y que no detengan la ejecución del programa existe la estructura try/catch:
     *
     *      -try: Entre las llaves del try se mete el código que nos da el error o
     *      que prevemos que nos lo puede dar.
     *
     *      -catch: En el catch se atrapa la excepción y se codifica lo que queramos
     *      que haga el programa si se produce el error. Entre paréntesis, se crea una variable
     *      del tipo de clase Exception para almacenar cualquier tipo de error que se produzca
     *      o creamos una variable del tipo de la clase del error específico que prevemos que
     *      se va a producir. Cada clase tiene sus métodos con los que podemos trabajar con el error.
     *      A la variable se le llama "e" por convención.
     *
     *      -finally: Existe una parte más en esta estructura llamada finally la cual realizará
     *      siempre las acciones que incluyamos dentro de ella y que sirve para realizar
     *      ciertas acciones que hayan podido quedar inconclusas por el fallo producido
     *      por el código del try, lo que se llama cerrar recursos, como por ejemplo
     *      posibles conexiones como bases de datos, resetear variables, etc.
     *      Se considera buena práctica no utilizar el finally y gestionar los
     *      cierres de recursos dentro del propio bloque de catch.
     *
     */

    public static void main(String[] args) {

        try {

            Scanner numerosPorTeclado = new Scanner(System.in);
            System.out.println("Introduce dos números enteros: ");
            int numeroA = numerosPorTeclado.nextInt();
            int numeroB = numerosPorTeclado.nextInt();

            int resultado = numeroA / numeroB;
            System.out.println(numeroA + " dividivo entre " + numeroB + " es: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("No se puede realizar la operación con los caracteres proporcionados");

        } catch (Exception e) {

            System.out.println("La excepción que ha saltado es del tipo: " + e.getClass());

        } finally {

            System.out.println("Cierre de recursos");

        }

    }
}
