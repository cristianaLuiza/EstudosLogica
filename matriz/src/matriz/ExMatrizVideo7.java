package matriz;

import java.util.Scanner;

public class ExMatrizVideo7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantidade de pessoas que foram entrevistadas: ");
        int entrevistadosTotal = leia.nextInt();

        String[][] nomeFilhos = new String[entrevistadosTotal][];

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Quantidade de filhos do entrevistado ");
            int quantidadeFilhos = leia.nextInt();
            nomeFilhos[i] = new String[quantidadeFilhos]; //para o armazenamento

            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Os nomes dos filhos " + (j + 1));
                nomeFilhos[i][j] = leia.next();

            }
        }
        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomeFilhos.length + " filhos ");
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println(nomeFilhos[i][j]);

            }
        }
    }
}
