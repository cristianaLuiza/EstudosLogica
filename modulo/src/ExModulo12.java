public class ExModulo12 {
    public static void main(String[] args) {
        int n = 4, p = 2, np = (n - p);
        int resultadoFinal = fatorialN(n) / fatorialNP(np);
        System.out.println("Seu resultado foi: "+ resultadoFinal);
        if(resultadoFinal%2!=0){
            System.out.println("-1");
        }
    }

    public static int fatorialN(int n) {
        int resultadoN = 1;
        for (int i = n; i >= 1; i--) {
            resultadoN = i * resultadoN;
        }
        return resultadoN;
    }

    public static int fatorialNP(int np) {
        int resultadoNP = 1;
        for (int j = np; j >= 1; j--) {
            resultadoNP = j * resultadoNP;
        }
        return resultadoNP;
    }
}
