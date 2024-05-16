public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    public void tocar(){
        System.out.println("TOCANDO");
    }

    public void pausar(){
        System.out.println("MÚSICA PAUSADA");
    }
    public void selecionarMusica(String musica){
        System.out.printf("MUSICA SELECIONADA: %s\n", musica);;
    }

    public void ligar(String numero){
        System.out.printf("LIGANDO PARA: %s\n", numero);
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("DEIXE SEU RECADO");
    }

    public void exibirPagina(String url){
        System.out.printf("EXIBINDO: %s\n", url);
    }

    public void adicionarAba(){
        System.out.println("ABA ADICIONADA");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO A PÁGINA");
    }

}
