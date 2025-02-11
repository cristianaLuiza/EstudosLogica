package ExPOOawariDesafio2;

public class Executa {
    public static void main(String[] args) {
        Banco b1 = new Banco();

        System.out.println("Contas: "+b1.getContas());

        b1.abrirConta("Kira", 123,10);
        System.out.println("Conta: "+b1.getContas());
        Conta c1 = new Conta(new Cliente("Kira"), 123,10);

        b1.depositos(c1,10);
        System.out.println("Novo valor "+ c1.toString());

    }
}
//Implemente uma classe chamada “Banco” que represente uma
// instituição financeira. Essa classe deve conter métodos para
// cadastrar clientes, abrir contas bancárias e realizar
// operações como saques, depósitos e transferências.