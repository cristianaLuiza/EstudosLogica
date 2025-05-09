package ExPOOawariDesafio2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();


    public void abrirConta(String nomeTitular, int numeroConta, double saldo) {
        Conta conta1 = new Conta(new Cliente(nomeTitular), numeroConta, saldo);
        this.contas.add(conta1);
    }


    public double depositos(Conta conta, double deposito) {
        deposito = deposito + conta.getSaldo();
        conta.setSaldo(deposito);
        return deposito;
    }
    public double saque(Conta conta, double saque) {
        saque = conta.getSaldo() - saque;
        conta.setSaldo(saque);
        return saque;
    }


    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}