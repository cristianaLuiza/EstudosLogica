package aula2;
//AULA DE VISIBILIDADE E ESTRUTURA BASICA
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1=new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor="azul";
        c1.carga=80;
        c1.tampada=true;
        c1.status();

        //se eu tentar colocar qualquer atributo
        // que esteja protegido da erro.
        //na minha classe no meu metodo main eu n consigo
        //mexer nos atributos nem metodos ditos privados.


    }
}
