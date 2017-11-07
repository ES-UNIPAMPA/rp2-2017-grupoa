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
    private String nome;
    private String descricao;

    public Midia(String caminho, String nome, String descricao) {
        this.caminho = caminho;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
