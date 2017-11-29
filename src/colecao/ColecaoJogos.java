/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;
import midia.Jogo;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class ColecaoJogos extends Colecao {

    public ColecaoJogos(List<Midia> listaDeMidia) {
        super(listaDeMidia);
    }

    @Override
    public void importarMidias(String caminhoArquivo) throws NumberFormatException, NullPointerException, IOException {
        File arquivo = new File(caminhoArquivo);
        FileReader reader = new FileReader(arquivo);
        BufferedReader buff = new BufferedReader(reader);

        String caminho;
        String titulo;
        String descricao;

        String genero;
        List<String> autores = new ArrayList();
        int ano;
        int numeroJogadores;
        boolean suporteRede;

        while ((caminho = buff.readLine()) != null) {

            titulo = buff.readLine();
            descricao = buff.readLine();

            // Atributos da classe
            genero = buff.readLine();
            autores.addAll(Arrays.asList(buff.readLine().split(";")));
            ano = Integer.parseInt(buff.readLine());
            numeroJogadores = Integer.parseInt(buff.readLine());
            suporteRede = Boolean.parseBoolean(buff.readLine());

            super.cadastrarMidia(new Jogo(caminho, titulo, descricao, genero, new ArrayList(autores), ano, numeroJogadores, suporteRede));

            //Solta uma linha
            buff.readLine();
            autores.clear();
        }

        buff.close();
        reader.close();
    }

    @Override
    public void ordenar() {
        List<Midia> lista = super.listaDeMidias;
        int n = lista.size();

        // Chamada recursiva (Reorganiza a lista)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapsort(lista, n, i);
        }

        // Um por um extrai um elemento
        for (int i = n - 1; i >= 0; i--) {
            // Faz a troca
            lista.set(i, lista.set(0, lista.get(i)));

            // Chamada recursiva
            heapsort(lista, i, 0);
        }
    }

    private void heapsort(List<Midia> lista, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;  // Esquerda = 2*i + 1
        int r = 2 * i + 2;  // Direita = 2*i + 2

        if (l < n && (lista.get(l).getTitulo()).compareToIgnoreCase(lista.get(largest).getTitulo()) > 0) {
            largest = l;
        }

        if (r < n && (lista.get(r).getTitulo()).compareToIgnoreCase(lista.get(largest).getTitulo()) > 0) {
            largest = r;
        }

        if (largest != i) {
            lista.set(largest, lista.set(i, lista.get(largest)));

            // Recursividade para diminuir a arvoré
            heapsort(lista, n, largest);
        }
    }
}
