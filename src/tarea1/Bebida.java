package tarea1;

/**
 * Una clase abstracta que hereda a la clase producto, esta clase servirá para dar las caracteristicas en común a las bebidas sprite y cocacola.
 */
public abstract class Bebida extends Producto {
    /**
     *
     * @param a El constructor de la clase, indica el numero de serie que tomarán las bebidas.
     */
    public Bebida(int a) {
        super(a);
    }
}

/**
 * Es la clase de cocacola que hereda a bebida.
 */
class CocaCola extends Bebida{
    /**
     *
     * @param serie Indica el numero de serie de la cocacola.
     */
    public CocaCola(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna un String con la palabra cocacola que indica que los compraste y consumiste.
     */
    public String ingerir(){
        return "cocacola";
    }
}

/**
 * Es la clase de sprite que hereda a bebida.
 */
class Sprite extends Bebida {
    /**
     *
     * @param serie2 Indica el numero de serie de la sprite.
     */
    public Sprite(int serie2){
        super(serie2);
    }

    /**
     *
     * @return Retorna un String con la palabra sprite que indica que los compraste y consumiste.
     */
    public String ingerir(){
        return "sprite";
    }
}
