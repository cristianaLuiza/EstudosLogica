import java.util.Scanner;

public class SetentaEOito {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor_idade[] = new int[3];
        int vetor_sexo[] = new int[3];
        int i, numeros = 0, idade_femina = 0, total_masculino = 0;
        double media, soma=0;
        for (i = 0; i < 3; i++) {
            System.out.print("Digite sua idade: ");
            vetor_idade[i] = leia.nextInt();

            System.out.print("Digite seu sexo O = masculino 1 = femino: ");
            vetor_sexo[i] = leia.nextInt();

            if (vetor_idade[i] <= 0) {
                return;
            }
        }
        for (i = 0; i < 3; i++) {
            soma = soma + vetor_idade[i];


            numeros++;

            if (vetor_sexo[i] == 1 && vetor_idade[i] > 30 && vetor_idade[i] < 45) {
                idade_femina++;
            }

            if (vetor_sexo[i] == 0) {
                total_masculino++;
            }
        }

        media = soma / numeros;

        System.out.print("\nA média das idades é de " + media);
        System.out.print("\nO total de idade de mulheres de 30 a 45 anos é de " + idade_femina);
        System.out.print("\nO total de pessoas do sexo masculino " + total_masculino);
    }
}
//Criar um algoritmo que leia idade e sexo (0-masculino, 1-feminino)
//de várias pessoas. Calcule e imprima a idade média, o total de pessoas do sexo
//feminino com idade entre 30-45 inclusive e o número total de pessoas do sexo
//masculino. O algoritmo termina quando se digita um número não positivo (0 ou um
//número negativo) para a idade.