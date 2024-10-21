public class ExModulo25 {
    public static void main(String[] args) {
        double k = 10;
double resultado = conversao(k);
        System.out.println("O resultado foi "+resultado+"Fahrenheit");
    }
public static double conversao(double k){
        double fFinal=0;
        fFinal=(k-273)*1.8+32;
        return fFinal;
    }
}
//Crie uma função que realize a conversão da escala Kelvin (K - escala absoluta) para a
//escala Fahrenheit (F). Sabe-se que 273K equivale a 32ºF e a cada variação de 10
//unidades na escala Kelvin equivale a 18 na escala Fahrenheit. A função deve retornar
//zero caso não seja possível realizar a conversão e um em caso contrário. Crie também
//um algoritmo para testar tal função.