public class ExModulo15 {
    public static void main(String[] args) {
        int x = 6, y = 2;
        int quantidadeDeY = divisao(x, y);
        System.out.println(quantidadeDeY);
        if(x==0 || y==0){
            System.out.println("-1");
        }
    }
    public static int divisao(int x, int y) {
        int divisor = 1;

        for (int i = y; i >= 1; i++) {
            divisor = x / y;
        }
        return divisor;
    }
}
// Criar uma função que verifique quantas vezes um número inteiro x é divisível por um
//número inteiro y. A função deve retornar -1 caso não seja possível calcular. Escreva
//também um algoritmo para testar tal função.