package matriz;

import java.util.Scanner;

public class ExMatrizVideo5 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            String[][][] compromissos = new String[12][31][8]; //dia/hora

            boolean sair = false;
            int opcao;
            while (!sair) { //enquanto o usuario n pedir para sair
                System.out.println("Digite 1 para add compromisso");
                System.out.println("Digite 2 para verificar compromisso");
                System.out.println("Digite 0 para sair");

                opcao = leia.nextInt();

                //PEGAR INFOMAÇÕES DO USUARIO

                if (opcao == 1) {//add compromisso
                    boolean mesValido = false;
                    int mes = 0;
                    while (!mesValido) {
                        System.out.println("Digite o mês ");
                        mes = leia.nextInt();
                        if (mes >= 1 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mes invalido, digite novamente ");
                        }
                    }
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
                            if (hora >= 0 && hora <= 8) {
                                horaValido = true;
                            } else {
                                System.out.println("hora invalido, digite novamente ");
                            }
                        }
                        mes--;
                        dia--;//devido ao dia começar em 0 na matriz sempre tipo 1 para ficar correto
                        System.out.println("Digite o compromisso");
                        compromissos[mes][dia][hora] = leia.next();
                    }

                    //PARA SE LOCALIZAR NA AGENDA
                } else if (opcao == 2) {
                    boolean mesValido = false;
                    int mes = 0;
                    while (!mesValido) {
                        System.out.println("Digite o mês ");
                        mes = leia.nextInt();
                        if (mes >= 1 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mês invalido, digite novamente ");
                        }
                    }
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
                            if (hora >= 0 && hora <= 8) {
                                horaValido = true;
                            } else {
                                System.out.println("hora invalido, digite novamente ");
                            }
                        }
                        mes--;
                        dia--;
                        System.out.println("O compromisso agendado é ");
                        System.out.println(compromissos[mes][dia][hora]);}

                } else if (opcao == 0) {
                    sair = true;
                } else {
                    System.out.println("Opcão invalida digite novamente");
                }
            }

        }
    }

