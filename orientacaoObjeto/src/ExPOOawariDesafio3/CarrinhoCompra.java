package ExPOOawariDesafio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarrinhoCompra {
    private double valorTotal;
    private float desconto;
    private Map<Produto, Integer> itensCarrinho = new HashMap<>();

    public class Carrinho {
        private Map<Produto, Integer> itensCarrinho; // Exemplo de Map onde a chave é Produto

        // Construtor da classe Carrinho
        public Carrinho() {
            itensCarrinho = new HashMap<>();

            // Adicionando alguns produtos e suas quantidades no carrinho
            itensCarrinho.put(new Produto("Produto A", 1,1), 1);
            itensCarrinho.put(new Produto("Produto B", 2,2), 2);
            itensCarrinho.put(new Produto("Produto C", 3,3), 3);
        }

        // Método para percorrer as chaves do Map (Set de Produto)
        public void percorrerProdutos() {
            Set<Produto> produtosCarrinho = itensCarrinho.keySet(); // Pegando as chaves (Produto)

            // Percorrendo o Set usando forEach
            // Imprime cada Produto
            produtosCarrinho.forEach(System.out::println);
        }
    }
    public void aplicarDesconto() {
        if (valorTotal > 100) {
            desconto = 5 / 100f;
            valorTotal = valorTotal * desconto;
        } else {
            desconto = 0;
        }
    }


    public double getValorTotal() {
        return valorTotal;
    }

    public float getDesconto() {
        return desconto;
    }

}
