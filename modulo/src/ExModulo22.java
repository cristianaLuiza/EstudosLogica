public class ExModulo22 {
    public static void main(String[] args) {
        double f = 212;

        double resultado = conversaoFinal(f);
        System.out.println(f+ " Fahrenheit é igual á " + resultado +"graus celsius");
    }

    public static double conversaoFinal( double f) {
        double Cfinal = 0;
        Cfinal = (f - 32) / 1.8;
        return Cfinal;
    }
}
//Crie uma função que realize a conversão de Fahrenheit (F) para graus Celsius (C),
//onde F é passado como parâmetro e C é retornado. Sabe-se que os pontos de fusão e
//ebulição nas escalas Celsius e Fahrenheit são: 0ºC e 100ºC, e 32ºF e 212ºF,
//respectivamente. Crie também um algoritmo para testar tal função.