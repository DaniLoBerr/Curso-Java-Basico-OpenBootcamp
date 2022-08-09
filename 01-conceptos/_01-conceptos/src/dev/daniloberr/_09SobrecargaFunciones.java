package dev.daniloberr;

/*
    La sobrecarga de funciones es un término que hace referencia a
    un conjunto de funciones que comparten el mismo identificador
    pero que demandan parámetros de diferente tipo de dato o un diferente
     número de un mismo tipo de dato.
 */

/*
    Signatura de una función = Modificadores + Identificador + Argumentos
 */

/*
    Atajo Ctrl + click. Si hacemos Ctrl+click encima de una invocación de
    una función, nos lleva directamente a la función en sí.
 */

public class _09SobrecargaFunciones {

    public static void main(String[] args) {
        funcion();
        funcion(2);
        funcion(5, "Euros");

    }

    public static void funcion() {
        System.out.println("Sin parámetros");
    }

    public static void funcion (int a) {
        System.out.println("Con parámetro " + a);
    }

    public static void funcion (int a, String b) {
        System.out.println("Con parámetro " + a + " " + b);
    }

    /*
        Es habitual utilizar la sobrecarga de funciones en la función
        constructor, una función especial que nos permite crear objetos a través
        de una clase. Esto viene de la POO que se verá más adelante.
     */

}
