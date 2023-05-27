import Objetos.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno("Albert", 17, 9);
        Aluno a2 = new Aluno("Robert", 17, 9);
        Aluno a3 = new Aluno("Enrico", 17, 9);
        Aluno a4 = new Aluno("Eugene", 17, 9);
        Aluno a5 = new Aluno("Hans", 17, 9);

        FilaLista fila = new FilaLista();
        fila.adiciona(a1);
        fila.adiciona(a2);
        fila.adiciona(a3);
        fila.adiciona(a4);
        fila.adiciona(a5);
        fila.imprimirFilaLista();
        System.out.println(fila.tamanho());
        System.out.println("");

        fila.remove();
        fila.imprimirFilaLista();
        System.out.println(fila.tamanho());
    }
}
