public class ExModulo21 {
    public static void main(String[] args) {
        double rad = 3.14, graus = 180, inicioGraus = 32;

        Resultado total = new Resultado(graus, rad, inicioGraus);
        double conversaoFeita = conversaoFinal(total);
        System.out.println(inicioGraus+" Graus equivalem á " + conversaoFeita+ " radianos");
    }

    public static class Resultado {
        public double rad;
        public double graus;
        public double inicioGraus;

        public Resultado(double graus, double rad, double inicioGraus) {
            this.graus = graus;
            this.rad = rad;
            this.inicioGraus = inicioGraus;
        }
    }

    public static double conversaoFinal(Resultado total) {
        double resultadoFinalRad = 0;
        resultadoFinalRad = total.graus * total.rad / total.inicioGraus;
        return resultadoFinalRad;
    }
}
//Crie uma função que realize a conversão para Radianos (rad) a partir de Graus (grad),
//onde grad é passado como parâmetro e rad é retornado. Sabe-se que 180º (graus) está
//para π radianos. Crie também um algoritmo para testar tal função.