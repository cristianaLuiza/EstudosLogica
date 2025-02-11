package ExPOO05IFBA;

public class Executa {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2, new Ponto(2, 1));
        System.out.println("Raio " + c1.raio);
        System.out.println("Raio após inflar " + c1.inflar(4));
        System.out.println("Raio após Desinflar " + c1.desinflar(2));
        System.out.println("Area = " + c1.area());
        System.out.println("Circulo movido para "+ c1.muv(4,6));


    }
}
//5) Escreva em Java uma classe que represente um circulo no plano
//cartesiano. Forneça os seguintes membros de classe:
//a) Um construtor que receba o raio e um ponto (o centro do
//círculo);
//b) Um construtor que receba o raio e posicione o círculo na origem
//do espaço cartesiano;
//c) Métodos de acesso ao atributo raio do círculo;
//d) Métodos inflar e desinflar, que, respectivamente, aumentam e
//diminuem o raio do círculo de um dado valor;
//e) Métodos sobrecarregados, inflar e desinflar, que,
//respectivamente, aumentam e diminuem o raio do círculo de uma
//unidade;
//h) Métodos sobrecarregados mover, que:
//i) por default (sem parâmetros) levam o círculo para a origem do
//espaço 2D;
//ii) movem o círculo para um local indicado por dois parâmetros
//do tipo double (indicando o valor de abcissa e ordenada do
//ponto para onde o círculo se move);
//iii) movem o círculo para o local indicado por outro ponto.
//f) Método que retorna a área do círculo