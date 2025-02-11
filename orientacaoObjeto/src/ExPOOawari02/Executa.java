package ExPOOawari02;

public class Executa {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNome("Cristiana");
        conta1.setNumeroConta(123);
        conta1.setSaldo(200);

        System.out.println("Nome: "+conta1.getNome());
        System.out.println("Conta Bancaria: "+conta1.getNumeroConta());
        System.out.println("Saldo R$"+conta1.getSaldo());
    }
}
