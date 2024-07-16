package lista.repeticao;

import java.util.Scanner;

public class Ex99 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero_pedido = 0, quantidade = 0, dia = 0, mes = 0, ano = 0;
        double preco_unitario = 0, valor_compra=0, valor_total=0;

//        System.out.print("Numero do pedido: ");
//        numero_pedido = leia.nextInt();
//        System.out.print("Dia do pedido: ");
//        dia = leia.nextInt();
//        System.out.print("Mês do pedido: ");
//        mes = leia.nextInt();
//        System.out.print("Ano do pedido: ");
//        ano = leia.nextInt();
//        System.out.print("Preço unitario: ");
//        preco_unitario = leia.nextDouble();
//        System.out.print("Quantidade: ");
//        quantidade = leia.nextInt();

        do{
            valor_compra=preco_unitario*quantidade;
            valor_total=valor_compra+valor_total;
            System.out.print("Numero do pedido: ");
            numero_pedido = leia.nextInt();
            if(numero_pedido==0){
                break;
            }
            System.out.print("Dia do pedido: ");
            dia = leia.nextInt();
            System.out.print("Mês do pedido: ");
            mes = leia.nextInt();
            System.out.print("Ano do pedido: ");
            ano = leia.nextInt();
            System.out.print("Preço unitario: ");
            preco_unitario = leia.nextDouble();
            System.out.print("Quantidade: ");
            quantidade = leia.nextInt();

        }while (true);

        System.out.print("Valor de sua compra R$"+valor_total);

    }
}
//Criar um algoritmo que possa ler um conjunto de pedidos de compra
//e calcule o valor total da compra. Cada pedido é composto pelos seguintes campos:
//- Número de pedido;
//- Data do pedido (dia, mês, ano);
//- Preço unitário;
//- Quantidade.
//O algoritmo deverá processar novos pedidos até que o usuário digite (zero) como
//número de pedido.