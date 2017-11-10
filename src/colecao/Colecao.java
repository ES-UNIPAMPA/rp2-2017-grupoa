/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Severo Pedroso / Gustavo Bittencourt Satheler
 * <leopedroso45@gmail.com>
 * <gustavosatheler@gmail.com>
 *
 */
public abstract class Colecao implements IColecao {

    protected List listaDeMidias;

    public Colecao() {
        this.listaDeMidias = new ArrayList();
    }

    @Override
    public boolean cadastrarMidia(Midia midia) {
        return this.listaDeMidias.add(midia);
    }

    @Override
    public boolean removerMidia(String pesquisa) {
        for (Object midia : listaDeMidias) {
            if (this.filtroPesquisa(pesquisa, (Midia) midia)) {
                if (this.listaDeMidias.remove(midia)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean editarMidia(String pesquisa, Midia midia) {
        for (Object midiaTemp : listaDeMidias) {
            if (this.filtroPesquisa(pesquisa, (Midia) midia)) {
                if (this.listaDeMidias.remove(midiaTemp) && this.cadastrarMidia(midia)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List consultarMidia(String pesquisa) {
        List<Midia> lista = new ArrayList();
        for (Object midia : listaDeMidias) {
            if (this.filtroPesquisa(pesquisa,(Midia) midia)) {
                lista.add((Midia) midia);
            }
        }
        return lista;
    }

    @Override
    public List exibirMidia() {
        return this.listaDeMidias;
    }

    private boolean filtroPesquisa(String pesquisa, Midia midia) {
        return (midia.getCaminho().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getTitulo().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getDescricao().toUpperCase()).contains(pesquisa.toUpperCase());
    }
}
