package com.sesionesJavaBasico.estructurasControl.condicionales;

public class IfElse {

    /**
     * If/else se utiliza para saber si algo es verdadero para realizar una operación y,
     * si no lo es, hacer otra operación.
     * @param args
     */
    public static void main(String[] args) {

        int edad = 17;
        boolean esMayor = edad >= 18;

        if(esMayor/*esto sería equivalente a poner: if(esMayor==true)*/) {
            // Si true, entra aquí
            System.out.println("Es mayor de edad");
        } else {
            //Si false, entre aquí
            System.out.println("No es mayor de edad");
        }

        /**
         * OPERADOR TERNARIO
         *
         * Es otra forma de escribir la estructura de If/Else:
         *
         * System.out.println(esMayor ? "Es mayor de edad" : "Es menor de edad");
         */
    }
}
