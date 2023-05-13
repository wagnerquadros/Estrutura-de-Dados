import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Vetor vetor = new Vetor();
        int vetorAleatorio[] = vetor.gerarNumerosAleatorios();
        Random rand = new Random();
        int valor = rand.nextInt(9999);
        // Busca Recursiva

        long inicioBuscaRec = System.nanoTime();
        boolean buscaRec = vetor.buscaRecursiva(vetorAleatorio, 0, vetorAleatorio.length-1, valor);
        long fimbuscaRec = System.nanoTime();
        
        System.out.println("Numero Buscado: " + valor);
        System.out.println("");
        
        System.out.println("==============================");
        System.out.println("Busca Recursiva");
        System.out.println("==============================");
        
        if(buscaRec){
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero não encontrado");
        }
        System.out.println("Tempo execução: " + (fimbuscaRec - inicioBuscaRec));
        
        System.out.println("==============================");
        System.out.println("");
       


        // Busca Iterativa

        long inicioBusca = System.nanoTime();
        boolean busca = vetor.buscaBinaria(valor);
        long fimbusca = System.nanoTime();

        System.out.println("==============================");
        System.out.println("Busca Iterativa");
        System.out.println("==============================");
        
        if(busca){
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero não encontrado");
        }

        System.out.println("Tempo execução: " + (fimbusca - inicioBusca));
        System.out.println("==============================");
    }
}
