package Desafio.Conta.Bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        try {

            int idade = leia.nextInt();
            if (idade >= 18 && idade < 140) {
                System.out.println("Voce esta elegivel para criar uma conta bancaria.");
            } else {
                System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Digite apenas valores numericos");
        }

        leia.close();
    }
}