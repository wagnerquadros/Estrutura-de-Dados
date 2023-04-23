import Interface.Lista;

public class ListaDE implements Lista {

    private Noh inicio;
    private Noh fim;

    public ListaDE(){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(int info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
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
