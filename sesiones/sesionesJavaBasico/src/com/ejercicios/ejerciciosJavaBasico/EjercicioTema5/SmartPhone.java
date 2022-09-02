package com.ejercicios.ejerciciosJavaBasico.EjercicioTema5;

public class SmartPhone extends SmartDevice {

    boolean faceID;
    String chip;
    double cameraMP;

    public SmartPhone(){}
    public SmartPhone
            (double weight, String color, int batteryLife, double display, boolean faceID, String chip, double cameraMP) {
        super(weight, color, batteryLife, display);
        this.faceID = faceID;
        this.chip = chip;
        this.cameraMP = cameraMP;
    }
}
