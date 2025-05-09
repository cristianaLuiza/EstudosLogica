import java.util.Scanner;

public class ExModulo04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero = 0;
        System.out.println("Numero: ");
        numero = leia.nextInt();
        romanos(numero);
        if (numero % 2 == 0) {
            String numeroRomano = romanos(numero);
            System.out.println(numeroRomano);
        }
        if (numero > 50) {
            System.out.println("erro");
        }
    }

    public static String romanos(int numero) {
        String[] dez = {"", "X", "XX", "XXX", "XL", "L"};
        String[] um = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder numeroRomano = new StringBuilder();
        numeroRomano.append(dez[(numero % 100) / 10]);
        numeroRomano.append(um[numero % 10]);

        return numeroRomano.toString();
    }
}
// StringBuider, essa classe permite criar e manipular dados de Strings dinamicamente,
// ou seja, podem criar variáveis de String modificáveis.

//Quando no StringBuilder é invocado o método append ele aloca novas strings
//concatenadas para o mesmo objeto, ou seja, cada vez que concatena
//strings não são criadas cópias dos objetos.