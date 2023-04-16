import Objetos.Aluno;
import Objetos.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        
        ListaSE l = new ListaSE();
        l.insereInicio(10);
        l.insereInicio(5);
        l.insereFim(8);
        l.insereFim(22);
        l.insereInicio(99);
        l.insereInicio(65);
        l.remove(5);
    
        l.imprimirLista();

        l.remove(1111);

        System.out.println(l.contemInfo(13123));
        System.out.println(l.contemInfo(8));
        System.out.println(l.estahVazia());

        ListaSE l2 = new ListaSE();
        System.out.println(l2.estahVazia());

        l2.insereFim(1);
        System.out.println(l2.estahVazia());
        System.out.println(l.tamanho());

        l.insereInicio(99);
        l.insereInicio(65);
        System.out.println(l.tamanho());



        Aluno a1 = new Aluno("Zé", 20 , 10);
        Professor p1 = new Professor("Mestre","mestre@gmail");

        ListaObjetos lo = new ListaObjetos();
        lo.insereInicio(a1);
        lo.insereInicio(p1);

        System.out.println();
        System.out.println();
        System.out.println(lo.estahVazia());
        System.out.println(lo.tamanho());
        lo.remove(a1);
        System.out.println();
        System.out.println(lo.tamanho());





    }
}
