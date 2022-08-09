package dev.daniloberr;

import PaqueteDePrueba.Coche;
import PaqueteDePrueba.CocheElectrico;
import PaqueteDePrueba.CocheHibrido;


// Polimorfismo

/*
    Otro mecanismo más de la POO. Es un concepto que se puede aplicar en objetos provenientes
    de diferentes clases pero las cuales heredan de una misma superclase.

    Cuando creamos un objeto a partir de una clase específica estamos concretando que queremos un objeto de ese tipo
    pero si queremos abstraernos del tipo de coche en este caso y queremos tratar al objeto como un
    coche en general, podemos utilizar el polimorfismo.

    En el ejemplo de abajo, digamos que tenemos múltiples formas de diferentes tipos de coches
    pero queremos tratarlas a todas por igual. Pues se cambia el tipo de dato de la clase específica
    a la suerclase.
 */


public class _20Polimorfismo {

    public static void main(String[] args) {

        // Ejemplos de objetos creados a partir de una clase específica

        // Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        // Ejemplos de objetos creados de su superclase (Polimorfismo)

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        /*
            Para saber de qué clase específica proviene un objeto, se puede utilizar la palabra
            reservada "instanceof":
         */

        if (coche4 instanceof Coche) {
            System.out.println("coche4 proviene de Coche");
        }

        if (coche4 instanceof CocheHibrido) {
            System.out.println("coche4 proviene de CocheHibrido");
        }

        if (coche4 instanceof CocheElectrico) {
            System.out.println("coche4 proviene de CocheElectrico");
        }

        /*
            Con este ejemplo vemos que el objeto coche4 proviene de la clase Coche y también
            de la Clase CocheElectrico, es decir, de su clase específica y de la superclase de
            esta.
         */
    }
}
