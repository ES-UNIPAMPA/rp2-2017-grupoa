/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao;

import colecao.Colecao;
import static interacao.InteracaoPrincipal.carregarArquivo;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import midia.Musica;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 *
 */
public class InteracaoMusicas extends Interacao {

    FormularioMusica cadastroMusica;

    public InteracaoMusicas(String tituloColecao, Colecao colecao) {
        super(tituloColecao, colecao);
        this.cadastroMusica = new FormularioMusica(colecao);
        this.cadastroMusica.setLocationRelativeTo(null);
        this.cadastroMusica.setResizable(false);
    }

    @Override
    protected void botaoCadastrar() {
        jButton_cadastrar.setText("Cadastrar novo");
        jButton_cadastrar.addActionListener((ActionEvent evt) -> {
            cadastroMusica.setModoCadastrar();
            cadastroMusica.setTabela(modelTabela);
            cadastroMusica.setInteracaoTodos(interacaoTodos);
            cadastroMusica.setVisible(true);
            atualizarTabela();
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
                    
                    cadastroMusica.setModoEditar(caminhoAnterior, tituloAnterior);
                    cadastroMusica.setTabela(modelTabela);
                    cadastroMusica.setInteracaoTodos(interacaoTodos);
                    cadastroMusica.setVisible(true);
                }
            }
        });
    }
    
    @Override
    protected void layoutTabela() {
        jTable_tabela.setModel(super.modelTabela = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Caminho", "Titulo", "Descrição", "Idioma", "Genero", "Autores", "Interpretes", "Duração", "Ano"
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
            Musica musica = (Musica) midia;
            modelTabela.addRow(new Object[]{
                musica.getCaminho(),
                musica.getTitulo(),
                musica.getDescricao(),
                musica.getIdioma(),
                musica.getGenero(),
                musica.getAutores(),
                musica.getInterpretes(),
                musica.getDuracao(),
                musica.getAno()
            });
        }
    }

}
