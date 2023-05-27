

public class App {
    public static void main(String[] args) {
        
        int n = 50;
        int m = 1;
        Somatorio s = new Somatorio();

        int resultadoRecursivo = s.realizarSomartorio(m, n);
        int resultadoFor = s.somtarioLacoFor(m, n);
        int resultadoWhile = s.somatorioLacoWhile(m, n);
   
        System.out.println("Recursivo: " + resultadoRecursivo);
        System.out.println("Laço For: " + resultadoFor);
        System.out.println("Laço While: " + resultadoWhile);
    }
}
