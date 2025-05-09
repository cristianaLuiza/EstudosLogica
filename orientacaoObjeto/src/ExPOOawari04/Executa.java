package ExPOOawari04;

public class Executa {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        double[] valorNotas = new double[3];
        valorNotas[0] = 10;
        valorNotas[1] = 5;
        valorNotas[2] = 2;
        a1.setNome("Cris");
        a1.setMatricula(123456);
        a1.setNotas(valorNotas);
        System.out.println("Nome: " + a1.getNome()+"/ Matricula: "+a1.getMatricula());
        System.out.printf("Media notas : %.2f" , a1.media());
    }
}
