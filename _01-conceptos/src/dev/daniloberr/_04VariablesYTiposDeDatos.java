package dev.daniloberr;

public class _04VariablesYTiposDeDatos {

    public static void main(String[] args) {

        /*
        Esquema para declarar una variable:

            // Forma 1:
            TipoDeDato Identificador = Dato;

            //Forma 2:
            TipoDeDato Identificador;
            Identificador = Dato;
         */


        //Tipos de datos primitivos:

            // Enteros
            byte number1 = 1;
            short number2 = 2;
            int number3 = 3;
            long number4 = 4; // 4l
            /*
                Diferencias entre los tipos de datos enteros: Su capacidad de almacenamiento.
                    // byte = 1 byte
                    // short = 2 bytes
                    // int = 4 bytes
                    // long = 8 bytes
             */

            // Punto flotante
            float decimal1 = 4.9f;
            double decimal2 = 9.99; // 9.99d
                /*
                Lo idoneo es colocarle al dato una f o una d para indicar si el decimal es un float o un double.
                Si no indicamos nada, el programa entiende por defecto que el dato es un double.

                Capacidad de almacenamiento:
                    // float = 4 bytes
                    // long = 8 bytes
                 */

            // Carácter
            char caracter1 = 'a';

            // Booleanos
            boolean verdadero = true;
            boolean falso = false;

        /*
          Los tipos de datos primitivos tienen varias particularidades:
            // Se definen empezando con letra miníscula.
            // No pueden ser nulos en sí, su valor no puede ser null, no puede ser que no tengan un valor definido.
         */

        // Tipos de dato Clase

            // Cadenas de texto
            String nombre = "Dani";
            String apellido = "Berrocal";

            // Tipos Envoltorio
            Integer numero = null;
            Long numero2 = 2L;
                    /*
                        Los tipos de dato envoltorio funcionan como una clase que nos permite envolver a los datos primitivos y darles un valor nulo.
                     */

        /*
          Los tipos de dato clase son un tipo de dato especial, involucran utilizar una clase.
            // Empiezan por mayúscula.
            // Se les puede dar un valor nulo.
         */
    }
}