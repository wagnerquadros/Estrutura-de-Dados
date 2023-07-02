public class ABB {
    
    private Noh raiz;

    public ABB (){
        
    }

    public boolean estahVazia(){
        return this.raiz == null;
    }

    public void adicionar(int elemento){
        if (estahVazia()){
            raiz = new Noh (elemento);
        } else {
            Noh aux = raiz;
            while (aux != null){
                if(elemento < aux.valor) {
                    if (aux.esq == null){
                        Noh novoNoh = new Noh (elemento);
                        aux.esq = novoNoh;
                        novoNoh.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else{
                    if (aux.dir == null){
                        Noh novoNoh = new Noh(elemento);
                        aux.dir = novoNoh;
                        novoNoh.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        }
    }

    public void addRecursiva(int elemento){
        if(estahVazia()){
            raiz = new Noh(elemento);
        } else {
            addRecursiva(raiz, elemento);
        }
    }

    private void addRecursiva (Noh noh, int elemento){
        if(elemento < noh.valor){
            if(noh.esq == null){
                Noh novoNoh = new Noh (elemento);
                noh.esq = novoNoh;
                novoNoh.pai = noh;
                return;
            }
            addRecursiva(noh.esq, elemento);
        } else {
            if (noh.dir == null){
                Noh novoNoh = new Noh(elemento);
                noh.dir = novoNoh;
                novoNoh.pai = noh;
                return;
            }
            addRecursiva(noh.dir, elemento);
        }
    }

    public boolean buscar(int elemento) {
        return buscar(raiz, elemento);
    }

    private boolean buscar(Noh noh, int elemento) {
        if (noh == null) {
            return false;
        }
        if (noh.valor == elemento) {
            return true;
        }
        if (elemento < noh.valor) {
            return buscar(noh.esq, elemento);
        } else {
            return buscar(noh.dir, elemento);
        }
    }

    public void imprimirArvore() {
        imprimirArvore(raiz);
    }

    private void imprimirArvore(Noh noh) {
        if (noh != null) {
            imprimirArvore(noh.esq);
            System.out.print(noh.valor + " ");
            imprimirArvore(noh.dir);
        }
    }
}  
