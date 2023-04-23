import Interface.IListaObject;

public class ListaObjetos implements IListaObject {

    private NohObjetos inicio;
    private NohObjetos fim;

    public ListaObjetos(){
            this.inicio = null;
            this.fim = null;
    }


    public void insereInicio(Object ob) {
        NohObjetos novo = new NohObjetos(ob);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        } 
    }


    public void insereFim(Object ob) {
        NohObjetos novo = new NohObjetos(ob);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }    
    }

    public boolean estahVazia() {
        if(inicio!=null)
            return false;
        return true;   
    }


    public boolean remove(Object ob) {
        NohObjetos p = inicio;

        while (p!=null && p.getInfo() != ob){
            p = p.getProximo();
        }

        if (p == null)
            return false;
        if (p == inicio){
            inicio = p.getProximo();
            if(inicio != null) inicio.setAnterior(null);
            else fim = null;
        } else if (p.getProximo() == null){     
                p.getAnterior().setProximo(null);
                fim = p.getAnterior();

        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        
        return true;
    }

    public int tamanho() {
        NohObjetos aux = inicio;
        int tamanho = 0;

        if (!this.estahVazia()){
            while(aux!=null){
                tamanho +=1;
                aux = aux.getProximo();
            }
        } 
        return tamanho;
    }
}
