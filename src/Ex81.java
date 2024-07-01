import java.util.Scanner;

public class Ex81 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pessoas = 1000;
        int vetor_idade[] = new int[pessoas];
        int i, total_menor = 0, total_maior = 0;

        for (i = 0; i < pessoas; i++) {
            System.out.print("Digite as idades: ");
            vetor_idade[i] = leia.nextInt();
            if (vetor_idade[i] <= 0) {
                break;
            }
        }
        for (i = 0; i < pessoas; i++) {
            if (vetor_idade[i] <= 21 && vetor_idade[i] > 0) {
                total_menor++;
            }
            if (vetor_idade[i] >= 50 && vetor_idade[i]<120) {
                total_maior++;
            }
        }
        System.out.print("O total de pessoas com menos de 21 anos é de " + total_menor);
        System.out.print("\nO total de pessoas com mais de 51 anos é de " + total_maior);
    }
}
//Escreva um algoritmo que receba a idade de várias pessoas e pare a
//execução com a entrada de um número não positivo. O algoritmo deve imprimir:
//- O total de pessoas com menos de 21 anos;
//- O total de pessoas com mais de 50 anos.