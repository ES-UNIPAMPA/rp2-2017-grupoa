/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midia;

import java.util.List;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class Partitura extends Midia {

    private String genero;
    private String autores;
    private int ano;
    private String instrumentos;

    public Partitura(String caminho, String nome, String descricao, String genero, String autores, int ano, String instrumentos) {
        super(caminho, nome, descricao);
        this.genero = genero;
        this.autores = autores;
        this.ano = ano;
        this.instrumentos = instrumentos;
    }

    /**
     * Captura o atributo gênero.
     *
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * Altera o atributo gênero.
     *
     * @param genero String
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Captura o atributo autores.
     *
     * @return String
     */
    public String getAutores() {
        return this.autores;
    }

    /**
     * Altera o atributo autores.
     *
     * @param autores String
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * Captura o atributo ano.
     *
     * @return int
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * Altera o atributo autores.
     *
     * @param ano int
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Captura uma lista de instrumentos.
     *
     * @return instrumentos
     */
    public String getInstrumentos() {
        return this.instrumentos;
    }

    /**
     * Adiciona um instrumento a lista.
     *
     * @param instrumentos String
     */
    public void setInstrumentos(String instrumentos) {
        this.instrumentos = instrumentos;
    }

    @Override
    public String toString() {
        return super.toString() + this.genero + "\n" + this.autores + "\n" + this.ano + "\n" + this.instrumentos + "\n";
    }
}
