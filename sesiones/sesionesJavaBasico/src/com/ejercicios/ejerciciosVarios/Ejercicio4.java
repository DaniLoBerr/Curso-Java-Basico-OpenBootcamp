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

        if (destinoSeleccionado.equals("Madrid") || destinoSeleccionado.equals("madrid")) {
                    double kmAdicional = (madrid-200)*0.03;
                    double descuento400Km = kmAdicional * 0.15;
                    double precioBilleteMadrid = precioViaje + kmAdicional + descuento400Km;
                    if (viajerosSeleccionados >= 3) {
                        precioBilleteMadrid -= viajerosSeleccionados * (precioBilleteMadrid*0.1);
                    }
            System.out.println("El precio a pagar es de: " + precioBilleteMadrid);

        } else if (destinoSeleccionado.equals("Bilbao") || destinoSeleccionado.equals("bilbao")) {
            double kmAdicional = (bilbao-200)*0.03;
            double precioBilleteBilbao = precioViaje + kmAdicional;
            if (viajerosSeleccionados >= 3) {
                precioBilleteBilbao -= viajerosSeleccionados * (precioBilleteBilbao*0.1);
            }
            System.out.println("El precio a pagar es de: " + precioBilleteBilbao);

        } else if (destinoSeleccionado.equals("Santander") || destinoSeleccionado.equals("santander")) {
            double precioBilleteSantander = precioViaje;
            if (viajerosSeleccionados >= 3) {
                precioBilleteSantander -= viajerosSeleccionados * (precioBilleteSantander*0.1);
            }
            System.out.println("El precio a pagar es de: " + precioBilleteSantander);

        } else {
            System.out.println("Debe seleccionar un destino válido");
        }
    }
}