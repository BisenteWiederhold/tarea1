package tarea1;

/**
 * Esta clase es para una exepcion y que hereda a Exception, que se usa para cuando se intente comprar un producto sin monedas.
 */
public class PagoIncorrectoException extends Exception{

    /**
     *
     * @param error Este parámetro String es el constructor de la calse, sirve para escribir la causa del error.
     */
    public PagoIncorrectoException(String error){
        super(error);
    }
}
