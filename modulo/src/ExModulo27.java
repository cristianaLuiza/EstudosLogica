public class ExModulo27 {
    public static void main(String[] args) {
        int x=4, y=2;
        int resultado = div(x, y);
        System.out.println(resultado);
    }

    public static int div(int x, int y) {
        if (x > y) {
            return 1 + ((x - y) / y);
        } else if (x < y) {
            return  0;
        } else if(x==y){
            return 1;
        }else{
            return -1;
        }
    }
}
