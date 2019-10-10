package chainofresponsability.Moedas;

/**
 *
 * @author Otávio
 */
public enum Moeda {
    UmCentavo(1),
    CincoCentavos(5),
    DezCentavos(10),
    VinteCincoCentavos(25),
    CinquentaCentavos(50),
    UmReal(100);

    private int valor;

    Moeda(int valorOpcao) {
        this.valor = valorOpcao;
    }

    public static Moeda getValor(int valorOpcao) {
        for (Moeda l : Moeda.values()) {
            if (l.valor == valorOpcao) {
                return l;
            }
        }
        throw new IllegalArgumentException("Moeda não identificada.");
    }
}
