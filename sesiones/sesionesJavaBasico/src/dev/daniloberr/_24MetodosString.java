package dev.daniloberr;

// MÉTODOS DE LA CLASE STRING
/*
    En este tema veremos diferentes métodos que se
    le pueden aplicar a elementos de la clase String
 */

/*
    length()
    startsWith("")
    indexOf("")
    subString(1,5)
    trim()
    equals()
    compareTo
 */

public class _24MetodosString {

    /*
        Puntualizar que cuando se aplica uno de estos métodos
        a una cadena de texto de una variable, no se modifica
        el valor de la variable original, si no que nos
        devuelve un nuevo valor. Si quisieramos trabajar
        con este nuevo valor, deberíamos guardarlo en una
        nueva variable.
     */

    public static void main(String[] args) {
        // length
        /*
            Calcula el número de caracteres que forman la
            cadena de texto.
         */
        String mensajeLength = "Hola mundo";
        System.out.println(mensajeLength.length());


        // toUpperCase
        /*
            Convierte los caracteres de la cadena de texto
            todos a mayúscula.
         */
        String mensajetoUpperCase = "Hola mundo";
        System.out.println(mensajetoUpperCase.toUpperCase());


        // trim

        /*
            Elimina los espacios que pueda haber sobrantes
            al principio y al final de una cadena de texto.
         */
        String mensajeTrim = "   Hola mundo   ";
        System.out.println(mensajeTrim.trim());


        // equals
        /*
            Compara una cadena de texto con otra. Para que
            sean iguales deben coincidir en to-do (mayúsculas,
            espacios, etc).
         */
        String mensajeEquals = "hola mundo";
        if (mensajeEquals.equals(mensajeLength)) {
            System.out.println("Las variables son iguales");
        } else {
            System.out.println("Las variables no son iguales");
        }


        // equalsIgnoreCase
        /*
            Compara una cadena de texto con otra ignorando que
            estén sus caracteres en mayúscula o minúscula.
         */
        if (mensajeEquals.equalsIgnoreCase(mensajeLength)) {
            System.out.println("Las variables son iguales");
        } else {
            System.out.println("Las variables no son iguales");
        }
    }


}