import java.util.Scanner;

public class ExModulo9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um caractere em maiusculo! ");
        String textoUsuario = leia.next();

        char caracter = textoUsuario.charAt(0); //PEGA O PRIMEIRO INDICE DA STRING CHAR AT== ACHAR NO(AT) INDICE
        int resultado = verificaSeEhCaractere(caracter);//VERIFICA SE O CARACTER É ALFABETICO
        System.out.println(resultado);
    }

    public static int verificaSeEhCaractere(char caracter) {
        int verifica = 0;
        if (caracter == 'A' || caracter == 'B' || caracter == 'C' || caracter == 'D'|| caracter == 'E'
                || caracter == 'F'|| caracter == 'G'|| caracter == 'H'|| caracter == 'I'|| caracter == 'J'
                || caracter == 'K'|| caracter == 'L'|| caracter == 'N'|| caracter == 'M'|| caracter == 'O'
                || caracter == 'P'|| caracter == 'Q'|| caracter == 'R'|| caracter == 'S'|| caracter == 'T'
                || caracter == 'U'|| caracter == 'V'|| caracter == 'W'|| caracter == 'X'|| caracter == 'Y'
                || caracter == 'Z') {
            verifica = 1;
        }
        return verifica;
    }
}
//Criar uma função que determine se um caractere, recebido como parâmetro, é ou não
//uma letra do alfabeto em maisculo. A função deve retornar 1 caso positivo e 0 em caso contrário.
//Escreva também um algoritmo para testar tal função.
