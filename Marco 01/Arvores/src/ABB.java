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

    public Noh buscaIter(int elemento) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.valor == elemento) return aux;
            if (elemento < aux.valor) aux = aux.esq;
            if (elemento > aux.valor) aux = aux.dir;
        }
        return null;
    }

    public Noh buscaRec(int elemento) {
        return buscaRec(this.raiz, elemento);
    }

    private Noh buscaRec(Noh noh, int elemento) {
        if (noh == null) return null;
        if (elemento == noh.valor) return noh;
        if (elemento < noh.valor)
            return buscaRec(noh.esq, elemento);
        else
            return buscaRec(noh.dir, elemento);
    }

    public void preOrdem() {
        preOrdem(this.raiz);    
    }

    private void preOrdem(Noh noh) {
        if (noh != null) {
            System.out.println(noh.valor);
            preOrdem(noh.esq);
            preOrdem(noh.dir);
        }
    }   

    public void emOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(Noh noh) {
        if (noh != null) {
            emOrdem(noh.esq);
            System.out.println(noh.valor);
            emOrdem(noh.dir);
        }
    }


    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Noh noh) {
        if (noh != null) {
            posOrdem(noh.esq);
            posOrdem(noh.dir);
            System.out.println(noh.valor);
            //impressão só ocorre depois
        }
    }

        public void removeNoh(int element) {
        if (estahVazia()) {
            System.out.println("Arvore vazia!");
            return;
        }

        Noh noh = buscaRec(raiz, element);
        if (noh == null) {
            System.out.println("Elemento " + element + " não encontrado na árvore.");
            return;
        }

        if (noh.esq == null && noh.dir == null) {
            if (noh.pai == null) {
                this.raiz = null;
            } else {
                if (noh.pai.esq == noh) {
                    noh.pai.esq = null;
                } else {
                    noh.pai.dir = null;
                }
            }
        } else if (noh.esq == null || noh.dir == null) {
            if (noh.pai == null) {
                if (noh.esq != null) {
                    this.raiz = noh.esq;
                } else {
                    this.raiz = noh.esq;
                }
            } else {
                if (noh.pai.esq == noh) {
                    if (noh.esq != null) {
                        noh.pai.esq = noh.esq;
                    } else {
                        noh.pai.esq = noh.dir;
                    }
                } else {
                    if (noh.esq != null) {
                        noh.pai.dir = noh.esq;
                    } else {
                        noh.pai.dir = noh.dir;
                    }
                }
            }
        } else {
            Noh sucessor = sucessor(noh);
            noh.valor = sucessor.valor;
            if (sucessor.pai.esq == sucessor) {
                sucessor.pai.esq = null;
            } else {
                sucessor.pai.dir = null;
            }
        }
    }

    private Noh sucessor(Noh noh) {
        if (noh.dir != null) {
            return minimo(noh.dir);
        } else {
            Noh pai = noh.pai;
            while (pai != null && noh == pai.dir) {
                noh = pai;
                pai = pai.pai;
            }
            return pai;
        }
    }

    private Noh minimo(Noh dir) {
        while (dir.esq != null) {
            dir = dir.esq;
        }
        return dir;
    }
}  
