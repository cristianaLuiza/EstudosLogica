package ExPOO09IFBA;

import ExPOO07IFBA.Continente;
import ExPOO07IFBA.Pais;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
    public List<String> elementos;

    public List<String> getElementos() {
        return elementos;
    }

    public void setElementos(List<String> elementos) {
        this.elementos = elementos;
    }

    public Conjunto(List<String> elementos) {
        this.elementos = elementos;
    }

    public void adicionarElemento(String novoElemento) {
        if (elementos.contains(novoElemento) == false) {
            elementos.add(novoElemento);
        }
    }

    public boolean verifica(String elemento) {
        if (elementos.contains(elemento) == true) {
            System.out.println("Esse elemento está na lista verificada!");
        } else {
            System.out.println("Esse elemento não está na lista verificada!");
        }
        return elementos.contains(elemento);
    }

    public Conjunto uniao(Conjunto conjunto2) {
        if (elementos.equals(conjunto2.elementos) == true) {
            System.out.println("Os conjuntos são iguais, logo não será adicionado nenhum elemento para união");
            return conjunto2;
        }
        Conjunto resultado = new Conjunto(elementos);
        for (int i = 0; i < conjunto2.elementos.size(); i++) {
            String elemento = conjunto2.elementos.get(i);
            if (elementos.contains(elemento) == false) {
                resultado.elementos.add(elemento);
            }
        }
        return resultado;
    }

    public Conjunto inter(Conjunto novoConjunto) {
        if (elementos.equals(novoConjunto.elementos) == true) { //Para verse os conjuntos não são completamente iguais
            System.out.println("Todos os elementos do conjunto são iguais, digite alguns elementos diferentes");
            return novoConjunto;
        }
        Conjunto inter = new Conjunto( new ArrayList<>()); // lista vazia para colocar os elementos repetidos
        for (int i = 0; i < novoConjunto.elementos.size(); i++) { // para percorrer todos os elementos que recebi como parametro
            String elementoRepetido = novoConjunto.elementos.get(i);//pegam um elemento da lista
            if (elementos.contains(elementoRepetido)) {//verifica se ele se repete na outra lista
                System.out.println("Adicionando o elemento "+elementoRepetido+" na lista de interseção");
                List<String> elementosIntersecao = inter.getElementos();//pegando a lista de elementos da minha interseção
                elementosIntersecao.add(elementoRepetido); //vai adicionando os repetidos a lista
                inter.setElementos(elementosIntersecao);//faço set para atualizar a lista de repetição
                System.out.println("Lista de interseção atualizada " + inter.getElementos());

            }
        }
        return inter;
    }

    public Conjunto menos(Conjunto conjunto1) {
        if (elementos.equals(conjunto1.elementos) == true) {
            System.out.println("Os elementos do conjunto são iguais!");
            Conjunto conjunto = new Conjunto(new ArrayList<>());
            return conjunto;
        }
        Conjunto menos = new Conjunto(elementos);
        for (int i = 0; i < conjunto1.elementos.size(); i++) { // para percorrer todos os elementos
            String elemento = conjunto1.elementos.get(i); // verifica se i tem nos elementos e novo conjunto
                menos.elementos.remove(elemento);

        }
        return menos;
    }
}
