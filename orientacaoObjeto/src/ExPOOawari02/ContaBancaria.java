package ExPOOawari02;

public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

    private double depositos() {
        double deposito = 0;
        deposito = deposito + this.saldo;
        return deposito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
