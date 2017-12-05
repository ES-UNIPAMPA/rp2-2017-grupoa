/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao;

import colecao.Colecao;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import midia.Midia;
import midia.Musica;

/**
 *
 * @author Leonardo Severo Pedroso
 * <leopedroso45@gmail.com>
 *
 */
public class FormularioMusica extends javax.swing.JFrame {

    private DefaultListModel listaInterpretes;
    private DefaultListModel listaAutores;
    private DefaultTableModel tabela;
    private Colecao colecao;
    private Musica musicaAnterior;

    private InteracaoTodos interacaoTodos;

    /**
     * Creates new form FormularioMusica
     *
     * @param colecao
     */
    public FormularioMusica(Colecao colecao) {
        initComponents();
        btnClose();
        this.colecao = colecao;
        this.listaAutores = new DefaultListModel();
        this.listaInterpretes = new DefaultListModel();
        this.musicaAnterior = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMusica = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        caminhoI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tituloI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descricaoI = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idiomaI = new javax.swing.JTextField();
        generoI = new javax.swing.JTextField();
        campoAutor = new javax.swing.JTextField();
        campoInterprete = new javax.swing.JTextField();
        btnAdicionarAutor = new javax.swing.JButton();
        btnAdicionarInterprete = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        campoAutores = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoInterpretes = new javax.swing.JList<>();
        btnRemoveAutor = new javax.swing.JButton();
        btnRemoveInterprete = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        duracaoI = new javax.swing.JFormattedTextField();
        anoI = new javax.swing.JFormattedTextField();
        tituloFormulario = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(360, 653));
        setResizable(false);

        jLabel2.setText("Caminho:");

        jLabel3.setText("Titulo:");

        jLabel4.setText("Descrição:");

        jLabel5.setText("Idioma:");

        jLabel6.setText("Genero:");

        jLabel7.setText("<html><center>Autor:</center></html>");

        jLabel8.setText("<html><center>Interpretes:</center></html>");

        jLabel9.setText("Duração:");

        jLabel10.setText("Ano:");

        idiomaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomaIActionPerformed(evt);
            }
        });

        btnAdicionarAutor.setText("Adicionar");
        btnAdicionarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAutorActionPerformed(evt);
            }
        });

        btnAdicionarInterprete.setText("Adicionar");
        btnAdicionarInterprete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarInterpreteActionPerformed(evt);
            }
        });

        campoAutores.setMaximumSize(new java.awt.Dimension(420, 0));
        jScrollPane.setViewportView(campoAutores);

        campoInterpretes.setMaximumSize(new java.awt.Dimension(420, 0));
        jScrollPane1.setViewportView(campoInterpretes);

        btnRemoveAutor.setText("Remover autor");
        btnRemoveAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAutorActionPerformed(evt);
            }
        });

        btnRemoveInterprete.setText("Remover Interprete");
        btnRemoveInterprete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveInterpreteActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        duracaoI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        anoI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        tituloFormulario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFormulario.setText("Insira a informação da Música");

        jButton5.setText("Salvar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMusicaLayout = new javax.swing.GroupLayout(panelMusica);
        panelMusica.setLayout(panelMusicaLayout);
        panelMusicaLayout.setHorizontalGroup(
            panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMusicaLayout.createSequentialGroup()
                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMusicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMusicaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnAdicionarAutor)
                        .addGap(99, 99, 99)
                        .addComponent(btnAdicionarInterprete)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMusicaLayout.createSequentialGroup()
                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMusicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelMusicaLayout.createSequentialGroup()
                                    .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(caminhoI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(tituloI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel4)
                                .addGroup(panelMusicaLayout.createSequentialGroup()
                                    .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idiomaI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(generoI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(descricaoI))
                            .addGroup(panelMusicaLayout.createSequentialGroup()
                                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(duracaoI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(anoI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelMusicaLayout.createSequentialGroup()
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelMusicaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMusicaLayout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addGroup(panelMusicaLayout.createSequentialGroup()
                                .addComponent(btnRemoveAutor)
                                .addGap(58, 58, 58)
                                .addComponent(btnRemoveInterprete)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMusicaLayout.setVerticalGroup(
            panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMusicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloFormulario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminhoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMusicaLayout.createSequentialGroup()
                        .addComponent(descricaoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idiomaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duracaoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarAutor)
                            .addComponent(btnAdicionarInterprete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveInterprete)
                    .addComponent(btnRemoveAutor))
                .addGap(18, 18, 18)
                .addGroup(panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAutorActionPerformed

        String autor = campoAutor.getText();
        if (autor != null && !autor.equals("")) {
            this.listaAutores.addElement(autor);
            campoAutores.setModel(listaAutores);
            campoAutor.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "O nome do autor precisa ser informado.");
        }
    }//GEN-LAST:event_btnAdicionarAutorActionPerformed

    private void btnAdicionarInterpreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarInterpreteActionPerformed
        String interprete = campoInterprete.getText();
        if (interprete != null && !interprete.equals("")) {
            this.listaInterpretes.addElement(interprete);
            campoInterpretes.setModel(listaInterpretes);
            campoInterprete.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "O nome do interprete precisa ser informado.");
        }
    }//GEN-LAST:event_btnAdicionarInterpreteActionPerformed

    private void btnRemoveAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAutorActionPerformed
        // TODO add your handling code here:
        int autorSelecionado = campoAutores.getSelectedIndex();
        if (autorSelecionado != -1) {
            this.listaAutores.remove(autorSelecionado);
            campoAutores.setModel(listaAutores);
            JOptionPane.showMessageDialog(null, "Autor removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o autor que você deseja remover na caixa de texto acima.");
        }
    }//GEN-LAST:event_btnRemoveAutorActionPerformed

    private void btnRemoveInterpreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveInterpreteActionPerformed
        int interpreteSelecionado = campoInterpretes.getSelectedIndex();
        if (interpreteSelecionado != -1) {
            this.listaInterpretes.remove(interpreteSelecionado);
            campoInterpretes.setModel(listaInterpretes);
            JOptionPane.showMessageDialog(null, "Interprete removido com sucesso! ");
        } else {
            JOptionPane.showMessageDialog(null, "Seleciona o interprete que você deseja remover na caixa de texto acima.");
        }
    }//GEN-LAST:event_btnRemoveInterpreteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        this.limparCampos();
    }//GEN-LAST:event_jButton6ActionPerformed

    public List<String> getAutores() {
        ListModel<String> ListaDeAutores = campoAutores.getModel();
        List<String> listaAutoresNova = new ArrayList();
        for (int i = 0; i < ListaDeAutores.getSize(); i++) {
            if (!ListaDeAutores.getElementAt(i).equals("")) {
                listaAutoresNova.add(ListaDeAutores.getElementAt(i));
            }
        }
        return listaAutoresNova;
    }

    /**
     *
     * @return
     */
    public List<String> getInterpretes() {
        ListModel<String> modeloListaDeAutores = campoInterpretes.getModel();
        List<String> listaAutoresNova = new ArrayList();
        for (int i = 0; i < modeloListaDeAutores.getSize(); i++) {
            if (!modeloListaDeAutores.getElementAt(i).equals("")) {
                listaAutoresNova.add(modeloListaDeAutores.getElementAt(i));
            }
        }
        return listaAutoresNova;
    }

    public String getCaminho() {
        return caminhoI.getText();
    }

    public String getTitulo() {
        return tituloI.getText();
    }

    public String getDescricao() {
        return descricaoI.getText();
    }

    public String getIdioma() {
        return idiomaI.getText();
    }

    public String getGenero() {
        return generoI.getText();
    }

    public int getDuracao() {
        return Integer.parseInt(duracaoI.getText());
    }

    public int getAno() {
        return Integer.parseInt(anoI.getText());
    }

    public void setTabela(DefaultTableModel tabela) {
        this.tabela = tabela;
    }

    public void setModoCadastrar() {
        this.musicaAnterior = null;
    }

    public void setModoEditar(String caminho, String titulo) {
        Musica musica1 = (Musica) colecao.consultarMidia(caminho);
        Musica musica2 = (Musica) colecao.consultarMidia(titulo);

        if ((musica1 != null && musica2 != null) && (musica1.equals(musica2))) {
            this.musicaAnterior = musica1;
            this.caminhoI.setText(musica1.getCaminho());
            this.tituloI.setText(musica1.getTitulo());
            this.descricaoI.setText(musica1.getDescricao());
            this.idiomaI.setText(musica1.getIdioma());
            this.generoI.setText(musica1.getGenero());

            musica1.getAutores().forEach((autor) -> {
                listaAutores.addElement(autor);
            });

            campoAutores.setModel(listaAutores);
            musica1.getInterpretes().forEach((interprete) -> {
                listaInterpretes.addElement(interprete);
            });
            campoInterpretes.setModel(listaInterpretes);
            this.duracaoI.setValue(musica1.getDuracao());
            this.anoI.setValue(musica1.getAno());

        } else {
            JOptionPane.showMessageDialog(null, "Erro inesperado.\nPor favor, contacte o administrador.");
        }
    }

    private boolean hasModoCadastrar() {
        return (this.musicaAnterior == null);
    }

    private void atualizarTabela() {
        this.tabela.setRowCount(0);

        for (Object midia : colecao.exibirMidia()) {
            Musica musica = (Musica) midia;
            tabela.addRow(new Object[]{
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

    private void limparCampos() {
        for (int i = 0; i < panelMusica.getComponentCount(); i++) {
            //varre todos os componentes
            Component c = panelMusica.getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField jtextfield = (JTextField) c;
                jtextfield.setText(null);
            } else if (c instanceof JFormattedTextField) {
                JFormattedTextField jformattedtextfield = (JFormattedTextField) c;
                jformattedtextfield.setValue(null);
            }
        }

        campoAutores.setModel((listaAutores = new DefaultListModel()));
        campoInterpretes.setModel((listaInterpretes = new DefaultListModel()));
    }

    private void btnClose() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (hasModoCadastrar()) {
            try {
                Musica musica = new Musica(getCaminho(), getTitulo(), getDescricao(), getIdioma(), getGenero(), getAutores(), getInterpretes(), getDuracao(), getAno());
                colecao.cadastrarMidia(musica);
                interacaoTodos.colecao.cadastrarMidia(musica);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Midia inserida com sucesso.");
                this.limparCampos();
                this.atualizarTabela();
                this.atualizarTabelaMaster();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            try {
                Musica musicaNova = new Musica(getCaminho(), getTitulo(), getDescricao(), getIdioma(), getGenero(), getAutores(), getInterpretes(), getDuracao(), getAno());
                colecao.editarMidia(this.musicaAnterior.getTitulo(), musicaNova);
                interacaoTodos.colecao.editarMidia(this.musicaAnterior.getTitulo(), musicaNova);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Midia alterada com sucesso.");
                this.atualizarTabela();
                this.atualizarTabelaMaster();
                this.limparCampos();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idiomaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idiomaIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField anoI;
    private javax.swing.JButton btnAdicionarAutor;
    private javax.swing.JButton btnAdicionarInterprete;
    private javax.swing.JButton btnRemoveAutor;
    private javax.swing.JButton btnRemoveInterprete;
    private javax.swing.JTextField caminhoI;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JList<String> campoAutores;
    private javax.swing.JTextField campoInterprete;
    private javax.swing.JList<String> campoInterpretes;
    private javax.swing.JTextField descricaoI;
    private javax.swing.JFormattedTextField duracaoI;
    private javax.swing.JTextField generoI;
    private javax.swing.JTextField idiomaI;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelMusica;
    private javax.swing.JLabel tituloFormulario;
    private javax.swing.JTextField tituloI;
    // End of variables declaration//GEN-END:variables
}
