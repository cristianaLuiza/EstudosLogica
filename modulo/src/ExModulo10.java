import java.util.Scanner;

public class ExModulo10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero! ");
        numero = leia.nextInt();

        boolean resultado = verificaCapicua(numero);
        if(!resultado){
            System.out.println(0);
        }else{
            System.out.println(1);
        }

    }

    public static boolean verificaCapicua(int numero) {

        String numeroConvertido = String.valueOf(numero); //CONVETENDO PARA STRING
        int tamanho = numeroConvertido.length(); //
        int index = 0;

        for (int i = tamanho - 1; i < tamanho; i--) {
            if (index < tamanho) {
                char primeiroCaracter = numeroConvertido.charAt(index);
                char ultimaCaracter = numeroConvertido.charAt(i);
                if (primeiroCaracter != ultimaCaracter) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
