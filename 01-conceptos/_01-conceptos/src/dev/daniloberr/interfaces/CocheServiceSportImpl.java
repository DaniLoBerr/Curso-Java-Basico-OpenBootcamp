package dev.daniloberr.interfaces;

import PaqueteDePrueba.Coche;
import PaqueteDePrueba.CocheElectrico;
import PaqueteDePrueba.CocheHibrido;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

}
