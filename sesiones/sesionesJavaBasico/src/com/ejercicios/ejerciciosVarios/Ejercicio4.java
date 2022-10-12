package com.ejercicios.ejerciciosVarios;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    Una línea de autobuses cobra un mínimo de 20 euros por persona y trayecto. Si el trayecto es
mayor de 200 km el billete tiene un recargo de 3 céntimos por km adicional. Sin embargo, para
trayectos de más de 400 km el billete tiene un descuento del 15 %. Por otro lado, para grupos de 3
o más personas el billete tiene un descuento del 10 %. Con las consideraciones anteriores, escriba
en Java un programa estructurado que lea por teclado la distancia del viaje a realizar, así como el
número de personas que viajan juntas. Con ello se debe calcular tanto el precio del billete
individual como el total a pagar si viaja más de una persona.
     */

    public static void main(String[] args) {

        System.out.println("Destinos disponibles: \n - Bilbao \n - Santander \n - Madrid");

        Scanner introduceDestino = new Scanner(System.in);
        System.out.println("Seleccione uno de los trayectos disponibles: ");
        String destinoSeleccionado = introduceDestino.nextLine();

        Scanner introduceViajeros = new Scanner(System.in);
        System.out.println("Seleccione el número de viajeros: ");
        int viajerosSeleccionados = introduceViajeros.nextInt();

        double precioViaje = 20;
        double santander = 149.22;
        double bilbao = 222.27;
        double madrid = 466.20;

        final double DISTANCIA_ADICIONAL = 200;
        final double RECARGO_KM_ADICIONAL = 0.03;
        final double DESCUENTO_TRAYECTO_400KM = 0.15;
        final int MINIMO_PERSONAS_NUMEROSAS = 3;
        final double DESCUENTO_PERSONAS_3 = 0.1;

        if (destinoSeleccionado.equals("Madrid") || destinoSeleccionado.equals("madrid")) {
                    double kmAdicional = (madrid - DISTANCIA_ADICIONAL) * RECARGO_KM_ADICIONAL;
                    double descuento400Km = kmAdicional * DESCUENTO_TRAYECTO_400KM;
                    double precioBilleteMadrid = precioViaje + kmAdicional + descuento400Km;
                    if (viajerosSeleccionados >= MINIMO_PERSONAS_NUMEROSAS) {
                        precioBilleteMadrid -= viajerosSeleccionados * (precioBilleteMadrid * DESCUENTO_PERSONAS_3);
                    }
            System.out.println("El precio a pagar es de: " + precioBilleteMadrid);

        } else if (destinoSeleccionado.equals("Bilbao") || destinoSeleccionado.equals("bilbao")) {
            double kmAdicional = (bilbao - DISTANCIA_ADICIONAL) * RECARGO_KM_ADICIONAL;
            double precioBilleteBilbao = precioViaje + kmAdicional;
            if (viajerosSeleccionados >= MINIMO_PERSONAS_NUMEROSAS) {
                precioBilleteBilbao -= viajerosSeleccionados * (precioBilleteBilbao * DESCUENTO_PERSONAS_3);
            }
            System.out.println("El precio a pagar es de: " + precioBilleteBilbao);

        } else if (destinoSeleccionado.equals("Santander") || destinoSeleccionado.equals("santander")) {
            double precioBilleteSantander = precioViaje;
            if (viajerosSeleccionados >= MINIMO_PERSONAS_NUMEROSAS) {
                precioBilleteSantander -= viajerosSeleccionados * (precioBilleteSantander * DESCUENTO_PERSONAS_3);
            }
            System.out.println("El precio a pagar es de: " + precioBilleteSantander);

        } else {
            System.out.println("Debe seleccionar un destino válido");
        }
    }
}