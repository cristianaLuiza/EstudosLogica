package lista.repeticao;

import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[10];
        int i, menornumero = 1000, maiornumero = 0;


        for (i = 0; i < 10; i++) {
            System.out.print("Digite seus numeros: ");
            vetor[i] = leia.nextInt();
            if (vetor[i] == -1) {
                return;
            }
            else if(vetor[i]<0){
                System.out.print("Digite somente numeros positivos");
            }
        }
        for (i = 0; i < 10; i++) {
            if(vetor[i]<menornumero){
                menornumero=vetor[i];
            }
            else if(vetor[i]>maiornumero) {
                maiornumero=vetor[i];
            }
        }
        System.out.print("Seu maior numero digitado foi "+maiornumero+" e seu menor numero foi "+menornumero);
    }
}
//Construa um algoritmo para encontrar o maior e o menor número de
//uma série de números positivos fornecidos pelo usuário através do teclado.
//Novamente, o dado finalizador é o número –1, e este não deve ser considerado.