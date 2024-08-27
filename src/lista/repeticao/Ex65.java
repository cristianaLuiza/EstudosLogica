package lista.repeticao;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int  quadrado = 0, numeros = 0;


        do {
            System.out.print("\nDigite um numero:");
            numeros = leia.nextInt();

            if ( quadrado%2==0) {
                quadrado=numeros*numeros;
                System.out.print("\nSeu numero ao quadrado é: " + quadrado );
            }

            else if (numeros % 6 == 0) {
                System.out.print("\n"+numeros+ " é um multiplo de 6");
                break;
            }
        } while (true);

    }
}
// Escreva um algoritmo em que receba números e imprima o quadrado de
//cada número até entrar um número múltiplo de 6 que deverá ter seu quadrado também
//impresso.

