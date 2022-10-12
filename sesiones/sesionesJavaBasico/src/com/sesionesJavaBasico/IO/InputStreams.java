package com.sesionesJavaBasico.IO;

import java.io.*;

public class InputStreams {

    /**
     *
     *  INPUTSTREAM
     *
     *  Cuando hablamos de Stream hablamos de un flujo de datos
     *  constante. InputStream es una clase abstracta que declara los métodos
     *  para leer este flujo de datos proveniente de una fuente de datos concreta
     *  (como por ejemplo un fichero) y que devuelve todo o parte de esos datos
     *  en forma de bytes.
     *
     *  Por ejemplo, cuando utilizamos un Scanner para pedir datos a un usuario,
     *  el System.in que se utiliza es un Input Stream por debajo.
     *
     */

    public static void main(String[] args) {

        /**
         *
         * FILE INPUT STREAM
         *
         * En este ejemplo vamos a crear un objeto FileInputStream para
         * leer el contenido de un fichero. El constructor de la clase
         * FileInputStream lanza una excepción por si no se puede
         * encontrar el archivo que queremos leer por lo que debemos
         * almacenar la entrada dentro de una estructura try/catch para capturar
         * la posible excepción. Con getMessage podemos mostrar
         * el mensaje de error y con getLocalizedMessage podemos
         * traducirlo al idioma donde nos encontremos.
         *
         * Lo que devuelve el FileInputStream es una secuencia de bytes,
         * por lo que si queremos almacenar el contenido del fichero
         * debemos hacerlo en un array de tipo byte.
         *
         * Existen varios métodos para obtener el contenido de un fichero.
         */

        /**
         * readAllBytes();
         *
         *   Obtiene el contenido completo del fichero. Este
         *   método nos lanza una excepción tipo IO por si se produce algún problema
         *   por lo que esta acción debemos de volver a almacenarla en un try/catch.
         *   El contenido se muestra en forma de bytes (números) por lo que
         *   posteriormente se debe convertir en caracteres.
         *   De esta manera, lo que se hace al leer todos los bytes del fichero es
         *   almacenar todos los datos del fichero en la memoria RAM, por lo que es
         *   factible hacerlo con ficheros pequeños pero no grandes, por lo que
         *   existen otros métodos.
         *   Para mostrar o trabajar con los datos del fichero se debe recorrer
         *   el array de bytes con un bucle for.
         * */

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte[] datosFichero = fichero.readAllBytes();
                for (byte dato : datosFichero) {
                    System.out.print((char)dato);
                };

            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("--");

        /**
         * read();
         *
         *   Este método obtiene el contenido del fichero byte a byte.
         *   También lanza la escepción IO y también se debe convertir el contenido
         *   de bytes a caracteres.
         *   Con este método ocurre que, al leer el contenido de poco en poco, el
         *   proceso es más lento ya que cada vez que se invoca el read y se lee un caracter
         *   se produce una operación de lectura del disco duro.
         *   También ocurre que, al leer el fichero byte a byte, ya nos nos está
         *   devolviendo un array de bytes si no nos está devolviendo números
         *   por separado, por lo que debemos almacenar los datos en un integer.
         *   Para mostrar o trabajar con los datos del fichero se debe utilizar
         *   un bucle while para recorrer los datos hasta que el valor obtenido
         *   de ese fichero sea -1, ya que el valor -1 simboliza el EOF (End Of File)
         *   o final del fichero.
         * */

        try {
            InputStream fichero2 = new FileInputStream("/etc/passwd");

            try {
                int datoFichero2 = fichero2.read();
                while (datoFichero2 != -1) {
                    System.out.print((char)datoFichero2);
                    datoFichero2 = fichero2.read();
                }

            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("--");

        /**
         * leer por tramos
         *
         * Obtiene el contenido del fichero por tramos de bytes. Funciona
         * igual que los otros dos y solventa más o menos los problemas de
         * ambos.
         * Se declara un array de x elementos, es decir, del número de bytes
         * que queremos que ocupe cada tramo y se recorre con el bucle while.
         *
         * */

        try {
            InputStream fichero3 = new FileInputStream("/etc/passwd");

            try {
                byte arrayDatosFichero3[] = new byte[5];
                int tramosFichero3 = fichero3.read(arrayDatosFichero3);
                while (tramosFichero3 != -1) {
                    System.out.print((arrayDatosFichero3.toString()));
                    tramosFichero3 = fichero3.read(arrayDatosFichero3);
                }

            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("--");


        /**
         *
         * BUFFERED INPUT STREAM
         *
         * Es una clase concreta que agrega funcionalidad a otro flujo de entrada, es decir,
         * es también un sistema de lectura de flujo de datos pero que
         * trabaja con otros flujos de entrada en vez de con ficheros directamente. Lo que hace
         * esta clase es crear un buffer, un array de bytes que funciona como una memoria interna
         * que va cargando tramos del flujo de entrada de otro Input Stream y los va reponiendo
         * según se van consumiendo. Esto hace que no haya que almacenar el fichero entero
         * en memoria para leerlo ni ir leyéndolo byte a byte, los datos del fichero se leen
         * directamente del buffer y esto produce una mejora del rendimiento del proceso y
         * de optimización de los recursos.
         *
         */

        try {
            InputStream fichero4 = new FileInputStream("/etc/passwd");
            BufferedInputStream bufferFichero4 = new BufferedInputStream(fichero4);

            try {

                int datosFichero4 = bufferFichero4.read();
                while (datosFichero4 != -1) {
                    System.out.print((char)datosFichero4);
                    datosFichero4 = bufferFichero4.read();
                }

            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
