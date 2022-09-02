package dev.daniloberr;

public class _07FuncionesYParametros {

    /*
        Las funciones son agrupaciones de sentencias de código que
        nos permiten reutilizarlas sin tener que volver a escribirlas (reutilizar código).

        Funciones = Métodos

        Métodos cuando hablamos de funciones relacionadas con objetos.
     */

    public static void main(String[] args) {

        // Funciones invocadas
        imprimirHolaMundo();
        imprimirNombreDado("Dani"); // Argumentos

        String apellidoDevuelto = imprimirApellidoDevuelto();
        System.out.println(apellidoDevuelto);
        /*
            En este caso almacenamos la información que nos devuelve la función en una variable
            para poder imprimirla.
         */

    }

    // Función declarada. Cuerpo de la función
    public static void imprimirHolaMundo() {

        System.out.println("Hola Mundo");

        /*

            Public = Modificador visibilidad. En este caso, se puede utilizar esta función fuera de la clase
            a la que pertenece, desde otra clase de este archivo o desde otro.

            Static = Modificador pertenencia. Esta función pertenece a esta clase y puede ser invocada sin tener
            que crear un objeto de la clase _07FuncionesYParametros para ello.

            Void = Modificador retorno. En este caso, esta función no devuelve ningún tipo de dato.

            Identificador = Nombre de la función.
         */
    }

    public static void imprimirNombreDado(String name) { // Parámetros

        /*
            String name = Parámetros que requiere la función para ejecutarse. Parámetros = Argumentos,
            Los parámetros son los datos que recibe la función y los argumentos son esos mismos datos que
            se envían a la función cuando se la invoca.
         */

        System.out.println(name);

    }

    private static String imprimirApellidoDevuelto() {

        /*
            Private = Modificador visibilidad. En este caso, no se puede utilizar esta función fuera de la clase
            a la que pertenece.

            El Modificador String en esta función nos obliga a devolver una cadena de texto.
         */

        return "Berrocal";

    }
}
