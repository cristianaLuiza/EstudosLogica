package lista.repeticao;

import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n[] = new int[4];
        int i;

        for (i = 0; i <= 3; i++) {
            System.out.print("Digite seus numeros: ");
            n[i] = leia.nextInt();
            if (n[i] <= 0) {
                System.out.print("Os numeros digitados não deve ser negativo");
                return;
            }
        }
        for (i = 0; i <= 3; i++) {
            System.out.print("\nA raiz do seu numero " + n[i] + " é " + Math.sqrt(n[i]));
        }
    }
}
//Criar um algoritmo que receba 10 números positivos e imprima a
//raiz quadrada de cada número. Para cada entrada de dados deverá haver um trecho de
//proteção para que um número negativo não seja aceito.
