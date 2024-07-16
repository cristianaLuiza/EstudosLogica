package lista.repeticao;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, quadrado = 0;
        int vetor[] = new int[3];

        for (i = 0; i < 3; i++) { //TODO: DEVERÁ PARAR QUANDO RECEBER UM NÚMERO NEGATIVO
            System.out.print("Digite seu numero:");
            vetor[i] = leia.nextInt();
            if (vetor[i] % 6 == 0) {
                return; //TODO: DEVERIA SER UM BREAK OU UM RETURN?
            }
            quadrado = vetor[i] * vetor[i];
            System.out.print("Seu numero ao quadrado é: " + quadrado + " \n"); //TODO: ESTÁ IMPRIMINDO O QUADRADO DO NÚMERO MULTIPLO DE 6?

        }
    }
}
// Escreva um algoritmo em que receba números e imprima o quadrado de
//cada número até entrar um número múltiplo de 6 que deverá ter seu quadrado também
//impresso.

