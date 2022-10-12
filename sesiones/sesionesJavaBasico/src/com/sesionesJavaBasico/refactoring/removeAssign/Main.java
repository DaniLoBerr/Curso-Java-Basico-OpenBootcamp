package com.sesionesJavaBasico.refactoring.removeAssign;

public class Main {

    /**
     * ELIMINAR ASIGNACIONES
     *
     * Consiste en no modificar el valor de los parámetros
     * que recibe un método, ya que esto podría crear efectos
     * indeseados en la aplicación.
     *
     * Esto nos lleva a la definición de las funciones
     * puras e impuras:
     *  -Una función pura es aquella que no modifica el valor
     *  de los parámetros que recibe. Para ello se puede guardar
     *  el valor de los parámetros en nuevas variables y trabajar
     *  con estas.
     *  -Una función impura trabaja directamente con los valores
     *  de los parámetros que recibe y los modifica.
     *
     *  PROGRAMACIÓN DEFENSIVA
     *
     *  Consiste en programar el código de un programa pensando
     *  en comprobar que los parámetros que nos puedan entregar
     *  se ajusten a lo que se pide y que estén bien.
     */
}
