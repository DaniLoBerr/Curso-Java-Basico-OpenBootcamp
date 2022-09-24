package com.sesionesJavaBasico.poo.conInterfaces;

import com.sesionesJavaBasico.poo.sinInterfaces.Empleado;

public class Main {

    /**
     * En este ejemplo veremos la misma aplicación con interfaces.
     *
     * Lo que conseguiremos será crear un intermediario entre la clase
     * principal del programa y las diferentes clases (implementaciones) de la misma
     * para que estas tengan que seguir obligatoriamente unas normas definidas
     * en la interface y que así el código principal del programa no se vea
     * afectado por los diferentes cambios que puedan realizarse en sus
     * implementaciones.
     *
     * Se pueden implementar varias interfaces en una misma clase.
     */

    static EmpleadoCRUD empleadoCRUD; /* Aquí lo que estamos haciendo es declarar
    una atributo del tipo de la interface EmpleadoCRUD sin inicializar, a través del
    cual se pueden crear objetos de las diferentes clases que implementen la
    interface. Y ahí reside la ventaja: si en el ejemplo sin interfaces teníamos
    que cambiar tanto en el código por hacer un cambio de implementación,
    aquí simplemente creando un objeto de una de las implementaciones ya no tendríamos
    que cambiar nada de la clase principal ni de nada.

    Se pone static porque se va a utilizar en el método main que es estático.*/

    public static void main(String[] args) {

        empleadoCRUD = new EmpleadoCRUDMySQL();
        empleadoCRUD.save(new Empleado());

        empleadoCRUD = new EmpleadoCRUDExcel();
        empleadoCRUD.findAll();
    }
}
