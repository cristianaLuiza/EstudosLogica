package matriz;

import java.security.SecureRandom;
import java.util.Scanner;

public class ExMatriz17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int codigo = 0, manicure = 5, quantidade = 4;
        int valor_mani0 = 0, valor_mani1 = 0, valor_mani2 = 0, valor_mani3 = 0, valor_mani4 = 0;
        int[][] matriz = new int[manicure][3];

        //PREECHENDO A MATRIZ
        for (manicure = 0; manicure < 5; manicure++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[manicure][coluna] = new SecureRandom().nextInt(5);
                //se ultima coluna
                if (coluna == 2) {
                    matriz[manicure][coluna] = new SecureRandom().nextInt(3);
                }
            }
        }
        //PRINTANDO A MATRIZ
        for (manicure = 0; manicure < 5; manicure++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("%d | ", matriz[manicure][coluna]);
            }
            System.out.printf("%n");
        }

        //CALCULANDO OS VALORES
        for (manicure = 0; manicure < 5; manicure++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (coluna == 0) {
                    switch (matriz[manicure][coluna]) {
                        case 0: {
                            int valor_servico = 0;
                            if (matriz[manicure][2] == 0) {
                                valor_servico = 10;
                            } else if (matriz[manicure][2] == 1) {
                                valor_servico = 15;
                            } else {
                                valor_servico = 30;
                            }
                            valor_mani0 = (matriz[manicure][1] * valor_servico) + valor_mani0;
                            break;
                        }
                        case 1: {
                            int valor_servico = 0;
                            if (matriz[manicure][2] == 0) {
                                valor_servico = 10;
                            } else if (matriz[manicure][2] == 1) {
                                valor_servico = 15;
                            } else {
                                valor_servico = 30;
                            }
                            valor_mani1 = (matriz[manicure][1] * valor_servico) + valor_mani1;
                            break;
                        }
                        case 2: {
                            int valor_servico = 0;
                            if (matriz[manicure][2] == 0) {
                                valor_servico = 10;
                            } else if (matriz[manicure][2] == 1) {
                                valor_servico = 15;
                            } else {
                                valor_servico = 30;
                            }
                            valor_mani2 = (matriz[manicure][1] * valor_servico) + valor_mani2;
                            break;
                        }
                        case 3: {
                            int valor_servico = 0;
                            if (matriz[manicure][2] == 0) {
                                valor_servico = 10;
                            } else if (matriz[manicure][2] == 1) {
                                valor_servico = 15;
                            } else {
                                valor_servico = 30;
                            }
                            valor_mani3 = (matriz[manicure][1] * valor_servico) + valor_mani3;
                            break;
                        }
                        default: {
                            int valor_servico = 0;
                            if (matriz[manicure][2] == 0) {
                                valor_servico = 10;
                            } else if (matriz[manicure][2] == 1) {
                                valor_servico = 15;
                            } else {
                                valor_servico = 30;
                            }
                            valor_mani4 = (matriz[manicure][1] * valor_servico) + valor_mani4;
                        }
                    }
                }
            }
        }
        System.out.println("Valor da manicure 0: " + valor_mani0/2 +
                "\nValor da manicure 1: " + valor_mani1/2 +
                "\nValor da manicure 2: " + valor_mani2/2 +
                "\nValor da manicure 3: " + valor_mani3/2 +
                "\nValor da manicure 4: " + valor_mani4/2);

    }
}


//A gerente do cabeleireiro Sempre Bela tem uma tabela em que registra os “pés” as
//“mãos” e o serviço de podologia das cinco manicures. Sabendo-se que cada uma
//ganha 50% do que faturou ao mês, criar um algoritmo que possa calcular e imprimir
//quanto cada um vai receber, uma vez que não têm carteiras assinadas; os valores,
//respectivamente, são R$ 10,00; R$ 15,00 e R$ 30,00.

/* entrada (exemplo)
codigo_manicure | quantidade_serviço | codigo_serviço
1               | 1                  | 1 (pé)
2               | 3                  | 2 (mãos)
3               | 2                  | 1 (pé)
3               | 3                  | 2 (mãos)
3               | 2                  | 3 (serviço de podologia)
*/