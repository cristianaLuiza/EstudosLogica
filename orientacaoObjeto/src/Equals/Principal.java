package Equals;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Kira");
        Pessoa pessoa2 = new Pessoa("kira");
        boolean comparacao;
         //comparacao = pessoa1 == pessoa2;  isso da falso pq cada um desses nomes está em um endereço de memoria diferente

         comparacao = pessoa1.equals(pessoa2); // estamos usando a implementacao do metodo equals da classe object que na realidade compara os endereços de memoria tb
        System.out.println(pessoa1.equals(pessoa2));
    }
}
