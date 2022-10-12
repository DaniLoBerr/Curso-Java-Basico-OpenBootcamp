package com.sesionesJavaBasico.tiposDatosComplejos;

public class Strings {

    /**
     *  TIPO DE DATO STRING
     *
     * Al ser un tipo de dato de clase, los Strings tienen una serie de
     * métodos y propiedades. Vamos a ver algunos de los métodos del
     * tipo de dato String.
     */

    public static void main(String[] args) {

        String cadenaTexto = "Mensaje de Texto";
        System.out.println("La cadena de texto para este ejemplo es: \n " + cadenaTexto);

        /** Método length */
        // Calcula el número de caracteres que mide la cadena de texto.
        int longitudCadenaTexto = cadenaTexto.length();
        System.out.println("Método length: \n La longitud de mi cadena es de " + longitudCadenaTexto);

        /** Método toUpperCase*/
        // Convierte todos los caracteres de la cadena en mayúsculas
        String cadenaMayus = cadenaTexto.toUpperCase();
        System.out.println("Método toUpperCase: \n " + cadenaMayus);

        /** Método toLowerCase*/
        // Convierte todos los caracteres de la cadena en minúsculas
        String cadenaMinus = cadenaTexto.toLowerCase();
        System.out.println("Método toLowerCase: \n " + cadenaMinus);

        /** Método startsWith */
        // Comprueba si la cadena comienza por los caracteres indicados (es case sensitive).
        boolean cadenaEmpiezaPor = cadenaTexto.startsWith("Men");
        System.out.println("Método startsWith: \n ¿La cadena de texto empierza por 'Men'? " + cadenaEmpiezaPor);

        /** Método endsWith */
        // Comprueba si la cadena finaliza con los caracteres indicados (es case sensitive).
        boolean cadenaTerminaCon = cadenaTexto.endsWith("e");
        System.out.println("Método endsWith: \n ¿La cadena de texto termina cor 'e'? " + cadenaTerminaCon);

        /** Método charAt */
        // Muestra el caracter que se encuentra en la posición que le indicamos
        char tercerCaracterCadena = cadenaTexto.charAt(2);
        System.out.println("Método charAt: \n El tercer caracter de la cadena de texto es: " + tercerCaracterCadena);

        /** Recorrer una cadena de texto */
        System.out.println("Recorrer una cadena de texto: ");
        for (int i = 0; i < cadenaTexto.length(); i++) {
            System.out.println(" Recorriendo la cadena de texto: " + cadenaTexto.charAt(i));
        }

        /** Invertir una cadena de texto */
        System.out.println("Invertir una cadena de texto: ");
        String cadenaTextoInvvertida = "";
        for (int i = cadenaTexto.length() - 1; i >= 0; i--) {
            cadenaTextoInvvertida += cadenaTexto.charAt(i);
        }
        System.out.println(" " + cadenaTextoInvvertida);

    }
}
