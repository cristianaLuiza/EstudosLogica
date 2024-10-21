public class ExModulo07 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        boolean resultadofinal;
        resultadofinal = divisao(x, y);
      if(resultadofinal==true){
          System.out.println("1 - X e Y  é divisivel um pelo outro");
      }else {
          System.out.println("zero - X e Y não é divisivél um pelo outro");
      }
    }

    public static boolean divisao(int x, int y) {
        boolean resultado = false;
        if (x % y == 0) {
            resultado = true;
        }
        return resultado;
    }
}
//Escreva uma função que receba dois números inteiros x e y. Essa função deve verificar
//se x é divisível por y. No caso positivo, a função deve retornar 1, caso contrário zero.
//Escreva também um algoritmo para testar tal função.