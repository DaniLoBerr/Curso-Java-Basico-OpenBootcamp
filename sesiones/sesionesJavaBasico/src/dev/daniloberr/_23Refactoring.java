package dev.daniloberr;

/*
    El refactoring o refactorización de código consiste en adaptar un código para
    hacerlo más legible y poder manejarlo mejor con el tiempo.

    El IDE incorpora la opción de refactoring.

    Vamos a ver ciertas técnicas de refactoring para mejorar la calidad
    del código. Para ello también es muy importante la buena nomenclatura
    de variables, métodos, clases, etc, y utilizar funciones puras que no
    módifiquen los datos de entrada y que no tengan efectos secundarios, es decir,
    que puedan ser ejecutas y que siempre devuelvan el mismo resultado.

    Existen un montón de técnicas de refactoring pero vamos a ver las
    principales:
 */

public class _23Refactoring {

    // TÉCNICAS DE REFACTORING

        // Condición consolidada
        /*
            Consiste en que cuando tenemos un grupo de condiciones que
            está quedando muy largo y que está siendo difícil de leer y de
            mantener, se puede desglosar en una función, es decir, crear un
            método que realice las comprobaciones y luego que la estructura condicional
            solo tenga que invocar ese método. Además es una buena práctica que
            ese método tenga un nombre preciso sobre lo que está comprobando.
         */

        // Duplicado consolidado
        /*
            Consiste en no repetir código en bucles if-else por ejemplo, si tenemos
            dos líneas iguales en un if y en un else, es una buena práctica sacarla fuera
            de la condición.
         */

        // Extraer clase
        /*
            Consiste en que cuando estamos trabajando con una clase que
            poco a poco va creciendo y se le van añadiendo variables,
            podría llegar un punto en el que se podrían agrupar ciertas variables
            de esa clase mayor y crear otra clase más pequeña con ellas.
         */

        // Extraer método
        /*
            Consiste en convertir cierta parte de un código en un método.
         */

        // Extraer variable
        /*
            Si tenemos una variable en la que se realizan por ejemplo una
            serie de operaciones, estas pueden ser difíciles de leer o
            que la variable quede un poco larga, por lo que se pueden
            almacenar estas operaciones en diferentes variables, bien nombradas
            para que se sepa que es lo que hacen, y dejar el código más
            limpio y legible, haciéndolo de manera ordenada y separada, haciendo
            las operaciones de una en una.
         */

}
