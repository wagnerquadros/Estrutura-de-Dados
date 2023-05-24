public class App {
    public static void main(String[] args) throws Exception {
        

        ListaDE lista = new ListaDE();

        lista.gerarNumerosAleatorios(10);
        lista.imprimirListaDoInicio();

        int numPares = lista.nroPares();
        System.out.println("Quantidade de Pares na lista: " + numPares);
    }
}
