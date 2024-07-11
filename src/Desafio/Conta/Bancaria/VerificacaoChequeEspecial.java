package Desafio.Conta.Bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        try {
        double saldo = leia.nextDouble();
        double saque = leia.nextDouble();

            double limiteChequeEspecial = 500;

            if (saque <= saldo) {
                System.out.println("Transação realizada com sucesso.");
            return;}
            if (saque <= limiteChequeEspecial+saldo) {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        } catch(InputMismatchException exception){
            System.out.println("Digite apenas valores numericos");
        }
        leia.close();
    }
}