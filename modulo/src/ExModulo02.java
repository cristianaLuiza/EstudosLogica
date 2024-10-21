import java.util.Scanner;

public class ExModulo02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um numero de 0 a 10");
        numero = leia.nextInt();
        String extenso = numeros(numero);
        System.out.println(extenso);
        eInteiro(numero);
    }

    public static String numeros(int numero) {
        switch (numero) {
            case 1:
                return "zero";
            case 2:
                return "um";
            case 3:
                return "três";
            case 4:
                return "quatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "sete";
            case 8:
                return "oito";
            case 9:
                return "nove";
            case 10:
                return "dez";
            default:
                return "erro";

        }
    }

    public static void eInteiro(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Seu numero é um numero inteiro");
        } else {
            System.out.println("Seu numero não é inteiro");
        }
    }
}
//Escreva um procedimento que receba um número inteiro e o imprima na forma
// extensa. Por exemplo, para 1 a saída desejada é “Um”. A função deve ser capaz de
//gerar o extenso dos números de 0 até 10, inclusive. Caso um número não compatível
//seja recebido o procedimento deve mostrar uma mensagem de erro. Crie também um
//algoritmo que leia um valor inteiro e chame o procedimento criado acima para a
//impressão do número extenso.