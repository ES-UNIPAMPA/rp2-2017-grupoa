/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import Media.Midia;

/**
 *
 * @author 161150960
 */
public interface IColecao {
    
    public boolean cadastrarMidia();
    public boolean removerMidia();
    public void editarMidia();
    public Midia consultarMidia();
    public Midia exibirMidia();
}
