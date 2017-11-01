/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import Media.Foto;
import Media.Midia;
import Media.Musica;
import Media.Podcast;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 161150960
 */
public class Colecao implements IColecao {

    private List<Foto> listafoto;
    private List<Musica> listamusica;
    private List<Podcast> listapodcast;

    public Colecao() {
        this.listafoto = new ArrayList();
        this.listamusica = new ArrayList();
        this.listapodcast = new ArrayList();
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
