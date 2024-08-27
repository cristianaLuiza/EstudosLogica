package DesafioIPhone;

public class IPhone extends AparelhoTelefonico {

    private String modelo;
    private boolean comandodevozSiri;


    public IPhone(String cor, int carga, boolean lig, boolean chamando, boolean correio, String modelo, boolean comandodevozSiri) {
        super(cor, carga, lig, chamando, correio);
        this.modelo=modelo;
        this.comandodevozSiri=comandodevozSiri;
    }
    public String getModelo(){
        return this.modelo;
    }


    public boolean pesquisaSiri() {
        if (this.comandodevozSiri) {
            System.out.println("Comando de voz Siri ativado");
        } else {
            System.out.println("Comando de voz Siri desativado");
        }
        return false;
    }
}
