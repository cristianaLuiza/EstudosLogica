package ExPOOawariDesafio2;

public class Conta {
    private Cliente titular;
    private int numeroConta;
    private double saldo;

    public Conta(Cliente titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Titular='" + titular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
