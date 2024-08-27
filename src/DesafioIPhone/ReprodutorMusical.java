package DesafioIPhone;

public class ReprodutorMusical {
    private boolean tocar;
    private boolean pausar;
    private float tempoMusica;
    private float quantidadeMemoria;

    public ReprodutorMusical(boolean tocar, boolean pausa, float tm, float qm) {
        this.tocar = tocar;
        this.pausar = pausa;
        this.tempoMusica = tm;
        this.quantidadeMemoria = qm;
    }
    public boolean getocar() {
        return this.tocar;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }


    public boolean getPausar() {
        return this.pausar;
    }
    public void setPausar(boolean pausar) {
        this.pausar = pausar;
    }
    public float getTempoMusica(){
        return this.tempoMusica;
    }
    public float getQuantidadeMemoria(){
        return this.quantidadeMemoria;
    }
}
