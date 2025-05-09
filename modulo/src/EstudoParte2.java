public class EstudoParte2 {

    public static void main(String[] args) {
        inicio();
    }

    private static void inicio() {
        String texto1;
        texto1 = primeira();
        System.out.println(texto1);

        int resultadoSoma;
        resultadoSoma = segunda();
        System.out.println(segunda());

        String texto2;
        texto2 = terceira();
        System.out.println(texto2);

    }


    public static String primeira() {
        return "INICIO DO PROGRAMA";
    }

    public static int segunda() {
        return 2 + 2;
    }

    public static String terceira() {
        return "FINAL DO PROGRAMA";
    }


}
