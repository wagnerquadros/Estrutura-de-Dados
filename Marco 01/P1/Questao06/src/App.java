public class App {
    public static void main(String[] args) throws Exception {
        
        ListaDE lista = new ListaDE();

        lista.add_ordenado(5);
        lista.add_ordenado(12);
        lista.add_ordenado(9);
        lista.add_ordenado(1);
        lista.add_ordenado(3);
        lista.add_ordenado(14);
        lista.add_ordenado(7);

        lista.imprimirListaDoInicio();
        
    }
}
