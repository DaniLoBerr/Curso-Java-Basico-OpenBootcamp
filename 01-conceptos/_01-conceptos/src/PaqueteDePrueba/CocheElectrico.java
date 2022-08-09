package PaqueteDePrueba;

public class CocheElectrico extends Coche {

    String motorElectrico;
    // Nuevo atributo característico de esta clase que se suma a los heredados de la superclase.

    public CocheElectrico() {
    }
    // Constructor de objetos de la nueva clase.

    public CocheElectrico(String motorElectrico) { // Sobrecarga de constructores
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double longitud, String motorElectrico) {
        /* Le asignamos al constructor todos los parámetros del constructor de la clase
        superior + el parámetro nuevo de esta clase.
         */
        super(color, fabricante, modelo, peso, longitud);
        /*
            Método super. Se invoca un constructor de la superclase para heredar sus atributos.
            Asignamos a través de él los parámetros recibidos a los de la clase base.
            Sería lo mismo que poner:

                this.color = color;
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.peso = peso;
                this.longitud = longitud;
         */
        this.motorElectrico = motorElectrico;
        // Asignamos el atributo de esta clase a este constructor.
    }

    @Override
    public String toString() { // Método toString con las propiedades de la superclase y de la clase
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", longitud=" + longitud +
                ", velocidad=" + velocidad +
                '}';
    }

    // Sobre Sobreescritura de métodos

    /*
        Vamos a sobreescribir el método "acelerar" de la clase Coche.
        Si escribirmos "public + nombreDelMetodo", el IDE nos autocompleta
        el código de la sobreescritura que vemos a continuación.

        -Primero aparece la notación Override (SObreescritura), la cual
        es un elemento sintáctico que aporta metadatos a los métodos o clases y que
        lo que hace es comprobar que en la clase superior existe el método que vamos a
        utiliar.
        Dentro de este método nuevo aparecerá otra vez la palabra reservada super
        para invocar el método de la clase superior.
     */
    @Override
    public void acelerar(Integer cantidad) {
        // Ahora hacemos una modificación del método con una variable nueva:
        Integer cantidadNueva = cantidad * 2;
        super.acelerar(cantidadNueva);
    }
}
