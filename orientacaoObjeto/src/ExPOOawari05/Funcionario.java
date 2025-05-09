package ExPOOawari05;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;

    public double imposto() {
        float imposto = 0, impostoTotal = 0;
        float beneficios = 450;
        imposto = ((5f / 100) * this.salario);
        impostoTotal = imposto + beneficios;
        float salarioLiquido = salario - impostoTotal;
        return salarioLiquido;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
