public class ExModulo24 {
    public static void main(String[] args) {
        double feet=3.281, metro=1, feetFinal=3;
        double resultado=conversao(feet,metro,feetFinal);
        System.out.println(feetFinal+ " pes tem "+ resultado + " metros");

    }
    public static double conversao(double feet, double metro, double feetFinal){
        double metroFinal=0;
        metroFinal = metro* feetFinal/feet;
        return  metroFinal;
    }
}
// Crie uma função que realize a conversão de pés (feet) para metros (m), onde feet é
//passado como parâmetro e m é retornado. Sabe-se que 1 metro está para 3,281 pés.
//Crie também um algoritmo para testar tal função