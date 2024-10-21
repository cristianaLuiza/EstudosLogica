import java.util.Scanner;

public class ExModulo19 {
    public static void main(String[] args) {
        int valor1 = 100, valor2 = 2, valor3 = 15, valor4 = 4, valor5 = 5;

        Valores total = new Valores(valor1, valor2, valor3, valor4, valor5);

        int maiorValor = maior(total);
        System.out.println("Maior Valor: " + maiorValor);

    }

    public static class Valores {
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        int valor5;

        public Valores(int valor1, int valor2, int valor3, int valor4, int valor5) {
            this.valor1 = valor1;
            this.valor2 = valor2;
            this.valor3 = valor3;
            this.valor4 = valor4;
            this.valor5 = valor5;
        }
    }

    public static int maior(Valores total) {
        int maiores = 0;

        if (total.valor1 > total.valor2 & total.valor1 > total.valor3 & total.valor1 > total.valor4 & total.valor1 > total.valor5) {
            maiores = total.valor1;
        } else if (total.valor2 > total.valor1 & total.valor2 > total.valor3 & total.valor2 > total.valor4 & total.valor2 > total.valor5) {
            maiores = total.valor2;
        } else if (total.valor3 > total.valor1 & total.valor3 > total.valor2 & total.valor3 > total.valor4 & total.valor3 > total.valor5) {
            maiores = total.valor3;
        } else if (total.valor4 > total.valor1 & total.valor4 > total.valor2 & total.valor4 > total.valor3 & total.valor4 > total.valor5) {
            maiores = total.valor4;
        } else {
            maiores = total.valor5;
        }
        return maiores;
    }

}
// Construa uma função que receba cinco valores e determine (retorne por passagem pro
//referência) o 2º e o 4º maior valores dentre eles. Construa também um algoritmo para
//ler tais valores, e imprimir o resultado obtido com a chamada da função.