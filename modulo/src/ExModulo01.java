import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ExModulo01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int nu = 0;
        System.out.println("Digite um numero de 1 a 12");
        nu = leia.nextInt();
       String mesAno = mes(nu) ;
        System.out.println(mesAno);

    }

    private static String mes(int nu) {
        switch (nu) {
            case 1:
                return "Janeiro";

            case 2:
                return "Fevereiro";

            case 3:
                return "Março";

            case 4:
                return "Abril";

            case 5:
                return "Maio";

            case 6:
                return "junho";

            case 7:
                return "julho";

            case 8:
                return "Agosto";

            case 9:
                return "Setembro";

            case 10:
                return "Outubro";

            case 11:
                return "Novembro";

            case 12:
                return "Dezembro";

            default:
               return "erro";

        }

    }

}

//Escreva um procedimento que receba um número inteiro e imprima o mês
//correspondente ao número. Por exemplo, 2 corresponde à “fevereiro”. O procedimento
//deve mostrar uma mensagem de erro caso o número recebido não faça sentido. Gere
//também um algoritmo que leia um valor e chame o procedimento criado.