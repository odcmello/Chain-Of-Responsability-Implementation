package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public class UmReal extends Manipulador {

    public UmReal() {
        super(Moeda.UmReal);
    }

    @Override
    public double manipularRequisicao(Moeda moeda) {
        if(Moeda.UmReal.equals(moeda)){
            return 1.00;
        }
        else{
            return sucessor.manipularRequisicao(moeda);
        }
    }
    
}
