import java.util.Set;
import java.util.TreeSet;

public class Dev {

    private String nome;
    private Set<Mentoria> mentorias = new TreeSet<Mentoria>();;
    private Set<Curso> cursos = new TreeSet<Curso>();;

    public Dev() {}

    public Dev(String nome) {
        this.nome = nome;
    }

    public void addMentoria(Mentoria novaMentoria) {
        mentorias.add(novaMentoria);
    }

    public void addCurso(Curso novoCurso) {
        cursos.add(novoCurso);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(Set<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
}
