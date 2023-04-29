package n2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    private String nome;

    private int duracao;

    private ArrayList<Disciplina> disciplinas;


    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void matricularAlunoEmDisciplina(Matriculado aluno, String nomeDisciplina){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getNome().equals(nomeDisciplina)){
                disciplina.addMatriculado(aluno);
            }
        }
    }

    public List<Matriculado> obterAlunosMatriculadosNoCurso(){
        List<Matriculado> alunosDoCurso = new ArrayList<>();
        for(Disciplina disciplina : disciplinas){
            alunosDoCurso.addAll(disciplina.getMatriculados());
        }
        return alunosDoCurso;
    }

    public Curso() {
    }

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.disciplinas = new ArrayList<>();
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
