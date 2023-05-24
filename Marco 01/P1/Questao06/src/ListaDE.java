import java.util.Random;

public class ListaDE {

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

    public int nroPares(){
        int pares = 0;
        Noh aux = inicio;
        while(aux != null){
            if(aux.getInfo() % 2 ==0){
                pares++;
            }
            aux =aux.getProximo();
        }
        return pares;
    }

    public void gerarNumerosAleatorios(int n){
        Random rand = new Random();
        for(int i = 0 ; i < n; i++){
            this.insereFim(rand.nextInt(100));
        }
    }

    public void imprimirListaDoInicio(){
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    public int add_ordenado(int info){
        Noh novo = new Noh(info);
        if(estahVazia()){
            inicio = novo;
            fim = novo;
        } else if (info <inicio.getInfo()){
            insereInicio(info);
        } else if(info > fim.getInfo()){
            insereFim(info);
        } else {
            Noh aux = inicio;

            while(aux != null && aux.getInfo() < info){
                aux = aux.getProximo();
            }
            insereNoMeio(info, novo);
        }

        return 0;
    }

    public void insereNoMeio(int info, Noh novo){
        Noh aux = inicio;

        while(aux != null && aux.getInfo() < info){
            aux = aux.getProximo();
        }
        novo.setProximo(aux);
        novo.setAnterior(aux.getAnterior());
        aux.getAnterior().setProximo(novo);
        aux.setAnterior(novo);
    }
    

    public boolean estahVazia() {
        return inicio == null;
    }
}
