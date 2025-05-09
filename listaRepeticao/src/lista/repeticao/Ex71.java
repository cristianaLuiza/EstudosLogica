package lista.repeticao;

public class Ex71 {
    public static void main(String[] args) {
        double taxaa = 0.50, taxab = 0.01;
        double paisA = 5000000, paisB = 7000000;
        int ano = 0;

        while (paisA < paisB) {
            paisA = paisA + (paisA * taxaa);
            paisB = paisB + (paisB * taxab);
            ano++;
        }
        System.out.print("o tempo necessário para que a população do país A ultrapasse a\n" +
                "//população do país B: " + ano);
    }
}
//Dado um país A, com 5000000 de habitantes e uma taxa de natalidade de 3% ao ano, e
//um país B com 7000000 de habitantes e uma taxa de natalidade de 2% ao ano,
//escrever um algoritmo que seja capaz de calcular e iterativamente e
//no fim imprimir o tempo necessário para que a população do país A ultrapasse a
//população do país B.