/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import java.util.List;
import midia.Midia;

/**
 *
 * @author Leonardo Severo Pedroso / Gustavo Bittencourt Satheler
 * <leopedroso45@gmail.com>
 * <gustavosatheler@gmail.com>
 */
public interface IColecao {

    /**
     * Adiciona uma mídia a coleção.
     *
     * @param midia Midia
     * @return True se a mídia for incluída com sucesso e False caso contrário.
     */
    public boolean cadastrarMidia(Midia midia);

    /**
     * Remove a Midia com a palavra informada.
     *
     * @param pesquisa Parâmetro utilizado para a pesquisa.
     * @return True se a nota for removida com sucesso e False caso contrário.
     */
    public boolean removerMidia(String pesquisa);

    /**
     * Altera a mídia com a palavra informada.
     *
     * @param pesquisa Parâmetro utilizado para a pesquisa.
     * @param midia Midia com as novas informações.
     * @return True se a mídia foi corretamente atualizada e False caso
     * contrário.
     */
    public boolean editarMidia(String pesquisa, Midia midia);

    /**
     * Exibe todas as mídias adicionadas a coleção que contém a palavra
     * pesquisada.
     *
     * @param pesquisa Parâmetro utilizado para a pesquisa.
     * @return Uma lista de mídias com a palavra pesquisada.
     */
    public List consultarMidia(String pesquisa);

    /**
     * Exibe todas as mídias adicionadas a coleção.
     *
     * @return Uma Lista de com todas as mídias.
     */
    public List exibirMidia();
}
