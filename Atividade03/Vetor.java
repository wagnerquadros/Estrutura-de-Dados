public class Vetor {

    private Aluno[] alunos = new Aluno[5];
    private int nextIndex = 0;

    public Vetor(){
    }

    public void Adiciona(Aluno aluno){
        alunos[nextIndex] = aluno;
        nextIndex++;
    }

    public int Tamanho(){
        return nextIndex;
    }

    public boolean Contem(Aluno aluno){
        boolean contem = false;
        for (int i = 0; i<nextIndex; i++){
            if (alunos[i].equals(aluno)){
                contem = true;
            }

        }
        return contem;
    }

    
}
