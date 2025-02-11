package ExPOO07IFBA;

public class Pais {
    public String nome;
    public double populacao;
    public double area;

    public Pais(double area, String nome, double populacao) {
        this.area = area;
        this.nome = nome;
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "area=" + area +
                ", nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}