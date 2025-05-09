public class ExModulo26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(fibo(i) + ","); //print para n pular linha
        }
    }

    public static int fibo(int n) {
        if (n <= 2) {//Retorna n se n for 0 ou 1 (os dois primeiros termos da série de Fibonacci).
            return 1;
        } else {//Retorna recursivamente sem parar essa soma
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}