public class App {
    public static void main(String[] args) throws Exception {
        
        
        Vetor vetorUm = new Vetor(10);
        Vetor vetorDois = new Vetor(10);

        int cont = 0;
        int [] vetorAuxiliar = new int[10];

        vetorUm.gerarNumerosAleatoriosRecebendotamanho(10);
        vetorDois.gerarNumerosAleatoriosRecebendotamanho(10);

        for(int i = 0; i < vetorDois.Tamanho(); i++){
            if(vetorUm.Contem(vetorDois.getNumero(i))){
                vetorAuxiliar[cont] = vetorDois.getNumero(i);
                cont++;
            }
        }

        Vetor intersecao = new Vetor(cont);
        for(int i = 0; i < cont; i++){
            intersecao.Adiciona(vetorAuxiliar[i]);
        }


        System.out.println("Vetor Um");
        vetorUm.listarVetor();

        System.out.println("");
        System.out.println("Vetor Dois");
        vetorDois.listarVetor();
        
        System.out.println("");
        System.out.println("Interseção");
        intersecao.listarVetor();
    }
}


