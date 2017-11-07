/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;
import midia.Partitura;

import java.util.List;
import java.util.ArrayList;

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

    private boolean filtroPesquisa(String pesquisa, Midia midia) {
        return (midia.getCaminho().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getTitulo().toUpperCase()).contains(pesquisa.toUpperCase())
                || (midia.getDescricao().toUpperCase()).contains(pesquisa.toUpperCase());
    }
}
