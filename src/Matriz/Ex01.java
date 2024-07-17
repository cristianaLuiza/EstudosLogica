package Matriz;

public class Ex01 {
    public static void main(String[] args) {
        int[][] Matriz = new int[4][4];

        Matriz[0][1] = 2; //linha é o primeiro [] e coluna o segundo []
        Matriz[1][2] = 75;
        Matriz[1][1] = 55;
        for (int linha = 0; linha < Matriz.length; linha++){
            for (int coluna=0; coluna<Matriz[0].length;coluna++){
                System.out.print( Matriz[linha][coluna]+ " ");
            }
            System.out.println(" ");
        }
        //legth para contar a quantidade de elementos

    }
}
// faço um for para a leitura das linhas e um for para a leitura das colunas