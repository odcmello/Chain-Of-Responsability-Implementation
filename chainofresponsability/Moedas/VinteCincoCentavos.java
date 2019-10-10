package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public class VinteCincoCentavos extends Manipulador {

    public VinteCincoCentavos() {
        super(Moeda.VinteCincoCentavos);
    }

    @Override
    public double manipularRequisicao(Moeda moeda) {
        if(Moeda.VinteCincoCentavos.equals(moeda)){
            return 0.25;
        }
        else{
            return sucessor.manipularRequisicao(moeda);
        }
    }
    
}
