package n2;

public class Curso {
    
    private String nome;

    private int duracao;

    private List<Disciplina> disciplinas = new ArrayList<>();


    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina)
    }

    public void matricularAlunoEmDisciplina(Matriculado aluno, String nomeDisciplina){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getNome().equals(nomeDisciplina)){
                disciplina.addMatriculado(aluno);
            }
        }
    }


    public Curso() {
    }

    public Curso(String nome, int duracao, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.duracao = duracao;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


}
