package matriz;

import java.util.Scanner;

public class ExMatriz20 {
    public static void main(String[] args) {
        double gasto[][] = new double[4][2];
        Scanner leia = new Scanner(System.in);
        double totalMes=0,totalAno=0;

        for (int mes = 0; mes < 4; mes++) {
            for (int semana = 0; semana < 2; semana++) {
                System.out.println("Digite o valor gasto da semana");
                gasto[mes][semana] = leia.nextDouble();
            }
        }
        for (int mes = 0; mes < 4; mes++) {
            for (int semana = 0; semana < 2; semana++) {
                totalMes=totalMes+(gasto[mes][semana]*4);
                totalAno=totalAno+totalMes;
                System.out.println("Gasto semana"+ (semana+1)+" R$"+gasto[mes][semana]);
                System.out.println("Gasto mensal "+ (mes+1)+" R$"+totalMes+"\n");
            }
        }
        System.out.println("Gasto Ano R$"+totalAno);

    }

}
//Criar um algoritmo que carregue uma matriz 12 x 4 com os valores das vendas de uma
//loja, em que cada linha represente um mês do ano, e cada coluna, uma semana do mês.
//Para fins de simplificação considere que cada mês possui somente 4 semanas. Calcule
//e imprima:
//- Total vendido em cada mês do ano;
//- Total vendido em cada semana durante todo o ano;
//- Total vendido no ano.
//     semana    semana   semana  semana
//mes 
//mes
//mes
// .
// .
// .
//mes 12