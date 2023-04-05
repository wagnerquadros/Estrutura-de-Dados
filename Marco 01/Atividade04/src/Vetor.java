public class Vetor implements Ivetor {

    private Object[] alunos = new Object[3];
    private int nextIndex = 0;

    public Vetor(){
    }

    public Vetor(int i){
        alunos = new Object [i];
    }

    public void Adiciona(Object aluno){
        
        this.GaranteEspaco();
        alunos[nextIndex] = aluno;
        nextIndex++;
    }

    public int Tamanho(){
        return nextIndex;
    }

    public boolean Contem(Object aluno){
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
            Object[] alunosAuxiliar = new Object [nextIndex *2];
            for(int i=0; i < alunos.length; i ++)
                alunosAuxiliar[i] = alunos[i];
            alunos = alunosAuxiliar;
        }
    }

    public boolean Remove(Object aluno){
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
