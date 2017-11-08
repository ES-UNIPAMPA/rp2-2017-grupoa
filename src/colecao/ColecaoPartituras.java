/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import gerais.LeitorArquivo;
import java.io.BufferedReader;
import midia.Midia;
import midia.Partitura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import midia.Jogo;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class ColecaoPartituras implements IColecao {

    private List<Partitura> listaDePartituras;

    public ColecaoPartituras() {
        this.listaDePartituras = new ArrayList();
    }

    @Override
    public boolean cadastrarMidia(Midia midia) {
        if (this.listaDePartituras.add((Partitura) midia)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removerMidia(String pesquisa) {
        for (Partitura partitura : listaDePartituras) {
            if (this.filtroPesquisa(pesquisa, partitura)) {
                if (this.listaDePartituras.remove(partitura)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean editarMidia(String pesquisa, Midia midia) {
        for (Partitura partitura : listaDePartituras) {
            if (this.filtroPesquisa(pesquisa, partitura)) {
                if (this.listaDePartituras.remove(partitura) && this.cadastrarMidia(midia)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List consultarMidia(String pesquisa) {
        List<Partitura> lista = new ArrayList();
        for (Partitura partitura : listaDePartituras) {
            if (this.filtroPesquisa(pesquisa, partitura)) {
                lista.add(partitura);
            }
        }
        return lista;
    }

    @Override
    public List exibirMidia() {
        return this.listaDePartituras;
    }

    @Override
    public boolean importarMidia(File arquivo) {
        FileReader reader;
        BufferedReader buff;

        try {
            reader = new FileReader(arquivo);
            buff = new BufferedReader(reader);

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

                //Soltar uma linha
                buff.readLine();
            }
        } catch (NumberFormatException e) {
            Logger.getLogger(LeitorArquivo.class.getName()).log(Level.SEVERE, null, e);
            return false;

        } catch (NullPointerException e) {
            Logger.getLogger(LeitorArquivo.class.getName()).log(Level.SEVERE, null, e);
            return false;

        } catch (IOException e) {
            Logger.getLogger(LeitorArquivo.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }

        return true;
    }

    private boolean filtroPesquisa(String pesquisa, Midia midia) {
        return (midia.getCaminho().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getTitulo().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getDescricao().toUpperCase()).contains(pesquisa.toUpperCase());
    }
}
