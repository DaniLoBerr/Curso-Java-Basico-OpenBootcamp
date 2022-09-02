package com.ejercicios.ejerciciosDiscoDuroDeRoer;

import java.util.Scanner;

public class Ejercicio1 {

    /*
Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
Pediremos que figura queremos calcular su área y, según lo introducido,
pedirá los valores necesarios para calcular el área.
Crea un método por cada figura para calcular cada área, este devolverá un número real.
Muestra el resultado por pantalla

Aquí te mostramos que necesita cada figura:

    Circulo: (radio^2)*PI
    Triangulo: (base * altura) / 2
    Cuadrado: lado * lado

     */

    public static void main(String[] args) {

        Scanner elegirFigura = new Scanner(System.in);
        System.out.println("¿De qué figura desea calcular el área? Seleccione entre círculo, cuadrado o triángulo: ");
        String figuraElegida = elegirFigura.nextLine();

        switch (figuraElegida) {

            case "circulo", "Circulo", "círculo", "Círculo":
                Scanner introducirRadioCirculo = new Scanner(System.in);
                System.out.print("Introduzca el radio del círculo: ");
                double radioCirculo = introducirRadioCirculo.nextDouble();

                double areaCirculo = calcularAreaCirculo(radioCirculo);

                System.out.println("El área del círculo es: " + areaCirculo);
                break;


            case "cuadrado", "Cuadrado":
                Scanner introducirLadoCuadrado = new Scanner(System.in);
                System.out.print("Introduzca el lado del cuadrado: ");
                double ladoCuadrado = introducirLadoCuadrado.nextDouble();

                double areaCuadrado = calcularAreaCuadrado(ladoCuadrado);

                System.out.println("El área del cuadrado es: " + areaCuadrado);
                break;

            case "triangulo", "Triangulo", "triángulo", "Triángulo":
                Scanner introducirBaseTriangulo = new Scanner(System.in);
                System.out.print("Introduzca la base del triángulo: ");
                double baseTriangulo = introducirBaseTriangulo.nextDouble();

                Scanner introducirAlturaTriangulo = new Scanner(System.in);
                System.out.print("Introduzca la altura del triángulo: ");
                double alturaTriangulo = introducirAlturaTriangulo.nextDouble();

                double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);

                System.out.println("El área del triángulo es: " + areaTriangulo);
                break;

            default:
                System.out.println("La figura seleccionada no es una figura válida");
        }

    }

    private static double calcularAreaCirculo(double radioCirculo) {
        double areaCirculo = (Math.pow(radioCirculo, 2))*Math.PI;
        return areaCirculo;
    }

    private static double calcularAreaCuadrado(double ladoCuadrado) {
        double areaCuadrado = ladoCuadrado*ladoCuadrado;
        return areaCuadrado;
    }

    private static double calcularAreaTriangulo(double baseTriangulo, double alturaTriangulo) {
        double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
        return areaTriangulo;
    }
}
