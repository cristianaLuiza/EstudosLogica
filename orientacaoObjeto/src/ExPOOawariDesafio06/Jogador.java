package ExPOOawariDesafio06;

import java.util.List;

public class Jogador {
    private String nome;
    private List<Cartas>listaCartas;


    public Jogador(String nome, List<Cartas>listaCartas){
        this.nome = nome;
        this.listaCartas = listaCartas;

    }

    public String toString(){
        return "Jogador "+nome;
    }

}
