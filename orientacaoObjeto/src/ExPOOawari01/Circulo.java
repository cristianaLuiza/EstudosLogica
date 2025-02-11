package ExPOOawari01;

public class Circulo {

    public double raio = 5;

    public double calcularArea() {
        double area = 3 * (this.raio * this.raio);
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * 3 * this.raio;
        return perimetro;
    }
}
