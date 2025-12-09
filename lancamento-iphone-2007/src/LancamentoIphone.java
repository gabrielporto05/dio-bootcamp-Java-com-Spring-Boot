public class LancamentoIphone {
    public static void main(String[] args) {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();

        Browser browser = new Browser();
        browser.exibirPagina();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioDeVoz();

    }
}
