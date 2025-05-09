package ExPOOawariDesafio08;

import ExPOOawari10.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livros> listaLivro = new ArrayList<>();
    List<Livros> livrosEmprestados = new ArrayList<>();


    public void cadastrarLivro(String titulo, String autor) { //Add livro
        Livros livro1 = new Livros(titulo, autor, false);
        this.listaLivro.add(livro1);
    }
    //percorrer a lista de livros cadastrados
    //verificar se tem o livro na lista
    //verficar se o livro foi emprestado:
    //se tiver cadastrado e não emprestado, vou recuperar ele da lista de livros cadastrados
    //exibir mensagem informando que o livro do titulo tal foi emprestado e marcar que o livro foi emprestado
    //se nao, vou informar uma mensagem de erro falando que o livro foi emprestado
    //se não, for encontado o livro, exibo mensagem erro

    public void fazerEmprestimo(String titulo) {// remove livro
        for (int i = 0; i < listaLivro.size(); i++) {
            Livros livro = listaLivro.get(i);
            if (livro.getTitulo().equals(titulo)) {
                if (livro.getEmprestado() == false) {
                    String emprestado = livro.getTitulo();
                    System.out.println("Livro emprestado: " + emprestado);
                    livro.setEmprestado(true);
                } else {
                    System.out.println("ERRO: Livro já emprestado");
                }
            } else {
                System.out.println("ERRO: Livro não encontrado");
            }

        }
    }

    public void fazerEmprestimoComReuso(String titulo) {// remove livro
        for (int i = 0; i < listaLivro.size(); i++) {
            Livros livro = listaLivro.get(i);
            if (verificarDisponibilidade(titulo) == true) {
                String emprestado = livro.getTitulo();
                System.out.println("Livro emprestado: " + emprestado);
                livro.setEmprestado(true);
            } else {
                System.out.println("ERRO: Livro já emprestado ou não cadastrado ");
            }

        }
    }

    //percorrer lista de livros cadatrados
    //verificar se o titulo esta na lista de livros cadastrados
    //se o livro está emprestado marcar ele como devolvido
    // se nao estiver emprestado mensagem de erro livro não retirado
    //se livro não cadastrado exibo erro livro n cadastrado

    public void devolverLivro(String titulo) {
        for (int i = 0; i < listaLivro.size(); i++) {
            Livros livro = listaLivro.get(i);
            if (livro.getTitulo().equals(titulo)) {
                if (livro.getEmprestado() == true) {
                    System.out.println("Livro devolvido");
                    livro.setEmprestado(false);
                } else {
                    System.out.println("Livro não pode ser devolvido");
                }
            } else {
                System.out.println("Livro não cadastrado");
            }
        }
    }

    //percorrer a lista de livros cadastrados
    // verificar se o livro está cadastrado na lista de livros cadastrados e nao emprestado

    public Boolean verificarDisponibilidade(String titulo) {
        boolean disponibilidade = false; // para o for ir executando
        for (int i = 0; i < listaLivro.size(); i++) {
            Livros livro = listaLivro.get(i);
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getEmprestado() == false) { // Ignor cases sensitive letras maiusculas e minusculas
                disponibilidade =  true;
            } else {
                disponibilidade =  false;
            }
        }
        return disponibilidade; // lista vazia
    }
}
// Implemente uma classe chamada “Biblioteca” que represente
// uma biblioteca virtual. Essa classe deve permitir cadastrar
// livros, fazer empréstimos, devolver livros e verificar a
// disponibilidade de um livro.