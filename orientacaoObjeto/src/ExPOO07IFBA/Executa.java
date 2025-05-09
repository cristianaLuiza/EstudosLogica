package ExPOO07IFBA;

import java.util.ArrayList;
import java.util.List;

public class Executa {
    public static void main(String[] args) {
        Pais p1 = new Pais(1, "a", 10);
        Pais p2 = new Pais(2, "b", 20);
        Pais p3 = new Pais(3, "c", 30);
        Pais p4 = new Pais(4, "d", 40);
        Pais p5 = new Pais(5, "e", 50);
        List<Pais> listaPaises = new ArrayList<>();
        listaPaises.add(p1);
        listaPaises.add(p2);
        listaPaises.add(p3);
        listaPaises.add(p4);
        listaPaises.add(p5);
        Continente c1 = new Continente( listaPaises,"asia");
        System.out.println(c1.calcularDimensao());
        System.out.println(c1.desidadePopulacional());
        System.out.println(c1.maiorDimensao());

        System.out.println();
    }
}
