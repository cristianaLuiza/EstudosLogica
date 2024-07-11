package lista.repeticao;

import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[8];
        int i, menornumero = 1000;
        for (i = 0; i < 8; i++) {
            System.out.print("Digite seus numeros: ");
            vetor[i] = leia.nextInt();
            if (vetor[i] < 0) {
                System.out.print("Digite somente numeros positivos");
            }
            if (vetor[i] == -1) {
                return;
            }

        }
        for (i = 0; i < 8; i++) {
            if (vetor[i] > 5 && vetor[i] < 15 && vetor[i] < menornumero) {
                menornumero = vetor[i];
            }
        }
        System.out.print("O menor valor do conjunto digitado é o numero: " + menornumero);
    }
}
//Construa um algoritmo para que: Dado um conjunto de valores
//inteiros e positivos, digitados pelo usuário através do teclado, determinar qual o menor
//valor do conjunto. O algoritmo deve imprimir o valor determinado. Quando o usuário
//decidir que finalizou a entrada de dados, ele deve digitar –1, e este dado não deve ser
//considerado.