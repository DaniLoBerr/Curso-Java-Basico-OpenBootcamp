package com.sesionesJavaBasico.IO;

import java.io.*;

public class PrintStreams {

    /**
     *
     * PRINTSTREAM
     *
     * Es la clase de Java que sirve para generar datos a partir de algo e
     * imprimirlos por pantalla, escribirlos en un fichero, etc.
     *
     *  Por ejemplo, cuando utilizamos el System.out.print típico para imprimir
     *  algo por pantalla, el out que se utiliza es un PrintStream por debajo.
     */

    /**
     *
     * Una buena práctica cuando se trabaja con ficheros es cerrarlos después
     * de usarlos porque los sistemas operativos tienen lo que se llama
     * "file descriptors" y son finitos. Cada vez que abrimos un fichero,
     * el sistema operativo abre un f de un file descriptor y si el sistema operativo
     * se queda sin ellos, no puede abrir más ficheros.
     */

    /*
        La herramienta "diff" en UNIX compara ficheros, si no devuelve
        resultado es que los ficheros son idénticos.
     */

    public static void main(String[] args) {

        /** Crear un fichero e introducir datos en él */
        try {
            PrintStream documento = new PrintStream("documento.txt");
            documento.println("Agregando datos en el documento.");
            documento.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }

        /** Copiando datos de un fichero a otro */
        try {
            InputStream ficheroOrigen = new FileInputStream("/etc/passwd/");
            BufferedInputStream bufferFicheroOrigen = new BufferedInputStream(ficheroOrigen);
            byte[] datosFicheroOrigen = bufferFicheroOrigen.readAllBytes();
            ficheroOrigen.close();
            try {
                PrintStream ficheroDestino = new PrintStream("documento2.txt");
                ficheroDestino.write(datosFicheroOrigen);
                ficheroDestino.close();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }



    }
}
