package ExPOOawariDesafio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MaquinaDeVenda {
    private Scanner leia = new Scanner(System.in);
    private List<Produtos> produtosCadastrados = new ArrayList<>();
    private List<Produtos> produtosSelecionados = new ArrayList<>();
    private double precoTotal = 0;

    public void cadastrar(String nome, double preco, int quantidade) {
        Produtos produtos1 = new Produtos(preco, nome, quantidade);
        this.produtosCadastrados.add(produtos1);
    }


    public List<Produtos> selecionarProduto() {
        int codigo;
        do {
            System.out.println("selecione os produtos");
            for (int i = 0; i < produtosCadastrados.size(); i++) {//Pecorrer a lista de produtos cadastrados
                Produtos produto = produtosCadastrados.get(i); //pego cada elemento da lista de produtos cadastrados
                System.out.println(i + "-" + produto.getNome());
            }

            codigo = leia.nextInt();
            if (codigo > produtosCadastrados.size() || codigo < 0) {
                System.out.println("ERRO: Codigo não existente");
            }else {
                Produtos pegarProduto = produtosCadastrados.get(codigo); // pego o codigo do produto cadastrado
                this.produtosSelecionados.add(pegarProduto); // add o produto cadastrado no produtos selecionado
            }
        } while (codigo < 100);
        return produtosSelecionados;
    }

    public double totalPreco() {
        for (int i = 0; i < produtosSelecionados.size(); i++) {
            Produtos produto = produtosSelecionados.get(i);
            precoTotal = produto.getPreco() + precoTotal;
        }
        return precoTotal;
    }

    public double inserirDinheiro() {
        System.out.println("Insira o valor a pagar: ");
        double dinheiro = leia.nextDouble();
        double troco = 0;
        troco = dinheiro - precoTotal;
        if (troco >= 0) {
            System.out.println("Compra efetuada!");
            for (int i = 0; i < produtosSelecionados.size(); i++) {
                Produtos produtoComprado = produtosSelecionados.get(i);
                int indiceDoProduto = produtosCadastrados.indexOf(produtoComprado); //apartir de um objeto pego um index da lista
                Produtos produtoEstoque = produtosCadastrados.get(indiceDoProduto); // peguei o produto
                int quantidadeNoEstoque = produtoEstoque.getQuantidade(); // pego a quantidade de estoque do produto
                produtoEstoque.setQuantidade(quantidadeNoEstoque - 1); // tiro -1 da quantidade do estoque
                produtosCadastrados.remove(produtoEstoque); // apago o elemento da lista
                produtosCadastrados.add(produtoEstoque); // adiciono o elemento da lista etualizado
            }
        } else {
            System.out.println("Dinheiro insuficiente!");
        }
        return troco;
    }

    public void estoque() {
        System.out.println("estoque:");
        for (int i = 0; i < produtosCadastrados.size(); i++) {
            Produtos produtos = produtosCadastrados.get(i);
            int quantidade = produtos.getQuantidade();
            System.out.println("Estoque: " + quantidade +" - "+ produtos.getNome() );

        }
    }

    public String toString() {
        return "Lista de produtos " + produtosCadastrados;
    }

}
/*
Crie uma classe chamada “MáquinaDeVendas” que simule uma máquina
 de venda de produtos. Essa classe deve permitir cadastrar produtos, selecionar
  um produto para compra, inserir dinheiro, retornar o troco e exibir o estoque disponível.
 */