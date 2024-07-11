package lista.repeticao;

import java.util.Scanner;

public class Ex87 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros = 1000;
        int vetor_numeros[] = new int[numeros];
        int i;

        for (i = 0; i < numeros; i++) {
            System.out.print("Digite seus numeros: ");
            vetor_numeros[i] = leia.nextInt();
            if (vetor_numeros[i] == -999) {
                break;
            }
        }

        for (i = 0; i < numeros; i++) {
            for (int c = -999; c <= vetor_numeros[i]; c++) {
                if (c != 0 && vetor_numeros[i] != 0) {
                    if (vetor_numeros[i] % c == 0) {
                        System.out.print("\ndivisores: " + c);
                    }
                }

            }
        }
    }
}

//Escreva um algoritmo que receba vários números, e finalize com a
//entrada do número –999. Para cada número, o algoritmo deve imprimir seus divisores.
