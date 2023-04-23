import Arquivo.Arquivo;
import Lista.ListaObjetos;

public class App {
    public static void main(String[] args) throws Exception {
       
        ListaObjetos categorias = new ListaObjetos();
        ListaObjetos veiculos = new ListaObjetos();
        ListaObjetos clientes = new ListaObjetos();

        Arquivo arquivo = new Arquivo();
        arquivo.setVeiculos(veiculos);
        arquivo.setCategorias(categorias);

        veiculos.imprimeLista();
        categorias.imprimeLista();
    }
}
