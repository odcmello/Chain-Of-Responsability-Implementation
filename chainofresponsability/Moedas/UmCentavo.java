package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public class UmCentavo extends Manipulador {

    public UmCentavo() {
        super(Moeda.UmCentavo);
    }
    
    @Override
    public double manipularRequisicao(Moeda moeda) {
        if(Moeda.UmCentavo.equals(moeda)){
            return 0.01;
        }
        else{
            return sucessor.manipularRequisicao(moeda);
        }
    }
    
}
