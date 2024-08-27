package lista.repeticao;

import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros = 0, soma = 0;

        System.out.print("Digite seus numero para a soma: ");
        numeros = leia.nextInt();

        do {
            soma = numeros + soma;
            System.out.print("Digite seus numero para a soma: ");
            numeros = leia.nextInt();

        } while (numeros !=-1);


        System.out.print("Resultado soma: " + soma);
    }
}
//Construa um algoritmo para fazer a soma de vários valores inteiros e
//positivos, fornecidos pelo usuário através do teclado. O dado que finaliza a seqüência
//de entrada é o número –1, e este não deve ser considerado.