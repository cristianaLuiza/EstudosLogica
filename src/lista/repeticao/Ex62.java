package lista.repeticao;

import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros_usuario = 0, contador = 0;

        do {

            System.out.print("Digite o numero do usuario: \n");
            numeros_usuario = scanner.nextInt();
            if (numeros_usuario >= 0) {
                contador++;
            }

        } while (numeros_usuario != 0);

        System.out.println("Foram digitados " + contador + " números.");
    }
}
// Escreva um algoritmo em que receba números do usuário enquanto eles
//forem positivos e ao fim o algoritmo deve imprimir quantos números foram digitados.