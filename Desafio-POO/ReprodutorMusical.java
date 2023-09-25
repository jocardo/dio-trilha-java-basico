public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }

    @Override
    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }

    @Override
    public void fazerChamada() {
        aparelhoTelefonico.fazerChamada();
    }

    @Override
    public void atenderChamada() {
        aparelhoTelefonico.atenderChamada();
    }

    @Override
    public void iniciarGravacaoVoz() {
        aparelhoTelefonico.iniciarGravacaoVoz();
    }

    @Override
    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
