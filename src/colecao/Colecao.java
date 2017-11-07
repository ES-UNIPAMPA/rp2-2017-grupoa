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
 * Essa class colecao sera refatorada!! by Leo
 */
@Deprecated
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

    /**
     *
     * Adicionando algumamusica do tipo Musica ao array listaDeMusica
     *
     * @param algumamusica
     */
    public void adicionarMusica(Musica algumamusica) {
        this.listaDeMusica.add(algumamusica);
    }

    /**
     *
     * Recebe o nomedamusica por parâmetro, busca no array listaDeMusica por
     * algum objeto com o mesmo nome, e o remove.
     *
     * @param nomedamusica
     */
    public void removerMusica(String nomedamusica) {
        for (Musica musica : listaDeMusica) {
            if (musica.getTitulo()== nomedamusica) {
                this.listaDeMusica.remove(musica);
                break;
            }
        }
    }

    /**
     *
     * Percorre o array listaDeMusica e printa o nome e o autor da musica em
     * questão.
     *
     */
    public void exibirMusicas() {
        for (Musica musica : listaDeMusica) {
            System.out.println("Nome: " + musica.getTitulo());
            System.out.println("Autor: " + musica.getAutores());
            System.out.println("-----");
        }
    }

    /**
     *
     * Recebe por paramêtro a musicaaserconsultada, percorre o array até
     * encontra-la e printa seus atributos.
     *
     * @param musicaaserconsultada
     */
    public void consultarMusica(String nomedamusica, String autordamusica) {
        for (Musica musica : listaDeMusica) {
            if (musica.getTitulo()== nomedamusica || musica.getAutores() == autordamusica) {
                System.out.println("Nome: " + musica.getTitulo());
                System.out.println("Autor: " + musica.getAutores());
                System.out.println("Descrição: " + musica.getDescricao());
                System.out.println("Genero: " + musica.getGenero());
                System.out.println("Idioma: " + musica.getIdioma());
                System.out.println("Interprete: " + musica.getInterprete());
                System.out.println("Duração: " + musica.getDuracao());
                System.out.println("Ano: " + musica.getAno());
                System.out.println("Caminho: " + musica.getCaminho());
            } else {
                System.err.println("Música não encontrada! Tente novamente especificando exatamente o nome da musica e de seus respectivos autores");
            }
        }
    }
    @Deprecated
    public void editarMusica(Musica umamusica) {
        for (Musica musica : listaDeMusica) {
            //
        }
    }

    @Override
    public boolean cadastrarMidia(Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removerMidia(String pesquisa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarMidia(String pesquisa, Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List consultarMidia(String pesquisa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List exibirMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}