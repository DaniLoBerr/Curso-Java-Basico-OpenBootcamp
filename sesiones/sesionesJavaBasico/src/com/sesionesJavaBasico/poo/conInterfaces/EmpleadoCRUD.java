package com.sesionesJavaBasico.poo.conInterfaces;

import com.sesionesJavaBasico.poo.sinInterfaces.Empleado;

import java.util.List;

/**
 * Los métodos solo se declaran, no se implementan.
 *
 * La interface actua como un contrato, dice lo que hay que hacer pero no dónde ni cómo.
 */

public interface EmpleadoCRUD {

    void save (Empleado empleado);

    List<Empleado> findAll();

    void delete (Empleado empleado);
}
