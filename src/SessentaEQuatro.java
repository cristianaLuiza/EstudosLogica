import java.util.Scanner;

public class SessentaEQuatro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, n=0, contador=0;

        for(i=0;i<3;i++){
            System.out.print("Digite seu numero: ");
            n = leia.nextInt();
            if (n>100 && n<200) { contador = contador + 1;}
            if (n==0){return;}
        }
        System.out.print(" Vc digitou " + contador+ " numeros");

    }
}