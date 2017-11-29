/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao;

import colecao.Colecao;
import static interacao.InteracaoPrincipal.carregarArquivo;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public abstract class Interacao {

    private String tituloColecao;
    protected JButton jButton_cadastrar;
    protected JButton jButton_excluir;
    protected JButton jButton_importar;
    private JButton jButton_exportar;
    private JLabel jLabel_titulo;
    private JPanel jPanel_colecao;
    protected JScrollPane jScrollPane_colecao;
    private JSeparator jSeparator_colecao;
    protected JTable jTable_tabela;
    DefaultTableModel modelTabela;
    protected Colecao colecao;

    public Interacao(String tituloColecao, Colecao colecao) {
        this.tituloColecao = tituloColecao;
        this.colecao = colecao;
        this.jPanel_colecao = new JPanel();
        this.jButton_importar = new JButton();
        this.jButton_exportar = new JButton();
        this.jLabel_titulo = new JLabel();
        this.jScrollPane_colecao = new JScrollPane();
        this.jTable_tabela = new JTable();
        this.jSeparator_colecao = new JSeparator();
        this.jButton_cadastrar = new JButton();
        this.jButton_excluir = new JButton();

        this.modelTabela = (DefaultTableModel) jTable_tabela.getModel();
    }

    public void gerarAba(InteracaoPrincipal interacaoPrincipal) {
        tituloColecao();
        layoutTabela();
        botaoCadastrar();
        eventoEditar();
        botaoImportar(colecao);
        botaoExportar(colecao);
        botaoExcluir();
        setLayout();

        interacaoPrincipal.getjTabbedPane_colecoes().addTab(this.tituloColecao, jPanel_colecao);
    }

    private void botaoExportar(Colecao colecao) {
        jButton_exportar.setText("Exportar arquivo");
        jButton_exportar.addActionListener((ActionEvent evt) -> {
            String arquivo = carregarArquivo();

            try {
                colecao.exportarMidias(arquivo);
                JOptionPane.showMessageDialog(null, "Mídias exportadas com sucesso.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Interacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Interacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Arquivo com codificação não suportada.");
            } catch (NullPointerException | ClassCastException ex) {
                Logger.getLogger(Interacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Nenhum arquivo foi selecionado.\n" + ex.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(Interacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possivel exportar.");
            }
        });
    }

    private void botaoExcluir() {
        jButton_excluir.setText("Excluir selecionado");
        jButton_excluir.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                String tituloLinha;
                int linha = jTable_tabela.getSelectedRow();
                if (linha >= 0) {
                    tituloLinha = (String) jTable_tabela.getValueAt(linha, 1);
                    modelTabela.removeRow(linha);
                    linha = jTable_tabela.getSelectedRow();
                    jTable_tabela.setModel(modelTabela);

                    colecao.removerMidia(tituloLinha);

                    JOptionPane.showMessageDialog(null, "Titulo removido: " + tituloLinha);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma linha da tabela foi selecionada");
                }
            }
        });
    }

    private void tituloColecao() {
        jLabel_titulo.setFont(new Font("Tahoma", 1, 14));
        jLabel_titulo.setText("Biblioteca de " + this.tituloColecao);
    }

    private void setLayout() {
        GroupLayout jPanel_colecaoLayout = new GroupLayout(jPanel_colecao);
        jPanel_colecao.setLayout(jPanel_colecaoLayout);
        jPanel_colecaoLayout.setHorizontalGroup(
                jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_colecaoLayout.createSequentialGroup()
                                .addGroup(jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel_colecaoLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton_excluir)
                                        )
                                        .addGroup(jPanel_colecaoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel_colecaoLayout.createSequentialGroup()
                                                                .addComponent(jLabel_titulo, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                                                .addGap(514, 514, 514)
                                                                .addComponent(jButton_cadastrar)
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jButton_importar)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton_exportar)
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
                                                .addComponent(jButton_cadastrar))
                                        .addGroup(jPanel_colecaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton_importar)
                                                .addComponent(jButton_exportar)
                                        )
                                )
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane_colecao, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_excluir)
                                .addGap(7, 7, 7)
                        )
        );

        jTable_tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_tabela.setRequestFocusEnabled(false);
        jTable_tabela.setAutoCreateRowSorter(true);
        
    }

    /**
     * Os métodos abaixo deverão ser implementados em uma classe filha
     *
     *
     * @param colecao Coleção que será passada por parâmetro que será
     * administrada.
     */
    protected void botaoImportar(Colecao colecao) {
        jButton_importar.setText("Importar arquivo");
        jButton_importar.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(null, "Não implementado - botaoImportar");
        });
    }

    protected void botaoCadastrar() {
        jButton_cadastrar.setText("Cadastrar novo");
        jButton_cadastrar.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(null, "Não implementado - botaoCadastrar");
        });
    }

    protected void eventoEditar() {
        jTable_tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int row = jTable_tabela.getSelectedRow();
                    //JOptionPane.showMessageDialog(null, modelTabela.getValueAt(row, 1));
                    JOptionPane.showMessageDialog(null, "Não implementado - eventoEditar");
                }
            }
        });
        
    }

    protected void layoutTabela() {
        jTable_tabela.setModel(this.modelTabela = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Caminho", "Titulo", "Descrição"
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

    protected void atualizarTabela() {
        JOptionPane.showMessageDialog(null, "Não implementado - atualizarTabela");
    }

}
