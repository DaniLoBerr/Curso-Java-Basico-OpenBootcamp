package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

/** Indica cuál es el problema de utilizar un Vector con la capacidad
 * por defecto si tuviésemos 1000 elementos para ser añadidos al mismo. */

public class Ejercicio4 {

    /*
        Lo que ocurre con los vectores que tienen una capacidad por defecto
        es que si le añadimos más elementos de los que puede albergar esta
        se duplica y, durante el proceso, lo que hace es crear un nuevo
        array del doble de tamaño del array del vector original, por lo que
        en un momento tendríamos cargados en memoria los dos arrays del vector.
        Esto no es un gran problema con vectores de poca capacidad, pero, si tenemos
        que añadir 1000 elementos a la vez, habría un momento en el que nuestro
        vector tendría una capacidad de 3000 elementos y podríamos saturar la
        memoria.
     */
}
