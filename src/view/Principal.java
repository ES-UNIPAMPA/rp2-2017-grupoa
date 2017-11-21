/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import colecao.Colecao;
import colecao.ColecaoJogos;
import colecao.ColecaoMusica;

import java.util.ArrayList;
import java.util.List;

import midia.Jogo;
import midia.Musica;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class Principal {

    public static void main(String[] args) {
        Colecao colecaoJogos = new ColecaoJogos(new ArrayList());
        List<String> autoresJogo1 = new ArrayList();
        
        autoresJogo1.add("Brandon Beck");
        autoresJogo1.add("Marc Merril");
        
        Jogo jogo1 = new Jogo("C:\\Riot Games\\League of Legends\\LeagueClient.exe", "League of Legends", "É um jogo eletrônico do gênero multiplayer online battle arena, desenvolvido e publicado pela Riot Games para Microsoft Windows e Mac OS X.", "Multiplayer online battle arena", autoresJogo1, 2009, 100000000, true);
        colecaoJogos.cadastrarMidia(jogo1);
        System.out.println(colecaoJogos.exibirMidia());

    }
}
