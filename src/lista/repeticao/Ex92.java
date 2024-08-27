package lista.repeticao;

import java.util.Scanner;

public class Ex92 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double renda_pessoal = 0, renda_familiar = 0, total_alimentacao = 0, total_despesas = 0;
        double porcentagem_desepsas = 0, porcentagem_alimentacao = 0, relacao=0,  renda_pessoal_maior=0, total_despesas_200=0;

        System.out.println("Renda pessoal: ");
        renda_pessoal = leia.nextDouble();
        System.out.println("Renda familiar: ");
        renda_familiar = leia.nextDouble();
        System.out.println("Total gasto com alimentação: ");
        total_alimentacao = leia.nextDouble();
        System.out.println("Total gasto com outras despesas: ");
        total_despesas = leia.nextDouble();

        while (renda_pessoal != 0) {
            if (total_despesas > 200) {
                total_despesas_200++;
                porcentagem_desepsas = total_despesas_200/total_despesas;
            }
            if (renda_pessoal > renda_familiar) {
                renda_pessoal_maior++;
            }
            porcentagem_alimentacao = total_alimentacao / 100;
            relacao= (renda_pessoal + renda_familiar)-(porcentagem_desepsas + porcentagem_alimentacao);

            System.out.println("Renda pessoal: ");
            renda_pessoal = leia.nextDouble();
            System.out.println("Renda familiar: ");
            renda_familiar = leia.nextDouble();
            System.out.println("Total gasto com alimentação: ");
            total_alimentacao = leia.nextDouble();
            System.out.println("Total gasto com outras despesas: ");
            total_despesas = leia.nextDouble();
        }

        System.out.println("Porcentagem dos alunos que gasta\n" +
                "acima de R$ 200,00 com outras despesas " + porcentagem_desepsas);
        System.out.println("Número de alunos com renda pessoal\n" +
                "maior que renda familiar " + renda_pessoal_maior);
        System.out.println("porcentagem gasta com alimentação e outras despesas em\n" +
                "relação às rendas pessoal e familiar " + relacao);

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