//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicinarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {

    }

    public static void main(String[] args) {
        Iphone iphone11 = new Iphone();
        iphone11.tocar();
        iphone11.pausar();
        iphone11.selecionarMusica("Blinding Lights");

        iphone11.ligar("11-94797-3045");
        iphone11.atender();
        iphone11.iniciarCorreioVoz();

        iphone11.exibirPagina("https://www.linkedin.com/in/ricardo-rodrigues-santana/");
        iphone11.adicinarNovaAba();
        iphone11.atualizarPagina();

    }
}