/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;
import midia.Musica;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 *
 */
public class ColecaoMusica extends Colecao {

    private List<Musica> listaDeMusica;

    public ColecaoMusica(List<Midia> listaDeMidia) {
        super(listaDeMidia);
    }

    /**
     *
     * Método que recebe por param o caminho, cria variaveis dos atributos da
     * class Musica, e le cada linha do arquivo fazendo um parser de acordo com
     * seu tipo (quando necessario) e atribuindo os valores nas variaveis
     * indicadas, após isso, instancia um novo objeto com os valores do arquivo!
     *
     * @param caminhoArquivo
     * @throws NumberFormatException
     * @throws NullPointerException
     * @throws IOException
     */
    @Override
    public void importarMidias(String caminhoArquivo) throws NumberFormatException, NullPointerException, IOException {
        File arquivo = new File(caminhoArquivo);

        FileReader reader = new FileReader(arquivo);
        BufferedReader buff = new BufferedReader(reader);

        //Atributos da Super Classe
        String caminho;
        String nome;
        String descricao;

        //Atributos da class Musica
        String idioma;
        String genero;
        List<String> autores = new ArrayList();
        List<String> interpretes = new ArrayList();
        int duracao;
        int ano;

        while ((caminho = buff.readLine()) != null) {

            nome = buff.readLine();
            descricao = buff.readLine();

            // Atributos da class Musica
            idioma = buff.readLine();
            genero = buff.readLine();
            autores.addAll(Arrays.asList(buff.readLine().split(";")));
            interpretes.addAll(Arrays.asList(buff.readLine().split(";")));
            duracao = Integer.parseInt(buff.readLine());
            ano = Integer.parseInt(buff.readLine());

            //instancia o objeto com os atributos lidos a cima
            super.cadastrarMidia(new Musica(caminho, nome, descricao, idioma, genero, autores, interpretes, duracao, ano));

            buff.readLine();
            autores.clear();
        }
    }

    /**
     * Not implemented yet!
     */
    @Deprecated
    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
