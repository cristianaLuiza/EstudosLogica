public class SetentaECinco {
    public static void main(String[] args) {
        double sp = 0, cu = 800000;
        int tempo = 0, tempo_horas=0;

        while (sp < cu) {
            sp = sp + 30;
            cu = cu - 40;
            tempo++;
        }
            tempo_horas=(tempo++)/3600;
            System.out.print(" o\n" +
                    "//tempo necessário para os maquinistas pararem as locomotivas antes que uma colisão\n" +
                    "//aconteça é de "+tempo_horas+" horas \n");
            System.out.print("Para a colisão acontecer a locomotiva A deve percorrer "+sp+"Km e a locomotiva B \n" +
                    " deve, percorrer "+cu+"Km.");
    }
}
//Considere uma linha ferroviária entre São Paulo e Curitiba. Suponha que uma
//locomotiva (trem) A parte de São Paulo para Curitiba com velocidade de 30 m/s
//enquanto que uma outra locomotiva B parte de Curitiba para São Paulo no mesmo
//instante com velocidade de 40 m/s. Considere a distância entre São Paulo e Curitiba
//de 400 Km. Escreva um algoritmo em PORTUGOL que calcule iterativamente o
//tempo necessário para os maquinistas pararem as locomotivas antes que uma colisão
//aconteça. O algoritmo deve calcular também a distância que as locomotivas devem
//percorrer para que a colisão aconteça.