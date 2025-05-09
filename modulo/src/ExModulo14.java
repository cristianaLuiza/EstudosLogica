import java.util.Scanner;

public class ExModulo14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Valor 1: ");
        double valor1 = leia.nextDouble();
        System.out.println("Valor2: ");
        double valor2 = leia.nextDouble();

        double resultado=maiorValor(valor1,valor2);
        System.out.println("Seu maior valor digitado foi: " + resultado);

    }
    public static double maiorValor(double valor1, double valor2) {
        double maior=0;
        if (valor1 > valor2) {
           maior=valor1;
        } else {
            maior=valor2;
        }
        return maior;
    }

}
//Criar uma função que calcule e retorne o MAIOR entre dois valores recebidos como
//parâmetro. Um algoritmo para testar tal função deve ser criado.