/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import colecao.ColecaoJogos;
import colecao.ColecaoMusica;
import colecao.ColecaoTodos;
import interacao.InteracaoJogos;
import interacao.InteracaoMusicas;
import interacao.InteracaoPrincipal;
import interacao.InteracaoTodos;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class Principal {

    public static void main(String[] args) {
        ColecaoTodos colecaoTodos = new ColecaoTodos(new ArrayList());
        ColecaoJogos colecaoJogos = new ColecaoJogos(new ArrayList());
        ColecaoMusica colecaoMusica = new ColecaoMusica(new ArrayList());

        // Gera o frame principal e a aba principal
        InteracaoPrincipal interacaoPrincipal = new InteracaoPrincipal();

        // Para cada instãncia, é gerado uma nova aba
        InteracaoTodos interacaoTodos = new InteracaoTodos("Mídias", colecaoTodos);
        interacaoTodos.gerarAba(interacaoPrincipal);

        // Para cada instãncia, é gerado uma nova aba
        InteracaoJogos interacaoJogo = new InteracaoJogos("Jogos", colecaoJogos);
        interacaoJogo.addInteracaoTodos(interacaoTodos);
        interacaoJogo.gerarAba(interacaoPrincipal);

        // Para cada instãncia, é gerado uma nova aba
        InteracaoMusicas interacaoMusica = new InteracaoMusicas("Músicas", colecaoMusica);
        interacaoMusica.addInteracaoTodos(interacaoTodos);
        interacaoMusica.gerarAba(interacaoPrincipal);
        
        // Inicia o programa
        interacaoPrincipal.iniciar();
    }
}
