package lista.repeticao;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, n = 0, contador = 0;

        for (i = 0; i < 3; i++) { //TODO: DEVERÁ PARAR QUANDO RECEBER UM NÚMERO NEGATIVO
            System.out.print("Digite seu numero: ");
            n = leia.nextInt();
            if (n > 100 && n < 200) {
                contador = contador + 1;
            }
            if (n == 0) {
                return; //TODO: DEVERIA SER UM RETURN OU UM BREAK?
            }
        }
        System.out.print(" Vc digitou " + contador + " numeros");

    }
}
//Escreva um algoritmo que leia vários números e informe quantos
//números entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido, o
//algoritmo deverá cessar sua execução.