package DesafioIPhone;

public class NavegadorInternet {
    private float velocidade;
    private boolean acessibilidade;
    private String pagina;
    private boolean abaAtiva;

    public NavegadorInternet(float velocidade, boolean acesso, String exibir, boolean abaAtiva) {

        this.velocidade = velocidade;
        this.acessibilidade = acesso;
        this.pagina = exibir;
        this.abaAtiva = abaAtiva;

    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    public float getVelocidade() {
        return this.velocidade;
    }


    public String verificarAcessibilidade() {
        if (this.acessibilidade) {
            return "Habilitada";
        } else {
            return "Desabilitada";
        }
    }

    public String getpagina() {
        return this.pagina;
    }

    public String verificarAbaAtiva() {
        if (this.abaAtiva) {
            return "Ativada";
        } else {
            return "Desativada";
        }
    }
}
