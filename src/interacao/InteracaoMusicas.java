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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import midia.Jogo;
import midia.Musica;

/**
 *
 * @author Gustavo Bittecourt Satheler
 * <gustavo.satheler@alunos.unipampa.edu.br>
 * <gustavosatheler@gmail.com>
 */
public class InteracaoMusicas extends Interacao {

    CadastroJogo cadastroJogo;

    public InteracaoMusicas(String tituloColecao, Colecao colecao) {
        super(tituloColecao, colecao);
        this.cadastroJogo = new CadastroJogo();
    }

    @Override
    protected void botaoImportar(Colecao colecao) {
        jButton_importar.setText("Importar arquivo");
        jButton_importar.addActionListener((ActionEvent evt) -> {
            String arquivo = carregarArquivo();

            try {
                super.colecao.importarMidias(arquivo);
                JOptionPane.showMessageDialog(null, "Mídias inseridas com sucesso.");

            } catch (NumberFormatException ex) {
                Logger.getLogger(Interacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Dados incompatíveis com essa mídia.");

            } catch (NullPointerException ex) {
                Logger.getLogger(Interacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Nenhum arquivo foi selecionado.");

            } catch (IOException ex) {
                Logger.getLogger(Interacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possivel inserir a mídia.\n" + ex.getMessage());
            }

            super.tabela.setRowCount(0);

            for (Object midia : super.colecao.exibirMidia()) {
                Musica musica = (Musica) midia;
                super.tabela.addRow(new Object[]{
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
        });
    }

    @Override
    protected void botaoCadastrar() {
        jButton_cadastrar.setText("Cadastrar novo");
        jButton_cadastrar.addActionListener((ActionEvent evt) -> {
            cadastroJogo.setUndecorated(true);
            cadastroJogo.setResizable(false);
            cadastroJogo.setVisible(true);

        });
    }

    @Override
    protected void layoutTabela() {
        jTable_tabela.setModel(super.tabela = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Caminho", "Titulo", "Descrição","Idioma", "Genero", "Autores","Interpretes","Duração", "Ano"
                }
        ));

        jScrollPane_colecao.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane_colecao.setViewportView(jTable_tabela);
    }

}