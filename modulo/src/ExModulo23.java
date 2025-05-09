public class ExModulo23 {
    public static void main(String[] args) {
        double polegada = 1, centimetro = 2.54, polegadaFinal = 2;
        double resultado= conversao(polegada,centimetro,polegadaFinal);
        System.out.println(polegadaFinal+" polegadas tem "+resultado+"cm");
    }

    public static double conversao(double polegada, double centimetro, double polegadaFinal) {
        double cmFinal = 0;
        cmFinal = centimetro * polegadaFinal / polegada;
        return cmFinal;
    }
}
//) Crie uma função que realize a conversão de Polegadas (pol) para Centímetros (cm),
//onde pol é passado como parâmetro e cm é retornado. Sabe-se que 1 polegada está
//para 2,54 centímetros. Crie também um algoritmo para testar tal função.