import Mapas.MapaHashLSE;
import Objetos.Estudante;

public class Main_LSE {
    
    public static void main(String[]args) {
    
        MapaHashLSE turma = new MapaHashLSE(8);

        turma.put(73643521, new Estudante(73643521, "Hideo"));
        turma.put(87999524, new Estudante(87999524, "Shigueru"));
        turma.put(52410922, new Estudante(52410922, "Shinji"));
        turma.put(99641111, new Estudante(99641111, "Akira"));
        turma.put(125, new Estudante(125, "Hironobu"));
        turma.put(126, new Estudante(126, "Tsurugi"));
        turma.put(127, new Estudante(127, "Hayate"));
        turma.put(128, new Estudante(128, "Ozora"));
        turma.put(129, new Estudante(129, "Sayaka"));
        turma.put(130, new Estudante(130, "Mai"));
        turma.put(131, new Estudante(131, "Ibuki"));
        turma.put(139, new Estudante(139, "Bazzo"));
        turma.put(140, new Estudante(140, "Ahames"));
        turma.put(2607, new Estudante(2607, "Giluke"));
        turma.put(495046, new Estudante(495046, "Goku"));
        turma.put(416015, new Estudante(416015, "Vegeta"));
        turma.put(541304, new Estudante(541304, "Pikolo"));
        turma.put(30103, new Estudante(30103, "Bulma"));
        turma.put(1256, new Estudante(1256, "Kame"));
        turma.put(50284, new Estudante(50284, "Kuririm"));
        turma.put(8152, new Estudante(81512, "Nr.18"));
        turma.put(56110, new Estudante(56110, "Napa"));


        System.out.println(turma.getLotacao());
        turma.imprimirLista();

        turma.remove(128);
        turma.remove(127);
        turma.remove(495046);

        System.out.println();

        System.out.println(turma.getLotacao());
        turma.imprimirLista();
    }
    
}
