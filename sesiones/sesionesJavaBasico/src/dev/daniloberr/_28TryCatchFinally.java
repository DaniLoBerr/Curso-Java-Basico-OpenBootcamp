package dev.daniloberr;

// Mecanismos de gestión de excepciones: Try, Catch, Finally
/*
    Son elementos que se utilizan cuando tenemos un código
    que creemos que nos puede dar un error y crear una
    excepción y queremos capturar dicha excepción de
    dicho error y hacer que el programa continue ejecutándose
     sin romperse, saltándose esa parte en la ejecución.
 */

public class _28TryCatchFinally {

    public static void main(String[] args) {

        /* Vamos a ver un ejemplo en el que vamos
         * a provocar un error.
         * En este caso, 5 entre 0 nos da error, nos
         * muestra una excepción aritmética. Pues
         * con esa excepción, vamos a usar el Try Catch Finally*/
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
        }
        /*
        -Try: Entre las llaves del try es donde incluimos
        el código que creemos que nos puede dar problemas.

        -Catch: Entre los paréntesis del catch se captura
         la excepción que corresponda.
         En este caso sabemos que será una excepción
         aritmética pero si no lo supieramos se pone el
         elemento genérico que sería "Exception".
         las llaves del catch es donde escribimos
        el código que queremos que se ejecute si se produce
        el fallo. En este caso, que se imprima el error.

        -Finally: Con el finally lo que se suele hacer
        es lo que se llama "Cerrar el recurso", es decir,
         dejar to-do como estaba al comienzo.
         Lo que hay entre las llaves del finally
         siempre se ejecuta,
         haya ido bien o mal el código del try.
         */

        System.out.println("Fin del programa");
    }
}
