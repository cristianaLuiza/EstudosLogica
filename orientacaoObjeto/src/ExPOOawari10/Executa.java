package ExPOOawari10;

import java.util.ArrayList;
import java.util.List;

public class Executa {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        Livro l1 = new Livro();

        l1.setAutor("Cris");
        l1.setPaginas(350);
        l1.setTitulo("Xugu chato");
        livros.add(l1);

        if(livros.contains(l1)){
            System.out.println("Devolvido\n");
        }else {
            System.out.println("Emprestado\n");
        }







    }
}
