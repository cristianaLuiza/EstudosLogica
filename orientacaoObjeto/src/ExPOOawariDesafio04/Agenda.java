package ExPOOawariDesafio04;

import ExPOOawariDesafio2.Cliente;
import ExPOOawariDesafio2.Conta;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contatos> listaTelefonica = new ArrayList<>();

    public String toString() {
        return "Lista de contatos" + listaTelefonica;
    }

    public Contatos percorrer(String nomePesquisado) {
        for (int i = 0; i < listaTelefonica.size(); i++) {
            Contatos pegarContato = listaTelefonica.get(i);
            String pegarNomeContato = pegarContato.getNome();
            if (pegarNomeContato.contains(nomePesquisado)) {
                return listaTelefonica.get(i);
            }
        }
        return null;
    }

    public Contatos editar(String nomeBuscado, String novoNome) {
        for (int i = 0; i < listaTelefonica.size(); i++) { // percorre a lista para achar o nome
            Contatos contatoDaLista = listaTelefonica.get(i);
            String nomeDoContatoDaLista = contatoDaLista.getNome();
            if (nomeDoContatoDaLista.contains(nomeBuscado)) {// verifica se o elemento tem o nome buscado
                Contatos contatoSerEditado = listaTelefonica.get(i); // pego um elemento da lista
                contatoSerEditado.setNome(novoNome); // atualiza o nome
                listaTelefonica.add(i, contatoSerEditado);  //add adiciona o elemento em um index especifico
                return contatoSerEditado;
            }
        }
        return null;
    }

    public void addcontato(Contatos contato) {
        this.listaTelefonica.add(contato);
    }

    public void removecontato(Contatos contatos) {
        this.listaTelefonica.remove(contatos);
    }

    public void addContatos(String nome, int numero) {
        Contatos conta1 = new Contatos(nome, numero);
        this.listaTelefonica.add(conta1);
    }

    public void removerContato(String nome, int numero) {
        Contatos conta1 = new Contatos(nome, numero);
        this.listaTelefonica.remove(conta1);
    }
}

//Implemente uma classe chamada “Agenda” que represente uma agenda
// telefônica. Essa classe deve permitir adicionar, editar e remover
// contatos, além de buscar por contatos a partir de um nome ou número de telefone.