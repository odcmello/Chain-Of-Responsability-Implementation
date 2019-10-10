package chainofresponsability;

/** Interface do produto
 *
 * @author Otavio
 */
public class Produto {
    String nomeProduto;
    int codigo;
    double precoProduto;
    
    public Produto (String nome, int codigoProd, double precoDoProduto){
        this.nomeProduto = nome;
        this.codigo = codigoProd;
        this.precoProduto = precoDoProduto;
    }
}
