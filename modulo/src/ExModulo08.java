public class ExModulo08 {
    public static void main(String[] args) {
        int numero = 60;
        boolean resultadoFinal;
        resultadoFinal = decomposicao(numero);
        if (resultadoFinal == true) {
            System.out.println("1 numero fator primo");
        } else {
            System.out.println("0 numero não é fator primo");
        }

    }

    public static boolean decomposicao(int numero) {
        boolean resultado = false;
            if (numero % 2 == 0 & numero % 3 == 0 & numero % 5 == 0) {
                resultado = true;
            }
        return resultado;
    }
}
//Um número é dito ser regular caso sua decomposição em fatores primos apresenta
//apenas potências de 2, 3 e 5. Faça uma função que verifique se um número é regular (retorne
//1) ou não (retorne 0) não regular. Escreva também um algoritmo para testar tal função.
