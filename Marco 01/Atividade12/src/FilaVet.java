import Interface.IFila;

public class FilaVet implements IFila {

    private int nElemFila;
    private int inicio;
    private Object[] vetFila;
    
    public FilaVet (int tamanho){   
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamanho];
    }

    public boolean adiciona(Object info) {
        if(this.nElemFila == vetFila.length){
            System.out.println("Capacidade da fila esgotou.");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove() {
        if(this.estaVazia()){
            System.out.println("Fila vazia.");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public boolean estaVazia() {
        if(this.nElemFila != 0)
            return false;
        return true;
    }

    public int tamanho() {
        return this.vetFila.length;
    }

    public void imprimirFila(){
        if(!estaVazia()){
            for(int i = inicio; i < (nElemFila + inicio); i++){
                System.out.println(vetFila[i]);
            }
        } else{
            System.out.println("Fila vazia");
        }

    }
    
}
