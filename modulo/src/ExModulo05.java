import java.util.Scanner;

public class ExModulo05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int diasSemana;
        System.out.println("Digite um numero");
        diasSemana = leia.nextInt();
        dias(diasSemana);
    }

    public static String dias(int diasSemana) {
        switch (diasSemana) {
            case 1:
                return "Seg";
            case 2:
                return "Ter";
            case 3:
                return "Qua";
            case 4:
                return "Qui";
            case 5:
                return "Sex";
            case 6:
                return "Sab";
            case 7:
                return "Dom";
            default:
                return "erro";
        }
    }
}
//Escreva um procedimento que receba um número natural e imprima os três primeiros
//caracteres do dia da semana correspondente ao número. Por exemplo, 6 corresponde à
//“SAB”. O procedimento deve mostrar uma mensagem de erro caso o número recebido
//não corresponda à um dia da semana. Gere também um algoritmo que utilize esse
//procedimento, chamando-o, mas antes lendo um valor para passagem de parâmetro.