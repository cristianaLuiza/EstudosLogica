package ExPOO010IFBA;

import java.security.SecureRandom;
import java.util.Scanner;

public class Matriz {
    public int linha;
    public int coluna;
    public int m[][] = new int[linha][coluna];

    public Matriz(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;

    }

    public int leituraEscritaElementos() {
        for (int i = 0; i < this.linha; i++) {
            for (int j = 0; j < this.coluna; j++) {
                m[i][j] = new SecureRandom().nextInt(9);
            }
        }
        return leituraEscritaElementos();
    }

    public int comparacaoSemantica() {
        for (int i = 0; i < this.linha; i++) {
            for (int j = 0; j < this.coluna; j++) {
                System.out.printf("%2d | ", m[i][j]);
            }
            System.out.printf("%n");
        }
        return comparacaoSemantica();
    }

    public int transposta() {
        int matrizTransposta[][] = new int[this.coluna][this.linha];

        return transposta();
    }

    public int sinalOposto() {
        for (int i = 0; i < this.linha; i++) {
            for (int j = 0; j < this.coluna; j++) {
                SecureRandom secureRandom = new SecureRandom();
                int randomNumber = secureRandom.nextInt(9);
                int negativoNumber = ((randomNumber * 0) - randomNumber);
                m[i][j] = new SecureRandom().nextInt(9);
            }
        }
        return sinalOposto();
    }

    public int nulo() {
        for (int i = 0; i < this.linha; i++) {
            for (int j = 0; j < this.coluna; j++) {
                SecureRandom secureRandom = new SecureRandom();
                int randomNulo = 0;
                randomNulo = secureRandom.nextInt(9);
                m[i][j] = new SecureRandom().nextInt(9);
            }
        }
        return nulo();

    }
}
//)Crie uma classe Matriz que represente uma matriz matemática.
//Forneça um construtor que permita a inicialização das dimensões da
//Matriz
//Forneça métodos para acesso (leitura/escrita) de cada elemento da
//matriz.
//Forneça os métodos adequados para as seguintes operações com
//matriz:
//a) Comparação semântica da matriz;
//b) Retornar a transposta (é aquela onde as linhas se transformam em
//colunas e as colunas em linhas) da matriz.
//c) Retornar a oposta (é aquela onde todos os elementos possuem
//sinais trocados) da matriz;
//d) Gere uma matriz nula (é aqueles onde todos os elementos são
//iguais a 0);
//e) Informe se a matriz é identidade (matriz quadrada onde os
//elementos da diagonal principal são todos iguais a 1 e os demais
//0);
//f) Informe se a matriz é diagonal (matriz quadrada onde os
//elementos fora da diagonal principal são todos iguais a 0).
//g) Informe se a matriz é singular (matriz diagonal onde os
//elementos da diagonal principal são todos iguais);
//h) Informe se a matriz é simétrica (uma matriz quadrada é dita
//simétrica se ela é igual a sua transposta);
//i) Informe se a matriz é anti-simétrica (uma matriz quadrada é dita
//anti-simétrica se sua oposta é igual a sua transposta)
//j) Adicionar duas matrizes (alterando o valor da que recebeu a
//mensagem);
//k) Subtrair duas matrizes(alterando o valor da que recebeu a
//mensagem);
//l) Multiplicar duas matrizes(alterando o valor da que recebeu a
//mensagem);
//m) Gere uma cópia da matriz.