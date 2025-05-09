package ExPOOawari04;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] valorNotas = new double[3];

    public double media() {
        double media=0;

        for (int i = 0; i < valorNotas.length; i++) {
            media = valorNotas[i] + media;
        }
        media = media/valorNotas.length;

        if (media > 5) {
            System.out.println("Aprovado");
        } else if (media < 5) {
            System.out.println("Desaprovado");
        }
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return valorNotas;
    }

    public void setNotas(double[] notas) {
        this.valorNotas = notas;
    }

}
