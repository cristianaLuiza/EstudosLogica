package matriz;

import java.util.Scanner;

public class ExMatrizVideo6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char[][] jovoVelha = new char[3][3];//O e X

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        boolean ganhou = false;
        while (!ganhou) {//enquanto ninguém ganhou continuamos com o jogo

            if (jogada % 2 == 1) { //como diferenciar os jogadores visto que jogada vale 1, ou seja 1/2 resto diferente de 0
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida) { //enquanto a linha for valida acho linha e coluna
                System.out.println("\nEntre com a linha (1,2 ou 3");
                linha = leia.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada invalida,tente novamente");
                }
            }
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1,2 ou 3");
                coluna = leia.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada invalida,tente novamente");
                }
            }
            linha--;//pq se o usuario ultilizar 3x3 pode dar erro visto que n existe a posição 3
            coluna--;
            if (jovoVelha[linha][coluna] == 'X' || jovoVelha[linha][coluna] == 'O') { // já tiver um sinal dentr, posição já usada, se não jogada ++ para atualizar
                System.out.println("Posição já usada, tente novamente");
            } else {
                jovoVelha[linha][coluna] = sinal;
                jogada++;
            }
            //imprimir tabuleiro
            for (int i = 0; i < jovoVelha.length; i++) {
                for (int j = 0; j < jovoVelha[i].length; j++) {
                    System.out.print(jovoVelha[i][j] + " | ");
                }
                System.out.printf("%n");
            }
            //verificar se tem ganhador
            if ((jovoVelha[0][0] == 'X' && jovoVelha[0][1] == 'X' && jovoVelha[0][2] == 'X') || //linha 1
                    (jovoVelha[1][0] == 'X' && jovoVelha[1][1] == 'X' && jovoVelha[1][2] == 'X') || //linha 2
                    (jovoVelha[2][0] == 'X' && jovoVelha[2][1] == 'X' && jovoVelha[2][2] == 'X') || //linha 3
                    (jovoVelha[0][0] == 'X' && jovoVelha[1][0] == 'X' && jovoVelha[2][0] == 'X') || //coluna 1
                    (jovoVelha[0][1] == 'X' && jovoVelha[1][1] == 'X' && jovoVelha[2][1] == 'X') || //coluna 2
                    (jovoVelha[0][2] == 'X' && jovoVelha[1][2] == 'X' && jovoVelha[2][2] == 'X') || //coluna 3
                    (jovoVelha[0][0] == 'X' && jovoVelha[1][1] == 'X' && jovoVelha[2][2] == 'X')) {  //Diagonal
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((jovoVelha[0][0] == 'O' && jovoVelha[0][1] == 'O' && jovoVelha[0][2] == 'O') || //linha 1
                    (jovoVelha[1][0] == 'O' && jovoVelha[1][1] == 'O' && jovoVelha[1][2] == 'O') || //linha 2
                    (jovoVelha[2][0] == 'O' && jovoVelha[2][1] == 'O' && jovoVelha[2][2] == 'O') || //linha 3
                    (jovoVelha[0][0] == 'O' && jovoVelha[1][0] == 'O' && jovoVelha[2][0] == 'O') || //coluna 1
                    (jovoVelha[0][1] == 'O' && jovoVelha[1][1] == 'O' && jovoVelha[2][1] == 'O') || //coluna 2
                    (jovoVelha[0][2] == 'O' && jovoVelha[1][2] == 'O' && jovoVelha[2][2] == 'O') || //coluna 3
                    (jovoVelha[0][0] == 'O' && jovoVelha[1][1] == 'O' && jovoVelha[2][2] == 'O')) {  //Diagonal)
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou a partida");
            }

        }
    }
}
