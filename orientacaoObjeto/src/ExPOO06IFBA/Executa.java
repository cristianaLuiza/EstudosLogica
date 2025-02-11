package ExPOO06IFBA;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Executa {
    public static void main(String[] args) {

        Pais p1 = new Pais("a", 111, 12356, 45);
        Pais p2 = new Pais("b", 222, 67809, 97);
        Pais p3 = new Pais("c", 333, 455556, 85);
        Pais p4 = new Pais("d", 444, 67899, 67);
        List<Pais>vizinhosp1 = new ArrayList<>();
        List<Pais>vizinhosp2 = new ArrayList<>();
        List<Pais>vizinhosp3 = new ArrayList<>();
        List<Pais>vizinhosp4 = new ArrayList<>();
        vizinhosp1.add(p2);
        vizinhosp1.add(p4);
        vizinhosp1.add(p3);
        p1.setPaisesVizinhos(vizinhosp1);

        vizinhosp2.add(p3);
        p2.setPaisesVizinhos(vizinhosp2);

        System.out.println("As ISOs dos paises são iguais = "+p1.equals(p2));
        System.out.println("Densidade populacional "+ p1.densidadePopulacional());
        System.out.println("O pais é limitrofe "+p1.limitrofe(p2));
        System.out.println("Os paises são vizinhos "+ p1.vizinhos(p2));
    }
}
