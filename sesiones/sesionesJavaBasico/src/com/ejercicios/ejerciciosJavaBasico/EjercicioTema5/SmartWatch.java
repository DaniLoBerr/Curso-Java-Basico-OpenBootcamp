package com.ejercicios.ejerciciosJavaBasico.EjercicioTema5;

public class SmartWatch extends SmartDevice {

    String colorBand;
    boolean submersible;
    boolean ecgApp;

    public SmartWatch() {
        super();
    }
    public SmartWatch
            (double weight, String color, int batteryLife, double display, String colorBand, boolean submersible, boolean ecgApp) {
        super(weight, color, batteryLife, display);
        this.colorBand = colorBand;
        this.submersible = submersible;
        this.ecgApp = ecgApp;
    }

    @Override
    public String toString() {
        return "SmartWatch: {" +
                "colorBand='" + colorBand + '\'' +
                ", submersible=" + submersible +
                ", ecgApp=" + ecgApp +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", batteryLife=" + batteryLife +
                ", display=" + display +
                '}';
    }
}
