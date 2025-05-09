package ExPOOawari08;

public class Executar {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.setVelocidade(50);
        c1.acelerar();
        c1.setMarca("Argo");
        c1.setModelo("Normal");
        System.out.println(c1.getMarca()+" /"+c1.getModelo());
        System.out.println("Velocidade: " + c1.getVelocidade());

        c1.frear();
        System.out.println("Velocidade: " + c1.getVelocidade());
    }
}
