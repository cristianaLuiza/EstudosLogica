package lista.repeticao;

import java.util.Scanner;

public class Ex96 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n_consumidor = 0, kwh, valor1 = 0, valor2 = 0, valor3 = 0, media1 = 0, media2 = 0, total1 = 0, total2 = 0, total3 = 0;
        double consumidor1 = 0, consumidor2 = 0, consumidor3 = 0;
        int consumidor = 0;
        System.out.print("Número do consumidor: ");
        n_consumidor = leia.nextDouble();
        System.out.print("Quantidade de kWh consumidos durante o mês: ");
        kwh = leia.nextDouble();
        System.out.print("Tipo de codigo do consumidor: ");
        consumidor = leia.nextInt();

        do {

            if (consumidor == 1) {
                consumidor1++;
                valor1 = kwh * 0.3;
                total1 = valor1 + total1;
            }
            if (consumidor == 2) {
                consumidor2++;
                valor2 = kwh * 0.5;
            }
            if (consumidor == 3) {
                consumidor3++;
                valor3 = kwh * 0.7;
                total2 = valor2 + total2;
            }
            System.out.print("Número do consumidor: ");
            n_consumidor = leia.nextDouble();
            if (n_consumidor == 0) {
                break;
            }
            System.out.print("Quantidade de kWh consumidos durante o mês: ");
            kwh = leia.nextDouble();
            System.out.print("Tipo de codigo do consumidor: ");
            consumidor = leia.nextInt();
        } while (true);

        consumidor1 = kwh * 0.3;
        consumidor2 = kwh * 0.5;
        consumidor3 = kwh * 0.7;

        media1 = total1 / consumidor1;
        media2 = total2 / consumidor2;

        System.out.print("O custo total para o consumidor residencial R$" + consumidor1);
        System.out.print("\nO custo total para o consumidor comercial R$" + consumidor2);
        System.out.print("\nO custo total para o consumidor industrial R$" + consumidor3);
        System.out.print("\nO total de consumo para o três tipos de consumidor, tipo 1- " + valor1 + ", tipo 2- " + valor2 + ", tipo 3- " + valor3);
        System.out.printf("\nA média de consumo do tipos 1 foi de %.2f ", media1);
        System.out.printf("\nA média de consumo do tipo 2 foi de  %.2f", media2);

    }
}
