package lista.repeticao;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = 0, contador = 0;

        do {
            System.out.print("Digite seus numeros: ");
            n = leia.nextInt();

            if (n > 100 && n < 200) {
                contador++;
            }

        } while (n != 0);

        System.out.print("Vc digitou " + contador + " numeros");

    }
}
//Escreva um algoritmo que leia vários números e informe quantos
//números entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido, o
//algoritmo deverá cessar sua execução.