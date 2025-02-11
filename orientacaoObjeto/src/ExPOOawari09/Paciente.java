package ExPOOawari09;

import java.util.List;

public class Paciente {
    private String nome;
    private int idade;
    private List<String> historicoConsultas;

    public void adicionarConsulta(String novaConsulta) {
        if (historicoConsultas.contains(novaConsulta) == false) {
            historicoConsultas.add(novaConsulta);
        }
    }

    public List<String> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public void setHistoricoConsultas(List<String> historicoConsultas) {
        this.historicoConsultas = historicoConsultas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}