package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public class DezCentavos extends Manipulador {

    public DezCentavos() {
        super(Moeda.DezCentavos);
    }

    @Override
    public double manipularRequisicao(Moeda moeda) {
        if(Moeda.DezCentavos.equals(moeda)){
            return 0.10;
        }
        else{
            return sucessor.manipularRequisicao(moeda);
        }
    }
    
}
