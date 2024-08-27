package matriz;

import java.util.Scanner;

public class ExMatrizVideo4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[][] compromissos = new String[31][24]; //dia/hora

        boolean sair = false;
        int opcao;
        while (!sair) { //enquanto o usuario n pedir para sair
            System.out.println("Digite 1 para add compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");

            opcao = leia.nextInt();

            //PEGAR INFOMAÇÕES DO USUARIO

            if (opcao == 1) {//add compromisso
                boolean diaValido = false;
                int dia;
                while (!diaValido) {
                    System.out.println("Digite o dia do mês ");
                    dia = leia.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente ");
                    }
                    boolean horaValido = false;
                    int hora = 0;
                    while (!horaValido) {
                        System.out.println("Digite a hora ");
                        hora = leia.nextInt();
                        if (hora >= 0 && hora <= 24) {
                            horaValido = true;
                        } else {
                            System.out.println("hora invalido, digite novamente ");
                        }
                    }
                    dia--;//devido ao dia começar em 0 na matriz sempre tipo 1 para ficar correto
                    System.out.println("Digite o compromisso");
                    compromissos[dia][hora] = leia.next();
                }

                //PARA SE LOCALIZAR NA AGENDA
            } else if (opcao == 2) {
                boolean diaValido = false;
                int dia;
                while (!diaValido) {
                    System.out.println("Digite o dia do mês ");
                    dia = leia.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente ");
                    }
                    boolean horaValido = false;
                    int hora = 0;
                    while (!horaValido) {
                        System.out.println("Digite a hora ");
                        hora = leia.nextInt();
                        if (hora >= 0 && hora <= 24) {
                            horaValido = true;
                        } else {
                            System.out.println("hora invalido, digite novamente ");
                        }
                    }
                    dia--;
                    System.out.println("O compromisso agendado é ");
                    System.out.println(compromissos[dia][hora]);}

                } else if (opcao == 0) {
                    sair = true;
                } else {
                    System.out.println("Opcão invalida digite novamente");
                }
        }

    }
}
