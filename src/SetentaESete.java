import java.util.Scanner;

public class SetentaESete {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[6];
        int i, maior=0, menor =1000, numeros = 0;
        double media, soma = 0;

        for (i = 0; i < 6; i++) {
            System.out.print("Digite seus numeros: ");
            vetor[i] = leia.nextInt();
            if (vetor[i] == 0) {
                return;
            }
        }
        for (i = 0; i < 6; i++) {
            if (vetor[i] > maior) {
                maior=vetor[i];
            } if (vetor[i]<menor){
                menor=vetor[i];
            }
            numeros++;
            soma = soma + vetor[i];
        }
        media = soma / numeros;
        System.out.print("Maior numero: "+maior);
        System.out.print("\nMenor numero: "+menor);
        System.out.print("\nA média dos numero é de "+media);
    }
}
//Criar um algoritmo que leia vários números e encerre a leitura com 0
//e imprima o maior, o menor e a média aritmética dos números. O número 0 (zero) não
//faz parte da seqüência.