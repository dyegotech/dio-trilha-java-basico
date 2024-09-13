public class Iphone implements NavegadorInternet, ReprodutorMusical{

    String cor;

    public void ligar(){
        System.out.println("Ligar");
    }

    public void atender(){
        System.out.println("Atender");
    }

    public void inciarCorreioVoz(){
        System.out.println("Correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página da web exibida.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

}
