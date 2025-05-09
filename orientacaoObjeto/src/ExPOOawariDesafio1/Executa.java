package ExPOOawariDesafio1;

import ExPOOawari09.Paciente;

public class Executa {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa(16, "Kira","Cachorrinho");

        p1.anoBissexto();
        System.out.println(" Nome:"+p1.getNome()+"\n Profissao: "+
                p1.getProfissao()+ "\n Idade: "+ p1.getIdade() + "\n Idade ano bissexto: "+ p1.anoBissexto());


    }
}
