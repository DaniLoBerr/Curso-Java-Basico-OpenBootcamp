package dev.daniloberr.interfaces;

import PaqueteDePrueba.Coche;
import PaqueteDePrueba.CocheHibrido;


/*
    Aquí vemos un método de la interface CocheService implementado.
    Nos aparece lo de Override porque estamos sobreescribiendo el
    método desde la interface.
    Tenemos que devolver un dato, en este caso un objeto de la clase
    Coche.
 */
public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico");
        return new CocheHibrido();
    }
}
