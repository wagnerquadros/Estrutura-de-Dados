package Fila;
public class Noh {
    private Object info;
    private Noh proximo;
    private Noh anterior;

    public Noh(Object info){
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getInfo() { return info;}
    public Noh getProximo() {return proximo;}
    public Noh getAnterior() {return anterior;}

    public void setInfo(Object info) {this.info = info;}
    public void setProximo(Noh n) {this.proximo = n;}
    public void setAnterior(Noh anterior) {this.anterior = anterior;}
    
}
