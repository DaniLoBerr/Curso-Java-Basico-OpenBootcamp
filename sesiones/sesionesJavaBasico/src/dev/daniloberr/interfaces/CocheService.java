package dev.daniloberr.interfaces;

import PaqueteDePrueba.Coche;

public interface CocheService {

    /*
        En este ejemplo crearemos un método que cada vez que se
        invoque cree un objeto de la clase Coche.
     */

    public Coche crearCocheDemo();
    /* En las interfaces no se declara el cuerpo de la función,
    solo su signatura.

        Se indica en la signatura el tipo de dato que se devuelve.
        En este caso, se devuelve un objeto de la clase Coche. Pero
        podría devolverse otra cosa o no devolverse nada.
     */
}