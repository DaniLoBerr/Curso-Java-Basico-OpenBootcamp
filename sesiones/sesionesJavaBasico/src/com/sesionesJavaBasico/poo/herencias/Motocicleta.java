package com.sesionesJavaBasico.poo.herencias;

import com.sesionesJavaBasico.poo.clases.Motor;
import com.sesionesJavaBasico.poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta() {
    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
