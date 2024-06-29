public class SetentaETres {
    public static void main(String[] args) {
        double segundos = 30, perda_massa = 0.25, fimmassa = 0.10, iniciomassa = 1000;
        int tempo = 0;

        while (iniciomassa > fimmassa) {
            iniciomassa = iniciomassa - ((iniciomassa * perda_massa) * segundos++);
            tempo++;
        }
        System.out.print("Serão necessários " + tempo + " segundos para que a massa se torne menor que 0,10 g");

    }
}
//Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material
//radioativo. Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um
//algoritmo  que calcule iterativamente e imprima o tempo necessário
//para que a massa deste material se torne menor que 0,10 grama. O algoritmo pode
//calcular o tempo para várias massas.,