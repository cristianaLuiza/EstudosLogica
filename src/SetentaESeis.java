import java.util.Scanner;

public class SetentaESeis {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[6];
        int i, soma = 0;

        for (i = 0; i < 6; i++) {
            System.out.print("Digite seus numero: ");
            vetor[i] = leia.nextInt();
        }
        System.out.print("Impares: ");
        for (i = 0; i < 6; i++) {
            if (vetor[i] % 2 == 0) {
                soma = vetor[i] + soma;
            } else {
                System.out.print(vetor[i]+",");
            }
        }
        System.out.print("\nO resultado da soma dos pares " + soma);
    }
}
//Criar um algoritmo em PORTUGOL que receba vários números inteiros e positivos e
//imprima o produto dos números ímpares digitados e a soma dos pares. O algoritmo
//encerra quando o zero ou um número negativo é digitado