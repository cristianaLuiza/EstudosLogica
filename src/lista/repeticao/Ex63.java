package lista.repeticao;

import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros_usuarios = 0;
        double media, soma = 0, conta_numero = 0;

        System.out.print("Digite seu numero:");
        numeros_usuarios = scanner.nextInt();

        do {

            if (numeros_usuarios <= 0) {
                break;
            }
            if (numeros_usuarios > 0) {
                conta_numero++;
                soma = numeros_usuarios + soma;
            }

            System.out.print("Digite seu numero:");
            numeros_usuarios = scanner.nextInt();
        } while (true);

        media = soma / conta_numero;

        System.out.println("Você digitou " + conta_numero + " numeros e sua média foi de " + media);
    }
}
// Escreva um algoritmo que receba números do usuário enquanto eles
//forem positivos e ao fim o algoritmo deve imprimir a média dos números digitados.