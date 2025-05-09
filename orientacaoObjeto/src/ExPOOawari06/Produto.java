package ExPOOawari06;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;

    public double ValorTotal() {
        double valorTotal = preco * quantidade;
        if(quantidade<5){
            System.out.println("Produto indisponpivel");
        }else {
            System.out.println("Produto Diponivél");
        }
        return valorTotal;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
