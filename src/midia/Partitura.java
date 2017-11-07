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
    private List<String> instrumentos;

    public Partitura(String caminho, String nome, String descricao, String genero, String autores, int ano, List<String> instrumentos) {
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
     * @return List
     */
    public List<String> getInstrumentos() {
        return this.instrumentos;
    }
    
    /**
     * Adiciona um instrumento a lista.
     * @param instrumento String
     * @return True se a String for incluída com sucesso e False caso contrário.
     */
    public boolean addInstrumentos(String instrumento) {
        return this.instrumentos.add(instrumento);
    }
    
    @Override
    public String toString() {
        return "Partitura {" 
                + "caminho = " + getCaminho()
                + ",\n       nome = " + getTitulo() 
                + ",\n       descricao = " + getDescricao() 
                + ",\n       genero = " + genero 
                + ",\n       autores = " + autores 
                + ",\n       ano = " + ano 
                + ",\n       instrumentos = " + instrumentos 
                + "\n   }";
    }
}
