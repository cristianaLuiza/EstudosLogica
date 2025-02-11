package ExPOO08IFBA;

public class Executa {
    public static void main(String[] args) {
        Pessoa claudia = new Pessoa("clau");
        Pessoa glaucia = new Pessoa("gra");
        Pessoa luis = new Pessoa("luis");
        Pessoa vassaro = new Pessoa("vassaro");
        Pessoa cristian = new Pessoa("cristian");
        Pessoa cristiana = new Pessoa("Cris", cristian, claudia);

        //glaucia
        glaucia.setMae(claudia);
        glaucia.setPai(cristian);

        //vassaro
        vassaro.setMae(claudia);
        vassaro.setPai(cristian);

        //luis
        luis.setPai(vassaro);
        luis.setMae(glaucia);

        vassaro.antecessores(luis);

        System.out.println("São irmãos: " + cristiana.verificaIrmao(glaucia));
        System.out.println("São a mesma pessoa: " + cristiana.verificaIgual(vassaro));
        System.out.println("São antecessores " +vassaro.antecessores(luis));
    }
}
