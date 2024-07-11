package lista.repeticao;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, quadrado = 0;
        int vetor[] = new int[3];

        for (i = 0; i < 3; i++) {
            System.out.print("Digite seu numero:");
            vetor[i] = leia.nextInt();
            if (vetor[i] % 6 == 0) {
                return;
            }
            quadrado = vetor[i] * vetor[i];
            System.out.print("Seu numero ao quadrado é: " + quadrado + " \n");

        }
    }
}
// Escreva um algoritmo em que receba números e imprima o quadrado de
//cada número até entrar um número múltiplo de 6 que deverá ter seu quadrado também
//impresso.

