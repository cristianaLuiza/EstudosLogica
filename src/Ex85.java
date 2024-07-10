import java.util.Scanner;

public class Ex85 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros = 1000;
        int vetor[] = new int[numeros];
        int i, multiplos = 0;
        double media, soma_multiplo = 0;

        for (i = 0; i < numeros; i++) {
            System.out.print("Digite seus numeros: ");
            vetor[i] = leia.nextInt();
            if (vetor[i] < 0) {
                break;
            }
        }

        for (i = 0; i < numeros; i++) {
            if (vetor[i] % 3 == 0 && vetor[i] > 0) {
                multiplos++;
                soma_multiplo = vetor[i] + soma_multiplo;
            }
        }

        media = soma_multiplo / multiplos;
        System.out.print("A média dos multiplos de 3 é " + media);
    }
}
// Criar um algoritmo que receba vários números inteiros e positivos e
//imprima a média dos números múltiplos de 3. A execução deve encerrar quando um
//número não positivo for lido.