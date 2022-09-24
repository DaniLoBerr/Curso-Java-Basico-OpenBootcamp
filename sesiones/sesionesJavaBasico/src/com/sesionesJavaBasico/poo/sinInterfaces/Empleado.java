package com.sesionesJavaBasico.poo.sinInterfaces;

public class Empleado {

    // 1. Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    // 2. Constructores
    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    // 3.Métodos
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
    /*
        El método toString es un método heredado de la clase
        Object (por eso lo de Override)
     */
}
