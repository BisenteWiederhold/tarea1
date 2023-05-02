package tarea1;

/**
 * Esta clase abstracta define los métodos y características que tendrán en común nuestros productos, tanto bebidas como dulces.
 */
public abstract class Producto {
    private int serie;

    /**
     *
     * @param a Es el parámetro del constructor de nuetra clase que indicara el número de serie de nuestro producto.
     */
    public Producto(int a){
        this.serie=a;
    }

    /**
     *
     * @return Este método no puedes ser instanciado pero tiene la función de retornar el producto que se ingiera.
     */
    public abstract String ingerir();

    /**
     *
     * @return Retorna el número de serie que asiganamos anteriormente al producto.
     */
    public int getSerie(){
        return serie;
    }
}
