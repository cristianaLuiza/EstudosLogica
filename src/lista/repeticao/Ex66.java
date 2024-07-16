package lista.repeticao;

import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[10];
        int i, somapar = 0, somaimpar = 0, numeros_par = 0, numero_impar = 0;
        int maior_numero = 0, menor_numero = 1000;
        float mediapar, mediaimpar;

        for (i = 0; i < 10; i++) { //TODO: DEVERÁ PARAR QUANDO RECEBER UM NÚMERO NEGATIVO
            System.out.print("Digite seus numeros para média: ");
            vetor[i] = leia.nextInt();
            if (vetor[i] < 0) {
                return; //TODO: DEVERIA SER UM RETURN OU BREAK?
            }
        }
        for (i = 0; i < 10; i++) { //TODO: DEVERÁ PARAR QUANDO RECEBER UM NÚMERO NEGATIVO
            if (vetor[i] % 2 == 0) {
                numeros_par++;
                somapar = vetor[i] + somapar;
            } else {
                numero_impar++;
                somaimpar = vetor[i] + somaimpar;
            }
        }
        mediapar = somapar / numeros_par;
        mediaimpar = somaimpar / numero_impar;

        for (i = 0; i < 10; i++) {//TODO: EXISTE UMA FORMA DE OTIMIZAR A QUANTIDADE DE FOR? PRECISO REALMENTE DE UM VETOR?
            if (vetor[i] > maior_numero && vetor[i] % 2 == 0) {
                maior_numero = vetor[i];
            } else if (vetor[i] < menor_numero && vetor[i] % 2 == 1) {
                menor_numero = vetor[i];
            }
        }

        System.out.print("A média impar será " + mediaimpar + " e a media par será " + mediapar + "\n");
        System.out.print("O maior numero Par será " + maior_numero + " o menor numero impar será " + menor_numero);

    }
}

//Construa um algoritmo para calcular a média de valores PARES e
//ÍMPARES, que serão digitados pelo usuário. Ao final o algoritmo deve mostrar estas
//duas médias. O algoritmo deve mostrar também o maior número PAR digitado e o
//menor número ÍMPAR digitado. Para finalizar o usuário irá digitar um valor negativo.
