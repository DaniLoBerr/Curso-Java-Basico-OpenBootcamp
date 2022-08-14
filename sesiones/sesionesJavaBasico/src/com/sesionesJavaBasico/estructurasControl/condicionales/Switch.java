package com.sesionesJavaBasico.estructurasControl.condicionales;

public class Switch {

    /**
     * Estructura muy parecida al If-Else-If.
     *
     * Se debe escribir la palabra "break" después de cada condición
     * porque si no se ejecutarían todas aunque se cumpliera la primera condición.
     *
     * Con la palabra "default" preparamos el último caso en caso de que
     * no se cumpla ninguna de las anteriores condiciones.
     * @param args
     */
    public static void main(String[] args) {

        String dia = "Domingo";

        switch (dia) {
            case "Lunes":
                System.out.println("Ánimo pin");
                break;
            case "Martes":
                System.out.println("Venga");
                break;
            case "Miércoles":
                System.out.println("My dudes");
                break;
            case "Jueves":
                System.out.println("Ya casi");
                break;
            case "Viernes":
                System.out.println("Daleeeee");
                break;
            case "Sábado":
                System.out.println("VAMOOOS");
                break;
            case "Domingo":
                System.out.println("Ye lo que hay");
                break;
            default:
                System.out.println("El día introducido no es un día válido");
        }
    }
}
