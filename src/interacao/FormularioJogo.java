/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao;

import colecao.Colecao;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import midia.Jogo;
import midia.Midia;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class FormularioJogo extends JFrame {

    private DefaultListModel modeloListaAutores;
    private DefaultTableModel tabela;
    private InteracaoTodos interacaoTodos;
    private Colecao colecao;
    private Jogo jogoAnterior;

    /**
     * Creates new form Cadastro
     *
     * @param colecao
     */
    public FormularioJogo(Colecao colecao) {
        initComponents();
        btnClose();
        this.colecao = colecao;
        this.modeloListaAutores = new DefaultListModel();
        this.jogoAnterior = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastro = new javax.swing.JPanel();
        tituloFormulario = new javax.swing.JLabel();
        labelCaminho = new javax.swing.JLabel();
        campoCaminho = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        labelGenero = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        labelQntJogadores = new javax.swing.JLabel();
        campoQntJogadores = new javax.swing.JFormattedTextField();
        labelSuporteRede = new javax.swing.JLabel();
        comboBoxSuporteRede = new javax.swing.JComboBox<>();
        labelAno = new javax.swing.JLabel();
        campoAno = new javax.swing.JFormattedTextField();
        labelAutor = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        bntAdicionarAutor = new javax.swing.JButton();
        labelAutores = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        listAutores = new javax.swing.JList<>();
        btnRemoverAutor = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tituloFormulario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFormulario.setText("Insira a informação do Jogo");

        labelCaminho.setText("Caminho");

        campoCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCaminhoActionPerformed(evt);
            }
        });

        labelTitulo.setText("Titulo");

        labelDescricao.setText("Descrição");

        labelGenero.setText("Gênero");

        labelQntJogadores.setText("Qnt de Jogadores");

        campoQntJogadores.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        labelSuporteRede.setText("Suporte à rede?");

        comboBoxSuporteRede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        labelAno.setText("Ano");

        campoAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnoActionPerformed(evt);
            }
        });

        labelAutor.setText("Autor");

        bntAdicionarAutor.setText("Adicionar");
        bntAdicionarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAdicionarAutorActionPerformed(evt);
            }
        });

        labelAutores.setText("Autores inseridos");

        listAutores.setMaximumSize(new java.awt.Dimension(334, 109));
        jScrollPane.setViewportView(listAutores);

        btnRemoverAutor.setText("Remover autor selecionado");
        btnRemoverAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverAutorActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tituloFormulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAutores, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAno))
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelAutor))
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bntAdicionarAutor))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGenero)
                                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addComponent(labelQntJogadores)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(campoQntJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelSuporteRede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxSuporteRede, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCaminho))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTitulo)
                                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(campoDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar)
                            .addComponent(btnRemoverAutor))))
                .addGap(96, 96, 96))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloFormulario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaminho)
                    .addComponent(labelTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescricao)
                .addGap(0, 0, 0)
                .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGenero)
                    .addComponent(labelQntJogadores)
                    .addComponent(labelSuporteRede))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQntJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSuporteRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno)
                    .addComponent(labelAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntAdicionarAutor))
                .addGap(7, 7, 7)
                .addComponent(labelAutores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (hasModoCadastrar()) {
            try {
                Jogo jogo = new Jogo(getCaminho(), getTitulo(), getDescricao(), getGenero(), getAutores(), getAno(), getQntJogadores(), getSuporteRede());
                colecao.cadastrarMidia(jogo);
                interacaoTodos.colecao.cadastrarMidia(jogo);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Midia inserida com sucesso.");
                this.atualizarTabela();
                this.atualizarTabelaMaster();
                this.limparCampos();

            } catch (ArithmeticException ex) {
                colecao.cadastrarMidia(new Jogo(getCaminho(), getTitulo(), getDescricao(), getGenero(), getAutores(), getAno(), getQntJogadores(), getSuporteRede()));
                interacaoTodos.colecao.cadastrarMidia(new Jogo(getCaminho(), getTitulo(), getDescricao(), getGenero(), getAutores(), getAno(), getQntJogadores(), getSuporteRede()));
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Midia inserida com sucesso.\n" + ex.getMessage());
                this.atualizarTabela();
                this.atualizarTabelaMaster();
                this.limparCampos();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            try {
                Jogo jogoNovo = new Jogo(getCaminho(), getTitulo(), getDescricao(), getGenero(), getAutores(), getAno(), getQntJogadores(), getSuporteRede());
                colecao.editarMidia(this.jogoAnterior.getTitulo(), jogoNovo);
                interacaoTodos.colecao.editarMidia(this.jogoAnterior.getTitulo(), jogoNovo);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Midia alterada com sucesso.");
                this.atualizarTabela();
                this.atualizarTabelaMaster();
                this.limparCampos();

            } catch (ArithmeticException ex) {
                colecao.editarMidia(this.jogoAnterior.getTitulo(), new Jogo(getCaminho(), getTitulo(), getDescricao(), getGenero(), getAutores(), getAno(), getQntJogadores(), getSuporteRede()));
                interacaoTodos.colecao.editarMidia(this.jogoAnterior.getTitulo(), new Jogo(getCaminho(), getTitulo(), getDescricao(), getGenero(), getAutores(), getAno(), getQntJogadores(), getSuporteRede()));
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Midia alterada com sucesso.\n" + ex.getMessage());
                this.atualizarTabela();
                this.atualizarTabelaMaster();
                this.limparCampos();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverAutorActionPerformed
        int selecionado = listAutores.getSelectedIndex();

        if (selecionado != -1) {
            String autor = (String) modeloListaAutores.remove(selecionado);
            listAutores.setModel(modeloListaAutores);
            JOptionPane.showMessageDialog(null, "Autor removido: " + autor);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione o autor acima que você deseja remover.");
        }
    }//GEN-LAST:event_btnRemoverAutorActionPerformed

    private void bntAdicionarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAdicionarAutorActionPerformed
        String autor = campoAutor.getText();
        if (autor != null && !autor.equals("")) {
            this.modeloListaAutores.addElement(autor);
            listAutores.setModel(modeloListaAutores);
        } else {
            JOptionPane.showMessageDialog(null, "O nome do autor não pode ser vazio.");
        }
    }//GEN-LAST:event_bntAdicionarAutorActionPerformed

    private void campoCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCaminhoActionPerformed

    private void campoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAnoActionPerformed

    public String getCaminho() {
        return campoCaminho.getText();
    }

    public String getTitulo() {
        return campoTitulo.getText();
    }

    public String getDescricao() {
        return campoDescricao.getText();
    }

    public String getGenero() {
        return campoGenero.getText();
    }

    public int getQntJogadores() {
        try {
            return Integer.parseInt(campoQntJogadores.getText());
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("A quantidade de jogadores não pode ser vazio.");
        }
    }

    public boolean getSuporteRede() {
        return (String.valueOf(comboBoxSuporteRede.getSelectedItem())).equals("Sim");
    }

    public List<String> getAutores() {
        ListModel<String> modeloListaDeAutores = listAutores.getModel();
        List<String> listaAutores = new ArrayList();
        for (int i = 0; i < modeloListaDeAutores.getSize(); i++) {
            if (!modeloListaDeAutores.getElementAt(i).equals("")) {
                listaAutores.add(modeloListaDeAutores.getElementAt(i));
            }
        }
        return listaAutores;
    }

    public int getAno() {
        try {
            return Integer.parseInt(campoAno.getText());
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("O ano não pode ser vazio.");
        }
    }

    public void setTabela(DefaultTableModel tabela) {
        this.tabela = tabela;
    }

    private void limparCampos() {
        for (int i = 0; i < panelCadastro.getComponentCount(); i++) {
            //varre todos os componentes
            Component c = panelCadastro.getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField jtextfield = (JTextField) c;
                jtextfield.setText(null);
            } else if (c instanceof JFormattedTextField) {
                JFormattedTextField jformattedtextfield = (JFormattedTextField) c;
                jformattedtextfield.setValue(null);
            }
        }

        listAutores.setModel((modeloListaAutores = new DefaultListModel()));
    }

    public void setModoCadastrar() {
        this.jogoAnterior = null;
    }

    public void setModoEditar(String caminho, String titulo) {
        Jogo jogo1 = (Jogo) colecao.consultarMidia(caminho);
        Jogo jogo2 = (Jogo) colecao.consultarMidia(titulo);

        if ((jogo1 != null && jogo2 != null) && (jogo1.equals(jogo2))) {
            this.jogoAnterior = jogo1;
            this.campoCaminho.setText(jogo1.getCaminho());
            this.campoTitulo.setText(jogo1.getTitulo());
            this.campoDescricao.setText(jogo1.getDescricao());
            this.campoGenero.setText(jogo1.getGenero());
            this.campoQntJogadores.setValue(jogo1.getNumeroJogadores());

            if (jogo1.hasSuporteRede()) {
                this.comboBoxSuporteRede.setSelectedIndex(0);
            } else {
                this.comboBoxSuporteRede.setSelectedIndex(1);
            }

            this.campoAno.setValue(jogo1.getAno());

            jogo1.getAutores().forEach((autor) -> {
                modeloListaAutores.addElement(autor);
            });
            listAutores.setModel(modeloListaAutores);

        } else {
            JOptionPane.showMessageDialog(null, "Erro inesperado.\nPor favor, contacte o administrador.");
        }
    }

    private boolean hasModoCadastrar() {
        return (this.jogoAnterior == null);
    }

    private void atualizarTabela() {
        this.tabela.setRowCount(0);

        for (Object midia : this.colecao.exibirMidia()) {
            Jogo jogo = (Jogo) midia;
            this.tabela.addRow(new Object[]{
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

    private void btnClose() {
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                setVisible(false);
                limparCampos();
            }
        });
    }

    public void setInteracaoTodos(InteracaoTodos interacaoTodos) {
        this.interacaoTodos = interacaoTodos;
    }

    protected void atualizarTabelaMaster() {
        interacaoTodos.tabelaMaster().setRowCount(0);

        for (Midia midia : interacaoTodos.colecao.exibirMidia()) {
            Midia midiaTemp = (Midia) midia;
            if (!midiaTemp.getTitulo().equals("null")) {
                interacaoTodos.tabelaMaster().addRow(new Object[]{
                    midiaTemp.getClass().getName().split("[.]")[1],
                    midiaTemp.getCaminho(),
                    midiaTemp.getTitulo(),
                    midiaTemp.getDescricao()
                });
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAdicionarAutor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemoverAutor;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField campoAno;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoCaminho;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JFormattedTextField campoQntJogadores;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JComboBox<String> comboBoxSuporteRede;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelAutores;
    private javax.swing.JLabel labelCaminho;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelQntJogadores;
    private javax.swing.JLabel labelSuporteRede;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listAutores;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel tituloFormulario;
    // End of variables declaration//GEN-END:variables
}