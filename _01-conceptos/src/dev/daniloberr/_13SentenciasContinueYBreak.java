package dev.daniloberr;

    // Palabras reservadas Continue y Break

        /*
            - Continue lo que hace es que si se cumple cierta condición, el bucle vuelva a realizar
            una iteración obviando el código del bucle que se encuentra después de dicha condición.
            - Break lo que hace es que si se cumple cierta condición, se rompe
            el bucle; este deja de iterar y el programa pasa a la siguiente parte del código.
         */

public class _13SentenciasContinueYBreak {

    public static void main(String[] args) {

        int count1 = 0;

        while (count1 < 10) {

            if (count1 == 6) {
                break;
            }

            /*
                // Esto también es válido (sin llaves) cuando el cuerpo es solo
                una línea de código:

                        if (count == 6)
                            break;
             */

            System.out.println(count1 + " Hola mundo");

            count1++;
            /*
                Este tipo de condiciones sumatorias en los bucles pueden ir en cualquier parte
                del bucle pero suele ponerse al final.
             */
        }

        System.out.println("Código después del bucle break");

        int count2 = 0;
        while (count2 < 10) {

            count2++;
            if (count2 == 6)
                continue;

            System.out.println(count2 + " Hola mundo");

            /*
                Aquí la condición sumatoria se coloca al inicio porque en este ejemplo, si lo
                ponemos al final, el bucle se quedaría iterando continuamente
             */
        }

        System.out.println("Código después del continue");
    }
}
