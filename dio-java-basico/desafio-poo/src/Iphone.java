public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    private String musica;
    
    public void tocar(){
        System.out.printf("TOCANDO: %s\n", musica);
    }

    public void pausar(){
        System.out.println("MÙSICA PAUSADA");
    }
    public void selecionarMusica(){
        System.out.println();;
    }

    public void ligar(){
        System.out.println();
    }

    public void atender(){
        System.out.println();
    }

    public void iniciarCorreioVoz(){
        System.out.println();
    }

    public void exibirPagina(){
        System.out.println();
    }

    public void adicionarAba(){
        System.out.println();
    }
    public void atualizarPagina(){
        System.out.println();
    }

    public String getMusica(){
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }


}
