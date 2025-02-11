package ExPOOawari08;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidade;

    public void acelerar() {
        double acelerar = 10;
        acelerar = getVelocidade() + acelerar;
        setVelocidade(acelerar);

    }
    public void frear() {
        double frear = 15;
        frear =  getVelocidade() - frear;
       setVelocidade(frear);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
