package ExPOOawariDesafio3;

import ExPOOawariDesafio2.Cliente;
import ExPOOawariDesafio2.Conta;

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    private List<Produto> produtos = new ArrayList<>();
    private List<CarrinhoCompra> carrinhoCompra = new ArrayList<>();

    public void addProduto(String nome, int codigoProduto, double valorProduto) { //adiciono produto
        Produto produto1 = new Produto (nome, codigoProduto, valorProduto);
        this.produtos.add(produto1);
    }
    public CarrinhoCompra gerarCarrinho(){ //Criar carrinho de compra
        CarrinhoCompra carrinhoCompra1 = new CarrinhoCompra();
        return carrinhoCompra1;
    }

}
