

public class App {
    public static void main(String[] args) throws Exception {
        

        Vetor vetor = new Vetor();
        int[] vatorAleatorio = vetor.gerarNumerosAleatorios();

        long inicioRec = System.nanoTime(); 
        System.out.println("Recursão - Valor máximo: " + vetor.maximoRecusao(vatorAleatorio, 0, vatorAleatorio.length-1));
        long fimRec = System.nanoTime();
        System.out.println("Tempo de execução (nanosegundos): " + (fimRec - inicioRec));

        System.out.println("");

        long inicioIte = System.nanoTime(); 
        System.out.println("Iteração - Valor máximo: " + vetor.maximoRecusao(vatorAleatorio, 0, vatorAleatorio.length-1));
        long fimIte = System.nanoTime();
        System.out.println("Tempo de execução (nanosegundos): " + (fimIte - inicioIte));



    }
}


/*
 * Utilize o TAD Vetor e implemente um método recursivo para encontrar
 *  o maior elemento. Implemente um método iterativo para esse fim também. 
 * Utilize algum método de cômputo de tempo para registrar o tempo de 
 * execução de cada um desses métodos para um vetor com 1000 números 
 * inteiros aleatórios. 
 */
