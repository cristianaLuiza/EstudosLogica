package matriz;

import java.util.Scanner;

public class ExMatriz16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] TP = new String[3]; //TP=tipo de planta
        int[][] M = new int[4][3];

        for (int I = 0; I < 4; I++) {
            System.out.print("Planta: ");
            TP[I] = leia.nextLine();

            System.out.print("Quantidade ideal para estoque: ");
            M[I][0] = leia.nextInt();
            if( M[I][0]==0){
                break;
            }

            System.out.print("Quantidade atual no estoque: ");
            M[I][1] = leia.nextInt();
            leia.nextLine();
            if( M[I][1]==0){
                break;
            }

            M[I][2] = M[I][1] - M[I][0];
        }

        for (int I = 0; I < 4; I++) {
            if (M[I][2] < 0) {
                System.out.println("Planta "+ TP[I] + " comprar: " + (-M[I][2]));
            }

        }


        leia.close();
    }
}
//Criar um algoritmo que deixe cadastrar 50
//tipos de plantas e nunca deixar o estoque ficar abaixo do ideal. Para cada planta, o
//dono gostaria de cadastrar o nome, o estoque ideal e a quantidade em estoque. Dessa
//forma o algoritmo pode calcular a quantidade que o dono da loja precisa comprar no
//próximo dia. Essa quantidade a ser comprada deve ser impressa (quando maior que
//zero) como uma lista para o dono da floricultura