package ExPOOawari09;

import java.util.ArrayList;
import java.util.List;

public class Executa {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        List<String> historicoConsultas1 = new ArrayList<>();
        historicoConsultas1.add("Ortopedista");
        historicoConsultas1.add("Endocrino");

        p1.setNome("Cris");
        p1.setIdade(26);

        System.out.println("Nome: " + p1.getNome() + "  Idade" + p1.getIdade());
        System.out.println("Historico de consultas: " + historicoConsultas1);
    }
}
