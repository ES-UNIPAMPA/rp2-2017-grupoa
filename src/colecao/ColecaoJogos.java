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
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class ColecaoJogos extends Colecao {

    public ColecaoJogos() {
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

    @Override
    public void exportarMidias(String nomeArquivo) throws FileNotFoundException, UnsupportedEncodingException, NullPointerException, ClassCastException, IOException {
        FileOutputStream outFile;
        BufferedWriter buff;

        outFile = new FileOutputStream(new File(nomeArquivo));
        buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        for (Object midia : listaDeMidias) {

            if (midia == null) {
                throw new NullPointerException("Está midia está vazia.");
            }

            if (!(midia instanceof Jogo)) {
                throw new ClassCastException("Classe inválida");
            }
            
            final Jogo jogo = (Jogo) midia;

            buff.write(jogo.getCaminho() + "\n");
            buff.write(jogo.getTitulo() + "\n");
            buff.write(jogo.getDescricao() + "\n");

            buff.write(jogo.getGenero() + "\n");
            buff.write(jogo.getAutores() + "\n");
            buff.write(jogo.getAno() + "\n");
            buff.write(jogo.getNumeroJogadores() + "\n");
            buff.write(jogo.hasSuporteRede() + "\n");

            buff.write("\n");
        }

        buff.close();
        outFile.close();
    }
}
