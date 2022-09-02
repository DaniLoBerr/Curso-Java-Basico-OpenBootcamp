package com.sesionesJavaBasico.poo.clases;

public class Vehiculo {

    // ESTRUCTURA DE UNA CLASE

    // 1.Atributos

    String fabricante;
    String modelo;
    double cc;
    int year;
    boolean sport;
    int speed;


    // 2. Constructores

    public Vehiculo(){}

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;

    }

    // 3. Métodos (comportamiento)

    public void acelerar(int quantity){
        this.speed += quantity;
    }
}
