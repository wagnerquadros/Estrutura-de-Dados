package Mapas;

import Objetos.Estudante;

public class MapaHashVetor {
    
    private Estudante[] vetor;
    private int lotacao;

    public MapaHashVetor(int tamanho){
        this.vetor = new Estudante[tamanho];
        this.lotacao = 0;
    }

    private int hash(int chave){
        return chave % vetor.length;
    }

    public Estudante get(int chave){
        int sondagem = 0;
        int hash;
        while(sondagem < vetor.length){
            hash = (hash(chave) + sondagem) % vetor.length;
            if(vetor[hash].getMatricula() == chave){
                return vetor[hash];
            }
            sondagem++;
        }
        return null;
    }

    public void put(int chave, Estudante valor){
        int sondagem = 0;
        int hash;

        if(estahLotado()){
            vetor = resize();
        }

        while(sondagem < vetor.length){
            hash = (hash(chave) + sondagem) % vetor.length;

            if (vetor[hash] == null || vetor[hash].getMatricula() == chave){
                vetor[hash] = valor;
                lotacao+=1;
                return;
            }
            sondagem++;
        }
    }

    public Estudante remove(int chave){
        
        int sondagem = 0;
        int hash;
        while(sondagem < vetor.length){
            hash = (hash(chave) + sondagem) % vetor.length;
            if(vetor[hash].getMatricula() == chave){
                Estudante estudante = vetor[hash];
                vetor[hash]=null;
                lotacao-=1;
                return estudante;
            }
            sondagem++;
        }
        return null;
    }

    public void imprimir(){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null)
                System.out.println(vetor[i].toString());
        }
    }

    public Estudante[] resize(){
        int novoTamanho = vetor.length * 2;
        Estudante[] novoVetor = new Estudante[novoTamanho];

        rehash(novoVetor);

        return novoVetor;
    }

    public void rehash(Estudante[] novoVetor){
        int sondagem = 0;
        int hash;

        for (int i = 0; i < vetor.length; i++){
    
            while(sondagem < vetor.length){
                hash = (hash(vetor[i].getMatricula()) + sondagem) % novoVetor.length;
         
                if (novoVetor[hash] == null){
                    novoVetor[hash] = vetor[i];
                    break;
                }
                sondagem++;
            }
        }
    }

    public boolean estahLotado(){
        return lotacao == vetor.length;
    }
}
