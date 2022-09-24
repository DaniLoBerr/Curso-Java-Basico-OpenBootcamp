package com.ejercicios.ejerciciosJavaBasico.EjercicioTema5;

public class SmartPhone extends SmartDevice {

    boolean faceID;
    String chip;
    double cameraMP;

    public SmartPhone(){
        super();
    }
    public SmartPhone
            (double weight, String color, int batteryLife, double display, boolean faceID, String chip, double cameraMP) {
        super(weight, color, batteryLife, display);
        this.faceID = faceID;
        this.chip = chip;
        this.cameraMP = cameraMP;
    }

    @Override
    public String toString() {
        return "SmartPhone: {" +
                "faceID=" + faceID +
                ", chip='" + chip + '\'' +
                ", cameraMP=" + cameraMP +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", batteryLife=" + batteryLife +
                ", display=" + display +
                '}';
    }
}
