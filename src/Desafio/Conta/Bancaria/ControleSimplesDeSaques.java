package Desafio.Conta.Bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        try {

            double limiteDiario = leia.nextDouble();
            if (limiteDiario < 0) {
                System.out.println("Digite apenas numeros positivos");
                return;
            }

            for (int i = 1; i < limiteDiario; i++) {
                double valorSaque = leia.nextDouble();
                if (valorSaque < 0) {
                    System.out.println("Digite apenas numeros positivos");
                    return;
                }

                if (valorSaque == 0) {
                    System.out.println("Transacoes encerradas.");
                    break;
                } else if (valorSaque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break;
                }
                if (valorSaque < limiteDiario) {
                    double valor_atualizado = limiteDiario - valorSaque;
                    System.out.println("Saque realizado. Limite restante: " + valor_atualizado);
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Digite apenas valores numericos");
        }

        leia.close();
    }
}