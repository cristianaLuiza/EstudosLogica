import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, alunos_turma;
        double porcentagem_aprovados = 0, aprovados_geo = 0, reprovado_geo = 0;

        System.out.print("Quantos alunos existem na turma? ");
        alunos_turma = leia.nextInt();
        int matematica[] = new int[alunos_turma];
        int fisica[] = new int[alunos_turma];
        int geografia[] = new int[alunos_turma];
        int historia[] = new int[alunos_turma];
        int portugues[] = new int[alunos_turma];

        String vetor_nome[] = new String[alunos_turma];
        for (i = 0; i < alunos_turma; i++) {
            System.out.print("\nDigite o nome ");
            vetor_nome[i] = leia.next();
            System.out.print("\n Nota 1 matematica:  ");
            matematica[i] = leia.nextInt();
            System.out.print("\n Nota 2 fisica:  ");
            fisica[i] = leia.nextInt();
            System.out.print("\n Nota 3 geografia:  ");
            geografia[i] = leia.nextInt();
            System.out.print("\n Nota 4 historia:  ");
            historia[i] = leia.nextInt();
            System.out.print("\n Nota 5 portugues:  ");
            portugues[i] = leia.nextInt();
        }
        for (i = 0; i < alunos_turma; i++) {
            if (matematica[i] >= 7 && fisica[i] >= 7 && geografia[i] >= 7 && historia[i] >= 7 && portugues[i] >= 7) {
                System.out.print("\n" + vetor_nome[i] + " aprovado em todas as matérias ");
            }
            if (matematica[i] >= 7 && historia[i] >= 7) {
                System.out.print("\n" + vetor_nome[i] + " aprovado em matematica e historia ");
            }
            if (geografia[i] >= 7) {
                aprovados_geo++;
            } else {
                reprovado_geo++;
            }

        }
        porcentagem_aprovados = aprovados_geo / (reprovado_geo + aprovados_geo);

        System.out.print("\n A porcentagem dos que passaram em geografia " + porcentagem_aprovados);
    }
}
//Os alunos de informática tiveram cinco provas (uma de cada matéria/disciplina): 1, 2,
//3, 4 e 5. Considere aprovado o aluno com nota igual ou superior a 7.0. Criar um
//algoritmo que leia o Nome dos alunos e as suas respectivas cinco
//notas. Inicialmente o algoritmo deve perguntar quantos alunos existem na turma e
//deve também imprimir:
//- Nome dos que foram aprovados em todas as matérias;
//- Nome dos alunos aprovados nas matérias 1 e 4;
//- A porcentagem dos aprovados na matéria 3.