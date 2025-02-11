package ExPOOawariDesafio05;

public class Executa {
    public static void main(String[] args) {
        MaquinaDeVenda m1 = new MaquinaDeVenda();
        m1.cadastrar("leite", 7, 2);
        m1.cadastrar("Agua", 2, 4);
        m1.selecionarProduto();
        m1.totalPreco();

        double troco = m1.inserirDinheiro();
        System.out.println("Troco R$" + troco);
        m1.estoque();
        System.out.println(m1);


    }
}
