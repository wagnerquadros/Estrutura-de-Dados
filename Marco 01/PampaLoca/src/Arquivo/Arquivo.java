package Arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Lista.ListaObjetos;
import objetos.Categoria;
import objetos.Veiculo;

public class Arquivo {

    String caminhoVeiculos = "D:\\GitHubDescktop\\Estrutura-de-Dados\\Marco 01\\PampaLoca\\src\\Dados\\Veiculos.csv";
    String caminhoCategorias = "D:\\GitHubDescktop\\Estrutura-de-Dados\\Marco 01\\PampaLoca\\src\\Dados\\Categorias.csv";

    public void setVeiculos(ListaObjetos lista){
        
        try{
            File arqVeic = new File(caminhoVeiculos);
            Scanner scanner = new Scanner(arqVeic);
            scanner.useDelimiter(";|\n");

            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] campos = linha.split(";");
                String placa = campos[0];
                String modelo = campos[1];
                String marca = campos[2];
                int ano = Integer.parseInt(campos[3]);
                int potencia = Integer.parseInt(campos[4]);
                int nLugares = Integer.parseInt(campos[5]);
                String categoria = campos[6];
                Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, potencia, nLugares, categoria);
                lista.insereFim(veiculo);
            }
            scanner.close();

        } catch (Exception ex){
            System.out.println("Erro na leitura do arquivo!");
        }
    }

    public void setCategorias(ListaObjetos lista){
        try{
            File arqVeic = new File(caminhoCategorias);
            Scanner scanner = new Scanner(arqVeic);
            scanner.useDelimiter(";|\n");

            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] campos = linha.split(";");
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                Categoria categoria = new Categoria(id, nome);
                lista.insereFim(categoria);
            }
            scanner.close();

        } catch (Exception ex){
            System.out.println("Erro na leitura do arquivo!");
        }
    }
}   
