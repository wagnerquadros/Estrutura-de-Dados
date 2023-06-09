import javax.print.event.PrintJobListener;

import Fila.FilaLista;
import Mapas.MapaHashVetor;
import Objetos.Aluno;
import Objetos.Estudante;
import Pilha.PilhaLista;
import Pilha.PilhaVet;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Atividade Palindromo
        Palindromo p = new Palindromo();
        System.out.println(p.ehPalindromo("arara")); 
        System.out.println(p.ehPalindromo("socorrammesubinoonibusemmarrocos"));
        System.out.println(p.ehPalindromo("esssaNaoEh"));

        System.out.println();
        System.out.println("==============================================");
        System.out.println();


        //Atividade pilha Alunos
        Aluno a = new Aluno("Allejo", 0, 0);
        Aluno b = new Aluno("Beranco", 0, 0);
        Aluno c = new Aluno("Canija", 0, 0);
        Aluno d = new Aluno("Dembele", 0, 0);
        Aluno e = new Aluno("Ezio", 0, 0);

        PilhaLista pilhaAlunos = new PilhaLista();
        pilhaAlunos.push(a);
        pilhaAlunos.push(b);
        pilhaAlunos.push(c);
        pilhaAlunos.push(d);
        pilhaAlunos.push(e); 

        pilhaAlunos.imprimirPilhaLista();
        
        PilhaLista pilhaInvertida = new PilhaLista();
        pilhaInvertida = pilhaAlunos.inverterPilha(pilhaAlunos);
        pilhaInvertida.imprimirPilhaLista();


    }
}
