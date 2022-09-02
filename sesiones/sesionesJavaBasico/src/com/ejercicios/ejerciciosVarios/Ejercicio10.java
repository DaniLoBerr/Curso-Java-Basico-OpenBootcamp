package com.ejercicios.ejerciciosVarios;

public class Ejercicio10 {

    /*
        The snail climbs up 7 feet each day and slips back 2 feet each night.
How many days will it take the snail to get out of a well with the given depth? depth 32 feet
     */
    public static void main(String[] args) {

        int depth = 42;
        int distanceTraveled = 7-2;
        int days = 1;

        while (distanceTraveled < depth) {
            days++;
            distanceTraveled += 7-2;
        }

        System.out.println(days);
    }
}
