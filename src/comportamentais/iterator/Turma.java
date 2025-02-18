package comportamentais.iterator;

public class Turma {
    Aluno[] alunos;
    IAlunoIterator alunoIterator;
    int i=0;
    public Turma(){
        alunos = new Aluno[10];
        alunoIterator = new AlunoIterator(this.alunos);
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos[i++] = aluno;
    }

    public IAlunoIterator getAlunoIterator(){
        return new AlunoIterator(this.alunos);
    }

}
