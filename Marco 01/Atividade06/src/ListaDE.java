import Interface.Lista;

public class ListaDE implements Lista {

    private Noh inicio;
    private Noh fim;

    public ListaDE(){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        
    }

    public void insereFim(int info) {

    }

    @Override
    public boolean estahVazia() {
        return false;
    }

    @Override
    public boolean remove(int info) {
        return false;
    }


    public int tamanho() {
        return 0;
    }
    
}
