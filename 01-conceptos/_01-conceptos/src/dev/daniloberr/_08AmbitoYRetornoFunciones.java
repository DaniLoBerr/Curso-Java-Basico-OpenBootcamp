package dev.daniloberr;

/*
        // Modificadores de ámbito

            // Private. No podemos invocar la función desde otra clase.
            // Public. Podemos invocar la función desde otra clase.
            // Protected. Solo se puede invocar la función desde una clase hija o desde una clase que esté
            en el mismo paquete que la función.
            // Nada. Si no indicamos el modificador de ámbito, la función podrá ser invocada
            por cualquier clase del paquete. Es parecido a Protectec, solo que protected está
            más enfocado al tema de herencias de objetos.

            El modificador static indica la pertenencia de la función a su clase.
                No podemos invocar la función desde otra clase a no ser que la invoquemos
                escribiendo el nombre de la clase antes de la función, en plan:
                    nombreClase.funcion();

        // Tipos de retorno

                // Void. La función no devuelve información.
                // int, String, boolean... La función debe devolver el tipo de dato indicado.

                Para devolver los datos se utiliza la palabra reservada return, la cual solo se puede
                utilizar en funciones que devuelvan algún tipo de dato o en funiones void
                que queramos que no hagan nada porque estamos realizando unas comprobaciones o lo que sea.

 */

public class _08AmbitoYRetornoFunciones {

        public static void main(String[] args) {
                _07FuncionesYParametros.imprimirHolaMundo();
        /*
            En este caso, estamos invocando una función pública de otra clase.
            Tenemos que poner el nombre de la clase a la que pertenece antes porque
             es una función estática.
         */
        }

        protected static void funcionProtected() {
                System.out.println("Función protected");
        }

        public static int sum(int num1, int num2) {
                return num1 + num2;
        }

}
