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
        pilha[numElem] = info;
        numElem++;
        return true;
    }


    public Object pop() {
        Object o = null;
        if(estahVazia()){
            System.out.println("Pilha vazia");
            return null;
        }
        o = pilha[numElem - 1];
        pilha[numElem - 1] = null;
        numElem--;
        System.out.println("esgsh");
        return o;

    }

 
    public Object top() {
        return null;
    }

  
    public boolean estahVazia() {
        if(numElem == 0)
            return true;
        return false;
    }

  
    public int tamanho() {
        return numElem;
    }
    
}
