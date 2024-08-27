package lista.repeticao;

import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor_numero[] = new int[3];
        int i;

        for (i = 0; i < 3; i++) {
            System.out.print("Digite seus 3 numeros: ");
            vetor_numero[i] = leia.nextInt();
        }
        if (vetor_numero[1] == vetor_numero[0] + 1 && vetor_numero[2] == vetor_numero[0] + 2)
        {
            System.out.print("Seus numeros são de um triângulo");
        } else {
            System.out.print("Seus numeros não formam um triângulo");
        }
    }
}
//Construa um algoritmo que receba um número e verifique se ele é
//um número triangular. (Um número é triangular quando é resultado do produto de três
//números consecutivos. Exemplo: 24 = 2 x 3 x 4)