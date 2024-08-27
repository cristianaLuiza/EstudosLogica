package Matriz;

import java.security.SecureRandom;
import java.util.Scanner;

public class ExMatriz29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int linha = 2;
        int coluna = 2;
        double m[][] = new double [2][2];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                m[i][j] = new SecureRandom().nextInt(9);
            }
        }
        //PRINTA MATRIZ ORIGEM
        System.out.print("Matriz identidade \n");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%.1f | ", m[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.print("\n\n");

        //ACHAR O DOMINANTE
        double md[][] = new double[2][2];
        double resultadoDP = 1;
        double resultadoDS = 1;
        double somaDet = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i == j) {
                    resultadoDP = m[i][j]*resultadoDP;
                }
                if ( i != j){
                        resultadoDS =  m[i][j]*resultadoDS;

                }
            }
        }
        somaDet = resultadoDP - resultadoDS;
        System.out.print(somaDet+"\n");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                md[i][j] = m[i][j] / somaDet;
            }
        }
        System.out.print("Matriz inversa \n");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%.2f | ", md[i][j]);
            }
            System.out.printf("%n");
        }


    }
}
// Criar um algoritmo que leia uma matriz A2x2 e calcule a respectiva inversa A-1
