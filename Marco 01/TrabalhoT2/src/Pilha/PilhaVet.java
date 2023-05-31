package Pilha;

import Interface.IPilha;

public class PilhaVet implements IPilha{

    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor){
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean push(Object info) {

        if( numElem == pilha.length){
            System.out.println("Pilha estourou");
            return false;
        } 
        pilha[this.numElem] = info;
        numElem++;
        return true;
    }


    public Object pop() {
        return null;
    }

 
    public Object top() {
        return null;
    }

  
    public boolean estahVazia() {
        if(pilha == null)
            return true;
        return false;
    }

  
    public int tamanho() {
        return numElem;
    }
    
}
