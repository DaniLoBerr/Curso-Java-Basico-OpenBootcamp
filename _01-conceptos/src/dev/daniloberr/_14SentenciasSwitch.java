package dev.daniloberr;

    // Estructuras de control: Bucle SwitchCase

        /*
            En este caso, las estructuras switch funcionan parecido
            a los if/else if/else.
            Se colocan los breaks para que, una vez se cumpla el caso,
            el bucle deje de ejecutarse y no se realicen las acciones
            de los demás cases.
            Se termina con un default por si no coincide la condición con
            ningún case.
         */

public class _14SentenciasSwitch {

    public static void main(String[] args) {

        String weather = "perro";

        switch (weather) {
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default:
                System.out.println("No se ha podido identificar el clima");
        }
    }
}
