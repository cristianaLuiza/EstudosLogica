package ExPOOawariDesafio09;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Calendario {
//    List<Dias> diasDoMes = new ArrayList<>();
//
//    public List<Dias> listarDiasMes(int meses) {
//        switch (meses) {
//            case 1:
//                for (int i = 1; i <= 31; i++) {
//                    boolean feriado = false;
//                    if (i == 1) {
//                        feriado = true;
//                    }
//                    Dias dia = new Dias(i, feriado);
//                    diasDoMes.add(dia);
//                }
//                break;
//                case 4:
//                for (int i = 1; i <= 31; i++) {
//                    boolean feriado = false;
//                    if (i == 18) {
//                        feriado = true;
//                    }
//                    Dias dia = new Dias(i, feriado);
//                    diasDoMes.add(dia);
//                }
//                break;
////            case 2:
////                for (int i = 1; i <= 28; i++)
////                    diasDoMes.add(i);
////                break;
////            case 3, 5, 7, 9, 11:
////
////                for (int i = 1; i <= 30; i++)
////                    diasDoMes.add(i);
////                break;
////            default:
////                return new ArrayList<>(); //LISTA VAZIA
////        }
////        return diasDoMes;
//
//
//    /*
//        Receber o dia e o mes do usuário;
//        Salvar em uma variavel, os dias existentes de um determinado mês;
//        Verificar se o dia recebido como parametro é feriado ou não;
//        Se for feriado,
//            exibir uma mensagem de que é feriado;
//        Senão,
//            exibir uma mensagem de que é dia comum;
//     */
////    public String verificarFeriado(int mes, int dia) { // mes = fevereiro, dia = 100
////        List<Dias> diasMes = listarDiasMes(mes);
////
//////        if (mes == 1 & dia == 1) {
////            String dia1 = "Dia 1º feriado ano novo";
////        }
////        } else if (mes == 3 & diasDoMes.equals(4)) {
////            return "Dia 4º feriado carnaval";
////        } else if (mes == 4 & diasDoMes.equals(18)) {
////            return "Dia 18º feriado nossa senhora";
////        } else if (mes == 4 & diasDoMes.contains(21)) {
////            return "Dia 21º feriado Tira dentes";
////        } else if (mes == 5 & diasDoMes.contains(1)) {
////            return "Dia 1º feriado dia do trabalho";
////        } else if (mes == 6 & diasDoMes.contains(19)) {
////            return "Dia 19º feriado corpus cristi";
////        } else if (mes == 9 & diasDoMes.contains(7)) {
////            return "Dia 7º feriado independencia";
////        }else if (mes == 10 & diasDoMes.contains(12)) {
////            return "Dia 12º feriado nossa senhora";
////        }else if (mes == 11 & diasDoMes.contains(2)) {
////            return "Dia 2º feriado finados";
////        }else if (mes == 12 & diasDoMes.contains(25)) {
////            return "Dia 25º feriado natal";
////        }else {
////            System.out.println("O dia digitado não é um feriado");
////        }
////        return "";
//
//// “Calendario” que represente um calendário anual.
//// Essa classe deve ter métodos para exibir o calendário
//// de um determinado mês, verificar se uma data é feriado
//// e calcular a diferença de dias entre duas datas.
