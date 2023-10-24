public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Página de internet adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página de internet atualizada.");
    }

    public static void main(String[] args) {
        Iphone iphone15 = new Iphone();
        iphone15.ligar();
        iphone15.atender();
        iphone15.iniciarCorreioVoz();
        iphone15.selecionarMusica();
        iphone15.tocar();
        iphone15.pausar();
        iphone15.adicionarNovaAba();
        iphone15.exibirPagina();
        iphone15.atualizarPagina();
    }
}
