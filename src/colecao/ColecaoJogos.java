/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;
import midia.Jogo;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class ColecaoJogos implements IColecao {

    private List<Jogo> listaDeJogos;

    public ColecaoJogos() {
        this.listaDeJogos = new ArrayList();
    }

    @Override
    public boolean cadastrarMidia(Midia midia) {
        if (this.listaDeJogos.add((Jogo) midia)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removerMidia(String pesquisa) {
        for (Jogo jogo : listaDeJogos) {
            if (this.filtroPesquisa(pesquisa, jogo)) {
                if (this.listaDeJogos.remove(jogo)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean editarMidia(String pesquisa, Midia midia) {
        for (Jogo jogo : listaDeJogos) {
            if (this.filtroPesquisa(pesquisa, jogo)) {
                if (this.listaDeJogos.remove(jogo) && this.cadastrarMidia(midia)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List consultarMidia(String pesquisa) {
        List<Jogo> lista = new ArrayList();
        for (Jogo jogo : listaDeJogos) {
            if (this.filtroPesquisa(pesquisa, jogo)) {
                lista.add(jogo);
            }
        }
        return lista;
    }

    @Override
    public List exibirMidia() {
        return this.listaDeJogos;
    }

    @Override
    public void importarMidia(String caminhoArquivo) throws NumberFormatException, NullPointerException, IOException {
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

    private boolean filtroPesquisa(String pesquisa, Midia midia) {
        return (midia.getCaminho().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getTitulo().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getDescricao().toUpperCase()).contains(pesquisa.toUpperCase());
    }

}
