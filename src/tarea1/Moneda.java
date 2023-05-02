package tarea1;

/**
 * Esta clase abstracta sirve para otorgar metodos y caracteristicas que tendran todas las monedas que se puedan uer en el programa
 * ademas se le agrego la interfaz comparable
 */
public abstract class Moneda implements Comparable<Moneda>{
    /**
     * Es el constructor, que no recibe parámetros.
     */
    public Moneda(){
    }
    /**
     *
     * @return Retorna el número de serie de la moneda que se pide para saber que moneda es.
     */
    public Moneda getSerie(){
        return this;
    }
    /**
     *
     * @return Este método abstarcto retorna el valor específico de la moneda.
     */
    public abstract int getValor();

    @Override/**
     *
     * compara las monedas dependiendo de su valor
     * @return la comparacion de las monedas
     */
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
}
/**
 * Esta clase es para la moneda de 100 pesos que hereda a la clase moneda.
 */
class Moneda100 extends Moneda{
    /**
     * Es el constructor, que no recibe parámetros
     */
    private int valor=100;
    public Moneda100(){
        super();
    }
    /**
     *
     * @return Retorna el valor de esta clase de moneda, que es 1000.
     */
    public int getValor(){
        return valor;
    }
}

/**
 * Esta clase es para la moneda de 1500 pesos que hereda a la clase moneda.
 */
class Moneda1500 extends Moneda {
    /**
     * Es el constructor, que no recibe parámetros
     */
    private int valor=1500;
    public Moneda1500(){
        super();
    }
    /**
     *
     * @return Retorna el valor de esta clase de moneda, que es 1000.
     */
    public int getValor(){
        return valor;
    }

}
/**
 * Esta clase es para la moneda de 1000 pesos que hereda a la clase moneda.
 */
class Moneda1000 extends Moneda {
    /**
     * Es el constructor, que no recibe parámetros
     */
    private int valor=1000;
    public Moneda1000(){
        super();
    }
    /**
     *
     * @return Retorna el valor de esta clase de moneda, que es 1000.
     */
    public int getValor(){
        return valor;
    }
}/**
 * Esta clase es para la moneda de 500 pesos que hereda a la clase moneda.
 */
class Moneda500 extends Moneda{
    /**
     * Es el constructor, que no recibe parámetros
     */
    private int valor=500;
    public Moneda500(){
        super();
    }
    /**
     *
     * @return Retorna el valor de esta clase de moneda, que es 1000.
     */
    public int getValor(){
        return valor;
    }
}

