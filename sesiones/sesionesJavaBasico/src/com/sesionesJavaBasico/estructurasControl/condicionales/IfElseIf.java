package com.sesionesJavaBasico.estructurasControl.condicionales;

public class IfElseIf {

    /**
     * If-Else-If se utiliza para evaluar más de una
     * expresión, evaluar diferentes casos cuando tenemos
     * muchas condiciones.
     *
     * En el momento en que se cumpla una de las condiciones,
     * ya no se evalua rl resto.
     *
     * @param args
     */
    public static void main(String[] args) {

        String dia = "Sábado";
        boolean resultado1 = dia.equals("Martes");
        boolean resultado2 = dia=="Martes";

        /**
         * Estas dos manneras de comparar el contenido
         * de dos variables son válidas, pero:
         *
         * == es un operador y compara referencias. Se utiliza más
         * para números.
         *
         * equals es un método y compara el contenido. Se utiliza más
         * para cadenas de texto.
         */

        if (dia.equals("Lunes")) {
            System.out.println("Ánimo con la semana pin");
        } else if (dia.equals("Martes")) {
            System.out.println("Ya queda menos");
        } else if (dia.equals("Miércoles")) {
            System.out.println("AAAAAahhhhaAah");
        } else if (dia.equals("Jueves")) {
            System.out.println("Ya casi lo puedes tocar!");
        } else if (dia.equals("Viernes")) {
            System.out.println("Vamosssssssss");
        } else if (dia.equals("Sábado")) {
            System.out.println("Yeeeeeeeeeeeeeeeeeee");
        } else if (dia.equals("Domingo")) {
            System.out.println("Resacón");
        } else {
            System.out.println("El día introducido no es un día válido");
        }

        /* Es importante en estos casos en los que se solicitan
        * datos a un cliente preparar un caso "default" como
        * el del último else en el que no se haya cumplido ninguna
        * de las condiciones porque el dato se haya escrito
        * mal o lo que sea */
    }
}
