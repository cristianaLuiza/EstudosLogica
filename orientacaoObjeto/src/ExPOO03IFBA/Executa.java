package ExPOO03IFBA;

public class Executa {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo(3, 4);
        NumeroComplexo n2 = new NumeroComplexo(1, 2);

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        System.out.println("Soma: " + n1.somar(n2));
        System.out.println("Subtração: " + n1.subtrair(n2));
        System.out.println("Multiplicação: " + n1.multiplicar(n2));
        System.out.println("Divisão: " + n1.divisor(n2));
       // System.out.println("Módulo de n1: " + n1.modulo());
        System.out.println("n1 é igual a n2? " + n1.iguais(n2));
    }
}
