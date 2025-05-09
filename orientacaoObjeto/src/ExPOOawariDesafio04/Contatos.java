package ExPOOawariDesafio04;

import java.util.ArrayList;
import java.util.List;

public class Contatos {
    String nome;
    int numero;


    public Contatos(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String toString() {
        return "Nome: " + nome +
                " Numero:" + numero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

}
