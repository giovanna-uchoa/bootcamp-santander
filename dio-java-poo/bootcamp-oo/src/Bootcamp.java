import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Bootcamp {

    private final int DURACAO = 60;
    private final LocalDate DATA_INICIAL = LocalDate.now();
    private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(60);
    
    private String nome;
    private String descricao;

    private Set<Dev> devs = new HashSet<Dev>();
    private List<Curso> cursos = new LinkedList<Curso>();
    private List<Mentoria> mentorias = new LinkedList<Mentoria>();
    
    // Construtores
    public Bootcamp() {}

    public Bootcamp(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public int getDuracao() {
        return DURACAO;
    }

    public LocalDate getDataInicial() {
        return DATA_INICIAL;
    }

    public LocalDate getDataFinal() {
        return DATA_FINAL;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Atributo Devs
    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    // Atributo Mentorias
    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    // Atributo Cursos
    public List<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

}