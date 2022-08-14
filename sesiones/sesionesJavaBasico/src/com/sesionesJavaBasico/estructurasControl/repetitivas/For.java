package com.sesionesJavaBasico.estructurasControl.repetitivas;

public class For {

    /**
     * Nos permite repetir el código tantas veces
     * como queramos e iterar estructuras de datos.
     *
     * Es un bucle determinado, es decir, ya está determinado
     * el número de veces que se va a ejecutar el bucle.
     * @param args
     */

    /**
     * Atajos:
     *
     * Ctrl+F: Sirve para buscar algo concreto en el código.
     * Ctrl+R: Sirve para reemplazar algo del código.
     * @param args
     */

    public static void main(String[] args) {
        
        // Repetir código
        for (int i = 0; i < 10; i++) {
            System.out.println("El número de la variable i es: " + i);
        }

        // iterar array
        String[] nombres = {"Pepe", "Juanito", "Ruperta"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        // sumar elementos de un array
        int suma = 0;
        int[] numeros = {5, 7, 8};
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            // suma += numeros[i];
        }
    }
    /**
     * i = i + 1  ->  i++
     * i = i + 2  ->  i+=2
     */
}
