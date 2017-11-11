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
import midia.Podcast;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 *
 */
public class ColecaoPodcast extends Colecao {

    private List<Podcast> listaDePodcast;

    /**
     * Apenas inicializada um array vazio listaDePodcast
     */
    public ColecaoPodcast() {
        super(new ArrayList<Podcast>());
    }

    /**
     *
     * Recebe uma nova midia, e adiciona ela ao array listaDePodcast, retornando
     * true caso ocorra tudo com sucesso!
     *
     * @param midia
     * @return true or false
     *
     */
    @Override
    public boolean cadastrarMidia(Midia midia) {
        if (listaDePodcast.add((Podcast) midia)) {
            return true;
        }
        return false;
    }

    /**
     *
     * Recebe o nome do Podcast por parametro, percorre o array listaDePodcast,
     * compara os titulos e quando encontra remove-o.
     *
     * @param nome
     * @return true or false
     *
     */
    @Override
    public boolean removerMidia(String nome) {
        for (Podcast podcast : listaDePodcast) {
            if (podcast.getTitulo() == nome) {
                listaDePodcast.remove(podcast);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * Ainda nao finalizada!
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
     * Cria uma listadeconsulta, percore o array listaDePodcast adicionando cada
     * Podcast no novo array, e depois retorna o mesmo.
     *
     * @param pesquisa
     * @return listadeconsulta;
     *
     */
    @Override
    public List consultarMidia(String pesquisa) {
        List<Podcast> listadeconsulta = new ArrayList();
        for (Podcast podcast : listaDePodcast) {
            listadeconsulta.add(podcast);
        }
        return listadeconsulta;
    }

    /**
     *
     * Retorna a lista de Podcasts
     *
     * @return listaDePodcast
     *
     */
    @Override
    public List exibirMidia() {
        return this.listaDePodcast;
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
