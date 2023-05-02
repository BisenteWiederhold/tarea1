package tarea1;

/**
 * La clase Tarea1 es la clase principal que contiene el método main donde implementaremos nuestra máquina expendedora y sus caracteristicas para ejecutar el programa de tarea 1 que es comprar dulces y bebidas .
 * Intentar comprar sin mineda--elegir un producto que no existe--pagar con una moneda que no nos alcanza--si pagamos y elegeimos correctamente un producto que nos imprima el producto y el vuelto--que nos imprima si quedan productos.
 * @author Franco Ponce
 * @author Vicente Widerhold
 *
 */
public class Tarea1 {

    /**
     *
     * @param args Son los argumentos y parámetros de la línea de comandos.
     * @throws PagoIncorrectoException Se produce si hay un error con el pago como no ingresar una moneda o se ingresa una moneda null e intentar pagar con eso.
     * @throws NoHayProductoException Se produce si no hay un productos disponibles, se acaba uno en especifico e intentar pedirlo o pedir uno que no existe.
     * @throws PagoInsuficienteException Se produce cuando no alcanza para pagar el producto con la moneda que se ingresó.
     */
    public static void main(String[] args) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        Expendedor exp = new Expendedor(2, 1000);
        Moneda m;
        Comprador c;
        try {
            m = null;
            c = new Comprador(m, 657, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        try {
            m = new Moneda500();
            c = new Comprador(m, 657, exp);
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1500();
            c = new Comprador(m, 5, exp);
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 1, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 1, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, 1, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
    }
}


