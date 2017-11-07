/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;
import midia.Jogo;

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

    private boolean filtroPesquisa(String pesquisa, Midia midia) {
        return (midia.getCaminho().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getTitulo().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getDescricao().toUpperCase()).contains(pesquisa.toUpperCase());
    }
}
