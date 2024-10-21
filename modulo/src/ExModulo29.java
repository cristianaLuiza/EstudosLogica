public class ExModulo29 {
    public static void main(String[] args) {
        int x = 4, y = 2;
        int resultado = calcularMDC(x, y);
        System.out.println("O MDC de " + x + " e " + y + " é: " + resultado);

    }

    public static int calcularMDC(int x, int y) {
        if (y == 0) { //quando y é igual a 0, nesse caso, o MDC é x
            return x;
        }
        return calcularMDC(y, x % y); // a função chama a si mesma com y e x % y
    }
}
