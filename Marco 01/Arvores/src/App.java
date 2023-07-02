public class App {
    public static void main(String[] args) throws Exception {
        
        ///////////////////////////////////////////////
        ABB abb = new ABB();

        abb.adicionar(20);
        abb.adicionar(25);
        abb.adicionar(40);
        abb.adicionar(17);
        abb.adicionar(34);
        abb.adicionar(1);
        abb.adicionar(10);
        abb.adicionar(15);

        
        System.out.println("");
        abb.emOrdem();
        System.out.println("");
        abb.preOrdem();
        System.out.println("");
        abb.posOrdem();

        System.out.println("");
        abb.preOrdem();
        abb.removeNoh(1);
        
        System.out.println("");
        abb.preOrdem();

        
        System.out.println("============================================");
        //////////////////////////////////////////////////////


        AVL avl = new AVL();
        avl.adicionar(51, avl.getRaiz());
        avl.adicionar(57, avl.getRaiz());
        avl.adicionar(98, avl.getRaiz());
        avl.adicionar(19, avl.getRaiz());
        avl.adicionar(11, avl.getRaiz());
        avl.adicionar(45, avl.getRaiz());
        avl.adicionar(79, avl.getRaiz());

        avl.preOrdem();

        System.out.println(avl.estahBalanceada(avl.getRaiz()));

    }
}
