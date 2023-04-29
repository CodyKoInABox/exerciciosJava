import n2.Aluno;
import n2.Curso;
import n2.Disciplina;
import n2.Endereco;
import n2.Matriculado;
import n2.Professor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        //cria um curso
        Curso curso = new Curso("Ciencia da Computacao", 4);

        // cria algumas disciplinas e adiciona ao curso
        Disciplina prog1 = new Disciplina(null, "Programacao 1", 0, null, null, null);
        Disciplina prog2 = new Disciplina(null, "Programacao 2", 0, null, null, null);
        curso.addDisciplina(prog1);
        curso.addDisciplina(prog2);

        //cria alguns alunos
        Aluno joao = new Aluno(null, "Joao", null, null, null);
        Aluno maria = new Aluno(null, "Maria", null, null, null);

        Matriculado aluno1 = new Matriculado(null, prog2, 0, 0);
        Matriculado aluno2 = new Matriculado(null, prog2, 0, 0);

        //matricula os alunos em algumas disciplinas
        curso.matricularAlunoEmDisciplina(aluno1, "Programacao 1");
        curso.matricularAlunoEmDisciplina(aluno2, "Programacao 2");
        curso.matricularAlunoEmDisciplina(aluno1, "Programacao 2");

        //obtem a lista de alunos matriculados no curso
        ArrayList<Matriculado> alunosMatriculados = curso.obterAlunosMatriculadosNoCurso();

        //imprime a lista de alunos matriculados
        System.out.println("Alunos matriculados no curso:");
        for(Matriculado aluno : alunosMatriculados){
            System.out.println(aluno.getAluno().getNome());
        }

        //obtem a lista de alunos matriculados na disciplina de programacao 2
        ArrayList <Matriculado> alunosMatriculadosProg2 = prog2.getMatriculados();

        //imprime a lista de alunos matriculados na disciplina de programacao 2
        System.out.println("\nAlunos matriculados na disciplina de programação 2:");
        for(Matriculado aluno : alunosMatriculadosProg2){
            System.out.println(aluno.getAluno().getNome());
        }


    }
}