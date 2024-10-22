public class ExModulo20 {
    public static void main(String[] args) {
        double a = 2, b = 5, c = 2;
        Raizes resultado = bascara(a, b, c);

        if (a == 0) {
            System.out.println("-1");
            return;
        }

        double valorFinalRaiz = deltas(a, b, c);
        System.out.println("Raiz positiva: " + resultado.raiz1);
        System.out.println("Raiz negativa: " + resultado.raiz2);

    }

    public static class Raizes {
        public double raiz1;
        public double raiz2;

        public Raizes(double raiz1, double raiz2) {
            this.raiz1 = raiz1;
            this.raiz2 = raiz2;
        }
    }

    public static double deltas(double a, double b, double c) {
        double delta;
        delta = b * b - (4 * a * c);
        if(delta==0){
            return -1;
        }
        return delta;
    }

    public static Raizes bascara(double a, double b, double c) {
        double deltas = deltas(a, b, c);
        double xnegativo = -b - Math.sqrt(deltas) / 2 * a;
        double xpositivo = -b + Math.sqrt(deltas) / 2 * a;
        Raizes x = new Raizes(xnegativo, xpositivo);

        return x;
    }

}
