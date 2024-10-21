public class ExModulo13 {
    public static void main(String[] args) {
        double n = 4, p = 2, np = (n - p);
        double resultadoFinal=fatorialN(n)/(fatorialP(p)*fatorialNP(np));
        System.out.println("Seu fatorial: "+resultadoFinal);

    }

    public static double fatorialN(double n) {
        double resultadoN = 1;
        for (double i = n; i >= 1; i--) {
            resultadoN = i * resultadoN;
        }
        return  resultadoN;
    }

    public static double fatorialP(double p) {
        double resultadoP = 1;
        for (double j = p; j >= 1; j--) {
            resultadoP = j * resultadoP;
        }
        return  resultadoP;
    }

    public static double fatorialNP(double np) {
        double resultadoNP = 1;
        for (double k = np; k >= 1; k--) {
            resultadoNP = k * resultadoNP;
        }
        return resultadoNP;
    }
}
