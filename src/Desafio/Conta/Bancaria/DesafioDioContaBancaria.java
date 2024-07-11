package Desafio.Conta.Bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioDioContaBancaria {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double saldo = 0, deposito = 0, saque = 0;
        boolean continuar = true;

        while (continuar) {
            try {

                int opcao = leia.nextInt();

                switch (opcao) {
                    case 1:
                        deposito = leia.nextDouble();
                        if (deposito <= 0) {
                            System.out.println("Digite valores positivos");
                            break;
                        }
                        saldo = saldo + deposito;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                        break;
                    case 2:
                        saque = leia.nextDouble();
                        if (saque <= 0) {
                            System.out.println("Digite valores positivos");
                            break;
                        }
                        if (saque > saldo) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo = saldo - saque;
                            System.out.printf("Saldo atual: %.1f%n", saldo);
                        }
                        break;
                    case 3:
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");

                }
            } catch (InputMismatchException exception) {
                System.out.println("Digite apenas valores numericos");
                continuar = false;
            }
        } leia.close();

    }
}
//1-Depositar
//2-Sacar
//3-Consultar Saldo
//4-Encerrar
//1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o
// saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
//2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve
// imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
//3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
//0: O programa encerrará, imprimindo