public class Vetor implements Ivetor {

    private Aluno[] alunos = new Aluno[3];
    private int nextIndex = 0;

    public Vetor(){
    }

    public Vetor(int i){
        alunos = new Aluno [i];
    }

    public void Adiciona(Aluno aluno){
        
        this.GaranteEspaco();
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

    public boolean Cheio() {
        if(nextIndex == this.alunos.length)
            return true;
        return false;
    }

    private void GaranteEspaco(){
        if(this.Cheio()){
            Aluno[] alunosAuxiliar = new Aluno [nextIndex *2];
            for(int i=0; i < alunos.length; i ++)
                alunosAuxiliar[i] = alunos[i];
            alunos = alunosAuxiliar;
        }
    }

    public boolean Remove(Aluno aluno){
        int indice = -1;
        for(int i=0; i < nextIndex; i++)
            if (aluno.getNome() == alunos[i].getNome()){
                indice = i;
                break;
            }
        if (indice != -1){
            for(int i=indice; i<(nextIndex-1);i++)
                alunos[i]=alunos[i+1];
            nextIndex--;
            return true;
        }     
        return false;
    }
       
}
