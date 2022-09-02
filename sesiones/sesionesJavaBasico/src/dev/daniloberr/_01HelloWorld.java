// Esta clase pertenece a este paquete.
package dev.daniloberr;

public class _01HelloWorld {

    // Atajo de teclado: "main"
    public static void main(String[] args) {

        // Atajo de teclado: "sout"
        System.out.println("Hola mundo desde clase HelloWorld");
    }

    /*
        En Java todo son clases.
        Cada elemento de una clase o un método es un modificador.
        El modificador public de la clase indica su visibilidad, en este caso permite que la clase sea accesible desde fuera, que se puedan crear objetos de esta clase.
        El método main de la clase principal sirve de punto de entrada principal a una aplicación de java. Desde ahí se realiza la programación de lo que queramos.
        El modificador public del método main indica que va a poder ser ejecutado fuera de la clase.
        El modificador static del método quiere decir que pertenece a la clase en la que se encuentra, en este caso la principal. No sería necesario crear un objeto.
        El modificador void del método se refiere al tipo de retorno de datos. En este caso, no devuelve ningún tipo de dato.
        main indica el nombre del método, en este caso main se refiere a que es el método principal de la clase. Normalmente solo se tiene un método main en todos los proyectos de Java, pero se pueden crear más clases con más métodos main.
        El (String[] args) es un array de argumentos, indica que esta aplicación puede recibir datos por la entrada estándar.
    */

}