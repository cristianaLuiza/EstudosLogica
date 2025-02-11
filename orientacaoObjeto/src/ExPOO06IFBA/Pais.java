package ExPOO06IFBA;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    public String pais;
    public int iso;
    public long populacao;
    public double area;
    public List<Pais> paisesVizinhos;

    public Pais(String pais, int iso, long populacao, double area ) {
        this.pais = pais;
        this.iso = iso;
        this.populacao = populacao;
        this.area = area;
        this.paisesVizinhos = new ArrayList<>();
    }

    public List<Pais> getPaisesVizinhos() {
        return paisesVizinhos;
    }

    public void setPaisesVizinhos(List<Pais> paisesVizinhos) {
        this.paisesVizinhos = paisesVizinhos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //VERIFICA SE É O MESMO ISO
        if (o == null || getClass() != o.getClass()) return false;//VERIFICA SE SÃO NULOS OU DE CLASSES DIFERENTES
        Pais pais = (Pais) o; //FAZ O CAST DO OBJETO PARA PAIS (cast converte um tipo de dados em outro compatível. Ex converter uma string em uma data ou um tipo numérico em uma string)
        return iso == pais.iso; // VERIFICA SE OS ATRIBUTOS DOS OBJETOS TEM O MESMO VALOR;
    }

    public double densidadePopulacional() { //CALCULO DE DENSIDADE POPULACIONAL
        double densidade = 0;
        densidade = this.area / this.populacao;
        return densidade;
    }

    public boolean limitrofe(Pais outrosPaises) {
        return this.paisesVizinhos.contains(outrosPaises);
    }

    public List<Pais> vizinhos(Pais paisVizinho) { //METODO COM LIST
        List<Pais> vizinhos = new ArrayList<>(); //UMA VARIAVEL PARA ARMAZENAR OS VIZINHOS DOS PAISES EM COMUM
        for (int i = 0; i < paisVizinho.paisesVizinhos.size(); i++) { //FOR PARA PERCORRER A LISTA DE VIZINHOS FO PAIS VIZINHOS
            Pais pais = paisVizinho.paisesVizinhos.get(i); //CADA VIZINHO DO PAIS
            boolean ehVizinho = this.paisesVizinhos.contains(pais); // SE O VIZINHO ESTÁ NA LISTA DE VIZINHOS DO OUTRO PAIS
            if (ehVizinho == true) { //SE TIVER ADD
                vizinhos.add(pais);
            }
        }
        return vizinhos;

    }

    @Override
    public String toString() {
        return "Pais{" +
                "area=" + area +
                ", iso=" + iso +
                ", pais='" + pais + '\'' +
                ", paisesVizinhos=" + paisesVizinhos +
                ", populacao=" + populacao +
                '}';
    }
}

//f) Um método que receba um país como parâmetro e retorne a lista de
//vizinhos comuns aos dois países.
//Considere que um país tem no máximo 40 outros países com os quais ele
//faz fronteira.