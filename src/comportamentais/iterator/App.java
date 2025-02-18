package comportamentais.iterator;

public class App {

    public static void main(String[] args){
        Turma turma = new Turma();

        for (int i = 0; i< 5; i++){
            turma.adicionarAluno(new Aluno("aluno "+i));
        }

        IAlunoIterator alunoIterator = turma.getAlunoIterator();

        Aluno aluno;
        while (alunoIterator.hasNext()){
            aluno = alunoIterator.next();
            System.out.println(aluno.nome);
        }
    }

}
