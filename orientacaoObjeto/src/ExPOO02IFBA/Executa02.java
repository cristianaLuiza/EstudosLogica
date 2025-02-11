package ExPOO02IFBA;

public class Executa02 {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(10,1);
        Ponto2D p2 = new Ponto2D();
        p1.setX(4);
        p1.setY(2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distancia(p2));
        System.out.println(p1.equals(p2));
        System.out.println(p1.clone());


    }
}
