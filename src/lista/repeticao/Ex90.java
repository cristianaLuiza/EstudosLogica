package lista.repeticao;

import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros = 1000;
        int n[] = new int[numeros];
        int i;
        for (i = 0; i < numeros; i++) {
            System.out.print("Digite seu numero para saber se ele é um quadrado perfeito: ");
            n[i] = leia.nextInt();
            if(n[i]<=0){
                break;
            }
        }
        for (i = 0; i < n[i]; i++) {
            double variavel = Math.sqrt(n[i]);
            if (variavel%1==0) {
                System.out.print("\nSeu numero "+n[i]+ " é um quadrado perfeito");
            } else{
                System.out.print("\nSeu numero "+n[i]+ " não é  quadrado perfeito");
            }
        }

    }
}
// Escreva um algoritmo que receba vários números e verifique se eles
//são ou não quadrados perfeitos. O algoritmo termina a execução quando for digitado
//um número menor ou igual a 0. (Um número é quadrado perfeito quando tem um
//número inteiro como raiz quadrada.)
