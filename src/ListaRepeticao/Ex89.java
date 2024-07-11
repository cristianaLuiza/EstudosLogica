import java.util.Scanner;

public class Ex89 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros = 1000;
        int n[] = new int[numeros];
        int i, fatorial = 1;
        for (i = 0; i <= numeros; i++) {
            System.out.print("Digite seu numeros: ");
            n[i] = leia.nextInt();
            if (n[i] < 1) {
                break;
            }
            for (i = n[i]; i >= 1; i--) {
                fatorial = i * fatorial;
            }
            System.out.print("\nO fatorial de " + n[i] + " é " + fatorial + "\n");
        }
    }
}
//Criar um algoritmo  que leia vários números inteiros e apresente o
//fatorial de cada número. O algoritmo deve finalizar quando um número menor do que
//1 é digitado