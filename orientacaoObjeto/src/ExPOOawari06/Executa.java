package ExPOOawari06;

public class Executa {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setPreco(2);
        p1.setQuantidade(6);
        p1.setNome("Kiras");
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Valor total estoque R$" + p1.ValorTotal());
    }
}
