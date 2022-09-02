package com.ejercicios.ejerciciosVarios;

public class Ejercicio2 {

    /*
Crea un programa que dibuje por pantalla si un estudiante ha aprobado o no la asignatura de matemáticas.
Tienes que usar las siguientes variables:

    notaExamen: de tipo double y que representa el 60% de la nota final.
    notaTrabajoGrupo: de tipo double y que representa el 40% de la nota final.
    ratioAsistencia: tipo Boolean que indica si el estudiante cumple con el mínimo de asistencia requerido.

Los valores de estas variables estarán hardcodeados.
Puedes usar otras variables si lo estimas oportuno.
Las condiciones para aprobar la asignatura son 2:

    Conseguir una media de las dos notas, igual o superior a 5, considerando los pesos de ambas notas.
    Cumplir con el ratio mínimo de asistencia requerido.

     */

    public static void main(String[] args) {

        System.out.println(Alumno1());
        System.out.println(Alumno2());
        System.out.println(Alumno3());

    }

    private static String Alumno1(){

        double notaExamen = 6.77;
        double notaTrabajoGrupo = 8.88;
        boolean ratioAsistencia = true;

        boolean notaFinal = (notaExamen * 0.6) + (notaTrabajoGrupo * 0.4) >= 5;

        if (notaFinal && ratioAsistencia) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

    private static String Alumno2(){

        double notaExamen = 3.77;
        double notaTrabajoGrupo = 2.88;
        boolean ratioAsistencia = true;

        boolean notaFinal = (notaExamen * 0.6) + (notaTrabajoGrupo * 0.4) == 5;

        if (notaFinal && ratioAsistencia) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

    private static String Alumno3(){

        double notaExamen = 6.77;
        double notaTrabajoGrupo = 8.88;
        boolean ratioAsistencia = false;

        boolean notaFinal = (notaExamen * 0.6) + (notaTrabajoGrupo * 0.4) == 5;

        if (notaFinal && ratioAsistencia) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

}
