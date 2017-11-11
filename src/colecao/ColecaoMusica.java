/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import midia.Midia;
import midia.Musica;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 *
 */
public class ColecaoMusica extends Colecao {

    private List<Musica> listaDeMusica;

    /**
     * Inicializa o array listaDeMusica.
     */
    public ColecaoMusica() {
        super(new ArrayList<Musica>());
    }

    /**
     *
     * Retorna true se a midia passada por parametro for adiciona corretamente
     * ao array e caso ocorra o contrario retorna false.
     *
     * @param midia
     * @return true or false
     */
    @Override
    public boolean cadastrarMidia(Midia midia) {
        if (listaDeMusica.add((Musica) midia)) {
            return true;
        }
        return false;
    }

    /**
     *
     * Recebe o nome da musica, percorre o array listaDeMusica procurando algum
     * objeto com o titulo igual ao informado e o remove retornando true, caso o
     * processo falhe ele retorna false.
     *
     * @param nome
     * @return true or false;
     */
    @Override
    public boolean removerMidia(String nome) {
        for (Musica musica : listaDeMusica) {
            if (musica.getTitulo() == nome) {
                listaDeMusica.remove(musica);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * Ainda nao implementado!
     *
     * @param pesquisa
     * @param midia
     * @return
     * @deprecated
     */
    @Deprecated
    @Override
    public boolean editarMidia(String pesquisa, Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    /**
     *
     * Cria uma listaDeConsulta, percorre o array listaDeMusica e add cada
     * musica no novo array e depois retorna o mesmo.
     *
     * @param pesquisa
     * @return listaDeConsulta
     */
    @Override
    public List consultarMidia(String pesquisa) {
        List<Musica> listaDeConsulta = new ArrayList();
        for (Musica musica : listaDeMusica) {
            listaDeConsulta.add(musica);
        }
        return listaDeConsulta;
    }

    /**
     *
     * Retorna a lista de Musicas
     *
     * @return listaDeMusica
     */
    @Override
    public List exibirMidia() {
        return this.listaDeMusica;
    }

    @Override
    public void importarMidias(String caminhoArquivo) throws NumberFormatException, NullPointerException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportarMidias(String nomeArquivo) throws FileNotFoundException, UnsupportedEncodingException, NullPointerException, ClassCastException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
