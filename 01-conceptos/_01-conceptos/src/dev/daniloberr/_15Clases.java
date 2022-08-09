package dev.daniloberr;

    // Crear clases en Java

        /*
            Esta clase se llama _15Clases por seguir
            la nomenclatura de los apuntes del curso
            pero imaginemos que es una clase que se llama COCHE
         */
public class _15Clases { // Clase Coche

    /*
        Comenzamos a explicar cómo funciona el paradigma de la
        Programación Orientada a Objetos, y es que en este paradigma
        las Clases son una parte fundamental, funcionan como los moldes
        de los objetos, a partir de los cuales estos se crean.

        En este ejemplo, la clase se llama Coche y es el molde de diferentes
        tipos de coches con diferentes características:
     */

            // Atributos. Variables que actúan como características de la clase Coche
            String color;
            String fabricante;
            String modelo;
            Double peso;
            Double longitud;
            Integer velocidad = 0;

            // Constructores. Métodos que crean objetos a partir de esta clase.

            /*
                Si no se añade un constructor, por defecto se crea un constructor vacío que permitirá
                crear coches sin asignar valores a los atributos.

                A continuación crearemos un constructor que le asigne unos valores a dichos atributos.
             */

            public _15Clases(String color, String fabricante, String modelo, Double peso, Double longitud) {

                /*
                    Los métodos constructores se caracterizan porque su nombre empieza por mayúscula
                    y es el mismo que su clase.
                 */

                this.color = color;
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.peso = peso;
                this.longitud = longitud;
                /*
                    Así se asignan los valores que recibe el constructor como parámetros
                    a los atributos de la clase.
                    Son parámetros que se obtienen desde fuera de la clase y con el constructor
                    se asginan a los objetos que se creen a partir de esta clase.
                 */
            }

            // Comportamientos. Métodos o acciones que puede realizar esta clase.

            public void acelerar(Integer cantidad) {

                if (cantidad > 0 && cantidad <= 120) {
                    this.velocidad += cantidad;
                }
            }

            /*
                Método toString(); Se suele generar un método toString que lo que hace es
                 devolver el valor de los atributos del objeto.
                 CLick derecho + generate. Lo veremos más adelante.
            */

            @Override
            public String toString() {
                return "_15Clases{" +
                        "color='" + color + '\'' +
                        ", fabricante='" + fabricante + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", peso=" + peso +
                        ", longitud=" + longitud +
                        ", velocidad=" + velocidad +
                        '}';
            }
        }

/*
    Esta sería la estructura habitual de una clase: Primero los atributos, luego los constructores y
    después los métodos.
 */


