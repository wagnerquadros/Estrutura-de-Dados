public class Vetor implements Ivetor {

    private Aluno[] alunos = new Aluno[3];
    private int nextIndex = 0;

    public Vetor(){
    }

    public Vetor(int i){
        alunos = new Aluno [i];
    }

    public void Adiciona(Aluno aluno){
        if (!this.Cheio()){
            alunos[nextIndex] = aluno;
            nextIndex++;
        } else {
            System.out.print("Vetor Cheio");
        }


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

    public boolean Cheio() {
        if(nextIndex == this.alunos.length)
            return true;
        return false;
    }

    
    
}
