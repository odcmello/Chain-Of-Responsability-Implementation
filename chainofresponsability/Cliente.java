package chainofresponsability;

import chainofresponsability.Moedas.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Otávio
 */
public class Cliente {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList();

        Manipulador manipulador = new UmCentavo();
        manipulador.setSucessor(new CincoCentavos());
        manipulador.setSucessor(new DezCentavos());
        manipulador.setSucessor(new VinteCincoCentavos());
        manipulador.setSucessor(new CinquentaCentavos());
        manipulador.setSucessor(new UmReal());

        double valorPago = 0;
        Produto meuProduto = null;
        
        produtos.add(new Produto("Chiclete",1,0.50));
        produtos.add(new Produto("Refrigerante",2,1.00));
        produtos.add(new Produto("Salgadinho",3,2.00));
        produtos.add(new Produto("Doce",4,4.00));
        
        System.out.println("Produtos Disponíveis (Digite o código):");
        
        for(Produto p: produtos){
            System.out.println(p.nomeProduto + " (" + p.codigo + ") = R$" + (String.format("%.2f", p.precoProduto)));
        }
        
        while (true) {
            int codigoP = scan.nextInt();
            for(Produto p: produtos){
                if(codigoP == p.codigo){
                    meuProduto = p;
                    break;
                }
            }
            if(meuProduto != null){
                break;
            }
            else{
                System.out.println("Código inválido, digite novamente.");
            }
        }

        System.out.println("Comprando " + meuProduto.nomeProduto + ". O valor a ser pago é R$" + (String.format("%.2f", meuProduto.precoProduto)) + ".");
        
        System.out.println("UM CENTAVO (1), CINCO CENTAVOS (5), DEZ CENTAVOS (10), VINTE E CINCO CENTAVOS (25),"
                + "CINQUENTA CENTAVOS (50), UM REAL (100)\n");

        while (valorPago < meuProduto.precoProduto) {
            valorPago = valorPago + manipulador.manipularRequisicao(Moeda.getValor(scan.nextInt()));
            System.out.println(String.format("%.2f", valorPago));
        }
        
        System.out.println("Alimento comprado! Seu troco é: R$" + String.format("%.2f", (valorPago-meuProduto.precoProduto)));
    }

}
