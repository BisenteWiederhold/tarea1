package tarea1;

/**
 * Esta clase es para el expendedor la cual recibirá monedas, almacenará y dará vuelto, almacena los productos y los arrojará estos al comprador.
 */
public class Expendedor {
    private DepositoBebidas coca;
    private DepositoBebidas sprite;
    private DepositoDulces snicker;
    private DepositoDulces super8;
    private DepositoM MonVu;
    private int vuelto;
    private int precio;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public static final int SNICKER=3;
    public static final int SUPER8=4;

    /**
     *
     * @param numProducto Este parámetro indica cuantas unidades disponibles hay para comprar por producto.
     * @param precioProductos Este parámetro indica el precio de los productos.
     */
    public Expendedor(int numProducto , int precioProductos){
        this.vuelto = 0;
        this.precio = precioProductos;
        this.coca = new DepositoBebidas();
        this.sprite = new DepositoBebidas();
        this.snicker = new DepositoDulces();
        this.super8 = new DepositoDulces();
        this.MonVu = new DepositoM();
        for(int i=0;i<numProducto;i++){
            sprite.addBebida(new Sprite(200+i));
            coca.addBebida(new CocaCola(100+i));
            snicker.addDulce(new Snicker(300+i));
            super8.addDulce(new Super8(400+i));
        }
    }

    /**
     *
     * @param m Este parámetro indica la moneda que se ha ingresado al expendedor para comprar.
     * @param num Este número indica lo que se quiere comprar, 1 para cocacola, 2 para sprite, 3 para snicker y 4 para super 8.
     * @return El return null es por si no se cumple ninguna de las condiciones anteriores.
     * @throws PagoIncorrectoException Lanza esta excepcion con un mensaje de tener que ingresar una moneda por si se intenta comprar sin moneda.
     * @throws NoHayProductoException Se lanza con un mensaje de que no quedan productos, ocurre si se acaba un producto en especifico, el expendedor está vacío o un producto que no exista.
     * @throws PagoInsuficienteException Se produce y lanza un mensaje que no alcanza cuando se ingresa una moneda de valor inferior al valor del producto.
     */
    public Producto comprarProducto(Moneda m, int num) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException{
        if(m==null){
            throw new PagoIncorrectoException("Tienes que ingresar una moneda");
        }else {
            if(coca.size()==0 && sprite.size()==0 && snicker.sizeDul()==0 && super8.sizeDul()==0){
                MonVu.addMon(m);
                throw new NoHayProductoException("No quedan productos");
            }else{
                int a = m.getSerie().getValor();
                if (a < precio) {
                    MonVu.addMon(m);
                    throw new PagoInsuficienteException("El dinero no es suficiente");
                } else if (a >= precio) {
                    if (num == 1) {
                        Bebida b = coca.getBebida();
                        if (b == null) {
                            MonVu.addMon(m);
                            throw new NoHayProductoException("No quedan CocaColas");
                        } else {
                            vuelto = a - precio;
                            while(vuelto!=0) {
                                MonVu.addMon(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return b;
                        }
                    } else if (num == 2) {
                        Bebida c = sprite.getBebida();
                        if (c == null) {
                            MonVu.addMon(m);
                            throw new NoHayProductoException("No quedan Sprite");
                        } else {
                            vuelto = a - precio;
                            while(vuelto!=0) {
                                MonVu.addMon(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return c;
                        }
                    } else if (num==3){
                        Dulces d = snicker.getDulce();
                        if(d==null){
                            MonVu.addMon(m);
                            throw new NoHayProductoException("No quedan Snicker");
                        }else{
                            vuelto = a - precio;
                            while(vuelto!=0) {
                                MonVu.addMon(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return d;
                        }
                    } else if (num==4){
                        Dulces f = super8.getDulce();
                        if(f==null){
                            MonVu.addMon(m);
                            throw new NoHayProductoException("No quedan Super 8");
                        }else{
                            vuelto = a - precio;
                            while(vuelto!=0) {
                                MonVu.addMon(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return f;
                        }
                    } else {
                        MonVu.addMon(m);
                        throw new NoHayProductoException("No existe este producto");
                    }
                }
            }
        }
        return null;
    }

    /**
     *
     * @return Retorna el vuelto final almacenado en monedas de 100 o la misma moneda ingresada en caso que no se pudo efectuar una compra.
     */
    public Moneda getVuelto(){
        return MonVu.getMon();
    }
}
