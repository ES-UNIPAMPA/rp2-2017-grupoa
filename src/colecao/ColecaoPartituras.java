/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Partitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class ColecaoPartituras extends Colecao {

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
        String instrumentos;

        while ((caminho = buff.readLine()) != null) {

            titulo = buff.readLine();
            descricao = buff.readLine();

            // Atributos da classe
            genero = buff.readLine();
            autores = buff.readLine();
            ano = Integer.parseInt(buff.readLine());
            instrumentos = buff.readLine();

            this.cadastrarMidia(new Partitura(caminho, titulo, descricao, genero, autores, ano, instrumentos));

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

            if (!(midia instanceof Partitura)) {
                throw new ClassCastException("Classe inválida");
            }

            final Partitura partitura = (Partitura) midia;

            buff.write(partitura.getCaminho() + "\n");
            buff.write(partitura.getTitulo() + "\n");
            buff.write(partitura.getDescricao() + "\n");

            buff.write(partitura.getGenero() + "\n");
            buff.write(partitura.getAutores() + "\n");
            buff.write(partitura.getAno() + "\n");
            buff.write(partitura.getInstrumentos() + "\n");

            buff.write("\n");
        }

        buff.close();
        outFile.close();
    }
}
