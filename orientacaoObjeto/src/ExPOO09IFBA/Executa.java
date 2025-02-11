package ExPOO09IFBA;

import java.util.ArrayList;
import java.util.List;

public class Executa {
    public static void main(String[] args) {
        List<String> elementosConjunto1 = new ArrayList<>(); //crio lista vazia para por elementosConjunto1
        elementosConjunto1.add("a"); // add elementosConjunto1
        elementosConjunto1.add("2");
        elementosConjunto1.add("3");
        elementosConjunto1.add("4");
        Conjunto conjunto1 = new Conjunto(elementosConjunto1);

        List<String> elementosConjunto2 = new ArrayList<>();
        elementosConjunto2.add("a"); // add elementosConjunto2
        elementosConjunto2.add("6");
        elementosConjunto2.add("7");
        elementosConjunto2.add("8");
        Conjunto conjunto2 = new Conjunto(elementosConjunto2); //

        List<String> elementosConjunto3 = new ArrayList<>();
        elementosConjunto3.add("a"); // add elementosConjunto2
        elementosConjunto3.add("10");
        elementosConjunto3.add("11");
        elementosConjunto3.add("12");
        Conjunto conjunto3 = new Conjunto(elementosConjunto3); //

        conjunto1.adicionarElemento("add");
        System.out.println("Adicionando novos elementos a lista "  + conjunto1.getElementos()+"\n");

        conjunto3.verifica("2");
        System.out.println("Elementos da lista "+conjunto3.getElementos()+"\n");

        System.out.println("Resultado da união de elementos " + conjunto1.uniao(conjunto2).getElementos()+"\n");


        System.out.println( "O elemento que está nos dois conjuntos é: " + conjunto3.inter(conjunto2).getElementos() +"\n");


        System.out.println("Retirando um dos conjuntos "+ conjunto1.menos(conjunto2).getElementos());
    }
}
