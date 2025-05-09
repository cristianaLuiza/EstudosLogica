package ExPOOawariDesafio09;

import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um dia do Mês");
        int mes = leia.nextInt();
        System.out.println("Digite um Dia");
        int dia = leia.nextInt();


        Calendario c1 = new Calendario();
        c1.listarDiasMes(mes);
        c1.verificarFeriado(mes,dia);
        System.out.println(c1.verificarFeriado(mes,dia));
    }
}
