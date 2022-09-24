package com.sesionesJavaBasico.poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDv1 {

    /*
        En esta clase creamos los métodos que nos permitan
        realizar las acciones CRUD en la base de datos.
     */

    /**
     * C - Create
     * R - Retrieve/Read
     * U - Update
     * D - Delete
     */

    // Estructura de datos
    /* Aquí creamos una lista para las operaciones que realicemos con los objetos del tipo Empleado.

       Un Array List es una interface en sí misma. Lo que pasa cuando se implementa un Array List es
       que nos permite crear objetos de la clase ArrayList, de tipo List, con la que
       podemos utilizar sus diversos métodos.
     */
    private List<Empleado> listaEmpleados = new ArrayList<>();


    // Operaciones CRUD
    // Create - guardar un empleado
    public void save(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    // Retrieve/Read - ver empleados
    public List<Empleado> findAll () {
        return listaEmpleados;
    }
}
