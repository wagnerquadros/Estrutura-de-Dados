public class App {
    public static void main(String[] args) throws Exception {
        
        
        Vetor vetor = new Vetor(1000);
        Vetor vetor2 = new Vetor(1000);
        Vetor vetor3 = new Vetor(1000);
        vetor.gerarNumerosAleatoriosRecebendotamanho(1000);
        vetor2.gerarNumerosAleatoriosRecebendotamanho(1000);
        vetor3.gerarNumerosAleatoriosRecebendotamanho(1000);

        long inicioBS = System.nanoTime();
        vetor.booble_sort();
        long fimBS = System.nanoTime();

        long inicioSS = System.nanoTime();
        vetor2.selection_sort();
        long fimSS = System.nanoTime();

        long inicioIS = System.nanoTime();
        vetor3.insertion_sort();
        long fimIS = System.nanoTime();
    
        System.out.println("Tempo execução Booble Sort: " + (fimBS - inicioBS));
        System.out.println("Tempo execução Selection Sort: " + (fimSS - inicioSS));
        System.out.println("Tempo execução Insertion Sort: " + (fimIS - inicioIS));
    }
}
