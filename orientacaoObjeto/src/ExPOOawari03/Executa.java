package ExPOOawari03;

public class Executa {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();

        r1.setAltura(2);
        r1.setLargura(4);
        System.out.println("Area Retângulo = "+r1.areaRetangulo()+" Perimetro = "+r1.perimetroRetangulo());
    }
}
