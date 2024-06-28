import java.util.Scanner;

public class SesentaEDois {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeros, i, conta_numero=0;


        for (i=0; i<3;i++) {
            System.out.print("Digite seu numero: \n");
            numeros = scanner.nextInt();
            if(numeros >= 0 ) { conta_numero++;}

        }
        System.out.println("Você digitou " + conta_numero +" numeros");



    }
}
