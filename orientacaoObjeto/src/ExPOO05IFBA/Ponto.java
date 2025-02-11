package ExPOO05IFBA;

public class Ponto {
    double pontoX;
    double pontoY;

    public Ponto(double pontoX, double pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    @Override
    public String toString() {
        return "{" +
                "pontoX=" + pontoX +
                ", pontoY=" + pontoY +
                '}';
    }
}
