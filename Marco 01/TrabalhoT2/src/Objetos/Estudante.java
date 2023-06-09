package Objetos;

public class Estudante {

    private String nome;
    private int matricula;

    public Estudante(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public void setNome(String nome){ this.nome = nome;}
    public void setMatricula(int matricula){ this.matricula = matricula;}

    public String getNome(){return nome;}
    public int getMatricula() {return matricula;}

    public String toString() {
        return nome;
    }
}
