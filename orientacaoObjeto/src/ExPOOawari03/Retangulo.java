package ExPOOawari03;

public class Retangulo {
    private double altura;
    private double largura;

    public double areaRetangulo() {
        double area = this.largura * this.altura;
        return area;
    }
    public double perimetroRetangulo(){
        double perimetro =  (this.altura*2) + (this.largura*2);
        return perimetro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
