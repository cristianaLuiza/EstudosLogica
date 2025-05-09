public class ExModulo30 {
    public static void main(String[] args) {
        int n = 4;
        int resultado = fatorial(n);
        System.out.println(resultado);
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n >= 1) {
            int nresu = 1;
            for (int i = n; i >= 1; i--) {
                nresu = i * nresu;
            }
            return nresu;
        } else {
            return -1;
        }
    }
}

