package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public class CincoCentavos extends Manipulador {

    public CincoCentavos() {
        super(Moeda.CincoCentavos);
    }

    @Override
    public double manipularRequisicao(Moeda moeda) {
        if(Moeda.CincoCentavos.equals(moeda)){
            return 0.05;
        }
        else{
            return sucessor.manipularRequisicao(moeda);
        }
    }
    
}
