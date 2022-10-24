package com.sesionesJavaBasico.eventos;

public class Main {

    /**
     *
     * EVENTOS EN JAVA
     *
     * Un evento es algo que sucede. En POO, se conoce como evento
     * a un cambio en el estado de un objeto.
     * Normalmente, cuando hablamos de eventos en Java,
     * nos referimos a la interacción que
     * realiza un usuario en la interfaz gráfica de una
     * aplicación, como clickar un botón, escribir en un
     * formulario, etc.
     *
     * Existen 2 tipos de eventos:
     *   - Eventos en primer plano. Son aquellos que se
     *   producen por la interacción directa con el usuario a
     *   través de una interfaz gráfica (click del ratón,
     *   escribir con un teclado, etc).
     *   - Eventos en segundo plano. Son aquellos que se
     *   producen por la consecuencia de otras acciones
     *   que no tienen por qué ser inmediatamente relacionadas
     *   con un usuario (Lo que ocurre cuando se interrumpe el
     *   sistema, lo que ocurre cuando se completa una operación,
     *   etc.)
     *
     * Todas las aplicaciones de escritorio se denominan
     * aplicaciones orientadas a eventos porque se basan en
     * que un usuario interaccione con la aplicación y que
     * esta responda a esos eventos realizando ciertas
     * acciones.
     *
     * En Java, se utiliza la librería Swing para crear
     * interfaces de usuario.
     *
     * El EventHandling es el mecanismo que controla los eventos
     * y que decide qué hacer cuando un evento sucede.
     * El EventHandler es el código que se dispara cuando
     * se produce un evento.
     * En Java se usa el Modelo de Evento de Delegación, el cual
     * se basa en la utilización de un emisor y uno o varios
     * receptores.
     *   - Emisor: Es el objeto en el que ocurre el evento. Propor-
     *   ciona la información del evento ocurrido a su controlador.
     *   - Receptor/es: Es el objeto controlador de los eventos.
     *   Genera una respuesta a un evento ocurrido.
     *  El beneficio de este enfoque es que la lógica de la interfaz
     *  de usuario está separada de la lógica que genera el evento,
     *  además de ser más eficiente ya que los eventos se envían
     *  solo a los receptores que deseen recibirlos.
     *
     * En cada interfaz de usuario se consideran 3 aspectos
     * principales:
     *  - Elementos de la interfaz de usuario: Son los elementos
     *  visuales principales con los que el usuario interactúa.
     *  - Diseños: Definen como se deben organizar los elementos
     *  de la interfaz de usuario en la pantalla y dan una apariencia
     *  final a la GUI.
     *  - Comportamiento. Son los eventos que ocurren cuando
     *  el usuario interactúa con los elementos.
     *
     *  CREAR INTERFAZ GRÁFICA
     *
     * Para crear una GUI para una aplicación con Swing, se crea
     * un formulario como el que utilizaremos en este ejemplo.
     * El formulario estará dividido en un archivo .form en el que
     * daremos forma a la interfaz y un archivo .class en el que
     * programaremos la lógica de los eventos.
     * En el archivo del formulario tendremos una serie de elementos
     * con los que conformaremos la interfaz: JLabel para escribir etiquetas,
     * JButton para crear botones, etc. (Aquí una página donde aparecen
     * todos los elementos y lo que hace cada uno: https://www.tutorialspoint.com/swing/swing_controls.htm)
     * Cada elemento que utilicemos nos aparecerá en el archivo class en
     * forma de atributo cada uno con un tipo de dato en
     * relación a la clase de dicho elemento.
     *
     * Para crear una ventana de nuestra aplicación se debe
     * instanciar un objeto de la clase JFrame dentro de la función principal.
     * Con este objeto se invoca el método "setContentPane" con el
     * parámetro de la instancia del objeto del panel principal
     * de la aplicación (JPanel) y también al objeto frame se le
     * debe invocar el método setVisible con el parámetro true
     * para hacer visible el panel de la aplicación cuando se ejecute.
     *
     *
     * CREAR EVENTOS
     *
     * Se pueden crear de dos formas: a mano o través del IDE.
     *
     *  - Con el IDE, clickando con el botón derecho encima de un
     *  elemento del formulario y seleccionando "Create Listener", se
     *  crea el código en el MainForm sobre qué queremos que pase
     *  en ese elemento para que se ejecute la lógica de lo que
     *  queremos que haga ese elemento, es decir, por ejemplo, en un
     *  JButton de una calculadora, debemos crear un listener que actúe
     *  cuando se clicka el botón (en este caso, se debe crear el listener
     *  ActionListener).
     *
     *   - Este código se crea a mano de la siguiente forma. Se crea un
     *   constructor dentro de la clase Main de la aplicación (en la
     *   que ya tenemos los atributos de cada elemento del formulario y
     *   nuestro método principal) y se invoca con el atributo del elemento
     *   del que queramos crear el listener al método addActionListener. A
     *   este método le tenemos que pasar como parámetro un ActionListener.
     *   Para ello, lo habitual (y lo que te crea el IDE cuando creas
     *   automáticamente el Listener) es crear otra función que nos devuelva
     *   un ActionListener dentro de los argumentos de la invocación del
     *   atributo. En este ejemplo, lo crearemos en dos pasos para verlo más claro,
     *   es decir, crear dos funciones separadas y que devuelva un Action Listener
     *   que se reciba en la invocación del atributo contenida en la otra.
     *   Las funciones que reciben y que devuelven otras funciones se conocen
     *   como funciones anidadas o función de alto nivel (se verán en profundidad
     *   más adelante).
     *
     *  ¿¿ - El código que se encuentra en la función Listener (en nuestro ejemplo,
     *   la que devuelve el ActionListener en caso de estar separadas las funciones
     *   o la función que se encuentra anidada en caso de estar juntas) se ejecuta
     *   constantemente porque esta función digamos que está siempre "escuchando" si
     *   se produce un evento desde los elementos que la invoquen. - ??
     *
     *   ActionListener: Escucha eventos de acciones que puedan ocurrir (click ratón,
     *   por ejemplo).
     *   KeyListener: Escucha eventos que se produzcan por escribir por teclado.
     *
     * PATRÓN OBSERVADOR
     *
     * El concepto de evento no existe de forma nativa en los lenguajes de
     * programación. Puede existir en ciertas librerías (como lo que hemos
     * visto en Swing para interfaces de usuario) pero también puede ser muy
     * útil para ciertas partes de nuestras aplicaciones. Para ello se debe
     * implementar a mano un gestor de eventos mediante un patrón de diseño
     * llamado patrón observador, el cual consiste en que hay una parte de
     * nuestro código que está constantemente en escucha de que ocurra cierto
     * evento para invocar a un método que reciben los escuchantes.
     */
}
