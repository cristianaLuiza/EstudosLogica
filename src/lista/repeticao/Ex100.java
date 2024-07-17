package lista.repeticao;

import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int maior_estoque = 0;
        int estoque_bola, estoque_boneca, estoque_ursinho;
        int bola = 80,
                boneca = 100,
                ursinho = 20;
        int venda_bola = 20,
                venda_boneca = 10,
                venda_ursinho = 5;

        estoque_bola = bola - venda_bola;
        if (estoque_bola < 50) {
            System.out.print("Há menos de 50 bolas no estoque");
        }
        estoque_boneca = boneca - venda_boneca;
        if (estoque_boneca < 50) {
            System.out.print("Há menos de 50 bonecas no estoque");
        }

        estoque_ursinho = ursinho - venda_ursinho;
        if (estoque_ursinho < 50) {
            System.out.print("Há menos de 50 ursinhos no estoque");
        }
        if (estoque_bola > estoque_boneca && estoque_bola > estoque_ursinho) {
            estoque_bola = maior_estoque;
            System.out.print("\nEstoque de bolas é o maior");
        } else if (estoque_boneca > estoque_bola && estoque_boneca > estoque_ursinho) {
            estoque_boneca = maior_estoque;
            System.out.print("\nEstoque de bonecas é o maior");
        } else {
            System.out.print("\nEstoque de ursinhos é o maior");
        }


    }
}
//Uma fábrica produz e vende vários produtos e para cada um deles tem-se o nome,
//quantidade produzida e quantidade vendida. Criar um algoritmo
//que imprima:
//- Para cada produto, nome, quantidade no estoque e uma mensagem se o produto
//tiver menos de 50 itens no estoque;
//- Nome e quantidade do produto com maior estoque;