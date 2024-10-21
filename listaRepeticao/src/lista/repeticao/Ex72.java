package lista.repeticao;

public class Ex72 {
    public static void main(String[] args) {
        double altura_chico = 1.50, altura_juca = 1.10;
        double chico_taxa = 0.02, juca_taxa = 0.03;
        int anos = 0;

        while (altura_chico > altura_juca) {
            altura_chico = altura_chico + (altura_chico * chico_taxa);
            altura_juca = altura_juca + (altura_juca * juca_taxa);
            anos++;
        }
        System.out.print("Serão necessários " + anos + " anos para chico ultrapassar a altura de joca.");
    }
}
//Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 3
//centímetros por ano. Construir um algoritmo que calcule
//iterativamente e imprima quantos anos serão necessários para que Juca seja maior que
//        Chico