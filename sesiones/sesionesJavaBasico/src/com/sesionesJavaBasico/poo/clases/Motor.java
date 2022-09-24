package com.sesionesJavaBasico.poo.clases;

public class Motor {

    // 1. Atributos
    String modelo; // modelo diferente al de la clase vehículo
    int caballos;
    double parNm;
    int numCilindros;

    // 2. Constructores

    public Motor(){}

    public Motor(String modelo, int caballos, double parNm, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }
    // 3. Métodos
}
