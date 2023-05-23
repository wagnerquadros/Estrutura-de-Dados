public class Fibonacci {
    
    public Fibonacci(){
    }

    public int fibonacciRecursao(int num){
        if (num < 2){
            return num;
        } else {
            return fibonacciRecursao(num - 1) + fibonacciRecursao(num - 2);
        }
    }

    public void imprimirFibonacci(int num){
        for (int i=0; i < num; i++){
            System.out.println(fibonacciRecursao(i));
        }
    }
}
