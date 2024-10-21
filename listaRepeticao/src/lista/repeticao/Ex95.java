package lista.repeticao;

import java.util.Scanner;

public class Ex95 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, voto5 = 0, voto6 = 0, voto = 0;
        double eleitores = 0, percentual = 0;


        do {
            System.out.print("Digite seu voto: ");
            voto = leia.nextInt();

            if (voto == 1) {
                voto1++;
            }
            if (voto == 2) {
                voto2++;
            }
            if (voto == 3) {
                voto3++;
            }
            if (voto == 4) {
                voto4++;
            }
            if (voto == 5) {
                voto5++;
            }
            if (voto == 6) {
                voto6++;
            }
            eleitores++;
            percentual = (voto6 + voto5) / eleitores;

        }
        while (voto!=0);

        System.out.print("Total de votos para o candidato 1 foi de " + voto1 + "\n" +
                "Total de votos para o candidato 2 foi de " + voto2 + " " +
                "\nTotal de votos para o candidato 3 foi de " + voto3 + " " +
                "\nTotal de votos para o candidato 4 foi de " + voto4);
        System.out.print("\nO total de votos nulos " + voto5);
        System.out.print("\nO total de votos em branco " + voto6);
        System.out.printf("\nO percentual dos votos em branco e nulos sobre o total %.2f", percentual);
    }
}
