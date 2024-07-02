import java.util.Scanner;

public class Ex83 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros = 10;
        int vetor_numeros[] = new int[numeros];
        int i, maior_numero = 0;

        for (i = 0; i < numeros; i++) {
            System.out.print("Digite seus numeros: ");
            vetor_numeros[i] = leia.nextInt();
            if (vetor_numeros[i] == -999) {
                break;
            }
        }

        for (i = 0; i < numeros; i++) {

            if (vetor_numeros[i] > maior_numero) {
                maior_numero = vetor_numeros[i];
            }
        }
        System.out.print("Seu maior numero foi "+maior_numero);

    }
}
//Escreva um algoritmo que receba vários números e ao final imprima
//o maior número digitado. O algoritmo acaba quando se digita –9999;