package lista.repeticao;

import java.util.Scanner;

public class Ex94 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cpf, dependentes;
        double renda_anual, imposto = 0, imposto_bruto=0;

        System.out.print("Digite seu CPF: ");
        cpf = leia.nextInt();
        System.out.print("Quantos dependentes você tem ");
        dependentes = leia.nextInt();
        System.out.print("Valor de sua renda anual: ");
        renda_anual = leia.nextDouble();


            System.out.print("Para o CPF: " + cpf + " seus descontos seguem abaixo");
            if (renda_anual < 12000) {
                System.out.print("\nInsento de taxa");

            } else if (renda_anual >= 12000 && renda_anual <= 25000) {
                imposto = renda_anual * (12 / 100);
                imposto_bruto = renda_anual - ((dependentes * 300) - imposto);
                System.out.print("\nVocê teve 12% de taxa cobrada, seu valor final é de " + imposto_bruto);

            } else {
                imposto = renda_anual * (12 / 100);
                imposto_bruto = renda_anual- ((dependentes * 300)-imposto);
                System.out.print("\nVocê teve 27,5% de taxa cobrada seu valor final é de " + imposto_bruto);

        }
    }
}
