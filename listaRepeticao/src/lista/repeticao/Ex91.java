package lista.repeticao;

import java.util.Scanner;

public class Ex91 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int turmaA = 100, turmaB = 100, turmaC = 100, contadores = 100;
        int notasA[] = new int[turmaA], notasB[] = new int[turmaB], notasC[] = new int[turmaC];
        int i, aprovadosA = 0, aprovadosB = 0, aprovadosC = 0, notas_total;
        int contadorA = 0, contadorB = 0, contadorC = 0;
        int reprovadosA = 0, reprovadosB = 0, reprovadosC = 0;
        int soma_notasA = 0, soma_notasB = 0, somas_notasC = 0;
        double percentualA = 0, percentualB = 0, percentualC = 0, mediaA = 0, mediaB = 0, mediaC = 0;

        for (i = 0; i < turmaA; i++) {
            System.out.print("Digite as notas da turma A: ");
            notasA[i] = leia.nextInt();
            if (notasA[i] < 0) {
                break;
            }
        }
        for (i = 0; i < turmaB; i++) {
            System.out.print("Digite as notas da turma B: ");
            notasB[i] = leia.nextInt();
            if (notasB[i] < 0) {
                break;
            }
        }
        for (i = 0; i < turmaC; i++) {
            System.out.print("Digite as notas da turma C: ");
            notasC[i] = leia.nextInt();
            if (notasC[i] < 0) {
                break;
            }
        }

        for (i = 0; i < turmaA; i++) {

            if (notasA[i] > 0) {
                soma_notasA = notasA[i] + soma_notasA;
                contadorA++;
            }

            if (notasA[i] >= 7)
                aprovadosA++;

            if (notasA[i] >= 0 && notasA[i] < 7)
                reprovadosA++;
        }
        percentualA = reprovadosA / contadorA;
        mediaA = soma_notasA / contadorA;

        for (i = 0; i < turmaB; i++) {
            if (notasB[i] > 0) {
                soma_notasB = notasB[i] + soma_notasB;
                contadorB++;
            }

            if (notasB[i] >= 7)
                aprovadosB++;

            if (notasB[i] >= 0 && notasB[i] < 7)
                reprovadosB++;
        }
        percentualB = reprovadosB / contadorB;
        mediaB = soma_notasB / contadorB;

        for (i = 0; i < turmaC; i++) {

            if (notasC[i] > 0) {
                somas_notasC = notasC[i] + somas_notasC;
                contadorC++;
            }

            if (notasC[i] >= 7)
                aprovadosC++;

            if (notasC[i] >= 0 && notasC[i] < 7)
                reprovadosC++;
        }
        percentualC = reprovadosC / contadorC;
        mediaC = somas_notasC / contadorC;

        System.out.print("Total de aprovados da turma A foi " + aprovadosA + " turma B " + aprovadosB + " turma C " + aprovadosC);
        System.out.print("\nA media da turma A foi de " + mediaA + " da turma B " + mediaB + " e da turma C " + mediaC);
        System.out.print("\nO percentual de reprovados na turma A foi " + percentualA + " turma B " + percentualB + " turma C " + percentualC);


    }
}
//Numa universidade, os alunos das turmas de informática fizeram uma prova de
//algoritmos. Cada turma possui um número de alunos. Criar um algoritmo
//que imprima para cada turma:
//- Quantidade de alunos aprovados;
//- Média de cada turma;
//- Percentual de reprovados.
//Considere aprovado aluno com nota igual ou superior a 7.0. O programa deve ler o
//número de alunos de cada turma e só finalizar o programa quando um número não
//positivo de alunos for digitado.
