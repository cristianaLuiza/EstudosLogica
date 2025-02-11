package ExPOO04IFBA;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Executa {
    public static void main(String[] args) {
        Reta r1 = new Reta(1,2);
        System.out.println( r1); //COEFICIENTES

        System.out.println("Esse ponto pertence a reta? " +  r1.verifica()); //SE PERTENCE A RETA

        if(r1.outraReta() == true){ //SE É OUTRA RETA OU SE É PARALELA
            System.out.println( r1.outraReta());
        }else{
            System.out.println("Retas paralelas = null");
        }
    }
}
