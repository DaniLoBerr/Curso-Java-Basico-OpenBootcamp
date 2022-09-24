package com.ejercicios.ejerciciosJavaBasico.EjercicioTema6;

public class Main {

    /*
    Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl()
     */

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        System.out.println(cocheCRUD.save());
        System.out.println(cocheCRUD.findAll());
        System.out.println(cocheCRUD.delete());

    }
}
