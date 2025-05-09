package lista.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex93 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int voto1 = 0, voto2 = 0, voto3 = 0, voto0 = 0, voto4 = 0, eleitores = 0, voto = 0;

        try {

            System.out.print("Digite seu voto ");
            voto = leia.nextInt();

            while (voto != -1) {
                if (voto < 0 || voto > 4) {
                    System.out.print("Por favor, digitar somente os numeros da tabela");
                    break;
                }

                if (voto == 1) {
                    voto1++;
                }
                if (voto == 2) {
                    voto2++;
                }
                if (voto == 3) {
                    voto3++;
                }
                if (voto == 0) {
                    voto0++;
                }
                if (voto == 4) {
                    voto4++;
                }
                eleitores++;
                System.out.print("Digite seu voto ");
                voto = leia.nextInt();
            }
        } catch (InputMismatchException exception) {
            System.out.print("Digite somente valores numericos");
            return;
        }

        if (voto1 > voto2 && voto1 > voto3) {
            System.out.print("O candidato vencedor foi o numero 1 ");
        }
        if (voto2 > voto1 && voto2 > voto3) {

            System.out.print("O candidato vencedor foi o numero 2 ");
        }
        if (voto3 > voto1 && voto3 > voto2) {

            System.out.print("O candidato vencedor foi o numero 3");
        }

        System.out.print("\nO numero de votos em branco " + voto0);
        System.out.print("\nO numero de votos nulos " + voto4);
        System.out.print("\nO numero de eleitores que compareceram ás urnas " + eleitores);

    }
}
