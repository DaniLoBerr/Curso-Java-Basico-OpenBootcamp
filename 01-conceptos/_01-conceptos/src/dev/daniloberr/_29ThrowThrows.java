package dev.daniloberr;

// Mecanismos de gestión de excepciones: Throw y Throws
/*
    Sirven para lanzar nosotros mismos
    nuestras propias excepciones cuando
    queremos que nuestro programa lance un
    error.

    Vamos a ver un ejemplo de esto:
 */

import java.util.Scanner;
import PaqueteDePrueba.NameFormatException;

public class _29ThrowThrows {

    public static void main(String[] args) {

        /* En nuestro método main
         invocamos una función y le
         hacemos un try catch
        para capturar nuestra
         una excepción creada.*/
        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }

/**
 * Método que lee nombres de consola y verifica que tengan
 * longitud igual o mayor que 8 caracteres
 * @throws NameFormatException
 */
    /* En este método, si no se cumple la condición,
    este lanza una excepción creada por nosotros (que se
    encuentra en el PaqueteDePruebas).

    Y así es la sintaxis: Se utiliza la palabra throws en la
    signatura, es decir, se incluye la palabra throws en la
    función que lanzará la excepción, y luego se crea un objeto
    de la clase de la excepción creada, utilizando
    la palabra throw para lanzar la excepción.
     */
    private static void leerNombres() throws NameFormatException {

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un nombre: ");
        while (teclado.hasNext()) {
            System.out.println ("Introduce un nombre: ");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException("El nombre debe" +
                        "contener como mínimo 8 caracteres");
            }
        }
        teclado.close();
    }

    /*
        Desde un método principal se puede hacer un try-catch
        que envuelva varias llamadas a métodos más pequeños,
        los cuales lancen cada uno una excepción y que todas vayan
        a parar al catch del método grande.
     */
}