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




    }
}
