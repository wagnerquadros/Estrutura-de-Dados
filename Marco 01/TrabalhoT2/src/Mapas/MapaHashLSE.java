package Mapas;

import Fila.Noh;
import Lista.ListaSE;
import Objetos.Aluno;
import Objetos.Estudante;
import Vetor.Vetor;

public class MapaHashLSE {
    
    private ListaSE[] vetorlista;
    private int lotacao = 0;

    public MapaHashLSE(int tamanho){
        this.vetorlista = new ListaSE[tamanho];
    }

    private int hash(int chave){
        return chave % vetorlista.length;
    }


    public void put(int chave, Estudante valor) {
        if(estahLotado()){
            vetorlista = resize();
        }
        int hash = hash(chave);
        ListaSE listaEstudantes = vetorlista[hash];

        if (listaEstudantes == null) {
            listaEstudantes = new ListaSE();
            listaEstudantes.insereInicio(valor);
            vetorlista[hash] = listaEstudantes;
            lotacao+=1;
        } else {
            for (Noh n = listaEstudantes.getInicio(); n != null; n = n.getProximo()) {
               
                if (((Estudante)n.getInfo()).getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            listaEstudantes.insereInicio(valor);
        }
    }


    private ListaSE[] resize(){
        int novoTamanho = vetorlista.length * 2;
        ListaSE[] novaLista = new ListaSE[novoTamanho];
        rehash(novaLista);
        return novaLista;
    }

    private void rehash(ListaSE[] novaLista){
        int hash;
        lotacao = 0;
        for (int i = 0; i <vetorlista.length; i++){
            ListaSE aux = vetorlista[i];
            if(aux!=null){
                for(Noh n = aux.getInicio(); n != null; n = n.getProximo()){
                    Estudante estudante = (Estudante)n.getInfo();
                    hash = estudante.getMatricula() % novaLista.length;
                    ListaSE listaEstudantes = novaLista[hash];
                            
                    if (listaEstudantes == null) {
                            listaEstudantes = new ListaSE();
                            listaEstudantes.insereInicio(estudante);
                            novaLista[hash] = listaEstudantes;
                            lotacao+=1;
                    } else { 
                        listaEstudantes.insereInicio(estudante);
                    }
                }
            }
        }
    }

    public void remove(int chave){
        int hash = hash(chave);
        for(Noh n = vetorlista[hash].getInicio(); n != null; n = n.getProximo()){
            if(((Estudante)n.getInfo()).getMatricula() == chave){
                vetorlista[hash].remove(n.getInfo());
                if(vetorlista[hash].getInicio() == null){
                    lotacao-=1;
                }
                return;
            }      
        } 
    }

    public void imprimirLista(){
        for(int i = 0; i< vetorlista.length; i++){
            ListaSE listaEstudantes = vetorlista[i];
            if(listaEstudantes != null){
                for(Noh n = listaEstudantes.getInicio(); n != null; n = n.getProximo()){
                    System.out.println(((Estudante)n.getInfo()).toString());      
                }
            }
        }
    }

    
    public boolean estahLotado(){
        return lotacao == vetorlista.length;
    }

    public int getLotacao(){
        return lotacao;
    }
}
