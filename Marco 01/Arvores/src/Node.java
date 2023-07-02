public class Node {
    
    private int valor;
    private Node esq;
    private Node dir;
    private Node pai;
    private int balanceamento;

    public Node(int v){
        this.valor = v;
    }

    public void setValor(int valor) { this.valor = valor;}
    public void setEsq(Node esq) {this.esq = esq;}
    public void setDir(Node dir) {this.dir = dir;}
    public void setPai(Node pai) {this.pai = pai;}
    public void setBalanceamento(int balanceamento) {this.balanceamento = balanceamento;}

    public int getValor() {return valor;}
    public Node getEsq() {return esq;}
    public Node getDir() {return dir;}
    public Node getPai() {return pai;}
    public int getBalanceamento() {return balanceamento; }
    
    
}
