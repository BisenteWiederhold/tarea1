package tarea1;
import java.util.ArrayList;

/**
 * Esta es la clase es para el despósito de monedas, donde se almacenarán las monedas.
 */
public class DepositoM {
    private ArrayList<Moneda> al;

    /**
     * Es el constructor de la clase, no recibe parámetros.
     */
    public DepositoM(){
        this.al = new ArrayList();
    }

    /**
     *
     * @return Retorna null si no hay una moneda almacenada y si la hay la saca.
     */
    public Moneda getMon(){
        if(al.size()==0){
            return null;
        }else{
            Moneda a = al.remove(0);
            return a;
        }
    }

    /**
     *
     * @param a Este parámetro es una moneda ya que que la función hace que añadan una moneda al depósito.
     */
    public void addMon(Moneda a){
        al.add(a);
    }
}

