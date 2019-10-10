package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public abstract class Manipulador {
    protected Manipulador sucessor;
    protected Moeda moeda;
    
    public Manipulador(Moeda moeda){
        sucessor = null;
        this.moeda = moeda;
    }
    
    public void setSucessor(Manipulador manipulador){
        if (sucessor == null){
            sucessor = manipulador;
        }
        else{
            sucessor.setSucessor(manipulador);
        }
    }
    
    public abstract double manipularRequisicao(Moeda moeda);
}
