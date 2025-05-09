package ExPOOawariDesafio08;

public class Livros {
    private String titulo;
    private String autor;
    private Boolean emprestado = false;

    public Livros(String titulo, String autor, Boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    public String toString() {
        return "Titulo: " + titulo + "Autor: " + autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public Boolean getEmprestado(){
        return emprestado;
    }
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
}
