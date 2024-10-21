
import java.util.Scanner;

public class ExModulo16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Valor A: ");
        int valorA = leia.nextInt();
        System.out.println("Valor B: ");
        int valorB = leia.nextInt();
        Valor x = new Valor(valorA, valorB); //a variavel x é do tipo Valor, e crio um objeto da classe Valor

        TROCA(x);
        System.out.println("Valor A igual a: " + x.x);
        System.out.println("Valor B igual a: " + x.y);
    }

    public static void TROCA(Valor valor) {
        int temporaria = valor.x;
        valor.x = valor.y;
        valor.y = temporaria;
    }
    public static class Valor {
        public int x;
        public int y;

        public Valor(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}


// Construa uma função que efetue a TROCA dos valores de a por b, recebidos como
//parâmetro. Ou seja, essa função deve substituir o valor de a pelo de b, e
//reciprocamente. Crie também um algoritmo que leia dois valores quaisquer, e imprima
//os valores após a chamada da função TROCA.