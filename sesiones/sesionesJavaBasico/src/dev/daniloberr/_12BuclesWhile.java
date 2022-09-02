package dev.daniloberr;

    // Estructuras de control: Bucles While

public class _12BuclesWhile {

    public static void main(String[] args) {

        /*
            Este bucle es habitual utilizarlo por ejemplo llamando a una función
            que nos retorne un valor booleano y según sea la respuesta se ejecute
            el bucle while o no.
            También es común el uso de contadores.
         */

        int count = 0;
        while (count < 10) {
            System.out.println(count + " Hola mundo");
            count++; // condición
        }
        System.out.println("fin");

        /*
            Si no colocamos una condición que pueda romper el bucle en
            algún momento, el bucle se iteraría de manera infinita.
         */
    }
}
