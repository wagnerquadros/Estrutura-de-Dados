package Atividade01;

public class Main {
    
    public static void main (String[] args) {

        PontoCartesiano pontoA = new PontoCartesiano(2,5);
        PontoCartesiano pontoB = new PontoCartesiano(2, 6);

        System.out.println("Distancia = " + pontoA.distanciaEuclidiana(pontoB));
        
    }
}
