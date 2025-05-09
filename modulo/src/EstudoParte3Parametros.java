public class EstudoParte3Parametros {
    public static void main(String[] args) {
        inicio();
    }

    private static void inicio() {
        String texto1;
        texto1 = mensagem("inicio");
        System.out.println(texto1);

        int resultadoSoma;
        resultadoSoma = segunda(3, 2);
        System.out.println("\nSOMA:" + resultadoSoma);

        resultadoSoma = segunda(7, 2);
        System.out.println("\nSOMA:" + resultadoSoma);
        texto1 = mensagem("xx");
        System.out.println("\n"+texto1);

    }


    public static String mensagem(String texto) {
        String retorno = texto;
        if (texto == "inicio") {
            return "INICIO DO PROGRAMA";
        } else {
            return "FINAL DO PROGRAMA";
        }

    }

    public static int segunda(int n1, int n2) {
        return n1 + n2;
    }


}
