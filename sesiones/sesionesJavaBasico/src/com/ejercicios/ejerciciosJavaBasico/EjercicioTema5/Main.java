package com.ejercicios.ejerciciosJavaBasico.EjercicioTema5;

public class Main {

    /*
    En este ejercicio tendréis que crear una clase SmartDevice.
    Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    Crear constructor vacío y con todos los parámetros para cada clase.
    Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
     */

    public static void main(String[] args) {

        SmartDevice dispositivoInteligente = new SmartDevice(20.7, "white", 8, 5.7);

        SmartPhone movilInteligente = new SmartPhone(18.4, "pink", 6, 6.3, true, "A15", 27.5);

        SmartWatch relojInteligente = new SmartWatch(9.6, "black", 17, 2.8, "yellow", true, false);

        System.out.println(dispositivoInteligente + "\n" + movilInteligente + "\n" + relojInteligente);
    }
}
