public class Somatorio {
    
    public Somatorio(){}

    public int realizarSomartorio(int m, int n){
        if (n <= m) {
            return m;
        } else {
            return m + realizarSomartorio(m + 1, n);
        }
    }

    public int somtarioLacoFor(int m, int n){
        int resultado = 0;
        for (int i = m; i <= n; i++){
            resultado += i;
        }
        return resultado;
    }
    
    public int somatorioLacoWhile(int m, int n){
        int resultado = 0;
        while (m <= n){
            resultado += m;
            m++;
        }
        return resultado;
    }
}
