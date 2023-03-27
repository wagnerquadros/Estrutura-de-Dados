package Atividade01;

public class PontoCartesiano {
    
    private double x;
    private double y;

    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x){ this.x = x;}
    public void setY(double y){ this.y = y;}

    public double getX(){ return x;}
    public double getY(){ return y;}

    public double distanciaEuclidiana (PontoCartesiano pontoB){
        
        double xBxA = pontoB.getX() - x;
        double yByA = pontoB.getY() - y;

        double distancia = Math.sqrt(Math.pow(xBxA, 2) + Math.pow(yByA, 2));
        return distancia;

    }
}
