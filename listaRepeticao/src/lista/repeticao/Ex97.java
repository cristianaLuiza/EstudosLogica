package lista.repeticao;

import java.util.Scanner;

public class Ex97 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double saldo = 0, percentual_negativo = 0.00, conta = 0, negativo = 0, conta_total=0, positivo=0;

        System.out.print("Digite sua conta: ");
        conta = leia.nextInt();
        System.out.print("Digite seu saldo");
        saldo = leia.nextDouble();

        while (conta > 0) {

            if (saldo < 0) {
                negativo++;
                System.out.print("Conta:" + conta + "\nSaldo:" + saldo);
                System.out.print("\nNegativo\n");
            } else {
                positivo++;
                System.out.print("Conta:" + conta + "\nSaldo:" + saldo);
                System.out.print("\nPositivo\n");
            }


            System.out.print("Digite sua conta: ");
            conta = leia.nextInt();
            System.out.print("Digite seu saldo");
            saldo = leia.nextDouble();
        }
        conta_total= negativo+positivo;
        percentual_negativo = negativo / conta_total;
        System.out.printf("\nO percentual de pessoas com saldo negativo %.2f" , percentual_negativo);

    }
}
//Escreva um algoritmo que receba o número da conta e o saldo de
//várias pessoas. O algoritmo deve imprimir todas as contas, os respectivos saldos e
//uma das mensagens: positivo/negativo. Ao final, o percentual de pessoas com saldo
//negativo. O algoritmo acaba quando se digita um número negativo para a conta.