package com.sesionesJavaBasico.estructurasControl.repetitivas;

public class ForEach {

    public static void main(String[] args) {

        // iterar array
        String[] nombres = {"Pepe", "Juanito", "Ruperta"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // sumar elementos de un array
        int[] numeros = {5, 10, 15};
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println(suma);
    }
}
