/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;
import midia.Musica;
import midia.Podcast;
import midia.Partitura;
import midia.Jogo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 *
 */
public class Colecao implements IColecao {
    
    private List<Musica> listaDeMusica;
    private List<Podcast> listaDePodcast;
    private List<Partitura> listaDePartituras;
    private List<Jogo> listaDeJogos;

    /**
     *
     * Construtor da class Colecao
     *
     * Inicializa as listas de cada tipo de mídia
     *
     */
    public Colecao() {
        this.listaDeMusica = new ArrayList();
        this.listaDePodcast = new ArrayList();
        this.listaDePartituras = new ArrayList();
        this.listaDeJogos = new ArrayList();
    }

    @Override
    public boolean cadastrarMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removerMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia consultarMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia exibirMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
