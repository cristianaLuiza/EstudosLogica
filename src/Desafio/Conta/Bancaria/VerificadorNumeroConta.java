package Desafio.Conta.Bancaria;

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        try {
            String numeroConta = leia.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        } finally {

            leia.close();
        }
    }
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}