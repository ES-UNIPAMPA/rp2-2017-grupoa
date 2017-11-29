/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midia;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class Jogo extends Midia {

    private String genero;
    private List<String> autores;
    private int ano;
    private int numeroJogadores;
    private boolean suporteRede;

    public Jogo(String caminho, String titulo, String descricao, String genero, List<String> autores, int ano, int numeroJogadores, boolean suporteRede) {
        super(caminho, titulo, descricao);
        this.setGenero(genero);
        this.setAutores(autores);
        this.setAno(ano);
        this.setNumeroJogadores(numeroJogadores);
        this.setSuporteRede(suporteRede);
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
        if (super.verificarConsistencia(genero)) {
            throw new IllegalArgumentException("O gênero não pode ser vazio.");
        }

        this.genero = genero;
    }

    public void setAutores(List<String> autores) {
        if (super.verificarConsistencia(autores)) {
            throw new IllegalArgumentException("Adicione pelo menos 01 autor.");
        }

        this.autores = autores;
    }

    /**
     * Captura o atributo autores.
     *
     * @return String
     */
    public List<String> getAutores() {
        return this.autores;
    }

    /**
     * Captura a quantidade de autores cadastrados.
     *
     * @return int
     */
    public int getQuantidadeAutores() {
        return this.autores.size();
    }

    /**
     * Altera o atributo autores.
     *
     * @param autor Nome do autor para ser adicionado a lista.
     * @return True se a mídia for incluída com sucesso e False caso contrário.
     */
    public boolean addAutor(String autor) {
        return this.autores.add(autor);
    }

    public boolean removeAutor(String autor) {
        return this.autores.remove(autor);
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
    public void setAno(int ano) throws IllegalArgumentException {
        if (verificarConsistenciaAno(ano)) {
            throw new IllegalArgumentException("Ano informado inválido.");
        }
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
    public void setNumeroJogadores(int numeroJogadores) throws ArithmeticException {
        if (super.verificarConsistencia(numeroJogadores)) {
            this.numeroJogadores = numeroJogadores * (-1);
            throw new ArithmeticException("Número de Jogadores não pode ser negativo.\nPortanto ele foi transformado para um número positivo.");
        }
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
        return super.toString() + this.genero + "\n" + super.listToString(this.autores) + "\n" + this.ano + "\n" + this.numeroJogadores + "\n" + this.suporteRede + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Jogo outro = (Jogo) obj;
        
        if (this.ano != outro.ano) {
            return false;
        }
        
        if (this.numeroJogadores != outro.numeroJogadores) {
            return false;
        }
        
        if (this.suporteRede != outro.suporteRede) {
            return false;
        }
        
        if (!Objects.equals(this.genero, outro.genero)) {
            return false;
        }
        
        if (!Objects.equals(this.autores, outro.autores)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.genero);
        hash = 97 * hash + Objects.hashCode(this.autores);
        hash = 97 * hash + this.ano;
        hash = 97 * hash + this.numeroJogadores;
        hash = 97 * hash + (this.suporteRede ? 1 : 0);
        return hash;
    }
}
