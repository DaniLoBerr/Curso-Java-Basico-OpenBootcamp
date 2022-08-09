package dev.daniloberr;

// Sentencias de control condicionales: If y Else

public class _10SentenciasIfElse {

    public static void main(String[] args) {

        boolean check = 5 < 10;
        System.out.println(check);

        int number1 = 50;
        int number2 = 20;
        int number3 = 30;

        if (number1 < number2 && number2 < number3) {
            System.out.println("Verdadero");
        } else if (number1 < number3) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }
}
/*
    Utilizando el Debugger se ve perfectamente el flujo de ejecución
    del programa.
 */