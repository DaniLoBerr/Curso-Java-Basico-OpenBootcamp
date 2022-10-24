package com.sesionesJavaBasico.eventos.patronObservador;

import java.util.ArrayList;

interface Mensajero {
    void hanSaludado();
}

class Emisor {
    private ArrayList<Mensajero> receptores = new ArrayList<>();

    public void meteReceptor (Mensajero receptor) {
        receptores.add(receptor);
    }

    public void saluda() {
        System.out.println("Hola!!");

        for (Mensajero ml : receptores) {
            ml.hanSaludado();
        }
    }
}

class Receptor implements Mensajero {
    @Override
    public void hanSaludado() {
        System.out.println("Hola en clase receptor");
    }
}

public class Main {
    public static void main(String []args) {

        Emisor emisor = new Emisor();
        Receptor receptor = new Receptor();
        Receptor receptor2 = new Receptor();
        Receptor receptor3 = new Receptor();
        Receptor receptor4 = new Receptor();

        emisor.meteReceptor(receptor);
        emisor.meteReceptor(receptor2);
        emisor.meteReceptor(receptor3);
        emisor.meteReceptor(receptor4);

        emisor.saluda();
    }
}