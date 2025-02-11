package ExPOOawari05;

public class Executa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setSalario(2000);

        System.out.println("Salario liquido R$" + f1.imposto());
    }
}
