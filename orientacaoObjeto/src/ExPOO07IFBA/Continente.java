package ExPOO07IFBA;

import java.util.List;

public class Continente {
    public String nomeContinente;
    public List<Pais> paises;

    public Continente(List<Pais> paises, String nomeContinente) {
        this.paises = paises;
        this.nomeContinente = nomeContinente;
    }

    public void adicionarPais(Pais pais) { //ADD PAISES
        paises.add(pais);
    }

    public double calcularDimensao() { //retorne a dimensão total do continente;
        double dimensaoTotal = 0;
        for (int i = 0; i < this.paises.size(); i++) { //PERCORRER A LISTA DE PAISES
            Pais pais = paises.get(i); //PEGANDO UMA INSTANCIA DE PAIS OU SEJA PEGANDO UM PAIS
            dimensaoTotal = pais.area + dimensaoTotal; // SOMANDO A ÁREA
        }
        return dimensaoTotal;
    }

    public double calcularPopulacao() { // população total do continente
        double populacaoTotal = 0;
        for (int i = 0; i < this.paises.size(); i++) {
            Pais pais = paises.get(i);
            populacaoTotal = pais.populacao + populacaoTotal;
        }
        return populacaoTotal;
    }

    public double desidadePopulacional() { //retorne a densidade populacional do continente
        double densidade = 0;
        densidade = calcularDimensao() / calcularPopulacao();
        return densidade;
    }

    public double maiorPopulacao() { // retorne o país com maior população no continente;
        double maior = 0;
        for (int i = 0; i < this.paises.size(); i++) {
            Pais pais = paises.get(i);
            if (pais.getPopulacao() > maior) {
                maior = pais.getPopulacao();
            }
        }
        return maior;
    }

    public double menorPopulacao() { //retorne o país com menor população no continente;
        double menor = 1000000000;
        for (int i = 0; i < this.paises.size(); i++) {
            Pais pais = paises.get(i);
            if (pais.getPopulacao() < menor) {
                menor = pais.getPopulacao();
            }
        }
        return menor;
    }

    public double maiorDimensao() { // MAIOR DIMENSAO
        double maiordimensao = 0;
        for (int i = 0; i < this.paises.size(); i++) {
            Pais pais = paises.get(i);
            if (pais.getArea() > maiordimensao) {
                maiordimensao = pais.getArea();
            }
        }
        return maiordimensao;
    }

    public double menorDimensao() {
        double menordimensao = 100000000;
        for (int i = 0; i < this.paises.size(); i++) {
            Pais pais = paises.get(i);
            if (pais.getArea() < menordimensao) {
                menordimensao = pais.getArea();
            }
        }
        return menordimensao;
    }
    public double razaoContinente(){
        double razao=0;
        razao = maiorDimensao() - menorDimensao();
        return razao;
    }
}