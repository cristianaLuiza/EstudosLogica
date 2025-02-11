package ExPOO05IFBA;

public class Circulo {
    public double raio;
    public Ponto ponto;

    public Circulo(double raio, Ponto ponto) { // CONSTRUTOR QUE RECEBA UM RAIO E UM PONTO
        this.raio = raio;
        this.ponto = ponto;
    }

    public Circulo(double raio) { //CONSTRUTO QUE FAÇA O RAIO E CIRCULO NA ORIGEM
        this.raio = raio;
        this.ponto = new Ponto(0, 0);
    }

    public double getRaio() { // METODOS DE ACESSO DO RAIOR E PONTO
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double inflar(double raio) { //METODOS DE INFLAR E DESINFLAR
        this.raio = raio;
        return this.raio;
    }

    public double desinflar(double raio) {
        this.raio = raio;
        return this.raio;
    }

    public Ponto muv() { // MOVER SEM PARAMETRO QUE LEVAM PARA A ORIGEM
        return this.ponto = new Ponto(0, 0);
    }

    public Ponto muv(double novoX, double novoY) { //MOVER PARA UM OUTRO VALOR DE X E Y
        return this.ponto =  new Ponto(novoX, novoY);
    }

    public Ponto muv(Ponto ponto ){
        return this.ponto = ponto;
    }

    public double area() { //AREA DO CIRCULO
        double pi = 3.14;
        return pi * (this.raio * this.raio);
    }
}



