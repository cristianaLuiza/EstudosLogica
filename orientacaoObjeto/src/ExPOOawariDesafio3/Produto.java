package ExPOOawariDesafio3;

public class Produto {
    private String nome;
    private int codigoProduto;
    private double valorProduto;

    public Produto (String nome, int codigoProduto, double valorProduto){
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.valorProduto = valorProduto;
    }

    public String toString(){
        return  "Produto: "+nome+" " +
                "Codigo Produto: "+codigoProduto+" " +
                "Valor: "+valorProduto;
    }



}
