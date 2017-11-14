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

    public ColecaoMusica(List<Midia> listaDeMidia) {
        super(listaDeMidia);
    }

    @Override
    public void importarMidias(String caminhoArquivo) throws NumberFormatException, NullPointerException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
