public class ExModulo07 {
    public static void main(String[] args) {
        int x = 40, y = 20;

       int resultadofinal = divisao(x, y);
        System.out.println(resultadofinal);
    }

    public static int divisao(int x, int y) {
        if (x % y == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
//Escreva uma função que receba dois números inteiros x e y. Essa função deve verificar
//se x é divisível por y. No caso positivo, a função deve retornar 1, caso contrário zero.
//Escreva também um algoritmo para testar tal função.