public class Noh {
    
    private int info; 
    private Noh proximo;

    public Noh (int info) {
        this.info = info;
        this.proximo = null;
    }

    public int getInfo() {return info;}
    public void setInfo(int info) {this.info = info;}
    public Noh getProximo() {return proximo;}
    public void setProximo(Noh proximo) {this.proximo = proximo;}

}
