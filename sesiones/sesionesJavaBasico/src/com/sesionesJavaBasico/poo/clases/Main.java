package com.sesionesJavaBasico.poo.clases;

import com.sesionesJavaBasico.poo.herencias.Camion;
import com.sesionesJavaBasico.poo.herencias.Coche;
import com.sesionesJavaBasico.poo.herencias.Motocicleta;

public class Main {

    /**
     *  PROGRAMACIÓN ORIENTADA A OBJETOS
     *
     *  CONCEPTOS
     *
     *Clases:
     *
     *  Una clase es como una plantilla de objetos. Una clase se instancia en la clase main y se crea un objeto.
     *  Un objeto funciona como un tipo de dato pero más sofisticado.
     *  Las clases tienen siempre la misma estructura: Propiedades, constructores y métodos.
     *
     *      Propiedades
     *
     *  A las propiedades se les pueden dar tipos de datos primitivos (int, double, float... los que empiezan por
     *  minúscula) y a estos se les debe dar un valor obligatoriamente. Sin embargo, a los datos primitivos se les puede
     *  envolver en los que se conoce como los tipos de datos envoltorio o wrappers
     *  (Double, String, Integer... los que empiezan por mayúscula) los cuales
     *  funcionan como una clase y convierten a la propiedad
     *  en un objeto, por tanto estas propiedades tendrían métodos y se les podría dar un valor null (valor 0).
     *
     *      Constructores
     *
     *  Un constructor es una función que se invoca cuando se instancia la clase en la que se encuentra, es decir,
     *  es la función que crea el objeto cuando se instancia su clase. Puede inicializar
     *  ciertos atributos de la clase, dependiendo de los argumentos que tenga, o invocar a ciertos métodos de la clase.
     *
     *  Mediante la sobrecarga de constructores, lo que hacemos es crear varios constructores con el mismo nombre pero
     *  los cuales o no reciben parámetros o reciben algunos parámetros que inicializan los atributos de la clase como
     *  decíamos. Se deben asisnar los atributos a los parámetros del constructor.
     *  Normalmente se crean 2 constructores, uno sin argumentos y otro con todos los atributos de la clase; pero,
     *  dependiendo de cómo esté estructurada la aplicación, nos puede venir mejor crear más constructores los cuales
     *  acepten solo ciertos parámetros (por ejemplo, un formulario que cuando te registras solo pida nombre de usuario
     *  y constraseña y luego ya pida más información).
     *
     *  Son públicos y reciben el mismo nombre de la clase (con su primera letra mayúscula).
     *
     *  (Se pueden generar los constructores con Ctrl+Click derecho -> Generate)
     *
     *  algo avanzado: Cuando la clase es compleja, contiene muchas propiedades y se requiere de muchos constructores,
     *  es normal utilizar un patrón de diseño llamado builder, el cual permite construir los objetos de una formas
     *  más óptima.
     *
     *      Métodos
     *
     *  Son funciones que alteran el comportamiento del objeto. Dentro de un método podrían
     *  hacerse ciertas restricciones para limitar los parámetros
     *  que pueda recibir la función.
     *  Se pueden crear diferentes métodos como los getters y setters, los métodos toString, etc.
     *
     *  --
     *
     * - Clase/método main. Punto de entrada principal a la aplicación. Ejecutan el código.
     * - Otra manera de ejecutar una aplicación web. A través de un controlador mendiante una petición HTTP.
     *
     *Instanciar una clase / Crear un objeto:
     *
     *  La estructura de una instancia a una clase es: Clase identificador = new Clase();
     *  Es decir, se pone la clase al principio como si fuera el tipo de dato del objeto, se le da el nombre al objeto y
     *  se le asigna a este objeto un valor, que es el que obtenemos llamando a su constructor. En este punto, se le
     *  proporcionan a la llamada al constructor los parámetros (Ctrl + p para ver los parámetros que acepta).
     *
     *
     * --
     *
     *Encapsulación:
     *
     *  Los atributos de una clase se pueden encapsular, con la palabra
     *  private, para que solo se puedan acceder a ellos desde su misma clase y no desde
     *  otro sitio. Así limitamos su acceso. Podemos crear unos métodos especiales llamados
     *  get y set para poder acceder a ellos desde fuera y modificarlos.
     *  Así se protege la manera en que se modifican y
     *  se hace de una manera controlada.
     *
     *Composición o creación de clases:
     *
     *  Realizar una composición es relacionar clases con otras. Cuando tenemos
     *  creado un sistema complejo, acumular todos los atributos en una sola
     *  clase es demasiado, por lo que se puede crear una subclase en la que
     *  acumular ciertos atributos relacionados entre si y luego en la clase
     *  superior a esta añadir la subclase como si fuera un atributo, indicando
     *  como tipo de dato el nombre de la subclase.
     *  Luego, a la hora de pasarle el parámetro al constructor de la primera
     *  clase, se crea un objeto de la subclase, al cual se le dan sus correspondientes
     *  atributos y se le da como parámetro a la primera clase el objeto creado
     *  de la subclase.
     *
     *Herencia:
     *
     *  Se utiliza cuando queremos crear un objeto un poco más espécifico a partir
     *  de una clase general. Se crea una nueva clase que se extiende de la clase general y
     *  recibe todos sus atributos, constructores, etc. Sirve para no repetir código.
     *  En este punto es importante el tema de la visibilidad. Primero, si se quiere heredar
     *  de una clase que se encuentra en otro paquete, se debe importar la clase. Después, se
     *  puede acceder a los elementos que no tienen indicador de visibilidad desde clases que
     *  se encuentren en el mismo paquete, de lo contrario, los elementos deben tener una visibilidad
     *  o pública o protegida para acceder a ellos (los atributos, por ejemplo, suelen tener
     *  una visibilidad privada y accederse a ellos a trevés de unos métodos getter y setter).
     *  También hay que indicar que, cuando creamos un constructor en una clase hija, se reutilizan
     *  elementos de la clase madre a través del método super.
     *  (Con Ctrl+Click se navega entre archivos Java).
     *
     *  Remarcar que todas las clases Java herendan intrínsecamente de una clase base llamada
     *  Object la cual dispone de una serie de métodos que están siempre disponibles.
     *
     *Polimorfismo
     *
     *  Es un concepto derivado de la herencia y de gran utilidad para
     *  lengujaes fuertemente tipados (como Java). Este concepto digamos
     *  que "relaja" en cierta manera el sistema de tipado y permite que ciertos
     *  elementos puedan adoptar diferentes formas; es decir, nosotros
     *  podemos declarar elementos (variables, arrays, etc) con un tipo de dato
     *  de una superclase y luego podemos utilizarlos con datos de esta superclase o
     *  de cualquiera de sus clases hijas.
     *
     *Abstracción
     *
     *  Es un concepto con el cual se declara una clase o una función de tal manera que
     *  no pueden utilizarse fuera de lo que es su clase, es decir:
     *      -la clase no se puede instanciar (no se pueden crear objetos a partir de ella).
     *     Lo que si se puede hacer es crear objetos a partir de clases derivadas de una
     *     clase abstracta.
     *      -La función no se puede invocar desde fuera de su propia clase. Una función abstracta
     *     simplemente se declara pero no se rellena y de esta manera obligamos a las clases
     *     hijas de esta a declarar obligatoriamente estas funciones. Esto se hace cuando
     *     sabemos que estos métodos van a ser completamente necesarios de implementar
     *     en todas las posibles clases hijas.
     *  Lo que conseguimos con esto es prohibir utilizar los elementos de una superclase genérica
     *  la cual utilizamos simplemente de plantilla y solamente crear objetos o utilizar los métodos
     *  de sus clases hijas (abstraer para solamente utilizar desde lo concreto).
     *
     *Static (elementos estáticos o miembros de clase)
     *
     *  Es un modificador que puede aplicarse en la definición de métodos y atributos y que define a estos
     *  como pertenecientes a la clase y no a las instancias de esta (a los objetos). Esto quiere decir que
     *  cuando un elemento tiene el modificador static, este puede utilizarse o acceder a él desde fuera
     *  de la clase sin tener que crear un objeto de ella para hacerlo. Se accede a un elemento estático
     *  a través del nombre de su clase.
     *  Con el modificador static puede ejecutarse un método por ejemplo (el método main de un programa) o
     *  también es útil para utilizar variables constantes que se encuentren almacenadas en una clase (la
     *  constante pi de la clase Math).
     *
     *  Programación genérica
     *
     *  (Algo avanzado)
     *
     *
     */

    public static void main(String[] args) {

        // 1. Clases y objetos
        Vehiculo toyotaPrius = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);

        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        fordMondeo.speed += 50;
        System.out.println(fordMondeo.speed);

        // 2. Herencias
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        // 3. Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        // 4. Abstracción

        // 5. Static

        // 6. Programación genérica
    }
}