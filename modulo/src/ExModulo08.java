public class ExModulo08 {
    public static void main(String[] args) {
        int numero = 60;

        int resultadoFinal = decomposicao(numero);
        System.out.println(resultadoFinal);

    }

    public static int decomposicao(int numero) {
        if (numero % 2 == 0 & numero % 3 == 0 & numero % 5 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
//Um número é dito ser regular caso sua decomposição em fatores primos apresenta
//apenas potências de 2, 3 e 5. Faça uma função que verifique se um número é regular (retorne
//1) ou não (retorne 0) não regular. Escreva também um algoritmo para testar tal função.
