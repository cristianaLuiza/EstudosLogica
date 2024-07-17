package lista.repeticao;

import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero, somapar = 0, somaimpar = 0, numeros_par = 0, numero_impar = 0;
        int maior_numero = 0, menor_numero = 1000;
        float mediapar, mediaimpar;

        System.out.print("Digite seus numeros para média: ");
        numero = leia.nextInt();
        do {
            if (numero <= 0) {
                break;
            }

            if (numero % 2 == 0) {
                numeros_par++;
                somapar = numero + somapar;
            } else {
                numero_impar++;
                somaimpar = numero + somaimpar;
            }

            if (numero > maior_numero && numero % 2 == 0) {
                maior_numero = numero;
            } else if (numero < menor_numero && numero % 2 == 1) {
                menor_numero = numero;
            }
            System.out.print("Digite seus numeros para média: ");
            numero = leia.nextInt();
        }
        while (true);
        mediapar = somapar / numeros_par;
        mediaimpar = somaimpar / numero_impar;

        System.out.print("A média impar será " + mediaimpar + " e a media par será " + mediapar + "\n");
        System.out.print("O maior numero Par será " + maior_numero + " o menor numero impar será " + menor_numero);

    }
}

//Construa um algoritmo para calcular a média de valores PARES e
//ÍMPARES, que serão digitados pelo usuário. Ao final o algoritmo deve mostrar estas
//duas médias. O algoritmo deve mostrar também o maior número PAR digitado e o
//menor número ÍMPAR digitado. Para finalizar o usuário irá digitar um valor negativo.
