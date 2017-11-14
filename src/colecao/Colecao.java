/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

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

    protected List<Midia> listaDeMidias;

    public Colecao(List<Midia> listaDeMidias) {
        this.listaDeMidias = new ArrayList(listaDeMidias);
    }

    @Override
    public boolean cadastrarMidia(Midia midia) {
        return this.listaDeMidias.add(midia);
    }

    @Override
    public boolean removerMidia(String pesquisa) {
        for (Midia midia : listaDeMidias) {
            if (midia.contains(pesquisa)) {
                if (this.listaDeMidias.remove(midia)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean editarMidia(String pesquisa, Midia midia) {
        for (int i = 0; i < listaDeMidias.size(); i++) {
            Midia midiaTemp = listaDeMidias.get(i);
            if (midiaTemp.contains(pesquisa)) {
                this.listaDeMidias.set(i, midia);
                return true;
            }
        }
        return false;
    }

    @Override
        public List consultarMidia(String pesquisa) {
        List<Midia> lista = new ArrayList();
        for (Midia midia : listaDeMidias) {
            if (midia.contains(pesquisa)) {
                lista.add((Midia) midia);
            }
        }
        return lista;
    }

    @Override
        public List exibirMidia() {
        return this.listaDeMidias;
    }

    @Override
        public void exportarMidias(String nomeArquivo) throws FileNotFoundException, UnsupportedEncodingException, NullPointerException, ClassCastException, IOException {
        FileOutputStream outFile;
        BufferedWriter buff;

        outFile = new FileOutputStream(new File(nomeArquivo));
        buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        for (Midia midia : listaDeMidias) {

            buff.write(midia.toString());
            buff.write("\n");
        }

        buff.close();
        outFile.close();
    }
}
