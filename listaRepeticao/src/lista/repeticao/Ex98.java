package lista.repeticao;

import java.util.Scanner;

public class Ex98 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double saldo_negativo = 0, saldo_positivo=0, saldo=0, conta = 0, negativo = 0, saldo_total=0, positivo=0, agencia=0;

        System.out.print("Digite sua conta: ");
        conta = leia.nextInt();
        System.out.print("Digite seu saldo");
        saldo = leia.nextDouble();

        while (conta < 10000) {
            if(conta==-999){
                break;
            }

            if (saldo < 0) {
                negativo++;
                saldo_negativo=saldo+saldo_negativo;
                System.out.print("Conta:" + conta + "\nSaldo:" + saldo);
                System.out.print("\nNegativo\n");
            } else {
                positivo++;
                saldo_positivo=saldo+saldo_positivo;
                System.out.print("Conta:" + conta + "\nSaldo:" + saldo_positivo);
                System.out.print("\nPositivo\n");
            }
            agencia++;



            System.out.print("Digite sua conta: ");
            conta = leia.nextInt();
            System.out.print("Digite seu saldo");
            saldo = leia.nextDouble();
        }
        saldo_total= saldo_positivo+saldo_negativo;
        System.out.printf("\nO total de pessoas com saldo negativo:"+negativo);
        System.out.printf("\nTotal de clientes da agência:"+agencia);
        System.out.printf("\nO saldo da agência:"+saldo_total);



    }
}



//Uma agência de uma cidade do interior tem, no máximo, 10000 clientes. Criar um
//algoritmo que possa receber o número da conta, nome e saldo de
//cada cliente. Esse algoritmo deve imprimir todas as contas, os respectivos saldos e
//uma das mensagens: positivo/negativo. A digitação acaba quando se digita –999 para
//um número da conta ou quando chegar a 10000. Ao final, deverá sair o total de
//clientes com saldo negativo, o total de clientes da agência e o saldo da agência.