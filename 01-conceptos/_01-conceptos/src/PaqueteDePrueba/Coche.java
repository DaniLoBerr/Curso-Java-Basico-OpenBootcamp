package PaqueteDePrueba;

public abstract class Coche {

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double longitud;
    Integer velocidad = 0;

    public Coche () {

    }

    public Coche (String color, String fabricante, String modelo, Double peso, Double longitud) {

        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.longitud = longitud;

    }

    public void acelerar(Integer cantidad) {

        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "_15Clases{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", longitud=" + longitud +
                ", velocidad=" + velocidad +
                '}';
    }
}