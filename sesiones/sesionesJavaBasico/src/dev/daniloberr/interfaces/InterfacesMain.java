package dev.daniloberr.interfaces;

import PaqueteDePrueba.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        /*
            En la clase principal del programa es donde utilizaríamos
            las implementaciones de las interfaces y tal.
         */

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        /*
            Lo que hacemos es instanciar una clase que implemente
            la interface y en este ejemplo también utilizamos
            el polimorfismo pero esta vez sobre interfaces.
         */

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();

        /*
            Y aquí lo que hacemos es utilizar el método de la interface,
            solo que cada implementación ejecuta una orden diferente.
         */
    }
}
