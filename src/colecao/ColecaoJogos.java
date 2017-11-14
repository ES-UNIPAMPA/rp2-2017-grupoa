/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Jogo;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import midia.Midia;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class ColecaoJogos extends Colecao {

    public ColecaoJogos(List<Midia> listaDeMidia) {
        super(listaDeMidia);
    }

    @Override
    public void importarMidias(String caminhoArquivo) throws NumberFormatException, NullPointerException, IOException {
        File arquivo = new File(caminhoArquivo);

        FileReader reader = new FileReader(arquivo);
        BufferedReader buff = new BufferedReader(reader);

        String caminho;
        String titulo;
        String descricao;

        String genero;
        String autores;
        int ano;
        int numeroJogadores;
        boolean suporteRede;

        while ((caminho = buff.readLine()) != null) {

            titulo = buff.readLine();
            descricao = buff.readLine();

            // Atributos da classe
            genero = buff.readLine();
            autores = buff.readLine();
            ano = Integer.parseInt(buff.readLine());
            numeroJogadores = Integer.parseInt(buff.readLine());
            suporteRede = Boolean.parseBoolean(buff.readLine());

            this.cadastrarMidia(new Jogo(caminho, titulo, descricao, genero, autores, ano, numeroJogadores, suporteRede));

            //Solta uma linha
            buff.readLine();
        }
    }
}
