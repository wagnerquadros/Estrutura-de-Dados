public class Vetor {

    private Aluno[] alunos = new Aluno[5];
    private int nextIndex = 0;

    public Vetor(){
    }

    public Vetor(int i){
        alunos = new Aluno [i];
    }

    public void Adiciona(Aluno aluno){
        if (nextIndex == alunos.length){
            return;
        }

        alunos[nextIndex] = aluno;
        nextIndex++;
    }

    public int Tamanho(){
        return nextIndex;
    }

    public boolean Contem(Aluno aluno){
        for (int i = 0; i<nextIndex; i++){
            if (alunos[i].getNome() == aluno.getNome()){
                return true;
            }

        }
        return false;
    }

    
}
