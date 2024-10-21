public class ExModulo11 {
    public static void main(String[] args) {
        int numero = 5;  //
        int resultadofinal = fatorial(numero);
        System.out.println("Total fatorial: " + resultadofinal);
    }

    public static int fatorial(int numero) {
        int resultado = 1;
        for (int i = numero; i >= 1; i--) {//ELE TERMINA NO NUMERO DIGITADO E INICA EM 1
            resultado = i * resultado;
        }
        return resultado;
    }
}
//  Criar uma função (não recursiva) que calcule e retorne o valor do fatorial de um
//número natural. Escreva também um algoritmo para testar tal função.