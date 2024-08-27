package aula2;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO, não posso rabiscar, estou tampada ");
        }else{
            System.out.println("Estou rabiscar");
        }


    }

    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;

    }
}
