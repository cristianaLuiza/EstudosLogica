package matriz;

import java.util.Scanner;

public class ExMatriz19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double maior = 0.0;
        double altura[][] = new double[2][3];

        for (int delegacao = 0; delegacao < 2; delegacao++) {
            for (int atrelas = 0; atrelas < 3; atrelas++) {
                System.out.println("Digite a altura da delegação " + (delegacao + 1) + ",do atleta " + (atrelas + 1));
                altura[delegacao][atrelas] = leia.nextDouble();
            }
        }

        for (int delegacao = 0; delegacao < 2; delegacao++) {
            for (int atrelas = 0; atrelas < 3; atrelas++) {
                if (altura[delegacao][atrelas] > maior) {
                    maior = altura[delegacao][atrelas];
                }
            }
            System.out.println("A maior altura da delgação " + (delegacao + 1) + " é;  " + maior);
            maior = 0.0;
        }
    }
}
//Criar um algoritmo que possa armazenar as alturas de dez atletas de cinco delegações
//que participarão dos jogos de verão. Imprimir a maior altura de cada delegação.