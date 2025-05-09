package lista.repeticao;

public class Ex74 {
    public static void main(String[] args) {
        int tempo = 0;
        double ciclista_a = 0, ciclista_b = 2000,totalb=0;

        while (ciclista_a < ciclista_b) {
            ciclista_a = ciclista_a + 10;
            ciclista_b = ciclista_b - 15;
            tempo++;
        }
        totalb=2000-ciclista_b;

        System.out.print("Foram necessários " + tempo + " segundos para o encontro \n");
        System.out.print("O cilista A percorreu " + ciclista_a + " quilometros \n");
        System.out.print("O cilista B percorreu " + totalb + " quilometros ");


    }
}
//Dois ciclistas A e B estão andando em uma pista de ciclismo com 2 Km de
//comprimento com velocidades de 10 m/s e 15 m/s, respectivamente. Escreva um
//algoritm que determine iterativamente o tempo que levará para que
//esses dois ciclistas A e B se encontrem em um mesmo ponto, sabendo que eles
//partiram de um mesmo ponto inicial, porém em sentido contrário. O algoritmo
//também deve calcular o deslocamento (a distância) que cada um percorreu.
// distancia percorrida m/s no caso foi 10*80e 15*80
