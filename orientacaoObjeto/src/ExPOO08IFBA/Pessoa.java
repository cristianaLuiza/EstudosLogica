package ExPOO08IFBA;

public class Pessoa {
    public String nome;
    public Pessoa pai;
    public Pessoa mae;

    public Pessoa(String nome, Pessoa pai,  Pessoa mae) { //inicializa o nome da pessoa, bem como seus antecessores pai/mae
        this.nome = "cristiana";
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {//inicializa o nome da pessoa, e coloque seus antecessores para null
        this(nome, null, null);
    }
    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public boolean verificaIgual(Pessoa outraPessoa) { //igualdade de pessoas
        if (this.nome.equals(outraPessoa.nome) && this.mae.equals(outraPessoa.mae)) {
            return true;
        }
        return false;
    }

    public boolean verificaIrmao(Pessoa irmao) { // verifica se são irmaos
        if (this.mae.equals(irmao.mae) && this.pai.equals(irmao.pai)){
            return true;
        }
        return false;
    }
    public boolean antecessores(Pessoa outraPessoa) {
        Pessoa pai1 = outraPessoa.pai; //descobri quem é o pai da outra pessoa
        Pessoa avo = pai1.pai; // quem é o avo da outra pessoa

        Pessoa mae1 = outraPessoa.mae;
        Pessoa avomae = mae1.mae;

        if(this.mae.equals(mae1) || this.pai.equals(pai1) || this.mae.equals(avomae) || this.pai.equals(avo)){
            return true;
        }
        return false;
    }
}
