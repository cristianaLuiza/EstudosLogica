package lista.repeticao;

import java.util.Scanner;

public class Ex63 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeros=0, i, soma=0, conta_numero=0;
        float  media;

        for( i = 0;i < 3;i++){ //TODO: DEVERÁ PARAR QUANDO RECEBER UM NÚMERO NEGATIVO
            System.out.print("Digite seu numero:");
            numeros = scanner.nextInt();
            if (numeros >=0 ){conta_numero++;
                soma = numeros + soma;} //TODO: Formatar o código
        }

        media = soma/conta_numero; //TODO: corrigir possível divisão por zero
        System.out.println("Você digitou " + conta_numero +" numeros e sua média foi de " + media);
    }
}
// Escreva um algoritmo que receba números do usuário enquanto eles
//forem positivos e ao fim o algoritmo deve imprimir a média dos números digitados.