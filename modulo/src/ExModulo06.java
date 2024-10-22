public class ExModulo06 {
    public static void main(String[] args) {
        int numero = 4;
        boolean resultado;
        resultado = primo(numero); //PEGO O RETORNO DA FUNÇÃO

        if(resultado==true){ //RETORNANDO OS RESULTADOS BOLEANOS
            System.out.println("1");
        }else{
            System.out.println("zero");
        }
        System.out.println("\nO numero é primo? " + resultado);

    }

    public static boolean primo(int numero) {
        boolean ePrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ePrimo = false;
            }
        }
        return ePrimo;
    }
}

//Funções que verificam uma situação, retorno booleano (verdadeiro, falso)
//Escreva uma função que receba um número inteiro. Esta função deve verificar se tal
//número é primo. No caso positivo, a função deve retornar 1, caso contrário zero.
//Escreva também um algoritmo para testar tal função.