public class AVL {
    
    private Node raiz;

    public AVL(){}

    public Node getRaiz(){ return this.raiz;}
    public void setRaiz(Node raiz){ this.raiz = raiz;}

    public boolean estahVazia(){
        return raiz == null;
    }

    public void adicionar(int elemento, Node atual) {
        if (estahVazia()) {
            Node novoNo = new Node(elemento);
            raiz = novoNo;
             ajustarBalanceamento(raiz);
        } else {
            if (elemento < atual.getValor()) {
                if (atual.getEsq() != null) {
                    adicionar(elemento, atual.getEsq());
                } else {
                    // no null, vamos inserir.
                    Node novoNo = new Node(elemento);
                    atual.setEsq(novoNo);
                    novoNo.setPai(atual);
                    ajustarBalanceamento(raiz);
                    raiz = balancear(raiz);
                }
            } else if (elemento > atual.getValor()) {
                if (atual.getDir() != null) {
                    adicionar(elemento, atual.getDir());
                } else {
                    // no null, vamos inserir.
                    Node novoNo = new Node(elemento);
                    atual.setDir(novoNo);
                    novoNo.setPai(atual);
                    ajustarBalanceamento(raiz);
                    raiz = balancear(raiz);
                }
            } else {
                System.out.println("Caso de no ser repetido!");
            }
        }
    }
    
     public void ajustarBalanceamento(Node atual) {
        atual.setBalanceamento(getAltura(atual.getEsq()) - getAltura(atual.getDir()));
        if (atual.getDir() != null) {
            ajustarBalanceamento(atual.getDir());
        }
        if (atual.getEsq() != null) {
            ajustarBalanceamento(atual.getEsq());
        }
    }

    public int getAltura(Node atual) {
        if (atual == null) {
            return -1;
        }
        if (atual.getDir() == null && atual.getEsq() == null) {
            return 0;
        } else if (atual.getEsq() == null) {
            return 1 + getAltura(atual.getDir());
        } else if (atual.getDir() == null) {
            return 1 + getAltura(atual.getEsq());
        } else {
            if (getAltura(atual.getEsq()) > getAltura(atual.getDir())) {
                return 1 + getAltura(atual.getEsq());
            } else {
                return 1 + getAltura(atual.getDir());
            }
        }
    }

    public Node balancear(Node atual) {
        if (atual.getBalanceamento() == 2 && atual.getEsq().getBalanceamento() >= 0) {
            atual = rotacaoADireita(atual);

        } else if (atual.getBalanceamento() == -2 && atual.getDir().getBalanceamento() <= 0) {
            atual = rotacaoAEsquerda(atual);

        } else if (atual.getBalanceamento() == 2 && atual.getEsq().getBalanceamento() < 0) {
            atual = rotacaoDuplaDireita(atual);

        } else if (atual.getBalanceamento() == -2 && atual.getDir().getBalanceamento() > 0) {
            atual = rotacaoDuplaEsquerda(atual);
        }

        if (atual.getDir() != null) {
            balancear(atual.getDir());
        }
        if (atual.getEsq() != null) {
            balancear(atual.getEsq());
        }
        return atual;
    }

    public Node rotacaoADireita(Node atual) {
        Node aux = atual.getEsq();
        aux.setPai(atual.getPai());
        if (aux.getDir() != null) {
            aux.getDir().setPai(atual);
        }
        atual.setPai(aux);
        atual.setEsq(aux.getDir());
        aux.setDir(atual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDir() == atual) {
                aux.getPai().setDir(aux);
            } else if (aux.getPai().getEsq() == atual) {
                aux.getPai().setEsq(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public Node rotacaoAEsquerda(Node atual) {
        Node aux = atual.getDir();
        aux.setPai(atual.getPai());
        if (aux.getEsq() != null) {
            aux.getEsq().setPai(atual);
        }

        atual.setPai(aux);
        atual.setDir(aux.getEsq());
        aux.setEsq(atual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDir() == atual) {
                aux.getPai().setDir(aux);
            } else if (aux.getPai().getEsq() == atual) {
                aux.getPai().setEsq(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public Node rotacaoDuplaDireita(Node atual) {
        Node auxEsq = atual.getEsq();
        atual.setEsq(rotacaoAEsquerda(auxEsq));
        Node auxDir = rotacaoADireita(atual);
        return auxDir;
    }

    public Node rotacaoDuplaEsquerda(Node atual) {
        Node auxDir = atual.getDir();
        atual.setDir(rotacaoADireita(auxDir));
        Node auxEsq = rotacaoAEsquerda(atual);
        return auxEsq;
    }

    public void preOrdem() {
        preOrdem(this.raiz);    
    }

    private void preOrdem(Node node) {
        if (node != null) {
            System.out.println(node.getValor());
            preOrdem(node.getEsq());
            preOrdem(node.getDir());
        }
    } 

    public boolean estahBalanceada(Node atual) {
        if (atual == null) {
            return true;
        }
        if (atual.getBalanceamento() > 1 || atual.getBalanceamento() < -1) {
            return false;
        }
        return estahBalanceada(atual.getEsq()) && estahBalanceada(atual.getDir());
    }
}


