package n2;

public class Disciplina {
    
    private String codigo;

    private String nome;

    private int cargaHoraria;

    private String ementa;

    private Professor professor;

    private List<Matriculado> matriculados = new ArrayList<>();

    public void addMatriculado(Matriculado matriculado){
        this.matriculados.add(matriculado)
    }

    public Disciplina() {
    }

    public Disciplina(String codigo, String nome, int cargaHoraria, String ementa, Professor professor, List<Matriculado> matriculados) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.professor = professor;
        this.matriculados = matriculados;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return this.ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Matriculado> getMatriculados() {
        return this.matriculados;
    }

    public void setMatriculados(List<Matriculado> matriculados) {
        this.matriculados = matriculados;
    }

}
