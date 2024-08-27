package DesafioIPhone;

public class ExecutaDesafioIPhone {
    public static void main(String[] args) {
        System.out.println("SOBRE O IPHONE");

        IPhone ip = new IPhone("preta", 90, true, true, true, "Iphone15", true);
        System.out.println("Modelo: " + ip.getModelo());
        ip.pesquisaSiri();

        if (ip.getmensagemCorreioVoz()) {
            System.out.println("Tem correio de voz");
        } else {
            System.out.println("Não tem correio de voz ");
        }

        System.out.println("____________________________");
        ReprodutorMusical rp = new ReprodutorMusical(true, true, 2, 100);
        ip.setReprodutorMusical(rp);
        ip.getReprodutorMusical().setPausar(false);
        if (ip.getReprodutorMusical().getPausar()) {
            System.out.println("Seu aparelho está pausado");
        } else {
            System.out.println("Reproduzindo ");
            System.out.println("Selecionando musica ");
            System.out.println("Essa musica tem " + ip.getReprodutorMusical().getTempoMusica() + " minutos");
            System.out.println("Memoria do seu aparelho " + ip.getReprodutorMusical().getQuantidadeMemoria() + " GB");
        }


        System.out.println("____________________________");
        NavegadorInternet nv = new NavegadorInternet(81, true, "www.pagina.nova", true);
        ip.setNavegadorInternet(nv);
        System.out.println("Velocidade da internet " + ip.getNavegadorInternet().getVelocidade() + "(Mbps)");
        System.out.println("Acessibilidade está: " + ip.getNavegadorInternet().verificarAcessibilidade());
        System.out.println("Endereço da pagina " + ip.getNavegadorInternet().getpagina());
        System.out.println("Sua aba está: " + ip.getNavegadorInternet().verificarAbaAtiva());
        ip.getNavegadorInternet().atualizarPagina();
    }
}
