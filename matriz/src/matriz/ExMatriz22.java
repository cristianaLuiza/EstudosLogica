package matriz;

import java.security.SecureRandom;

public class ExMatriz22 {
    public static void main(String[] args) {
        int linha = 3;
        int coluna = 3;
        int m[][] = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                m[i][j] = new SecureRandom().nextInt(9);
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%2d | ", m[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.print("\n\n");
        int m2[][] = new int[linha][coluna];
        int v = linha-1; //v vai ser para pegar minha ultima linha e cada vez que troco de linha eu decremento o valor de V

        for (int i = 0; i < linha; i++) {
            int z= coluna-1; // coloco fora do for para n ter que ler a variavel toda vez desde o começo
            for (int j = 0; j < coluna; j++) {
                m2[v][z]=m[i][j];
                z--;
            }
            v--;
        }

        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.printf("%2d | ", m2[i][j]);
            }
            System.out.printf("%n");
        }


    }
}
