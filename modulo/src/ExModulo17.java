import java.util.Scanner;

public class ExModulo17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite valor A: ");
        int valorA = leia.nextInt();

        System.out.println("Digita valor B: ");
        int valorB = leia.nextInt();

        System.out.println("Digite valor C: ");
        int valorC = leia.nextInt();

        ValorTotal total = new ValorTotal(valorA, valorB, valorC);

        int maiorValor = maior(total);
        int menorValor = menor(total);

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }

    public static class ValorTotal {
        public int valorA;
        public int valorB;
        public int ValorC;

        public ValorTotal(int valorA, int valorB, int valorC) {
            this.valorA = valorA;
            this.valorB = valorB;
            this.ValorC = valorC;
        }
    }

    public static int maior(ValorTotal valor) {
        int maiores = 0;

        if (valor.valorA > valor.valorB && valor.valorA > valor.ValorC) {
            maiores = valor.valorA;
        } else if (valor.valorB > valor.valorA && valor.valorB > valor.ValorC) {
            maiores = valor.valorB;
        } else {
            maiores = valor.ValorC;
        }
        return maiores;
    }

    public static int menor(ValorTotal valor) {
        int menores = 0;

        if (valor.valorA < valor.valorB && valor.valorA < valor.ValorC) {
            menores = valor.valorA;
        } else if (valor.valorB < valor.valorA && valor.valorB < valor.ValorC) {
            menores = valor.valorB;
        } else {
            menores = valor.ValorC;
        }
        return menores;
    }

}
//Construa uma função que receba três valores, a, b e c, retorne (passagem por
//referência) o MAIOR e o MENOR valor desses três. Deve ser criado um algoritmo
//para utilizar tal função lendo os três valores e imprimindo o maior e o menor valor
//computado