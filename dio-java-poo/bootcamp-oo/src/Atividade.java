public abstract class Atividade {

    protected final double XP_PADRAO = 100d;
    
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public Atividade() {}

    public Atividade(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
