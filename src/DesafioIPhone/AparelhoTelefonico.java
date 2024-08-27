package DesafioIPhone;

public class AparelhoTelefonico {
    private String cor;
    private int carga;
    private boolean ligado;
    private boolean emLigacao;
    private boolean mensagemCorreioVoz;
    private ReprodutorMusical reprodutorMusical;
    private NavegadorInternet navegadorInternet;


    public AparelhoTelefonico(String cor, int carga, boolean lig, boolean chamando, boolean correio) {
        this.cor = cor;
        this.carga = carga;
        this.ligado = lig;
        this.emLigacao = chamando;
        this.mensagemCorreioVoz = correio;
    }


    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


    public boolean getligar() {
        return this.ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }


    public boolean getAtender() {
        return this.emLigacao;
    }

    public void atender() {
        this.emLigacao = true;
    }

    public void naotender() {
        this.emLigacao = false;
    }


    public boolean getmensagemCorreioVoz() {
        return this.mensagemCorreioVoz;
    }

    public void temcorreiovoz() {
        this.emLigacao = true;
    }

    public void naotemcorreiovoz() {
        this.emLigacao = false;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return this.reprodutorMusical;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

}





