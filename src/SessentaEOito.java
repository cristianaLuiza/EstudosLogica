import java.util.Scanner;

public class SessentaEOito {
    public static void main (String[] args){
        Scanner leia= new Scanner( System.in);
        int i, soma=0,numeros=0;
        int vetor[]=new int[5];
        float media;

        for(i=0;i<5;i++){
            System.out.print("Digite seus numeros: ");
            vetor[i] = leia.nextInt();
            if(vetor[i]==-1){
                return;
            }
        }
        for(i=0;i<5;i++){
            if(vetor[i]>=10 && vetor[i]<=20) {
                numeros++;
                soma=vetor[i]+soma;
            }
        }
        media=soma/numeros;
        System.out.print("A médias de numeros dentro do conjunto de 10 á 20: "+media);



    }
}
//Construa um algoritmo em PORTUGOL para calcular a média de um conjunto de
//valores inteiros e positivos, fornecidos pelo usuário através do teclado. Novamente, o
//dado finalizar é o número –1, e este não deve ser considerado.
