/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midia;

import java.util.List;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 *
 */
public class Musica extends Midia {

    private String idioma;
    private String genero;
    private List<String> autores;
    private List<String> interpretes;
    private int duracao;
    private int ano;

    /**
     *
     * Construtor da class Musica
     *
     * @param caminho
     * @param nome
     * @param descricao
     * @param idioma
     * @param genero
     * @param autores
     * @param interprete
     * @param duracao
     * @param ano
     *
     */
    public Musica(String caminho, String nome, String descricao, String idioma, String genero, String autor, String interprete, int duracao, int ano) {
        super(caminho, nome, descricao);
        this.idioma = idioma;
        this.genero = genero;
        this.autores.add(autor);
        this.interpretes.add(interprete);
        this.duracao = duracao;
        this.ano = ano;
    }

    /**
     *
     * Retorna o idioma atual
     *
     * @return idioma
     *
     */
    public String getIdioma() {
        return this.idioma;
    }

    /**
     *
     * Altera o idioma atual, pelo idioma passado por parametro
     *
     * @param idioma
     *
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     *
     * Retorna o genero atual
     *
     * @return genero
     *
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     *
     * Altera o genero atual, pelo genero passado por parametro
     *
     * @param genero
     *
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * Retorna os autores atuais
     *
     * @return autores
     *
     */
    public List<String> getAutores() {
        return autores;
    }

    /**
     *
     * Altera os autores atuais, pelos autores passado por parametro
     *
     * @param autores
     *
     */
    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    /**
     *
     * Retorna o inteprete atual
     *
     * @return interprete
     *
     */
    public List<String> getInterpretes() {
        return interpretes;
    }

    /**
     *
     * Altera o interprete atual, pelo interprete passado por parametro
     *
     * @param interprete
     *
     */
    public void setInterpretes(List<String> interpretes) {
        this.interpretes = interpretes;
    }

    /**
     *
     * Retorna a duracao atual
     *
     * @return duracao
     *
     */
    public int getDuracao() {
        return this.duracao;
    }

    /**
     *
     * Altera a duracao atual, pela duracao passada por parametro
     *
     * @param duracao
     *
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     *
     * Retorna o ano atual
     *
     * @return ano
     *
     */
    public int getAno() {
        return this.ano;
    }

    /**
     *
     * Altera o ano atual, pelo ano passado por parametro
     *
     * @param ano
     *
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void adicionarAutor(String autor) {
        this.autores.add(autor);
    }
    
    public void adicionarInterprete (String interprete) {
        this.interpretes.add(interprete);
    }
}
