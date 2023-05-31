package Fila;

import Interface.IFila;

public class FilaLista implements IFila {

    private Noh inicio;
    private Noh fim;

    public FilaLista(){
        this.inicio = null;
        this.fim = null;
    }

    public boolean adiciona(Object info) {
        Noh novo = new Noh(info);
        if (estaVazia())
            inicio = novo;
        else
            fim.setProximo(novo);
        fim = novo;
        return true;
    }

    public boolean remove() {
        if(!estaVazia()){
            if(inicio == fim){
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProximo();
            }
            return true;
        }
        return false;
    }


    public boolean estaVazia() {
        if(inicio != null) 
            return false;
        return true;
    }

   
    public int tamanho() {
        Noh aux = inicio;
        int tamanho = 0;

        if (!this.estaVazia()){
            while(aux!=null){
                tamanho +=1;
                aux = aux.getProximo();
            }
        } 
        return tamanho;
    }


    public void imprimirFilaLista(){
        Noh aux = inicio;
        while (aux != null){
            System.out.println(aux.getInfo().toString());
            aux = aux.getProximo();
        }
    }
    
}
