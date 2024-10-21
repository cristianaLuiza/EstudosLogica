import java.util.Scanner;

public class ExModulo18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Valor A: ");
        double valorA = leia.nextDouble();
        System.out.println("Valor B: ");
        double valorB = leia.nextDouble();

        ValorTotal total = new ValorTotal(valorA, valorB);
        double quocienteFinal = quociente(total);
        double dividendoFinal = dividendo(total);
        double restoFinal = resto(total);

        System.out.println("Quociente: " + quocienteFinal);
        System.out.println("Dividendo: " + dividendoFinal);
        System.out.println("Resto: " + restoFinal);

    }

    public static class ValorTotal {
        double valorA;
        double valorB;

        public ValorTotal(double valorA, double valorB) {
            this.valorA = valorA;
            this.valorB = valorB;
        }
    }

    public static double quociente(ValorTotal total) {
        double valorQuociente = 0;
        valorQuociente = total.valorA / total.valorB;
        return valorQuociente;

    }

    public static double dividendo(ValorTotal total) {
        double valorDividendo = 0;
        valorDividendo = total.valorA;
        return valorDividendo;
    }

    public static double resto(ValorTotal total) {
        double valorResto = 0;
        valorResto = total.valorA % total.valorB;
        return valorResto;
    }

}
//Construa uma função que receba dois valores inteiros a e b, retorne (passagem por
//referência) o quociente, dividendo, e o resto divisão, mod, de a por b. A função deve retornar
//-1 caso não seja possível realizar as operações e 0 caso seja possível. Um algoritmo
//para utilizar tal função deve ser criado, tratando o retorno da função