import java.util.Scanner;

public class SessentaESete {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[5];
        int soma = 0, i;

        for (i = 0; i < 5; i++) {
            System.out.print("Digite seus numero para soma: ");
            vetor[i] = leia.nextInt();
            if (vetor[i] == 0) {
                return;
            }
        }
        for (i = 0; i < 5; i++) {
            soma = vetor[i] + soma;
        }
        System.out.print("A soma dos  seus numero é de: " + soma);
    }
}
//Construa um algoritmo para fazer a soma de vários valores inteiros e
//positivos, fornecidos pelo usuário através do teclado. O dado que finaliza a seqüência
//de entrada é o número –1, e este não deve ser considerado.