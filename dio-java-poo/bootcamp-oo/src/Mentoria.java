import java.time.LocalDate;

public class Mentoria extends Atividade {
    
    private LocalDate dataMentoria;

    public double calcularXP() {
        return XP_PADRAO + 100d;
    }
    
    // Construtores
    public Mentoria() {}

    public Mentoria(String nome) {
        super(nome);
    }
 
    public Mentoria(String nome, LocalDate dataMentoria) {
        super(nome);
        this.dataMentoria = dataMentoria;
    }

    // Getters e Setters
    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }
}
