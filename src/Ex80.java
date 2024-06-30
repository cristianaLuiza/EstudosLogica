import java.util.Locale;
import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        double media, maior_altura = 0, maior_peso = 0;
        int soma_idade = 0;
        String nome_altura = "", nome_peso = "";


        Scanner leia = new Scanner(System.in);

        int i, atletas;
        System.out.print("Quantos Atletas parcitiparam ");
        atletas = leia.nextInt();
        String nome[] = new String[atletas];
        int sexo[] = new int[atletas];
        int idade[] = new int[atletas];
        double peso[] = new double[atletas];
        double altura[] = new double[atletas];

        for (i = 0; i < atletas; i++) {
            System.out.print("\nDigite o nome: ");
            nome[i] = leia.next();
            System.out.print("\nDigite o sexo 1-femino 0-masculino: ");
            sexo[i] = leia.nextInt();
            System.out.print("\nDigite o idade: ");
            idade[i] = leia.nextInt();
            System.out.print("\nDigite o peso: ");
            peso[i] = leia.nextDouble();
            System.out.print("\nDigite o altura: ");
            altura[i] = leia.nextDouble();
        }
        for (i = 0; i < atletas; i++) {
            if (sexo[i] == 0 && altura[i] > maior_altura) {
                maior_altura = altura[i];
                nome_altura = nome[i];
            }
            if (sexo[i] == 1 && peso[i] > maior_peso) {
                maior_peso = peso[i];
                nome_peso = nome[i];
            }
            soma_idade = idade[i] + soma_idade;
        }
        media = soma_idade / atletas;
        System.out.print("\nA atleta feminina com maior peso foi " + nome_peso);
        System.out.print("\nO atleta masculino mais alto é " + nome_altura);
        System.out.print("\nA média das idades dos atletas " + media);
    }
}
// Criar um algoritmo que leia um conjunto de informações (nome,
//sexo, idade, peso e altura) dos atletas que participaram de uma olimpíada, e informar:
//- O atleta do sexo masculino mais alto;
//- A atleta do sexo feminino mais pesada;
//- A média de idade dos atletas.