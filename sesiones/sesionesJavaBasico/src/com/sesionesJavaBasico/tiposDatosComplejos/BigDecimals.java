package com.sesionesJavaBasico.tiposDatosComplejos;

import java.math.BigDecimal;

public class BigDecimals {

    /**
     *
     * BIG DECIMAL
     *
     * En la computación en general ocurre que se
     * producen errores cuando se trabajan con números muy
     * grandes o con gran cantidad de decimales, en resumen
     * con números para los que se requiera de una alta precisión.
     * No es recomendable, por ejemplo, trabajar con datos
     * financieros utilizando variables tipo float o
     * double debido a que estos implementan la aritmética de
     * coma flotante de los estándares y esto le da problemas
     * a los procesadores.
     *
     * Para ello, en Java tenemos la clase BigDecimal. Para operar
     * valores utilizando esta clase, se debe instanciar la misma y
     * crear un objeto para cada valor pasándole el mismo como parámetro.
     * Después se opera con los métodos de la clase.
     */

    public static void main(String[] args) {

        BigDecimal valorA = new BigDecimal(0.1);
        BigDecimal valorB = new BigDecimal(10);
        BigDecimal valorC = valorA.add(valorB);

        System.out.println(valorC);



    }
}
