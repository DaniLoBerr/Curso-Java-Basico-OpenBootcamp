package PaqueteDePrueba;

/*
    Siempre que creemos una excepción, la clase debe heredar de la clase exception.
    Lo único que tiene esta clase es un constructor que recibe
    el mensaje de error que le pasamos cuando creamos la excepción.
 */
public class NameFormatException extends Exception {

    private static final long serialVersionUID = 1L;

    public NameFormatException(String errorMessage) {
        super(errorMessage);
    }
}
