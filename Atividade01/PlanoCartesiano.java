import Atividade01.PontoCartesiano;

public class PlanoCartesiano {
    
    
    private PontoCartesiano p1,p2;
    

    public PlanoCartesiano (PontoCartesiano p1, PontoCartesiano p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double distanciaEuclidiana (){
        
        double xBxA = p2.getX() - p1.getX();
        double yByA = p2.getY() - p1.getY();

        double distancia = Math.sqrt(Math.pow(xBxA, 2) + Math.pow(yByA, 2));
        return distancia;

    }


}
