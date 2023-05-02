package tarea1;

/**
 * Esta clase es para una exepcion y que hereda a Exception, que se usa para cuando no hay productos o no queda el que se pide.
 */
public class NoHayProductoException extends Exception{

    /**
     *
     * @param error Este parámetro String es el constructor de la calse, sirve para escribir la causa del error.
     */
    public NoHayProductoException(String error){
        super(error);
    }
}
