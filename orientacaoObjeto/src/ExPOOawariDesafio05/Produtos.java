package ExPOOawariDesafio05;

import java.security.SecureRandom;

public class Produtos {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produtos(double preco, String nome, int quantidade) {
        this.codigo = new SecureRandom().nextInt(100);
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Produto: " + nome + "  preço R$" + preco;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }

}