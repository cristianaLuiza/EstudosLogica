package ExPOOawariDesafio08;

public class Executa {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        b1.cadastrarLivro("Louisis", "Kira");
        b1.cadastrarLivro("Kibra","Eus");

       b1.fazerEmprestimo("Kibra");
       b1.devolverLivro("Kibra");
        Boolean verificadora = b1.verificarDisponibilidade("KIBRA") ;
        System.out.println("O titulo está disponível? R:" + verificadora);

    }


}
