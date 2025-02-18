package comportamentais.iterator;

public class AlunoIterator implements IAlunoIterator {
    Aluno[] alunos;
    int i = 0;

    public AlunoIterator(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean hasNext() {
        if (alunos == null || this.alunos[i] == null) return false;

        return i < alunos.length - 1;
    }

    @Override
    public Aluno next() {
        return alunos[i++];
    }
}
