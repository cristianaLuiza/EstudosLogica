package ExPOOawariDesafio1;

public class Pessoa {
    private String nome;
    private double idade;
    private String profissao;

    public Pessoa(double idade, String nome, String profissao) {
        this.idade = idade;
        this.nome = nome;
        this.profissao = profissao;
    }

    public double anoBissexto() {
        double anobiss = idade / 4;
        return anobiss;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}

//Os anos bissextos ocorrem a cada quatro anos.
// Isso significa que o ano tem 366 dias, com um
// dia extra em fevereiro, que passa a ter 29 dias