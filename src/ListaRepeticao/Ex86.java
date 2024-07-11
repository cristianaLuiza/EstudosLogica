import java.util.Scanner;

public class Ex86 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros = 1000;
        int n;
        int i, j,contador=0;
        boolean primo;

        for (i = 0; i < numeros; i++) {
            System.out.print("Digite seus numeros: ");
            n = leia.nextInt();
            if (n <= 0) {
                break;
            }
            primo = n % 1 == 0 && n > 0;
            for (j = 2; j < n; j++) {
                if (n % j == 0) {
                    primo = false;
                }
            }
            if(primo==true){
                contador++;
            }
        }
        System.out.print("O total de numeros primos foi de " + contador);


    }
}
//Escreva um algoritmo que receba vários números inteiros e imprima
//a quantidade de números primos dentre os números que foram digitados. O algoritmo
//acaba quando se digita um número menor ou igual a 0.