package ExPOOawariDesafio04;

public class Executa {
    public static void main(String[] args) {
        Agenda a1 = new Agenda();
        Contatos c1 = new Contatos("a",111);
        Contatos c2 = new Contatos("b",222);
        Contatos c3 = new Contatos("c",333);
        Contatos c4 = new Contatos("d",444);

        a1.addContatos("e",555);
        a1.addcontato(c1);
        a1.addcontato(c3);
        a1.addcontato(c4);
        //a1.removecontato(c2);
        a1.editar(c1.getNome(), "kira");

        Contatos contatoEncontrado = a1.percorrer("b"); //

        System.out.println(a1);
        System.out.println("Encontrar contato: "+contatoEncontrado);





    }
}
