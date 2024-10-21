import java.util.Scanner;

public class ExModulo03 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);

        String nome;
        System.out.println("Nome: ");
        nome= leia.next();
        cabecalho(nome);
    }
    public static void cabecalho(String nome){
        System.out.println("============================================\n" +
                " UFMG – Universidade Federal de Minas Gerais\n" +
                " ICEx – Instituto de Ciências Exatas\n" +
                " Disciplina de Programação de Computadores\n" +
                " Nome: " + nome + "\n" +
                "============================================ ,");
    }
}
