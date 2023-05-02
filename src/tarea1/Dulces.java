package tarea1;

/**
 * Esta clase abstracta que hereda a la clase producto, define un método en común para los dulces.
 */
public abstract class Dulces extends Producto{
    /**
     *
     * @param a Indica el num de serie de los dulces.
     */
    public Dulces(int a){
        super(a);
    }
}

/**
 * Esta clase hereda a la clase Dulces, esta definirá al snicker.
 */
class Snicker extends Dulces{
    /**
     *
     * @param serie Es el número de serie del snicker.
     */
    public Snicker(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna un String con la palabra snicker que indica que los compraste y consumiste.
     */
    public String ingerir(){
        return "snicker";
    }
}

/**
 * Esta clase hereda a la clase Dulces, esta definirá al super 8.
 */
class Super8 extends Dulces{
    /**
     *
     * @param serie Es el número de serie del super 8.
     */
    public Super8(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna un String con la palabra super 8 que indica que los compraste y consumiste.
     */
    public String ingerir(){
        return "super8";
    }
}