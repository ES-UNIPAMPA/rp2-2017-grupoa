/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import midia.Midia;

import java.util.List;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class ColecaoTodos extends Colecao {

    public ColecaoTodos(List<Midia> listaDeMidia) {
        super(listaDeMidia);
    }

    @Override
    public void exportarMidias(String nomeArquivo) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Método não suportado para essa coleção.");
    }

    @Override
    public void importarMidias(String caminhoArquivo) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Método não suportado para essa coleção.");
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
