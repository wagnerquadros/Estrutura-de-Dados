package Interface;

public interface IPilha {
    public boolean push(Object info);
    public Object pop();
    public Object top();
    public boolean estahVazia();
    public int tamanho();
}
