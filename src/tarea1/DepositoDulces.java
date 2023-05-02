package tarea1;
import java.util.ArrayList;

/**
 * Esta es la clase es para el despósito de dulces, donde se almacenarán los dulces que el comprador retirará una vez ya comprado.
 */
public class DepositoDulces {
    private ArrayList<Dulces> d;

    /**
     * Es el constructor, no recibe parámetros.
     */
    public DepositoDulces(){
        this.d = new ArrayList();
    }

    /**
     *
     * @return Retorna null si no hay un dulce almacenado y si la hay lo retira.
     */
    public Dulces getDulce(){
        if(d.size()==0){
            return null;
        }else{
            Dulces a = d.remove(0);
            return a;
        }
    }

    /**
     *
     * @param a Este parámetro es un dulce ya que que la función hace que añadan un dulce al depósito.
     */
    public void addDulce(Dulces a){
        d.add(a);
    }

    /**
     *
     * @return Retorna la cantidad de dulces que hay.
     */
    public int sizeDul(){
        return d.size();
    }
}
