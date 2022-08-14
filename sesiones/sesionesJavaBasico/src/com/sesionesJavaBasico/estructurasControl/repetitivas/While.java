package com.sesionesJavaBasico.estructurasControl.repetitivas;

public class While {

    /**
     * Es un bucle indeterminado, puede producirse
     * un bucle infinito.
     */
    public static void main(String[] args) {


        int contador1 = 0;
        while (contador1 < 10) {
            contador1++;
            System.out.println(contador1);
        }

        System.out.println(" ");

        // romper un bucle while
        int contador2 = 0;
        while (contador2 < 10) {
            contador2++;
            if (contador2 > 5) {
                break;
            }
            System.out.println(contador2);
        }

        System.out.println(" ");

        // saltar a la siguiente iteración
        int contador3 = 0;
        while (contador3 < 10) {
            contador3++;
            if (contador3 == 5) {
                continue;
            }
            System.out.println(contador3);
        }
    }
}