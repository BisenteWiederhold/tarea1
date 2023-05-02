package tarea1;

/**
 * Es la clase del comprador, lo que cumplirá la función del cliente oséa que pague y elija que quiere consumir.
 */
public class Comprador {
    private String sonido;
    private int vuelto;

    /**
     *
     * @param m Es la moneda con la que el cliente quiere comprar.
     * @param cualProducto Es el número que indica que producto quiere, 1 para cocacola, 2 para sprite, 3 para snicker y 4 para super 8.
     * @param exp Es el expendedor donde el comprador pondrá su moneda y eligirá el producto.
     * @throws NoHayProductoException Como uno de los parámetros del comprador es expendedor, esta puede lanzar una excepcion en caso caso que ingrese un número de producto que no exista o no queden productos.
     * @throws PagoInsuficienteException Como uno de los parámetros del comprador es expendedor, la moneda que ingrese el comprador en el parámetro anterior puede ser insuficiente.
     * @throws PagoIncorrectoException Como uno de los parámetros del comprador es expendedor, si no ingresa moneda el pago es incorrecto.
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.vuelto = 0;
        int num = cualProducto;
        Producto producto = exp.comprarProducto(m, num);
        if(producto!=null){
            sonido = producto.ingerir();
        }
        for (Moneda moneda = exp.getVuelto(); moneda != null; moneda = exp.getVuelto()) {
            this.vuelto += moneda.getValor();
        }
    }

    /**
     *
     * @return Retorna el vuelto al comprador.
     */
    public int cuantoVuelto(){
        return vuelto;
    }

    /**
     *
     * @return Nos dice que es lo que compró y consumió el cliente.
     */
    public String queIngeriste(){
        return sonido;
    }
}
