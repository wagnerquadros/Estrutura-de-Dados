public class App {
    public static void main(String[] args) throws Exception {
        ListaSE lista = new ListaSE();
        lista.gerarNumerosAleatorios(10);
        lista.bubbleSort();
        lista.imprime_rec(lista.getInicio());
    }
}
