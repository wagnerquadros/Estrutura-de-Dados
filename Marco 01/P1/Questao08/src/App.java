public class App {
    public static void main(String[] args) throws Exception {
        
        ListaDE lista1 = new ListaDE();
        ListaDE lista2 = new ListaDE();
        
        lista1.gerarNumerosAleatorios(5);
        lista2.gerarNumerosAleatorios(5);
        lista1.concat(lista2);

        lista1.imprimirListaDoInicio();


    }
}
