/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midia;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 * 
 */
public abstract class Midia {
    private String caminho;
    private String titulo;
    private String descricao;

    public Midia(String caminho, String titulo, String descricao) {
        this.caminho = caminho;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
