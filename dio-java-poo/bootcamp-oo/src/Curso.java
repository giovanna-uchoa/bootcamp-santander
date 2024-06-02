public class Curso extends Atividade {
  
    private int cargaHoraria;

    public double calcularXP() {
        return XP_PADRAO + 400d;
    }
    
    // Construtores
    public Curso() {}

    public Curso(String nome) {
        super(nome);
    }

    public Curso(String nome, int cargaHoraria) {
        super(nome);
        this.cargaHoraria = cargaHoraria;
    }

    // Getter e Setter
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
