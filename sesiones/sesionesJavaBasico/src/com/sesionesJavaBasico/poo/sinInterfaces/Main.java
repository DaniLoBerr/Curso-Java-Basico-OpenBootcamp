package com.sesionesJavaBasico.poo.sinInterfaces;

import java.util.List;

public class Main {

    /**
     * INTERFACES
     *
     *  Una interface es una especie de intermediaria que funciona como una especie
     *  de contrato en el cual se declaran diferentes especificaciones y comportamientos
     *  que tienen que desarrollar obligatoriamente las clases que quieran implementar
     *  dicha interface. Es un mecanismo muy útil para abstraer y desacoplar el código,
     *  es decir, hacer que partes del código de una aplicación no sean tan dependientes
     *  de otras partes del mismo y poder trabajar con ellas por separado sin que la
     *  aplicación se vea alterada.
     *
     *  ATAJO Ctrl+D: Se duplica una línea de código.
     *
     *  Los que haremos en este ejemplo es simular una aplicación que nos permita realizar
     *  operaciones CRUD en una base de datos sin utilizar interfaces. Veremos que según va
     *  aumentando el tamaño de la aplicación y su complejidad, al no utilizar interfaces,
     *  realizar cambios en la aplicación se vuelve muy complicado y engorroso.
     *
     *  En este ejemplo, nosotros tenemos una implementación de las operaciones CRUD para almacenar
     *  los datos en un Array List y cuando alguien realiza una nueva implementación porque quiere
     *  almacenar los datos en una base de datos, al no haber interfaces, se requiere hacer muchos
     *  cambios en la clase principal del programa, además de que cada persona hace su propia versión
     *  de la implementación sin seguir ninguna norma.
     *
     *  En otro paquete, veremos este mismo ejemplo con interfaces para observar la diferencia.
     *
     */

    public static void main(String[] args) {

        EmpleadoCRUDv1 empleadoCRUD = new EmpleadoCRUDv1();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        // guardar empleados
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(roberto);

        // consultar empleados
        List<Empleado> listaEmpleados = empleadoCRUD.findAll();
        System.out.println(listaEmpleados);


    }
}
