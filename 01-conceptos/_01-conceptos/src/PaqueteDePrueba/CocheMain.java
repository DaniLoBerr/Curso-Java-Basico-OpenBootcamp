package PaqueteDePrueba;

public class CocheMain {

    public static void main(String[] args) {

        /*
            Crear un objeto es similar a declarar una variable:
                -Como tipo de dato pondríamos el nombre de la Clase, en este caso
                el objeto sería un tipo de dato Clase.
                -Escribimos el identificador del objeto.
                -Aplicamos el operador de asignación.
                -Aplicamos el operador new. EL operador new es el que permite
                crear un objeto a partir de una clase.
                -Indicamos el nombre de la Clase de la que queremos crear el objeto
                y entre paréntesis se invoca la creación del objeto. Lo que estamos haciendo es invocar
                 al método constructor, por lo que si el constructor nos demanda unos parámetros,
                  aquí debemos indicarlos.

                Atajo teclado: Ctrl+p. Utilizando este atajo, el IDE nos dice los nombres de los
                argumentos que tenemos que rellenar.
         */
         /*
            A los valores que le damos a un objeto cuando invocamos al constructor
            se les conoce como Instancias, instancias de una clase.

            Crear un objeto = Instanciar una clase.
         */

        ////Coche cocheObj1 = new Coche();

        ////Coche cocheObj2 = new Coche ("negro", "renault", "megane", 1345.86, 6.5);

        /*
            Para acceder a los métodos de una clase, se escribe el nombre del objeto
            que queremos que realice la acción seguido de un punto y del nombre del método.
         */

        // cocheObj2.acelerar(50);

        /*
            En este caso le estamos dando el valor 50 al atributo Velocidad mediante el
            método Acelerar al cocheObjeto2.
         */

        ////System.out.println(cocheObj2);

        /*
            Se pueden imprimir objetos, nos muestra sus atributos.
         */

        ////cocheObj2.peso = 1276.4;

        ////System.out.println(cocheObj2);

        /*
            Para comoprobar los atributos de un objeto, lo recomendable
            sería depurar el código poniendo un breakpoint en la línea del
            objeto.
         */


        // Sobre tema Herencia

        CocheElectrico cocheElectrico = new CocheElectrico(); // Instancia de la clase nueva

        cocheElectrico.motorElectrico = "Ejemplo motor"; // Utilización de los atributos de la clase hija
        cocheElectrico.color = "Verde"; // Utilización de atributos de la clase madre
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido();

        System.out.println(cocheHibrido);


        // Sobre método super

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500d, 4.95, "TXZ");
        /*
            Esto es un objeto de la clase CocheElectrico creado a través de un constructor que hereda los atributos de
              otro constructor de su superclase a través del método super.
         */
        System.out.println(cocheElectrico2);


        // Sobre sobreescritura

        cocheElectrico.acelerar(50);

        System.out.println(cocheElectrico);

        /*
            Vemos como ahora al utilizar el método acelerar en un objeto
            de la clase con el método sobreescrito, se ve afectado por las
            nuevas condiciones.
         */

    }

}
