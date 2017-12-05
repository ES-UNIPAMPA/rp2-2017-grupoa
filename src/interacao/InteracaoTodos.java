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
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;

import midia.Jogo;
import midia.Midia;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class InteracaoTodos extends Interacao {

    FormularioJogo formulario;

    public InteracaoTodos(String tituloColecao, Colecao colecao) {
        super(tituloColecao, colecao);
    }

    @Override
    protected void eventoEditar() {
        jTable_tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    JOptionPane.showMessageDialog(null, "Evento bloqueado para esta mídia.");
                }
            }
        });
    }

    @Override
    protected void layoutTabela() {
        jTable_tabela.setModel(modelTabela = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Tipo da mídia", "Caminho", "Titulo", "Descrição"
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
            Midia midiaTemp = (Midia) midia;
            modelTabela.addRow(new Object[]{
                midiaTemp.getClass().getName().split("[.]")[1],
                midiaTemp.getCaminho(),
                midiaTemp.getTitulo(),
                midiaTemp.getDescricao()
            });
        }
    }
    
    
    @Override
    protected void setLayout() {
        GroupLayout jPanel_colecaoLayout = new GroupLayout(jPanel_colecao);
        jPanel_colecao.setLayout(jPanel_colecaoLayout);
        jPanel_colecaoLayout.setHorizontalGroup(
                jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_colecaoLayout.createSequentialGroup()
                                .addGroup(jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel_colecaoLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                        )
                                        .addGroup(jPanel_colecaoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel_colecaoLayout.createSequentialGroup()
                                                                .addComponent(jLabel_titulo, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                                        )
                                                        .addComponent(jScrollPane_colecao, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                                                )
                                        )
                                )
                                .addContainerGap()
                        )
        );

        jPanel_colecaoLayout.setVerticalGroup(
                jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_colecaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel_titulo)
                                        )
                                )
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane_colecao, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGap(7, 7, 7)
                        )
        );

        jTable_tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable_tabela.setRequestFocusEnabled(false);
        jTable_tabela.setAutoCreateRowSorter(true);
        
    }

}
