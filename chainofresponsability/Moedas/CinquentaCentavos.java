package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public class CinquentaCentavos extends Manipulador {

    public CinquentaCentavos() {
        super(Moeda.CinquentaCentavos);
    }

    @Override
    public double manipularRequisicao(Moeda moeda) {
        if(Moeda.CinquentaCentavos.equals(moeda)){
            return 0.50;
        }
        else{
            return sucessor.manipularRequisicao(moeda);
        }
    }
    
}
