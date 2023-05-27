public class App {
    public static void main(String[] args) {    
        
        FilaVet fila = new FilaVet(4);
        fila.adiciona(5);
        fila.adiciona(3);
        fila.adiciona(2);
        fila.adiciona(6);

        fila.imprimirFila();

        fila.adiciona(7);

        fila.remove();
        fila.remove();
        fila.imprimirFila();
       
    }
}
