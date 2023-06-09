import Mapas.MapaHashVetor;
import Objetos.Estudante;

public class Main_Mapas {
    
    public static void main(String[]args) {

        //Atividade Mapas
        MapaHashVetor turma = new MapaHashVetor(4);    
        turma.put(736435217, new Estudante(736435217, "Hideo"));
        turma.put(879995247, new Estudante(879995247, "Shigueru"));
        turma.put(524109227, new Estudante(524109227, "Shinji"));
        turma.put(996411117, new Estudante(996411117, "Akira"));
        turma.put(125, new Estudante(125, "Hironobu"));
        
        turma.imprimir();
        System.out.println();
        turma.remove(524109227);
        turma.imprimir();

        turma.put(126, new Estudante(126, "Tsurugi"));
        turma.put(127, new Estudante(127, "Hayate"));
        turma.put(128, new Estudante(128, "Ozora"));
        turma.put(129, new Estudante(129, "Sayaka"));
        turma.put(130, new Estudante(130, "Mai"));
        turma.put(131, new Estudante(131, "Ibuki"));
        turma.put(139, new Estudante(139, "Bazzo"));
        turma.put(140, new Estudante(140, "Ahames"));
        turma.put(260, new Estudante(260, "Giluke"));

        System.out.println();
        turma.imprimir();
        System.out.println();
        
        turma.remove(130);
        turma.remove(140);
        turma.imprimir();
    }
}
