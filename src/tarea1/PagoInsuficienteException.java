package tarea1;

/**
 * Esta clase es para una exepcion y que hereda a Exception, que se usa para cuando la moneda que se ingrese no alcanze para pagar un producto.
 */
public class PagoInsuficienteException extends Exception{

    /**
     *
     * @param error Este parámetro String es el constructor de la clase, sirve para escribir la causa del error.
     */
    public PagoInsuficienteException(String error){
        super(error);
    }
}
