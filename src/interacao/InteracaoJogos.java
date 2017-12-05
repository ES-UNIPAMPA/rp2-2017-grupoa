/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao;

import colecao.Colecao;
import static interacao.InteracaoPrincipal.carregarArquivo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import midia.Jogo;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class InteracaoJogos extends Interacao {

    FormularioJogo formulario;

    public InteracaoJogos(String tituloColecao, Colecao colecao) {
        super(tituloColecao, colecao);
        this.formulario = new FormularioJogo(colecao);
        this.formulario.setLocationRelativeTo(null);
        this.formulario.setResizable(false);
    }

    @Override
    protected void botaoCadastrar() {
        jButton_cadastrar.setText("Cadastrar novo");
        jButton_cadastrar.addActionListener((ActionEvent evt) -> {
            formulario.setModoCadastrar();

            formulario.setTabela(modelTabela);
            formulario.setInteracaoTodos(interacaoTodos);
            formulario.setVisible(true);
        });
    }

    @Override
    protected void eventoEditar() {
        jTable_tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int row = jTable_tabela.getSelectedRow();
                    String caminhoAnterior = (String) jTable_tabela.getValueAt(row, 0);
                    String tituloAnterior = (String) jTable_tabela.getValueAt(row, 1);

                    formulario.setModoEditar(caminhoAnterior, tituloAnterior);
                    formulario.setTabela(modelTabela);
                    formulario.setInteracaoTodos(interacaoTodos);
                    formulario.setVisible(true);
                }
            }
        });
    }

    @Override
    protected void layoutTabela() {
        jTable_tabela.setModel(modelTabela = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Caminho", "Titulo", "Descrição", "Genero", "Autores", "Ano", "Número de Jogadores", "Suporte à rede"
                }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        ;
        });

        jScrollPane_colecao.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane_colecao.setViewportView(jTable_tabela);
    }

    @Override
    protected void atualizarTabela() {
        modelTabela.setRowCount(0);

        for (Object midia : colecao.exibirMidia()) {
            Jogo jogo = (Jogo) midia;
            modelTabela.addRow(new Object[]{
                jogo.getCaminho(),
                jogo.getTitulo(),
                jogo.getDescricao(),
                jogo.getGenero(),
                jogo.getAutores(),
                jogo.getAno(),
                jogo.getNumeroJogadores(),
                jogo.hasSuporteRede()
            });
        }
    }

}
