/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midia;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class Jogo extends Midia {

    private String genero;
    private String autores;
    private int ano;
    private int numeroJogadores;
    private boolean suporteRede;

    public Jogo(String caminho, String titulo, String descricao, String genero, String autores, int ano, int numeroJogadores, boolean suporteRede) {
        super(caminho, titulo, descricao);
        this.genero = genero;
        this.autores = autores;
        this.ano = ano;
        this.numeroJogadores = numeroJogadores;
        this.suporteRede = suporteRede;
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
     * Captura o atributo numeroJogadores.
     *
     * @return int
     */
    public int getNumeroJogadores() {
        return this.numeroJogadores;
    }
    
    /**
     * Altera o atributo numeroJogadores.
     *
     * @param numeroJogadores int
     */
    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }
    
    /**
     * Captura o atributo suporteRede.
     *
     * @return int
     */
    public boolean hasSuporteRede() {
        return this.suporteRede;
    }
    
    /**
     * Altera o atributo numeroJogadores.
     *
     * @param suporteRede boolean
     */
    public void setSuporteRede(boolean suporteRede) {
        this.suporteRede = suporteRede;
    }

    @Override
    public String toString() {
        return "Jogo {" 
                + "caminho = " + getCaminho()
                + ",\n       nome = " + getTitulo() 
                + ",\n       descricao = " + getDescricao() 
                + ",\n       genero = " + genero 
                + ",\n       autores = " + autores 
                + ",\n       ano = " + ano 
                + ",\n       numeroJogadores = " + numeroJogadores 
                + ",\n       suporteRede = " + suporteRede 
                + "\n   }";
    }
}
