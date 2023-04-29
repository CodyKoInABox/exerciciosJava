package exercicioN2.escola;

public class Curso {
    
    private String nome;

    private int duracao;

    private List<Disciplina> listaDeDisciplinas;

    public void adicionarDisciplina(Disciplina disciplina){
        listaDeDisciplinas.add(disciplina);
    }

    public void matricularAlunoEmDisciplina(Aluno aluno, Disciplina disciplina){
        for(Disciplina disciplinaDoCurso : listaDeDisciplinas){
            if (disciplinaDoCurso.getNome() == disciplina.getNome()){
                Matriculado novoMatriculado = new Matriculado(aluno, disciplina, null, null);
                disciplinaDoCurso.adicionarMatriculado(novoMatriculado);
            }
        }
    }

    public Curso() {
    }

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.listaDeDisciplinas = new ArrayList<Disciplina>();
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

    public List<Disciplina> getListaDeDisciplinas() {
        return this.listaDeDisciplinas;
    }

    public void setListaDeDisciplinas(List<Disciplina> listaDeDisciplinas) {
        this.listaDeDisciplinas = listaDeDisciplinas;
    }

}
