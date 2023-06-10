package Objetos;

public class Aluno {
    private String nome;
    private int idade;
    private int nota;

    public Aluno (String nome, int idade, int nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public int getNota() {return nota;}

    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setNota(int nota) {this.nota = nota;}

    public String toString() {
        return nome;
    }
  

}
