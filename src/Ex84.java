import java.util.Scanner;

public class Ex84 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, c, mmc;
        mmc = 1;
        System.out.print("Digite seu primeiro número: ");
        a = leia.nextInt();
        System.out.print("Digite seu segundo número: ");
        b = leia.nextInt();
        c = 2;
        while (c <= a || c <= b) {
            if (a % c == 0 || b % c == 0)
            {
                mmc = mmc * c; //O que tinha antes * meu numero primo(ex:2*5*3)

                if (a % c == 0) {
                    a = a / c;
                }
                if (b % c == 0) {
                    b = b / c;
                }
                c = c - 1;
            }
            c = c + 1;
        }
        System.out.print("O menor numero de MMC " + mmc);
    }
}
//Criar um algoritmo que calcule o M.M.C (mínimo múltiplo comum)
//entre dois números lidos. (por exemplo: o M.M.C, entre 10 e 15 é 30).