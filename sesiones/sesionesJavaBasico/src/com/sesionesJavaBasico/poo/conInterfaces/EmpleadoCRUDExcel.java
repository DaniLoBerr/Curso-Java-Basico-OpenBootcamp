package com.sesionesJavaBasico.poo.conInterfaces;

import com.sesionesJavaBasico.poo.sinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDExcel implements EmpleadoCRUD, EmpleadoExporter {

    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
