public class Main {

    public static void main (String[]args){

        Aluno a1 = new Aluno("Adear", 20, 5);
        Aluno a2 = new Aluno("Joao", 20, 5);
        Aluno a3 = new Aluno("Pele", 20, 5);
        Aluno a4 = new Aluno("Zico", 20, 5);
    
        Vetor vetor = new Vetor();
         
		
        vetor.Adiciona(a1);
        vetor.Adiciona(a2);
        vetor.Adiciona(a3);
        vetor.Adiciona(a4);
	
        System.out.println(vetor.Contem(a4));

        vetor.Remove(a4);

        System.out.println(vetor.Contem(a4));

	
    }
}
