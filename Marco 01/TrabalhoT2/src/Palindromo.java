import Pilha.PilhaVet;

public class Palindromo {
    
    private PilhaVet pilha;

    public Palindromo(){
    }

    public boolean ehPalindromo(String palavra){
        pilha = new PilhaVet(palavra.length());
        empilharLetras(palavra, pilha);

        for(int i = 0; i < palavra.length(); i++){
            if (!pilha.top().equals(palavra.charAt(i))){
                return false;
            }
            pilha.pop();
        }
        return true;
    }

    private void empilharLetras(String palavra, PilhaVet pilha){
        for(int i = 0; i < palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        } 
    }

    public void imprimir(){
        pilha.imprimirPilhaVet();
    }
}
