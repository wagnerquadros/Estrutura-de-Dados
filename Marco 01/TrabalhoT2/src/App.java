import Fila.FilaLista;
import Objetos.Aluno;
import Pilha.PilhaVet;

public class App {
    public static void main(String[] args) throws Exception {
        

        Aluno a = new Aluno("W", 0, 0);
        PilhaVet p = new PilhaVet(1);
        p.push(a);
        p.pop();
        p.pop();
    }
}
