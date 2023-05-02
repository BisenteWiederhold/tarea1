package tarea1;
import java.util.ArrayList;

/**
 * Esta es la clase es para el despósito de bebidas, donde se almacenarán las bebidas que el comprador retirará una vez ya comprado.
 */
public class DepositoBebidas {
    private ArrayList<Bebida> arr;

    /**
     * Es el constructor, no recibe parámetros.
     */
    public DepositoBebidas(){
        this.arr = new ArrayList();
    }

    /**
     *
     * @return Retorna null si no hay una bebida almacenada y si la hay la retira.
     */
    public Bebida getBebida(){
        if(arr.size()==0){
            return null;
        }else{
            Bebida a = arr.remove(0);
            return a;
        }
    }

    /**
     *
     * @param a Este parámetro es una bebida ya que que la función hace que añadan una bebida al depósito.
     */
    public void addBebida(Bebida a){
        arr.add(a);
    }

    /**
     *
     * @return Retorna la cantidad de bebidas que hay.
     */
    public int size(){
        return arr.size();
    }
}
