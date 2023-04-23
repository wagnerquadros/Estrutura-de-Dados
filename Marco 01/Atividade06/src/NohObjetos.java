public class NohObjetos {

    private Object obj; 
    private NohObjetos proximo;
    private NohObjetos anterior;

    public NohObjetos (Object obj) {
        this.obj = obj;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getInfo() {return obj;}
    public void setInfo(Object obj) {this.obj = obj;}

    public NohObjetos getProximo() {return proximo;}
    public void setProximo(NohObjetos proximo) {this.proximo = proximo;}

    public NohObjetos getAnterior() { return anterior;}
    public void setAnterior(NohObjetos anterior) {this.anterior = anterior;}

    
}
