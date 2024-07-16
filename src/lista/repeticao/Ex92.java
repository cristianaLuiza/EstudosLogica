package lista.repeticao;

import java.util.Scanner;

public class Ex92 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i;
        int total_alunos, alunos_maior_renda = 0;
        double porcentagem_despesas = 0, contador_depesas = 0, porcentagem_alimentacao = 0, soma_alimentacao = 0, alimentacao_despesas = 0;
        double porcentagens_pessoal=0, porcentagem_familiar=0;
        System.out.println("Digite o total de alunos: ");
        total_alunos = leia.nextInt();
        double total_gasto_outras_despesas[] = new double[total_alunos];
        for (i = 0; i < total_alunos; i++) {
            System.out.println(" Total gasto com outras despesas: ");
            total_gasto_outras_despesas[i] = leia.nextDouble();
        }
        for (i = 0; i < total_alunos; i++) {
            if (total_gasto_outras_despesas[i] > 200) {
                contador_depesas++;
            }
        }

        double renda_familiar[] = new double[total_alunos];
        for (i = 0; i < total_alunos; i++) {
            System.out.println(" Renda familiar: ");
            renda_familiar[i] = leia.nextDouble();
        }
        double renda_pessoal[] = new double[total_alunos];
        for (i = 0; i < total_alunos; i++) {
            System.out.println(" Renda pessoal: ");
            renda_pessoal[i] = leia.nextDouble();
            if (renda_pessoal[i] == 0) {
                break;
            }
        }
        for (i = 0; i < total_alunos; i++) {
            if (renda_pessoal[i] > renda_familiar[i]) {
                alunos_maior_renda++;
            }
        }
        double gasto_alimentacao[] = new double[total_alunos];
        for (i = 0; i < total_alunos; i++) {
            System.out.print("Gasto com alimentação: ");
            gasto_alimentacao[i] = leia.nextDouble();
        }
        for (i = 0; i < total_alunos; i++) {
            alimentacao_despesas = gasto_alimentacao[i] + total_gasto_outras_despesas[i];
            porcentagens_pessoal=alimentacao_despesas/renda_pessoal[i];
            porcentagem_familiar=alimentacao_despesas/renda_familiar[i];
        }

        porcentagem_despesas = contador_depesas / total_alunos;
        System.out.printf("A porcentagem de alunos que gastam acima de 200 é %.2f ", porcentagem_despesas);
        System.out.print("\nTotal de alunos com renda pessoal maior que renda familiar é " + alunos_maior_renda);
        System.out.print("\nA porcentagem gasta com alimentação e outras despesas em relação a rendas pessoal é "+ porcentagens_pessoal+" e familiar "+porcentagem_familiar);
    }
}

//Numa universidade cada aluno possui os seguintes dados:
//- Renda pessoal;
//- Renda familiar;
//- Total gasto com alimentação;
//- Total gasto com outras despesas;
//Criar um algoritmo que imprima a porcentagem dos alunos que gasta
//acima de R$ 200,00 com outras despesas, o número de alunos com renda pessoal
//maior que renda familiar e a porcentagem gasta com alimentação e outras despesas em
//relação às rendas pessoal e familiar. O algoritmo acaba quando se digita 0 para a renda
//pessoal.