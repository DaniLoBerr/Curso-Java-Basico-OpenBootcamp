package com.sesionesJavaBasico.poo.clases;

public class Vehiculo {

    // ESTRUCTURA DE UNA CLASE

    // 1.Atributos

    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;


    // 2. Constructores

    public Vehiculo(){}

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    // 3. Métodos (comportamiento)

    public void acelerar(int quantity){
        this.speed += quantity;
    }

    // getter y setter

    //toString
}
