package Pilha;

import javax.lang.model.util.ElementScanner14;

import Fila.Noh;
import Interface.IPilha;

public class PilhaLista implements IPilha {
    
    private Noh topo;

    public PilhaLista(){
        this.topo = null;
    }

    public boolean push(Object info){
        Noh novo =  new Noh(info);
        if (estahVazia())
            topo = novo;
        else {
            novo.setProximo(topo);
            topo = novo;
        }
        return true;
    }

    public Object pop() {
        Object info = null;
        if(!estahVazia()){
            info = topo.getInfo();
            topo = topo.getProximo();
        }
        return info;
    }

    public Object top() {
        return topo;
    }

    public boolean estahVazia() {
        if(topo == null)
            return true;
        return false;
    }

    public int tamanho() {
        Noh aux =  topo;
        int tamanho = 0;
        if(!estahVazia()){
            while(aux != null){
                aux = aux.getProximo();
                tamanho++;
            }    
        }
        return tamanho;
    }

    public void imprimirPilhaLista(){
        if(!estahVazia()){
            Noh aux = topo;
            while (aux != null){
                System.out.println(aux.getInfo().toString());
                aux = aux.getProximo();
            }
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public PilhaLista inverterPilha(PilhaLista pilha){
        if(!estahVazia()){
            PilhaLista invertida = new PilhaLista();
            while(pilha.top()!=null){
                invertida.push(topo.getInfo());
                pilha.pop();
            }
            return invertida;
        } else {
            System.out.println("Pilha Vazia");
        }
        return null;
    }
    
}
